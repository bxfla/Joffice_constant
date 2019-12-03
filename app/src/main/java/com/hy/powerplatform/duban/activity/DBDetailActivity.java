package com.hy.powerplatform.duban.activity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import com.hy.powerplatform.R;
import com.hy.powerplatform.duban.bean.DBList;
import com.hy.powerplatform.my_utils.base.BaseActivity;
import com.hy.powerplatform.my_utils.myViews.Header;

import butterknife.BindView;
import butterknife.ButterKnife;

public class DBDetailActivity extends BaseActivity {

    @BindView(R.id.header)
    Header header;
    @BindView(R.id.tvType)
    TextView tvType;
    @BindView(R.id.tvRW)
    TextView tvRW;
    @BindView(R.id.tvJHWCSJ)
    TextView tvJHWCSJ;
    @BindView(R.id.tvContent)
    TextView tvContent;
    @BindView(R.id.tvDBR)
    TextView tvDBR;
    @BindView(R.id.tvZXR)
    TextView tvZXR;
    @BindView(R.id.tvFBSJ)
    TextView tvFBSJ;
    @BindView(R.id.tvLXR)
    TextView tvLXR;
    @BindView(R.id.tvFJ)
    TextView tvFJ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ButterKnife.bind(this);
        Intent intent = getIntent();
        DBList.ResultBean bean = (DBList.ResultBean) intent.getSerializableExtra("bean");
        tvType.setText(bean.getTaskType());
        tvRW.setText(bean.getTaskName());
        tvJHWCSJ.setText(bean.getPlanFinishTime());
        tvContent.setText(bean.getTaskContext());
        tvDBR.setText(bean.getSupervisorNames());
        tvZXR.setText(bean.getOperatorNames());
        tvFBSJ.setText(bean.getApproveTime());
        tvLXR.setText(bean.getApproverName());
        tvFJ.setText(bean.getFileNames()+"");
    }

    @Override
    protected int provideContentViewId() {
        return R.layout.activity_dndetail;
    }

    @Override
    protected boolean isHasHeader() {
        return true;
    }

    @Override
    protected void rightClient() {

    }
}
