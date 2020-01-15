package com.hy.powerplatform.login.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
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
import com.hy.powerplatform.SharedPreferencesHelper;
import com.hy.powerplatform.comper.ComperListActivity;
import com.hy.powerplatform.duban.bean.ItemBean;
import com.hy.powerplatform.human.HuManListActivity;
import com.hy.powerplatform.login.activity.LoginPersonMoreActivity;
import com.hy.powerplatform.login.bean.LoginPerson;
import com.hy.powerplatform.login.bean.OAFlowNum;
import com.hy.powerplatform.login.bean.YingYunData;
import com.hy.powerplatform.my_utils.base.Constant;
import com.hy.powerplatform.my_utils.base.OkHttpUtil;
import com.hy.powerplatform.my_utils.utils.AlertDialogUtil;
import com.hy.powerplatform.my_utils.utils.BaseRecyclerAdapter;
import com.hy.powerplatform.my_utils.utils.BaseRecyclerAdapterPosition;
import com.hy.powerplatform.my_utils.utils.BaseViewHolder;
import com.hy.powerplatform.my_utils.utils.BaseViewHolderPosition;
import com.hy.powerplatform.my_utils.utils.ProgressDialogUtil;
import com.hy.powerplatform.my_utils.utils.time_select.CustomDatePickerMonth;
import com.hy.powerplatform.oa_flow.OAFlowListActivity;
import com.hy.powerplatform.oa_flow.bean.WillDoNum;
import com.hy.powerplatform.operation.OperationListActivity;
import com.hy.powerplatform.safer.SaferListActivity;
import com.hy.powerplatform.statist.StatistListActivity;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
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

