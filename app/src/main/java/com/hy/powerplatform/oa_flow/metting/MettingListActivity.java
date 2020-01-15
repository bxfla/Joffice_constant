package com.hy.powerplatform.oa_flow.metting;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.hy.powerplatform.R;
import com.hy.powerplatform.SharedPreferencesHelper;
import com.hy.powerplatform.duban.bean.ItemBean;
import com.hy.powerplatform.my_utils.base.BaseActivity;
import com.hy.powerplatform.my_utils.myViews.Header;
import com.hy.powerplatform.my_utils.utils.AlertDialogUtil;
import com.hy.powerplatform.my_utils.utils.BaseRecyclerAdapter;
import com.hy.powerplatform.my_utils.utils.BaseViewHolder;
import com.hy.powerplatform.oa_flow.metting.activity.JiYaoListActivity;
import com.hy.powerplatform.oa_flow.metting.activity.MyOverOpenListActivity;
import com.hy.powerplatform.oa_flow.metting.activity.MyWillOpenListActivity;
import com.hy.powerplatform.oa_flow.metting.activity.OverOpenListActivity;
import com.hy.powerplatform.oa_flow.metting.activity.WillOpenListActivity;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MettingListActivity extends BaseActivity {

    @BindView(R.id.header)
    Header header;
    @BindView(R.id.recyclerView)
    RecyclerView recyclerView;

    Intent intent;
    String rights;
    String userStatus;
    BaseRecyclerAdapter mAdapter;
    AlertDialogUtil alertDialogUtil;
    List<ItemBean> itemList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ButterKnife.bind(this);
        alertDialogUtil = new AlertDialogUtil(this);
        rights = new SharedPreferencesHelper(this, "login").getData(this, "rights", "");
        userStatus = new SharedPreferencesHelper(this, "login").getData(this, "userStatus", "");
        addItem();
        setItemAdapter();
    }

    @Override
    protected int provideContentViewId() {
        return R.layout.activity_metting_list;
    }

    @Override
    protected boolean isHasHeader() {
        return true;
    }

    @Override
    protected void rightClient() {

    }

    private void addItem() {
        ItemBean bean1 = new ItemBean();
        int drawableId1 = getResources().getIdentifier("oaflow_metting_rb1", "drawable", getPackageName());
        bean1.setAddress(drawableId1);
        bean1.setName(getResources().getString(R.string.oaflow_metting_rb1));
        if (rights.contains(",MyJoinConferenceView")) {
            itemList.add(bean1);
        }else if (userStatus.equals("超级管理员")){
            itemList.add(bean1);
        }

        ItemBean bean2 = new ItemBean();
        int drawableId2 = getResources().getIdentifier("oaflow_metting_rb2", "drawable", getPackageName());
        bean2.setAddress(drawableId2);
        bean2.setName(getResources().getString(R.string.oaflow_metting_rb2));
        if (rights.contains(",MyJoinedConferenceView")) {
            itemList.add(bean2);
        }else if (userStatus.equals("超级管理员")){
            itemList.add(bean2);
        }

        ItemBean bean3 = new ItemBean();
        int drawableId3 = getResources().getIdentifier("oaflow_metting_rb3", "drawable", getPackageName());
        bean3.setAddress(drawableId3);
        bean3.setName(getResources().getString(R.string.oaflow_metting_rb3));
        if (rights.contains(",WaitOpenConferenceView")) {
            itemList.add(bean3);
        }else if (userStatus.equals("超级管理员")){
            itemList.add(bean3);
        }

        ItemBean bean4 = new ItemBean();
        int drawableId4 = getResources().getIdentifier("oaflow_metting_rb4", "drawable", getPackageName());
        bean4.setAddress(drawableId4);
        bean4.setName(getResources().getString(R.string.oaflow_metting_rb4));
        if (rights.contains(",HaveOpenConferenceView")) {
            itemList.add(bean4);
        }else if (userStatus.equals("超级管理员")){
            itemList.add(bean4);
        }

        ItemBean bean5 = new ItemBean();
        int drawableId5 = getResources().getIdentifier("oaflow_metting_rb5", "drawable", getPackageName());
        bean5.setAddress(drawableId5);
        bean5.setName(getResources().getString(R.string.oaflow_metting_rb5));
        if (rights.contains(",ConfSummaryView")) {
            itemList.add(bean5);
        }else if (userStatus.equals("超级管理员")){
            itemList.add(bean5);
        }
    }

    private void setItemAdapter() {
        GridLayoutManager manager = new GridLayoutManager(this, 3);
        recyclerView.setLayoutManager(manager);
        mAdapter = new BaseRecyclerAdapter<ItemBean>(this, R.layout.adapter_maindata, itemList) {
            @Override
            public void convert(BaseViewHolder holder, final ItemBean itemBean) {
                holder.setText(R.id.textView, itemBean.getName());
                holder.setImageResource(R.id.imageView, itemBean.getAddress());
                holder.setOnClickListener(R.id.linearLayout, new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if (itemBean.getName().equals(getResources().getString(R.string.oaflow_metting_rb1))) {
                            intent = new Intent(MettingListActivity.this, MyWillOpenListActivity.class);
                            startActivity(intent);
                        } else if (itemBean.getName().equals(getResources().getString(R.string.oaflow_metting_rb2))) {
                            intent = new Intent(MettingListActivity.this, MyOverOpenListActivity.class);
                            startActivity(intent);
                        } else if (itemBean.getName().equals(getResources().getString(R.string.oaflow_metting_rb3))) {
                            intent = new Intent(MettingListActivity.this, WillOpenListActivity.class);
                            startActivity(intent);
                        } else if (itemBean.getName().equals(getResources().getString(R.string.oaflow_metting_rb4))) {
                            intent = new Intent(MettingListActivity.this, OverOpenListActivity.class);
                            startActivity(intent);
                        } else if (itemBean.getName().equals(getResources().getString(R.string.oaflow_metting_rb5))) {
                            intent = new Intent(MettingListActivity.this, JiYaoListActivity.class);
                            startActivity(intent);
                        }
                    }
                });
            }
        };
        recyclerView.setAdapter(mAdapter);
        mAdapter.notifyDataSetChanged();
    }
}
