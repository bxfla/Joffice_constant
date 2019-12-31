package com.hy.powerplatform.oa_flow.metting;

import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;

import com.hy.powerplatform.R;
import com.hy.powerplatform.my_utils.base.BaseActivity;
import com.hy.powerplatform.my_utils.myViews.Header;
import com.hy.powerplatform.my_utils.utils.AlertDialogUtil;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MettingListActivity extends BaseActivity {

    @BindView(R.id.header)
    Header header;
    @BindView(R.id.rb1)
    RadioButton rb1;
    @BindView(R.id.rb2)
    RadioButton rb2;
    AlertDialogUtil alertDialogUtil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ButterKnife.bind(this);
        alertDialogUtil = new AlertDialogUtil(this);
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

    @OnClick({R.id.rb1, R.id.rb2})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.rb1:
                break;
            case R.id.rb2:
                break;
        }
    }
}