import static com.hy.powerplatform.my_utils.base.Constant.TAG_FIVE;
import static com.hy.powerplatform.my_utils.base.Constant.TAG_FOUR;
import static com.hy.powerplatform.my_utils.base.Constant.TAG_ONE;
import static com.hy.powerplatform.my_utils.base.Constant.TAG_SIX;
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
    @BindView(R.id.tvDate)
    TextView tvDate;

    //数据的集合
    public BarDataSet dataset;
    //保存数据的实体（下面定义了两组数据集合）
    public ArrayList<BarEntry> entries = new ArrayList<BarEntry>();
    //表格下方的文字
    public ArrayList<String> labels = new ArrayList<String>();

    Unbinder unbinder;
    int num = 0;
    String rights;
    String userStatus;
    Intent intent;
    private OkHttpUtil httpUtil;
    BaseRecyclerAdapter mAdapter;
    AlertDialogUtil alertDialogUtil;
    BaseRecyclerAdapter baseAdapterYY;
    private CustomDatePickerMonth customDatePicker1;
    BaseRecyclerAdapterPosition mAdapterLogin;
    List<ItemBean> itemList = new ArrayList<>();
    ArrayList<IBarDataSet> dataSets = new ArrayList<>();
    final HashMap<String, String> map = new HashMap();
    List<YingYunData> yingyunList = new ArrayList<>();
    List<LoginPerson.ResultBean> loginPersonList = new ArrayList<>();
    List<WillDoNum.ResultBean> willDoList = new ArrayList<>();
    final HashMap<String, String> map1 = new HashMap();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Log.e("XXXCCCC", "111");
        if (view != null) {
            ViewGroup parent = (ViewGroup) view.getParent();
            if (null != parent) {
                parent.removeView(view);
            }
        } else {
            view = inflater.inflate(R.layout.fragment01, container, false);
            unbinder = ButterKnife.bind(this, view);
            userStatus = new SharedPreferencesHelper(getActivity(), "login").getData(getActivity(), "userStatus", "");
            rights = new SharedPreferencesHelper(getActivity(), "login").getData(getActivity(), "rights", "");
            httpUtil = OkHttpUtil.getInstance(getActivity());
            mBarChart.setDescription(null);
            getLoginPerson();
            getOAFlowNum();
            initDatePicker();
            alertDialogUtil = new AlertDialogUtil(getActivity());
            LinearLayoutManager manager = new LinearLayoutManager(getActivity());
            recyclerViewLogin.setLayoutManager(manager);
            //设置布局的方式
            GridLayoutManager layoutManager = new GridLayoutManager(getActivity(), 3);
            recyclerViewYY.setLayoutManager(layoutManager);
//        //添加模块
//        addItem();
//        setItemAdapter();
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
        }
        return view;
    }

    @Override
    public void onResume() {
        super.onResume();
        getNum();
    }

    /**
     * 获取代办数量
     */
    private void getNum() {
        num = 0;
        itemList.clear();
        final String path_url = Constant.BASE_URL2 + Constant.MYWILLDOLIST + 0 + "&limit=" + 200;
        httpUtil.getAsynHttp(path_url, new OkHttpUtil.ResultCallback() {
            @Override
            public void onError(Request request, Exception e) {
//                Log.i("main", "response:" + e.toString());
                Message message = new Message();
                Bundle b = new Bundle();
                b.putString("error", e.toString());
                message.setData(b);
                message.what = TAG_SIX;
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
                message.what = TAG_FIVE;
                handler.sendMessage(message);
            }
        });
    }

    /**
     * 选择时间
     */
    private void initDatePicker() {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM", Locale.CHINA);
        Calendar c = Calendar.getInstance();
        //过去一月
        c.setTime(new Date());
        c.add(Calendar.MONTH, -1);
        Date m = c.getTime();
        String mon = format.format(m);
        tvDate.setText(mon);

        customDatePicker1 = new CustomDatePickerMonth(getActivity(), new CustomDatePickerMonth.ResultHandler() {
            @Override
            public void handle(String time) { // 回调接口，获得选中的时间
                String date = time.split(" ")[0];
                String date1 = date.split("-")[0] + "-" + date.split("-")[1];
                tvDate.setText(date1);
                getYYData();
            }
        }, "2000-01-01 00:00", "2030-01-01 00:00"); // 初始化日期格式请用：yyyy-MM-dd HH:mm，否则不能正常运行
        customDatePicker1.showSpecificTime(false); // 不显示时和分
        customDatePicker1.setIsLoop(false); // 不允许循环滚动
        customDatePicker1.showSpecificDay(false); // 不允许循环滚动
    }

    /**
     * 获取流程情况
     */
    private void getOAFlowNum() {
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
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        Calendar c = Calendar.getInstance();
        //过去七天
        c.setTime(new Date());
        c.add(Calendar.DATE, -7);
        Date d = c.getTime();
        String day = format.format(d);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd", Locale.CHINA);
        String now = sdf.format(new Date());
        String endDate = now.split(" ")[0];
        map1.clear();
        map1.put("beginDate", day);
        map1.put("endDate", endDate);
        httpUtil.postForm(path_url, map1, new OkHttpUtil.ResultCallback() {
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
        map.put("month", tvDate.getText().toString());
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
        itemList.clear();
        ItemBean bean1 = new ItemBean();
        int drawableId1 = getResources().getIdentifier("fragment_rb1", "drawable", getActivity().getPackageName());
        bean1.setAddress(drawableId1);
        bean1.setName(getResources().getString(R.string.fragment_rb1));
        if (rights.contains(",NoticeView")||rights.contains(",MyJoinConferenceView")||rights.contains(",MyJoinedConferenceView")
            ||rights.contains(",WaitOpenConferenceView")||rights.contains(",HaveOpenConferenceView")||rights.contains(",ConfSummaryView")
            ||rights.contains(",NewProcess")||rights.contains(",MyTaskView")||rights.contains(",MyProcessRunView")
            ||rights.contains(",RelevantProcessRunView")||rights.contains(",RevokeFlowDetailView")||rights.contains(",FileSendView")
            ||rights.contains(",SuperWorkTaskView")||rights.contains(",SuperWorkTaskView")||rights.contains(",SuperTaskOperView")
            ||rights.contains(",SuperWorkTaskSuperView")) {
            itemList.add(bean1);
        }else if (userStatus.equals("超级管理员")){
            itemList.add(bean1);
        }

        ItemBean bean2 = new ItemBean();
        int drawableId2 = getResources().getIdentifier("fragment_rb2", "drawable", getActivity().getPackageName());
        bean2.setAddress(drawableId2);
        bean2.setName(getResources().getString(R.string.fragment_rb2));
        if (rights.contains(",ResumeView")||rights.contains(",DriverPracticeFileView")||rights.contains(",EmpNormalSearchView")) {
            itemList.add(bean2);
        }else if (userStatus.equals("超级管理员")){
            itemList.add(bean2);
        }

        ItemBean bean3 = new ItemBean();
        int drawableId3 = getResources().getIdentifier("fragment_rb3", "drawable", getActivity().getPackageName());
        bean3.setAddress(drawableId3);
        bean3.setName(getResources().getString(R.string.fragment_rb3));
        if (rights.contains(",CarManeger")||rights.contains(",LineInfoView")) {
            itemList.add(bean3);
        }else if (userStatus.equals("超级管理员")){
            itemList.add(bean3);
        }

        ItemBean bean6 = new ItemBean();
        int drawableId6 = getResources().getIdentifier("fragment_rb6", "drawable", getActivity().getPackageName());
        bean6.setAddress(drawableId6);
        bean6.setName(getResources().getString(R.string.fragment_rb6));
        if (rights.contains(",ViolationRecordView")||rights.contains(",AccidentBasicInformationView")) {
            itemList.add(bean6);
        }else if (userStatus.equals("超级管理员")){
            itemList.add(bean6);
        }

        ItemBean bean7 = new ItemBean();
        int drawableId7 = getResources().getIdentifier("fragment_rb7", "drawable", getActivity().getPackageName());
        bean7.setAddress(drawableId7);
        bean7.setName(getResources().getString(R.string.fragment_rb7));
        itemList.add(bean7);

        ItemBean bean8 = new ItemBean();
        int drawableId8 = getResources().getIdentifier("fragment_rb8", "drawable", getActivity().getPackageName());
        bean8.setAddress(drawableId8);
        bean8.setName(getResources().getString(R.string.fragment_rb8));
        if (rights.contains(",OperationIndexReportView")||rights.contains(",ProductionOperationAnalysisView")) {
            itemList.add(bean8);
        }else if (userStatus.equals("超级管理员")){
            itemList.add(bean8);
        }

        ItemBean bean4 = new ItemBean();
        int drawableId4 = getResources().getIdentifier("fragment_rb4", "drawable", getActivity().getPackageName());
        bean4.setAddress(drawableId4);
        bean4.setName(getResources().getString(R.string.fragment_rb4));
        itemList.add(bean4);

        ItemBean bean5 = new ItemBean();
        int drawableId5 = getResources().getIdentifier("fragment_rb5", "drawable", getActivity().getPackageName());
        bean5.setAddress(drawableId5);
        bean5.setName(getResources().getString(R.string.fragment_rb5));
        itemList.add(bean5);
    }

    private void setItemAdapter() {
        GridLayoutManager manager = new GridLayoutManager(getActivity(), 4);
        recyclerView.setLayoutManager(manager);
        mAdapter = new BaseRecyclerAdapter<ItemBean>(getActivity(), R.layout.adapter_maindata, itemList) {
            @Override
            public void convert(BaseViewHolder holder, final ItemBean itemBean) {
                if (itemBean.getName().equals(getResources().getString(R.string.fragment_rb1)) && Integer.valueOf(num) != 0) {
                    holder.setVisitiomV(R.id.tvRolese);
                    holder.setText(R.id.tvRolese, String.valueOf(num));
                }
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
                            alertDialogUtil.showSmallDialog(getResources().getString(R.string.no_fuction));
                        } else if (itemBean.getName().equals(getResources().getString(R.string.fragment_rb5))) {
                            alertDialogUtil.showSmallDialog(getResources().getString(R.string.no_fuction));
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

    @OnClick({R.id.tvLoginMore, R.id.tvDate})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.tvLoginMore:
                intent = new Intent(getActivity(), LoginPersonMoreActivity.class);
                startActivity(intent);
                break;
            case R.id.tvDate:
                customDatePicker1.show(tvDate.getText().toString());
                break;
        }
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
                        yingyunList.clear();
                        for (int i = 0; i < jsonArray.length(); i++) {
                            JSONObject jsonObject = jsonArray.getJSONObject(i);
                            YingYunData yyBena = new YingYunData();
                            yyBena.setNum(jsonObject.getString("num"));
                            if (jsonObject.getString("type") != null && jsonObject.getString("type").equals("收入")) {
                                yyBena.setType(jsonObject.getString("type") + "(万)");
                            } else if (jsonObject.getString("type") != null && jsonObject.getString("type").equals("成本")) {
                                yyBena.setType(jsonObject.getString("type") + "(万)");
                            } else if (jsonObject.getString("type") != null && jsonObject.getString("type").equals("里程")) {
                                yyBena.setType(jsonObject.getString("type") + "(万公里)");
                            } else if (jsonObject.getString("type") != null && jsonObject.getString("type").equals("人数")) {
                                yyBena.setType(jsonObject.getString("type") + "(人)");
                            } else if (jsonObject.getString("type") != null && jsonObject.getString("type").equals("客流量")) {
                                yyBena.setType(jsonObject.getString("type") + "(人次)");
                            }
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
                        BarData dataNum = new BarData(labels, dataset);
                        mBarChart.setData(dataNum);
                        //通知BarData更新
                        mBarChart.getBarData().notifyDataChanged();
                        //通知BarChart更新
                        mBarChart.notifyDataSetChanged();
                        //使图表更新生效
                        mBarChart.invalidate();
                    }
                    break;
                case TAG_FIVE:
                    willDoList.clear();
                    Bundle bnum = msg.getData();
                    String datanum = bnum.getString("data");
                    WillDoNum beannum = new Gson().fromJson(datanum, WillDoNum.class);
                    for (int i = 0; i < beannum.getResult().size(); i++) {
                        willDoList.add(beannum.getResult().get(i));
                    }
                    if (willDoList.size() != 0) {
                        num = willDoList.size();
                    }
                    //添加模块
                    addItem();
                    setItemAdapter();
                    break;
                case TAG_SIX:
                    String message1 = msg.getData().getString("error");
                    Toast.makeText(getActivity(), message1, Toast.LENGTH_SHORT).show();
                    ProgressDialogUtil.stopLoad();
                    //添加模块
                    addItem();
                    setItemAdapter();
                    break;
            }
        }
    };

}
