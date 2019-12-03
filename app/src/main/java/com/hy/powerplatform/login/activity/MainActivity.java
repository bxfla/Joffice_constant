package com.hy.powerplatform.login.activity;

import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.annotation.IdRes;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.KeyEvent;
import android.widget.FrameLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import com.google.gson.Gson;
import com.hy.powerplatform.R;
import com.hy.powerplatform.business_inspect.utils.DBHandler;
import com.hy.powerplatform.login.bean.Version;
import com.hy.powerplatform.login.fragment.Fragment01;
import com.hy.powerplatform.login.fragment.Fragment02;
import com.hy.powerplatform.my_utils.base.AlertDialogCallBack;
import com.hy.powerplatform.my_utils.base.BaseActivity;
import com.hy.powerplatform.my_utils.base.Constant;
import com.hy.powerplatform.my_utils.myViews.Header;
import com.hy.powerplatform.my_utils.utils.AlertDialogUtil;
import com.hy.powerplatform.my_utils.utils.ProgressDialogUtil;

import butterknife.BindView;
import butterknife.ButterKnife;

import static com.hy.powerplatform.my_utils.base.Constant.TAG_FOUR;
import static com.hy.powerplatform.my_utils.base.Constant.TAG_TWO;

public class MainActivity extends BaseActivity  implements RadioGroup.OnCheckedChangeListener{

    @BindView(R.id.header)
    Header header;
    @BindView(R.id.frame_layout)
    FrameLayout frameLayout;
    @BindView(R.id.rb1)
    RadioButton rb1;
    @BindView(R.id.rb2)
    RadioButton rb2;
    @BindView(R.id.radio_group)
    RadioGroup radioGroup;

    private Fragment01 fragment01;
    private Fragment02 fragment02;
    private FragmentManager manager;

    String versiondata = "";
    AlertDialogUtil alertDialogUtil;
    private static boolean isExit = false;

    //推出程序
    Handler mHandler = new Handler() {

        @Override
        public void handleMessage(Message msg) {
            super.handleMessage(msg);
            isExit = false;
        }
    };

    //推出程序
    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (keyCode == KeyEvent.KEYCODE_BACK) {
            exit();
            return false;
        }
        return super.onKeyDown(keyCode, event);
    }

    private void exit() {
        if (!isExit) {
            isExit = true;
//            alertDialogUtil.showDialog1("您确定要退出程序吗", new AlertDialogCallBack() {
//
//                @Override
//                public void select(String data) {
//
//                }
//
//                @Override
//                public void confirm() {
//                    finish();
//                }
//
//                @Override
//                public void cancel() {
//
//                }
//            });
            Toast.makeText(this, "再点一次退出程序", Toast.LENGTH_SHORT).show();
            mHandler.sendEmptyMessageDelayed(0, 2000);
        } else {
            finish();
            System.exit(0);
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ButterKnife.bind(this);
        alertDialogUtil = new AlertDialogUtil(this);
        //默认选中第一个
        RadioButton btn = (RadioButton) radioGroup.getChildAt(0);
        btn.setChecked(true);
        initFragment();
        radioGroup.setOnCheckedChangeListener(MainActivity.this);
        getVersion();
    }

    private void getVersion() {
        new Thread(new Runnable() {
            @Override
            public void run() {
                String url = com.hy.powerplatform.my_utils.base.Constant.BASE_URL2 + Constant.VERSIONNO;
                DBHandler dbA = new DBHandler();
                versiondata = dbA.getAPKVerson(url);
                Message message = new Message();
                if (versiondata.equals("")) {
                    handler.sendEmptyMessage(TAG_TWO);
                } else {
                    handler.sendEmptyMessage(TAG_FOUR);
                }
//                message.what = TAG_FOUR;
//                handler.sendMessage(message);
            }
        }).start();
    }

    /**
     * 初始化第一个页面
     */
    private void initFragment() {
        //获取管理器
        manager = getSupportFragmentManager();
        //通过管理器获取一个事件
        FragmentTransaction transaction = manager.beginTransaction();
        //添加第一个fragment到帧布局中
        fragment01 = new Fragment01();
        transaction.add(R.id.frame_layout, fragment01);
        transaction.commit();
    }

    @Override
    protected int provideContentViewId() {
        return R.layout.activity_main2;
    }

    @Override
    protected boolean isHasHeader() {
        return true;
    }

    @Override
    protected void rightClient() {
    }


    @Override
    public void onCheckedChanged(RadioGroup group, @IdRes int checkedId) {
        switch (checkedId){
            case R.id.rb1:
                FragmentTransaction ft1 = manager.beginTransaction();
                hideAll(ft1);
                if (fragment01 ==null){
                    fragment01 = new Fragment01();
                    ft1.add(R.id.frame_layout, fragment01);
                }else {
                    ft1.show(fragment01);
                }
                ft1.commit();
                break;
            case R.id.rb2:
                FragmentTransaction ft2 = manager.beginTransaction();
                hideAll(ft2);
                if (fragment02 ==null){
                    fragment02 = new Fragment02();
                    ft2.add(R.id.frame_layout, fragment02);
                }else {
                    ft2.show(fragment02);
                }
                ft2.commit();
                break;
        }
    }

    /**
     * 隐藏所有fragment
     * @param ft
     */
    private void hideAll(FragmentTransaction ft){
        if (ft==null){
            return;
        }
        if (fragment01 !=null){
            ft.hide(fragment01);
        }
        if (fragment02 !=null){
            ft.hide(fragment02);
        }
    }

    Handler handler = new Handler() {
        @Override
        public void handleMessage(Message msg) {
            super.handleMessage(msg);
            switch (msg.what) {
                case TAG_TWO:
                    Toast.makeText(MainActivity.this, "请求数据失败", Toast.LENGTH_SHORT).show();
                    ProgressDialogUtil.stopLoad();
                    break;
                case Constant.TAG_FOUR:
                    ProgressDialogUtil.stopLoad();
                    Gson gson = new Gson();
                    Version version = gson.fromJson(versiondata, Version.class);
                    if (version!=null&&version.getData() != null) {
                        String nnm = version.getData().getVersionNo();
                        String versionName = "";
                        int versionCode = 0;
                        try {
                            // ---get the package info---
                            PackageManager pm = MainActivity.this.getPackageManager();
                            PackageInfo pi = pm.getPackageInfo(MainActivity.this.getPackageName(), 0);
                            versionName = pi.versionName;
                            versionCode = pi.versionCode;
                        } catch (Exception e) {
                            e.printStackTrace();
                        }

                        if (versionName == null || versionName.length() <= 0) {
                            versionName = "";
                        }

                        if (!nnm.equals(versionName)&&Double.valueOf(nnm)>Double.valueOf(versionName)){
//                        if (!nnm.equals("2")) {
                            final String url = Constant.BASE_URL2 + "attachFiles/" + version.getData().getDownurl();
                            String data1 = version.getData().getSubstance();
                            new AlertDialogUtil(MainActivity.this).showDialog2("检测到服务器上有新的版本，是否立即更新。\n"+data1, new AlertDialogCallBack() {
                                @Override
                                public void select(String data) {

                                }

                                @Override
                                public void confirm() {
                                    Intent intent = new Intent(Intent.ACTION_VIEW);
                                    Uri content_url = Uri.parse(url);
                                    intent.setData(content_url);
                                    startActivity(intent);
                                }

                                @Override
                                public void cancel() {
                                    finish();
                                }
                            });
                        }
                    }
                    break;
            }
        }
    };
}
