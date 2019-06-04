package com.hy.powerplatform.login.activity;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.annotation.NonNull;
import android.support.v4.app.ActivityCompat;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.google.gson.Gson;
import com.hy.powerplatform.R;
import com.hy.powerplatform.SharedPreferencesHelper;
import com.hy.powerplatform.business_inspect.activity.InspectYeWuActivity;
import com.hy.powerplatform.business_inspect.activity.ShiGuActivity;
import com.hy.powerplatform.business_inspect.utils.DBHandler;
import com.hy.powerplatform.car_maintain.activity.MainTainActivity;
import com.hy.powerplatform.car_maintain.activity.MainTainActivity1;
import com.hy.powerplatform.login.adapter.MainDataAdapter;
import com.hy.powerplatform.login.bean.MainData;
import com.hy.powerplatform.login.presenter.MainDataPresenter;
import com.hy.powerplatform.login.presenter.loginpresenterimpl.MainDataPresenterImpl;
import com.hy.powerplatform.login.view.MainView;
import com.hy.powerplatform.my_utils.base.ActivityCollector;
import com.hy.powerplatform.my_utils.base.BaseActivity;
import com.hy.powerplatform.my_utils.base.BaseRequestBackTLisenter;
import com.hy.powerplatform.my_utils.base.Constant;
import com.hy.powerplatform.my_utils.base.MyApplication;
import com.hy.powerplatform.my_utils.base.MyHttpURLConnection;
import com.hy.powerplatform.my_utils.myViews.Header;
import com.hy.powerplatform.my_utils.utils.AlertDialogUtil;
import com.hy.powerplatform.my_utils.utils.ProgressDialogUtil;
import com.hy.powerplatform.news.activity.NewsActivity;
import com.hy.powerplatform.news.activity.NoticeActivity;
import com.hy.powerplatform.oa_flow.activity.HistoryListActivity;
import com.hy.powerplatform.oa_flow.activity.InboxActivity;
import com.hy.powerplatform.oa_flow.activity.ListActivity;
import com.hy.powerplatform.oa_flow.activity.MyFlowListActivity;
import com.hy.powerplatform.oa_flow.activity.MyWillDoActivity;
import com.hy.powerplatform.oa_flow.activity.WithMeListActivity;
import com.hy.powerplatform.oa_flow.bean.MyWillDo;
import com.hy.powerplatform.phone.activity.PhoneListActivity;
import com.hy.powerplatform.qrcode.zxing.activity.CaptureActivity;
import com.hy.powerplatform.signin.activity.NewSignActivity;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

import static com.hy.powerplatform.my_utils.base.Constant.TAG_FIVE;
import static com.hy.powerplatform.my_utils.base.Constant.TAG_ONE;
import static com.hy.powerplatform.my_utils.base.Constant.TAG_THERE;
import static com.hy.powerplatform.my_utils.base.Constant.TAG_TWO;

public class MainActivity extends BaseActivity implements MainView {

    @BindView(R.id.recyclerView)
    RecyclerView recyclerView;
    @BindView(R.id.activity_main2)
    LinearLayout activityMain2;
    @BindView(R.id.header)
    Header header;
    @BindView(R.id.mIvBanner)
    ImageView mIvBanner;
    MainDataPresenter mainDataPresenter;
    List<MainData.DataBean> mainDataList = new ArrayList<>();
    List<Integer> imageList = new ArrayList<>();
    AlertDialogUtil alertDialogUtil;
    MainDataAdapter mainDataAdapter;
    Intent intent;

    String versiondata = "";
    String versionName;
    int versionCode;

