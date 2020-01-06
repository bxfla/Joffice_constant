package com.hy.powerplatform.login.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.github.mikephil.charting.charts.BarChart;
import com.github.mikephil.charting.data.BarData;
import com.github.mikephil.charting.data.BarDataSet;
import com.github.mikephil.charting.data.BarEntry;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.highlight.Highlight;
import com.github.mikephil.charting.interfaces.datasets.IBarDataSet;
import com.github.mikephil.charting.listener.OnChartValueSelectedListener;
import com.github.mikephil.charting.utils.ColorTemplate;
import com.google.gson.Gson;
import com.hy.powerplatform.R;
import com.hy.powerplatform.comper.ComperListActivity;
import com.hy.powerplatform.duban.bean.ItemBean;
import com.hy.powerplatform.human.HuManListActivity;
import com.hy.powerplatform.login.activity.LoginPersonMoreActivity;
import com.hy.powerplatform.login.bean.LoginPerson;
import com.hy.powerplatform.login.bean.OAFlowNum;
import com.hy.powerplatform.login.bean.YingYunData;
import com.hy.powerplatform.my_utils.base.Constant;
import com.hy.powerplatform.my_utils.base.OkHttpUtil;
import com.hy.powerplatform.my_utils.utils.BaseRecyclerAdapter;
import com.hy.powerplatform.my_utils.utils.BaseRecyclerAdapterPosition;
import com.hy.powerplatform.my_utils.utils.BaseViewHolder;
import com.hy.powerplatform.my_utils.utils.BaseViewHolderPosition;
import com.hy.powerplatform.my_utils.utils.ProgressDialogUtil;
import com.hy.powerplatform.oa_flow.OAFlowListActivity;
import com.hy.powerplatform.operation.OperationListActivity;
import com.hy.powerplatform.safer.SaferListActivity;
import com.hy.powerplatform.statist.StatistListActivity;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.Unbinder;
import okhttp3.Request;
import okhttp3.Response;

import static com.hy.powerplatform.my_utils.base.Constant.TAG_FOUR;
import static com.hy.powerplatform.my_utils.base.Constant.TAG_ONE;
import static com.hy.powerplatform.my_utils.base.Constant.TAG_THERE;
import static com.hy.powerplatform.my_utils.base.Constant.TAG_TWO;

/**
 * Created by Administrator on 2019/9/25.
 */

public class Fragment01 extends Fragment {
    View view;
    @BindView(R.id.mIvBanner)
    ImageView mIvBanner;
    @BindView(R.id.recyclerView)
    RecyclerView recyclerView;
    @BindView(R.id.recyclerViewLogin)
    RecyclerView recyclerViewLogin;
    @BindView(R.id.mBarChart)
    BarChart mBarChart;
    @BindView(R.id.tvLoginMore)
    TextView tvLoginMore;
    @BindView(R.id.recyclerViewYY)
    RecyclerView recyclerViewYY;

    //数据的集合
    public BarDataSet dataset;
    //保存数据的实体（下面定义了两组数据集合）
    public ArrayList<BarEntry> entries = new ArrayList<BarEntry>();
    //表格下方的文字
    public ArrayList<String> labels = new ArrayList<String>();

