package com.hy.powerplatform.oa_flow;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.hy.powerplatform.R;
import com.hy.powerplatform.duban.bean.ItemBean;
import com.hy.powerplatform.my_utils.base.BaseActivity;
import com.hy.powerplatform.my_utils.myViews.Header;
import com.hy.powerplatform.my_utils.utils.AlertDialogUtil;
import com.hy.powerplatform.my_utils.utils.BaseRecyclerAdapter;
import com.hy.powerplatform.my_utils.utils.BaseViewHolder;
import com.hy.powerplatform.oa_flow.metting.MettingListActivity;
import com.hy.powerplatform.oa_flow.notice.NoticeListActivity;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class OAFlowListActivity extends BaseActivity {

    @BindView(R.id.header)
    Header header;
    @BindView(R.id.recyclerView)
    RecyclerView recyclerView;

    Intent intent;
    BaseRecyclerAdapter mAdapter;
    AlertDialogUtil alertDialogUtil;
    List<ItemBean> itemList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ButterKnife.bind(this);
        alertDialogUtil = new AlertDialogUtil(this);
        //添加模块
        addItem();
        setItemAdapter();
    }

    @Override
    protected int provideContentViewId() {
        return R.layout.activity_oaflow_list;
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
        int drawableId1 = getResources().getIdentifier("oaflow_rb1", "drawable", getPackageName());
        bean1.setAddress(drawableId1);
        bean1.setName(getResources().getString(R.string.oaflow_rb1));
        itemList.add(bean1);

        ItemBean bean2 = new ItemBean();
        int drawableId2 = getResources().getIdentifier("oaflow_rb2", "drawable", getPackageName());
        bean2.setAddress(drawableId2);
        bean2.setName(getResources().getString(R.string.oaflow_rb2));
        itemList.add(bean2);

        ItemBean bean3 = new ItemBean();
        int drawableId3 = getResources().getIdentifier("oaflow_rb3", "drawable", getPackageName());
        bean3.setAddress(drawableId3);
        bean3.setName(getResources().getString(R.string.oaflow_rb3));
        itemList.add(bean3);

        ItemBean bean4 = new ItemBean();
        int drawableId4 = getResources().getIdentifier("oaflow_rb4", "drawable", getPackageName());
        bean4.setAddress(drawableId4);
        bean4.setName(getResources().getString(R.string.oaflow_rb4));
        itemList.add(bean4);
    }

    private void setItemAdapter() {
        GridLayoutManager manager = new GridLayoutManager (this,4);
        recyclerView.setLayoutManager(manager);
        mAdapter = new BaseRecyclerAdapter<ItemBean>(this, R.layout.adapter_itembean, itemList) {
            @Override
            public void convert(BaseViewHolder holder, final ItemBean itemBean) {
                holder.setText(R.id.textView, itemBean.getName());
                holder.setImageResource(R.id.imageView, itemBean.getAddress());
                holder.setOnClickListener(R.id.linearLayout, new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if (itemBean.getName().equals(getResources().getString(R.string.oaflow_rb1))){
                            intent = new Intent(OAFlowListActivity.this, NoticeListActivity.class);
                            startActivity(intent);
                        }else if (itemBean.getName().equals(getResources().getString(R.string.oaflow_rb2))){
                            intent = new Intent(OAFlowListActivity.this, MettingListActivity.class);
                            startActivity(intent);
                        }else if (itemBean.getName().equals(getResources().getString(R.string.oaflow_rb3))){
                            intent = new Intent(OAFlowListActivity.this, OAListActivity.class);
                            startActivity(intent);
                        }else if (itemBean.getName().equals(getResources().getString(R.string.oaflow_rb4))){
                        }
                    }
                });
            }
        };
        recyclerView.setAdapter(mAdapter);
        mAdapter.notifyDataSetChanged();
    }
}