    MainData bean;
    int limit = 20;
    int start = 0;
    String res = "";
    String tag = "N";
    List<MyWillDo.ResultBean> beanList = new ArrayList<>();
    SharedPreferencesHelper sharedPreferencesHelper;
    String userName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ButterKnife.bind(this);
        userName = sharedPreferencesHelper.getData(this, "userName", "");
        PackageManager pm = this.getPackageManager();
        PackageInfo pi = null;
        try {
            pi = pm.getPackageInfo(this.getPackageName(), 0);
            versionName = pi.versionName;
            versionCode = pi.versionCode;
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
        }
        ActivityCollector.addActivity(this);
        SharedPreferencesHelper helper = new SharedPreferencesHelper(this, "login");
        String address = helper.getData(this, "Address", "");
        header.setTvRight(address);
        header.setTvTitle(getResources().getString(R.string.app_name));
        alertDialogUtil = new AlertDialogUtil(this);
        imageList.add(R.drawable.signin);
        imageList.add(R.drawable.sign_in);
        imageList.add(R.drawable.my_information);
        imageList.add(R.drawable.technological_process);
        imageList.add(R.drawable.business_inspection);
        imageList.add(R.drawable.data_analysis);
        imageList.add(R.drawable.staff_work);
        imageList.add(R.drawable.phonelist);
        imageList.add(R.drawable.mycenter);
        imageList.add(R.drawable.mycenter);
        imageList.add(R.drawable.mycenter);
        imageList.add(R.drawable.mycenter);
        StaggeredGridLayoutManager manager = new StaggeredGridLayoutManager(4, StaggeredGridLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(manager);
        SharedPreferencesHelper sharedPreferencesHelper = new SharedPreferencesHelper(this, "login");
        String userName = sharedPreferencesHelper.getData(this, "userName", "");
        mainDataPresenter = new MainDataPresenterImpl(this, this);
        //mainDataPresenter.getMainDataPresenterData(userName);
        String found = sharedPreferencesHelper.getData(MyApplication.getContextObject(), "Found", "");
        String BASE_URL = "http://" + sharedPreferencesHelper.getData(MyApplication.getContextObject(), "Ip", "")
                + ":" + sharedPreferencesHelper.getData(MyApplication.getContextObject(), "Socket", "") + "/" + found + "/";
        final String Url = BASE_URL + "system/getStatusModuleManagement.do" + "?userName=" + userName;
        final Message message = new Message();
        ProgressDialogUtil.startLoad(this,"获取数据中");
        new Thread(new Runnable() {
            @Override
            public void run() {
                MyHttpURLConnection.getData(Url, new BaseRequestBackTLisenter() {
                    @Override
                    public void success(Object o) {
                        message.what = TAG_ONE;
                        message.obj = o;
                        handler.sendMessage(message);
                    }

                    @Override
                    public void fail(String msg) {
                        message.what = TAG_TWO;
                        handler.sendMessage(message);
                    }

                    @Override
                    public void failF(String msg) {

                    }
                });
            }
        }).start();
    }