    Unbinder unbinder;
    Intent intent;
    private OkHttpUtil httpUtil;
    BaseRecyclerAdapter mAdapter;
    BaseRecyclerAdapter baseAdapterYY;
    BaseRecyclerAdapterPosition mAdapterLogin;
    List<ItemBean> itemList = new ArrayList<>();
    ArrayList<IBarDataSet> dataSets = new ArrayList<>();
    final HashMap<String, String> map = new HashMap();
    List<YingYunData> yingyunList = new ArrayList<>();
    List<LoginPerson.ResultBean> loginPersonList = new ArrayList<>();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment01, container, false);
        unbinder = ButterKnife.bind(this, view);
        LinearLayoutManager manager = new LinearLayoutManager(getActivity());
        recyclerViewLogin.setLayoutManager(manager);
        //设置布局的方式
        GridLayoutManager layoutManager = new GridLayoutManager(getActivity(),3);
        recyclerViewYY.setLayoutManager(layoutManager);
        //添加模块
        addItem();
        setItemAdapter();
        mAdapterLogin = new BaseRecyclerAdapterPosition<LoginPerson.ResultBean>(getActivity(), R.layout.adapter_loginperson, loginPersonList) {
            @Override
            public void convert(BaseViewHolderPosition holder, final LoginPerson.ResultBean itemBean, int position) {
                holder.setText(R.id.tvNum, position + 1 + "");
                holder.setText(R.id.tvUserName, itemBean.getFullName());
                holder.setText(R.id.tvLoginNum, String.valueOf(itemBean.getDlcs()));
                if (position % 2 != 0) {
                    holder.setColor(R.id.ll);
                }
            }
        };
        recyclerViewLogin.setAdapter(mAdapterLogin);
        baseAdapterYY = new BaseRecyclerAdapter<YingYunData>(getActivity(), R.layout.adapter_yingyingdata_item, yingyunList) {
            @Override
            public void convert(BaseViewHolder holder, final YingYunData itemBean) {
                holder.setText(R.id.tvName, itemBean.getType());
                holder.setText(R.id.tv, itemBean.getNum());
            }
        };
        recyclerViewYY.setAdapter(baseAdapterYY);
        //设置单个点击事件
        mBarChart.setOnChartValueSelectedListener(new OnChartValueSelectedListener() {
            @Override
            public void onValueSelected(Entry entry, int i, Highlight highlight) {
                Toast.makeText(getActivity(), entry.getVal() + "", Toast.LENGTH_LONG).show();
            }

            @Override
            public void onNothingSelected() {

            }
        });
        //设置显示动画效果
        mBarChart.animateY(2000);
        mBarChart.setMaxVisibleValueCount(60);

        httpUtil = OkHttpUtil.getInstance(getActivity());
        getLoginPerson();
        getOAFlowNum();
        return view;
    }

    /**
     * 获取流程情况
     */
    private void getOAFlowNum() {
        ProgressDialogUtil.startLoad(getActivity(), getResources().getString(R.string.get_data));
        final String path_url = Constant.BASE_URL2 + Constant.OAFLOWNUM;
        httpUtil.getAsynHttp(path_url, new OkHttpUtil.ResultCallback() {
            @Override
            public void onError(Request request, Exception e) {
//                Log.i("main", "response:" + e.toString());
                Message message = new Message();
                Bundle b = new Bundle();
                b.putString("error", e.toString());
                message.setData(b);
                message.what = TAG_ONE;
                handler.sendMessage(message);
            }

            @Override
            public void onResponse(Response response) throws IOException {
//                Log.i("main", "response:" + response.body().string());
                String data = response.body().string();
                Message message = new Message();
                Bundle b = new Bundle();
                b.putString("data", data);
                message.setData(b);
                message.what = TAG_FOUR;
                handler.sendMessage(message);
            }
        });
    }

    /**
     * 获取登录次数
     */
    private void getLoginPerson() {
        ProgressDialogUtil.startLoad(getActivity(), getResources().getString(R.string.get_data));
        final String path_url = Constant.BASE_URL2 + Constant.LOGINPERSON;
        httpUtil.getAsynHttp(path_url, new OkHttpUtil.ResultCallback() {
            @Override
            public void onError(Request request, Exception e) {
//                Log.i("main", "response:" + e.toString());
                Message message = new Message();
                Bundle b = new Bundle();
                b.putString("error", e.toString());
                message.setData(b);
                message.what = TAG_ONE;
                handler.sendMessage(message);
            }

            @Override
            public void onResponse(Response response) throws IOException {
//                Log.i("main", "response:" + response.body().string());
                String data = response.body().string();
                Message message = new Message();
                Bundle b = new Bundle();
                b.putString("data", data);
                message.setData(b);
                message.what = TAG_TWO;
                handler.sendMessage(message);
            }
        });
    }

    /**
     * 获取营运数据
     */
    private void getYYData() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM", Locale.CHINA);
        String now = sdf.format(new Date());
        final String path_url = Constant.BASE_URL2 + Constant.YINGYUNDATA;
        map.clear();
        map.put("month",now);
        httpUtil.postForm(path_url, map, new OkHttpUtil.ResultCallback() {
            @Override
            public void onError(Request request, Exception e) {
//                Log.i("main", "response:" + e.toString());
                Message message = new Message();
                Bundle b = new Bundle();
                b.putString("error", e.toString());
                message.setData(b);
                message.what = TAG_ONE;
                handler.sendMessage(message);
            }

            @Override
            public void onResponse(Response response) throws IOException {
//                Log.i("main", "response:" + response.body().string());
                String data = response.body().string();
                Message message = new Message();
                Bundle b = new Bundle();
                b.putString("data", data);
                message.setData(b);
                message.what = TAG_THERE;
                handler.sendMessage(message);
            }
        });
    }

    private void addItem() {
        ItemBean bean1 = new ItemBean();
        int drawableId1 = getResources().getIdentifier("fragment_rb1", "drawable", getActivity().getPackageName());
        bean1.setAddress(drawableId1);
        bean1.setName(getResources().getString(R.string.fragment_rb1));
        itemList.add(bean1);

        ItemBean bean2 = new ItemBean();
        int drawableId2 = getResources().getIdentifier("fragment_rb2", "drawable", getActivity().getPackageName());
        bean2.setAddress(drawableId2);
        bean2.setName(getResources().getString(R.string.fragment_rb2));
        itemList.add(bean2);

        ItemBean bean3 = new ItemBean();
        int drawableId3 = getResources().getIdentifier("fragment_rb3", "drawable", getActivity().getPackageName());
        bean3.setAddress(drawableId3);
        bean3.setName(getResources().getString(R.string.fragment_rb3));
        itemList.add(bean3);

        ItemBean bean4 = new ItemBean();
        int drawableId4 = getResources().getIdentifier("fragment_rb4", "drawable", getActivity().getPackageName());
        bean4.setAddress(drawableId4);
        bean4.setName(getResources().getString(R.string.fragment_rb4));
//        itemList.add(bean4);

        ItemBean bean5 = new ItemBean();
        int drawableId5 = getResources().getIdentifier("fragment_rb5", "drawable", getActivity().getPackageName());
        bean5.setAddress(drawableId5);
        bean5.setName(getResources().getString(R.string.fragment_rb5));
//        itemList.add(bean5);

        ItemBean bean6 = new ItemBean();
        int drawableId6 = getResources().getIdentifier("fragment_rb6", "drawable", getActivity().getPackageName());
        bean6.setAddress(drawableId6);
        bean6.setName(getResources().getString(R.string.fragment_rb6));
        itemList.add(bean6);

        ItemBean bean7 = new ItemBean();
        int drawableId7 = getResources().getIdentifier("fragment_rb7", "drawable", getActivity().getPackageName());
        bean7.setAddress(drawableId7);
        bean7.setName(getResources().getString(R.string.fragment_rb7));
        itemList.add(bean7);

        ItemBean bean8 = new ItemBean();
        int drawableId8 = getResources().getIdentifier("fragment_rb8", "drawable", getActivity().getPackageName());
        bean8.setAddress(drawableId8);
        bean8.setName(getResources().getString(R.string.fragment_rb8));
        itemList.add(bean8);
    }

    private void setItemAdapter() {
        GridLayoutManager manager = new GridLayoutManager(getActivity(), 4);
        recyclerView.setLayoutManager(manager);
        mAdapter = new BaseRecyclerAdapter<ItemBean>(getActivity(), R.layout.adapter_itembean, itemList) {
            @Override
            public void convert(BaseViewHolder holder, final ItemBean itemBean) {
                holder.setText(R.id.textView, itemBean.getName());
                holder.setImageResource(R.id.imageView, itemBean.getAddress());
                holder.setOnClickListener(R.id.linearLayout, new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if (itemBean.getName().equals(getResources().getString(R.string.fragment_rb1))) {
                            intent = new Intent(getActivity(), OAFlowListActivity.class);
                            startActivity(intent);
                        } else if (itemBean.getName().equals(getResources().getString(R.string.fragment_rb2))) {
                            intent = new Intent(getActivity(), HuManListActivity.class);
                            startActivity(intent);
                        } else if (itemBean.getName().equals(getResources().getString(R.string.fragment_rb3))) {
                            intent = new Intent(getActivity(), OperationListActivity.class);
                            startActivity(intent);
                        } else if (itemBean.getName().equals(getResources().getString(R.string.fragment_rb4))) {
//                            intent = new Intent(getActivity(), RepairListActivity.class);
//                            startActivity(intent);
                        } else if (itemBean.getName().equals(getResources().getString(R.string.fragment_rb5))) {
//                            intent = new Intent(getActivity(), MaterialListActivity.class);
//                            startActivity(intent);
                        } else if (itemBean.getName().equals(getResources().getString(R.string.fragment_rb6))) {
                            intent = new Intent(getActivity(), SaferListActivity.class);
                            startActivity(intent);
                        } else if (itemBean.getName().equals(getResources().getString(R.string.fragment_rb7))) {
                            intent = new Intent(getActivity(), StatistListActivity.class);
                            startActivity(intent);
                        } else if (itemBean.getName().equals(getResources().getString(R.string.fragment_rb8))) {
                            intent = new Intent(getActivity(), ComperListActivity.class);
                            startActivity(intent);
                        }
                    }
                });
            }
        };
        recyclerView.setAdapter(mAdapter);
        mAdapter.notifyDataSetChanged();
    }

    @OnClick(R.id.tvLoginMore)
    public void onViewClicked() {
        intent = new Intent(getActivity(), LoginPersonMoreActivity.class);
        startActivity(intent);
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        unbinder.unbind();
    }

    Handler handler = new Handler() {
        @Override
        public void handleMessage(Message msg) {
            super.handleMessage(msg);
            switch (msg.what) {
                case TAG_ONE:
                    String message = msg.getData().getString("error");
                    Toast.makeText(getActivity(), message, Toast.LENGTH_SHORT).show();
                    ProgressDialogUtil.stopLoad();
                    break;
                case TAG_TWO:
                    Bundle b1 = msg.getData();
                    String data = b1.getString("data");
                    LoginPerson bean = new Gson().fromJson(data, LoginPerson.class);
                    if (bean.getResult().size() > 10) {
                        for (int i = 0; i < 10; i++) {
                            loginPersonList.add(bean.getResult().get(i));
                        }
                    } else {
                        for (int i = 0; i < bean.getResult().size(); i++) {
                            loginPersonList.add(bean.getResult().get(i));
                        }
                    }
                    mAdapterLogin.notifyDataSetChanged();
                    getYYData();
                    break;
                case TAG_THERE:
                    Bundle b2 = msg.getData();
                    String data2 = b2.getString("data");
                    try {
                        JSONArray jsonArray = new JSONArray(data2);
                        for (int i = 0; i < jsonArray.length(); i++) {
                            JSONObject jsonObject = jsonArray.getJSONObject(i);
                            YingYunData yyBena = new YingYunData();
                            yyBena.setNum(jsonObject.getString("num"));
                            yyBena.setType(jsonObject.getString("type"));
                            yingyunList.add(yyBena);
                        }
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                    baseAdapterYY.notifyDataSetChanged();
                    ProgressDialogUtil.stopLoad();
                    break;
                case TAG_FOUR:
                    Bundle b3 = msg.getData();
                    String data3 = b3.getString("data");
                    OAFlowNum bean3 = new Gson().fromJson(data3, OAFlowNum.class);
                    if (bean3.getTotalCounts() != 0) {
                        for (int i = 0; i < bean3.getResult().size(); i++) {
                            entries.add(new BarEntry(Float.parseFloat(bean3.getResult().get(i).getNum()), i));
                            labels.add(bean3.getResult().get(i).getName());
                            dataset = new BarDataSet(entries, "流程统计图");
                            dataset.setColors(ColorTemplate.COLORFUL_COLORS);
                            dataSets.add(dataset);
                        }
                    }
                    BarData dataNum = new BarData(labels, dataset);
                    mBarChart.setData(dataNum);
                    break;
            }
        }
    };
}
