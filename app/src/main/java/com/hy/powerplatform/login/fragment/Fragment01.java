package com.hy.powerplatform.login.fragment;

import android.content.Intent;
import android.os.Bundle;
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
import com.hy.powerplatform.R;
import com.hy.powerplatform.duban.bean.ItemBean;
import com.hy.powerplatform.human.HuManListActivity;
import com.hy.powerplatform.login.bean.LoginPerson;
import com.hy.powerplatform.my_utils.utils.BaseRecyclerAdapter;
import com.hy.powerplatform.my_utils.utils.BaseRecyclerAdapterPosition;
import com.hy.powerplatform.my_utils.utils.BaseViewHolder;
import com.hy.powerplatform.my_utils.utils.BaseViewHolderPosition;
import com.hy.powerplatform.oa_flow.OAFlowListActivity;
import com.hy.powerplatform.operation.OperationListActivity;
import com.hy.powerplatform.safer.SaferListActivity;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;

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
    @BindView(R.id.tv1)
    TextView tv1;
    @BindView(R.id.tv2)
    TextView tv2;
    @BindView(R.id.tv3)
    TextView tv3;
    @BindView(R.id.tv4)
    TextView tv4;
    @BindView(R.id.mBarChart)
    BarChart mBarChart;

    //保存数据的实体（下面定义了两组数据集合）
    public ArrayList<BarEntry> entries = new ArrayList<BarEntry>();
    //数据的集合（每组数据都需要一个数据集合存放数据实体和该组的样式）
    public BarDataSet dataset;
    public BarDataSet dataset1;
    //表格下方的文字
    public ArrayList<String> labels = new ArrayList<String>();

    Unbinder unbinder;
    Intent intent;
    BaseRecyclerAdapter mAdapter;
    BaseRecyclerAdapterPosition mAdapterLogin;
    List<ItemBean> itemList = new ArrayList<>();
    List<LoginPerson> loginPersonList = new ArrayList<>();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment01, container, false);
        unbinder = ButterKnife.bind(this, view);
        LinearLayoutManager manager = new LinearLayoutManager(getActivity());
        recyclerViewLogin.setLayoutManager(manager);
        //添加模块
        addItem();
        setItemAdapter();

        LoginPerson loginPerson = new LoginPerson();
        loginPerson.setUserName("李勇");
        loginPerson.setLoginNum(5 + "");
        loginPersonList.add(loginPerson);

        LoginPerson loginPerson1 = new LoginPerson();
        loginPerson1.setUserName("张苏");
        loginPerson1.setLoginNum(4 + "");
        loginPersonList.add(loginPerson1);

        LoginPerson loginPerson2 = new LoginPerson();
        loginPerson2.setUserName("李明");
        loginPerson2.setLoginNum(4 + "");
        loginPersonList.add(loginPerson2);

        LoginPerson loginPerson3 = new LoginPerson();
        loginPerson3.setUserName("孙有才");
        loginPerson3.setLoginNum(3 + "");
        loginPersonList.add(loginPerson3);

        LoginPerson loginPerson4 = new LoginPerson();
        loginPerson4.setUserName("刘山");
        loginPerson4.setLoginNum(1 + "");
        loginPersonList.add(loginPerson4);
//        for (int i = 0; i < 5; i++) {
//            LoginPerson loginPerson = new LoginPerson();
//            loginPerson.setUserName("袁斌" + i + 1);
//            loginPerson.setLoginNum(i + 1 + "");
//            loginPersonList.add(loginPerson);
//        }

        mAdapterLogin = new BaseRecyclerAdapterPosition<LoginPerson>(getActivity(), R.layout.adapter_loginperson, loginPersonList) {
            @Override
            public void convert(BaseViewHolderPosition holder, final LoginPerson itemBean, int position) {
                holder.setText(R.id.tvNum, 1 + "");
                holder.setText(R.id.tvUserName, itemBean.getUserName());
                holder.setText(R.id.tvLoginNum, itemBean.getLoginNum());
                if (position % 2 != 0) {
                    holder.setColor(R.id.ll);
                }
            }
        };
        recyclerViewLogin.setAdapter(mAdapterLogin);
        mAdapterLogin.notifyDataSetChanged();

        tv1.setText("123");
        tv2.setText("456");
        tv3.setText("789");
        tv4.setText("21324");

        entries.add(new BarEntry(335f, 0));
        entries.add(new BarEntry(110f, 1));

        labels.add("运行中");
        labels.add("已结束");


        dataset = new BarDataSet(entries, "流程统计");
        dataset.setColors(ColorTemplate.COLORFUL_COLORS);
        ArrayList<IBarDataSet> dataSets = new ArrayList<>();
        dataSets.add(dataset);
        BarData data = new BarData(labels,dataset);
        mBarChart.setData(data);
        //设置单个点击事件
        mBarChart.setOnChartValueSelectedListener(new OnChartValueSelectedListener() {
            @Override
            public void onValueSelected(Entry entry, int i, Highlight highlight) {
                Toast.makeText(getActivity(),entry.getVal()+"",Toast.LENGTH_LONG).show();
            }

            @Override
            public void onNothingSelected() {

            }
        });
        //设置显示动画效果
        mBarChart.animateY(2000);
        //设置图标右下放显示文字
        mBarChart.setDescription("MPandroidChart Test");
        return view;
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
        itemList.add(bean4);

        ItemBean bean5 = new ItemBean();
        int drawableId5 = getResources().getIdentifier("fragment_rb5", "drawable", getActivity().getPackageName());
        bean5.setAddress(drawableId5);
        bean5.setName(getResources().getString(R.string.fragment_rb5));
        itemList.add(bean5);

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
//                            intent = new Intent(getActivity(), StatistListActivity.class);
//                            startActivity(intent);
                        } else if (itemBean.getName().equals(getResources().getString(R.string.fragment_rb8))) {
//                            intent = new Intent(getActivity(), ComperListActivity.class);
//                            startActivity(intent);
                        }
                    }
                });
            }
        };
        recyclerView.setAdapter(mAdapter);
        mAdapter.notifyDataSetChanged();
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        unbinder.unbind();
    }
}
