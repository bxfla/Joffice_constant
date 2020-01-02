package com.hy.powerplatform.oa_flow.metting;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;

import com.hy.powerplatform.R;
import com.hy.powerplatform.my_utils.base.BaseActivity;
import com.hy.powerplatform.my_utils.myViews.Header;
import com.hy.powerplatform.my_utils.utils.AlertDialogUtil;
import com.hy.powerplatform.oa_flow.metting.activity.JiYaoListActivity;
import com.hy.powerplatform.oa_flow.metting.activity.MyOverOpenListActivity;
import com.hy.powerplatform.oa_flow.metting.activity.MyWillOpenListActivity;
import com.hy.powerplatform.oa_flow.metting.activity.OverOpenListActivity;
import com.hy.powerplatform.oa_flow.metting.activity.WillOpenListActivity;

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
    @BindView(R.id.rb3)
    RadioButton rb3;
    @BindView(R.id.rb4)
    RadioButton rb4;
    @BindView(R.id.rb5)
    RadioButton rb5;
    Intent intent;
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

    @OnClick({R.id.rb1, R.id.rb2, R.id.rb3, R.id.rb4, R.id.rb5})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.rb1:
                intent = new Intent(this, MyWillOpenListActivity.class);
                startActivity(intent);
                break;
            case R.id.rb2:
                intent = new Intent(this, MyOverOpenListActivity.class);
                startActivity(intent);
                break;
            case R.id.rb3:
                intent = new Intent(this, WillOpenListActivity.class);
                startActivity(intent);
                break;
            case R.id.rb4:
                intent = new Intent(this, OverOpenListActivity.class);
                startActivity(intent);
                break;
            case R.id.rb5:
                intent = new Intent(this, JiYaoListActivity.class);
                startActivity(intent);
                break;
        }
    }
}
