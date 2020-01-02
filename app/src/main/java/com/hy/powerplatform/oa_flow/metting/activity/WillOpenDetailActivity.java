package com.hy.powerplatform.oa_flow.metting.activity;

import android.os.Bundle;
import android.widget.TextView;

import com.hy.powerplatform.R;
import com.hy.powerplatform.my_utils.base.BaseActivity;
import com.hy.powerplatform.my_utils.myViews.Header;
import com.hy.powerplatform.my_utils.myViews.RichTextView;
import com.hy.powerplatform.oa_flow.metting.bean.WillOpenList;

import butterknife.BindView;
import butterknife.ButterKnife;

public class WillOpenDetailActivity extends BaseActivity {

    @BindView(R.id.header)
    Header header;
    @BindView(R.id.tvTitle)
    TextView tvTitle;
    @BindView(R.id.tvType)
    TextView tvType;
    @BindView(R.id.tvHome)
    TextView tvHome;
    @BindView(R.id.tvJB)
    TextView tvJB;
    @BindView(R.id.tvStartTime)
    TextView tvStartTime;
    @BindView(R.id.tvOverTime)
    TextView tvOverTime;
    @BindView(R.id.tvContent)
    RichTextView tvContent;
    @BindView(R.id.tvZCR)
    TextView tvZCR;
    @BindView(R.id.tvJLR)
    TextView tvJLR;
    @BindView(R.id.tvCJJYR)
    TextView tvCJJYR;
    @BindView(R.id.tvXGR)
    TextView tvXGR;
    @BindView(R.id.tvCKR)
    TextView tvCKR;
    @BindView(R.id.tvCJR)
    TextView tvCJR;
    @BindView(R.id.tvCSR)
    TextView tvCSR;
    @BindView(R.id.tvCSBZ)
    TextView tvCSBZ;
    @BindView(R.id.tvSPR)
    TextView tvSPR;
    @BindView(R.id.tvZT)
    TextView tvZT;
    @BindView(R.id.tvSHBZ)
    TextView tvSHBZ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ButterKnife.bind(this);
        header.setTvTitle(getResources().getString(R.string.oaflow_metting_rb3));
        WillOpenList.ResultBean bean = (WillOpenList.ResultBean) getIntent().getSerializableExtra("bean");
        tvTitle.setText(bean.getConfTopic());
        tvType.setText(bean.getConfProperty());
        tvHome.setText(bean.getRoomName());
        tvStartTime.setText(bean.getStartTime());
        tvOverTime.setText(bean.getEndTime());
        tvContent.setHtml1(bean.getConfContent(),500);
        tvZCR.setText(bean.getCompereName());
        tvJLR.setText(bean.getRecorderName());
        tvCJR.setText(bean.getAttendUsersName());
        tvXGR.setText(bean.getRecorderName());
        tvCSR.setText(bean.getApprovedName());
        tvCSBZ.setText(bean.getApprovedText());
        tvSPR.setText(bean.getApprovedName());
    }

    @Override
    protected int provideContentViewId() {
        return R.layout.activity_mywill_open_detail;
    }

    @Override
    protected boolean isHasHeader() {
        return true;
    }

    @Override
    protected void rightClient() {

    }
}