    /**
     * 获取数据
     * @param start
     * @param limit
     */
    private void getData(final int start, final int limit) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                String url = Constant.BASE_URL2 + Constant.MYWILLDOLIST + start + "&limit=" + limit;
                DBHandler dbA = new DBHandler();
                res = dbA.OAQingJiaWillDo(url);
                if (res.equals("获取数据失败") || res.equals("")) {
                    handler.sendEmptyMessage(TAG_TWO);
                } else {
                    handler.sendEmptyMessage(TAG_FIVE);
                }
            }
        }).start();
    }

    Handler handler = new Handler() {
        @Override
        public void handleMessage(Message msg) {
            super.handleMessage(msg);
            switch (msg.what) {
                case TAG_ONE:
                    mainDataList.clear();
                    String data = msg.obj.toString();
                    bean = new Gson().fromJson(data, MainData.class);
                    mainDataList.clear();
                    for (int i = 0; i < bean.getData().size(); i++) {
                        mainDataList.add(bean.getData().get(i));
                    }
//                    MainData.DataBean bean1 = new MainData.DataBean();
//                    bean1.setModuleCode("GRZX");
//                    bean1.setModuleName("个人中心");
//                    mainDataList.add(bean1);
                    getData(start, limit);
                    break;
                case TAG_TWO:
                    Toast.makeText(MainActivity.this, "请求数据失败", Toast.LENGTH_SHORT).show();
                    ProgressDialogUtil.stopLoad();
                    break;
                case Constant.TAG_FIVE:
                    try {
                        JSONObject jsonObject = new JSONObject(res);
                        JSONArray jsonArray = jsonObject.getJSONArray("result");
                        if (jsonArray.length()!=0){
                            tag = "Y";
                        }
                        ProgressDialogUtil.stopLoad();
                        mainDataAdapter = new MainDataAdapter(MainActivity.this, mainDataList, imageList,tag);
                        recyclerView.setAdapter(mainDataAdapter);
                        mainDataAdapter.sendOnGetAdapterPositionListener(new MainDataAdapter.OnGetAdapterPositionListener() {
                            @Override
                            public void getAdapterPosition(int position) {
                                String tag = mainDataList.get(position).getModuleCode();
                                if (mainDataList.get(position).getModuleCode().equals("SGGL")) {
                                    intent = new Intent(MainActivity.this, ShiGuActivity.class);
                                    startActivity(intent);
                                } else if (mainDataList.get(position).getModuleCode().equals("QD")) {
                                    intent = new Intent(MainActivity.this, NewSignActivity.class);
                                    startActivity(intent);
                                } else if (mainDataList.get(position).getModuleCode().equals("GG")) {
                                    intent = new Intent(MainActivity.this, NoticeActivity.class);
                                    intent.putExtra("heard", getResources().getString(R.string.notice));
                                    startActivity(intent);
                                } else if (mainDataList.get(position).getModuleCode().equals("XW")) {
                                    intent = new Intent(MainActivity.this, NewsActivity.class);
                                    intent.putExtra("heard", getResources().getString(R.string.news));
                                    startActivity(intent);
                                } else if (mainDataList.get(position).getModuleCode().equals("WSJC")) {
                                    intent = new Intent(MainActivity.this, InspectYeWuActivity.class);
                                    startActivity(intent);
                                } else if (mainDataList.get(position).getModuleCode().equals("GRZX")) {
                                    intent = new Intent(MainActivity.this, MyPersonalActivity.class);
                                    startActivity(intent);
                                } else if (mainDataList.get(position).getModuleCode().equals("TXL")) {
                                    intent = new Intent(MainActivity.this, PhoneListActivity.class);
                                    startActivity(intent);
                                } else if (mainDataList.get(position).getModuleCode().equals("ZGJNKH")) {
                                    intent = new Intent(MainActivity.this, com.hy.powerplatform.business_inspect.newactivity.InspectAllActivity.class);
                                    startActivity(intent);
                                } else if (mainDataList.get(position).getModuleCode().equals("YFSFJKH")) {
                                    intent = new Intent(MainActivity.this, com.hy.powerplatform.business_inspect.newactivity.InspectStarteActivity.class);
                                    startActivity(intent);
                                } else if (mainDataList.get(position).getModuleCode().equals("FWWSJZ")) {
                                    intent = new Intent(MainActivity.this, com.hy.powerplatform.business_inspect.newactivity.InspectHealthActivity.class);
                                    startActivity(intent);
                                } else if (mainDataList.get(position).getModuleCode().equals("AQZXJC")) {
                                    intent = new Intent(MainActivity.this, com.hy.powerplatform.business_inspect.newactivity.InspectSufferActivity.class);
                                    startActivity(intent);
                                } else if (mainDataList.get(position).getModuleCode().equals("JSZKJC")) {
                                    intent = new Intent(MainActivity.this, com.hy.powerplatform.business_inspect.newactivity.InspectKillActivity.class);
                                    startActivity(intent);
                                } else if (mainDataList.get(position).getModuleCode().equals("JLWX")) {
                                    intent = new Intent(MainActivity.this, MainTainActivity1.class);
                                    startActivity(intent);
                                } else if (mainDataList.get(position).getModuleCode().equals("SPLC")) {
                                    intent = new Intent(MainActivity.this, ListActivity.class);
                                    startActivity(intent);
                                }else if (mainDataList.get(position).getModuleCode().equals("DBLC")) {
                                    intent = new Intent(MainActivity.this, MyWillDoActivity.class);
                                    startActivity(intent);
                                }else if (mainDataList.get(position).getModuleCode().equals("LSLC")) {
                                    intent = new Intent(MainActivity.this, HistoryListActivity.class);
                                    startActivity(intent);
                                }else if (mainDataList.get(position).getModuleCode().equals("YWXGLC")) {
                                    intent = new Intent(MainActivity.this, WithMeListActivity.class);
                                    startActivity(intent);
                                }else if (mainDataList.get(position).getModuleCode().equals("WDLC")) {
                                    intent = new Intent(MainActivity.this, MyFlowListActivity.class);
                                    startActivity(intent);
                                }else if (mainDataList.get(position).getModuleCode().equals("SYS")) {
                                    startQrCode();
                                }else if (mainDataList.get(position).getModuleCode().equals("SJX")) {
                                    intent = new Intent(MainActivity.this, InboxActivity.class);
                                    startActivity(intent);
                                }
                            }
                        });
                    } catch (JSONException e) {
                        e.printStackTrace();
                        handler.sendEmptyMessage(TAG_THERE);
                    }
                    break;
            }
        }
    };


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
    public void getMainViewData(MainData mainData) {
//        MainData.DataBean bean = new MainData.DataBean();
//        bean.setModuleCode("QD");
//        bean.setModuleName("签到");
//        mainDataList.add(bean);
        mainDataList.clear();
        for (int i = 0; i < mainData.getData().size(); i++) {
            mainDataList.add(mainData.getData().get(i));
        }
//        bean.setModuleCode("JLWX");
//        bean.setModuleName("车辆维修");
//        mainDataList.add(bean);
//        MainData.DataBean bean1 = new MainData.DataBean();
//        bean1.setModuleCode("GRZX");
//        bean1.setModuleName("个人中心");
//        mainDataList.add(bean1);
        mainDataAdapter = new MainDataAdapter(this, mainDataList, imageList,tag);
        recyclerView.setAdapter(mainDataAdapter);
        mainDataAdapter.sendOnGetAdapterPositionListener(new MainDataAdapter.OnGetAdapterPositionListener() {
            @Override
            public void getAdapterPosition(int position) {
                String tag = mainDataList.get(position).getModuleCode();
                if (mainDataList.get(position).getModuleCode().equals("SGGL")) {
                    intent = new Intent(MainActivity.this, ShiGuActivity.class);
                    startActivity(intent);
                } else if (mainDataList.get(position).getModuleCode().equals("QD")) {
                    intent = new Intent(MainActivity.this, NewSignActivity.class);
                    startActivity(intent);
                } else if (mainDataList.get(position).getModuleCode().equals("GG")) {
                    intent = new Intent(MainActivity.this, NoticeActivity.class);
                    intent.putExtra("heard", getResources().getString(R.string.notice));
                    startActivity(intent);
                } else if (mainDataList.get(position).getModuleCode().equals("XW")) {
                    intent = new Intent(MainActivity.this, NewsActivity.class);
                    intent.putExtra("heard", getResources().getString(R.string.news));
                    startActivity(intent);
                } else if (mainDataList.get(position).getModuleCode().equals("WSJC")) {
                    intent = new Intent(MainActivity.this, InspectYeWuActivity.class);
                    startActivity(intent);
                }  else if (mainDataList.get(position).getModuleCode().equals("TXL")) {
                    intent = new Intent(MainActivity.this, PhoneListActivity.class);
                    startActivity(intent);
                } else if (mainDataList.get(position).getModuleCode().equals("ZGJNKH")) {
                    intent = new Intent(MainActivity.this, com.hy.powerplatform.business_inspect.newactivity.InspectAllActivity.class);
                    startActivity(intent);
                } else if (mainDataList.get(position).getModuleCode().equals("YFSFJKH")) {
                    intent = new Intent(MainActivity.this, com.hy.powerplatform.business_inspect.newactivity.InspectStarteActivity.class);
                    startActivity(intent);
                } else if (mainDataList.get(position).getModuleCode().equals("FWWSJZ")) {
                    intent = new Intent(MainActivity.this, com.hy.powerplatform.business_inspect.newactivity.InspectHealthActivity.class);
                    startActivity(intent);
                } else if (mainDataList.get(position).getModuleCode().equals("AQZXJC")) {
                    intent = new Intent(MainActivity.this, com.hy.powerplatform.business_inspect.newactivity.InspectSufferActivity.class);
                    startActivity(intent);
                } else if (mainDataList.get(position).getModuleCode().equals("JSZKJC")) {
                    intent = new Intent(MainActivity.this, com.hy.powerplatform.business_inspect.newactivity.InspectKillActivity.class);
                    startActivity(intent);
                } else if (mainDataList.get(position).getModuleCode().equals("JLWX")) {
                    intent = new Intent(MainActivity.this, MainTainActivity.class);
                    startActivity(intent);
                }
            }
        });
    }

    // 开始扫码
    private void startQrCode() {
        // 申请相机权限
        if (ActivityCompat.checkSelfPermission(this, Manifest.permission.CAMERA) != PackageManager.PERMISSION_GRANTED) {
            // 申请权限
            ActivityCompat.requestPermissions(MainActivity.this, new String[]{Manifest.permission.CAMERA}, Constant.REQ_PERM_CAMERA);
            return;
        }
        // 申请文件读写权限（部分朋友遇到相册选图需要读写权限的情况，这里一并写一下）
        if (ActivityCompat.checkSelfPermission(this, Manifest.permission.READ_EXTERNAL_STORAGE) != PackageManager.PERMISSION_GRANTED) {
            // 申请权限
            ActivityCompat.requestPermissions(MainActivity.this, new String[]{Manifest.permission.READ_EXTERNAL_STORAGE}, Constant.REQ_PERM_EXTERNAL_STORAGE);
            return;
        }
        // 二维码扫码
        Intent intent = new Intent(MainActivity.this, CaptureActivity.class);
        startActivityForResult(intent, Constant.REQ_QR_CODE);
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        switch (requestCode) {
            case Constant.REQ_PERM_CAMERA:
                // 摄像头权限申请
                if (grantResults.length > 0 && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                    // 获得授权
                    startQrCode();
                } else {
                    // 被禁止授权
                    Toast.makeText(MainActivity.this, "请至权限中心打开本应用的相机访问权限", Toast.LENGTH_LONG).show();
                }
                break;
            case Constant.REQ_PERM_EXTERNAL_STORAGE:
                // 文件读写权限申请
                if (grantResults.length > 0 && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                    // 获得授权
                    startQrCode();
                } else {
                    // 被禁止授权
                    Toast.makeText(MainActivity.this, "请至权限中心打开本应用的文件读写权限", Toast.LENGTH_LONG).show();
                }
                break;
        }
    }
}
