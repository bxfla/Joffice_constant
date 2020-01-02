package com.hy.powerplatform.comper.activity;

import android.os.Bundle;

import com.hy.powerplatform.R;
import com.hy.powerplatform.my_utils.base.BaseActivity;

import butterknife.ButterKnife;

public class YingYunZBActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ButterKnife.bind(this);
    }

    @Override
    protected int provideContentViewId() {
        return R.layout.activity_add_main_tain;
    }

    @Override
    protected boolean isHasHeader() {
        return true;
    }

    @Override
    protected void rightClient() {

    }
}
