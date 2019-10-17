package com.hy.powerplatform.login.fragment;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.annotation.NonNull;
import android.support.v4.app.ActivityCompat;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Toast;

import com.google.gson.Gson;
import com.hy.powerplatform.R;
import com.hy.powerplatform.SharedPreferencesHelper;
import com.hy.powerplatform.business_inspect.activity.InspectYeWuActivity;
import com.hy.powerplatform.business_inspect.activity.ShiGuActivity;
import com.hy.powerplatform.business_inspect.utils.DBHandler;
import com.hy.powerplatform.car_maintain.activity.MainTainActivity1;
import com.hy.powerplatform.login.activity.MyPersonalActivity;
import com.hy.powerplatform.login.adapter.MainDataAdapter;
import com.hy.powerplatform.login.bean.MainData;
import com.hy.powerplatform.my_utils.base.BaseRequestBackTLisenter;
import com.hy.powerplatform.my_utils.base.Constant;
import com.hy.powerplatform.my_utils.base.MyApplication;
import com.hy.powerplatform.my_utils.base.MyHttpURLConnection;
import com.hy.powerplatform.my_utils.utils.AlertDialogUtil;
import com.hy.powerplatform.my_utils.utils.ProgressDialogUtil;
import com.hy.powerplatform.news.activity.NewsActivity;
import com.hy.powerplatform.news.activity.NoticeActivity;
import com.hy.powerplatform.oa_flow.activity.HistoryListActivity;
import com.hy.powerplatform.oa_flow.activity.InboxActivity;
import com.hy.powerplatform.oa_flow.activity.ListActivity;
import com.hy.powerplatform.oa_flow.activity.ListActivity1;
import com.hy.powerplatform.oa_flow.activity.ListActivity2;
import com.hy.powerplatform.oa_flow.activity.ListActivity3;
import com.hy.powerplatform.oa_flow.activity.MyBackFlowListActivity;
import com.hy.powerplatform.oa_flow.activity.MyBackSureFlowListActivity;
import com.hy.powerplatform.oa_flow.bean.MyWillDo;
import com.hy.powerplatform.phone.activity.PhoneListActivity;
import com.hy.powerplatform.qrcode.zxing.activity.CaptureActivity;
import com.hy.powerplatform.signin.activity.NewSignActivity;
import com.hy.powerplatform.weekly.WeeklyListActivity;

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

/**
 * Created by Administrator on 2019/9/25.
 */

public class Fragment01 extends Fragment {
    @BindView(R.id.recyclerView)
    RecyclerView recyclerView;
    @BindView(R.id.mIvBanner)
    ImageView mIvBanner;
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
    String superRoleName;
    View view;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment01, container, false);
        ButterKnife.bind(this, view);
        userName = sharedPreferencesHelper.getData(getActivity(), "userName", "");
        superRoleName = sharedPreferencesHelper.getData(getActivity(), "superRoleName", "");
        PackageManager pm = getActivity().getPackageManager();
        PackageInfo pi = null;
        try {
            pi = pm.getPackageInfo(getActivity().getPackageName(), 0);
            versionName = pi.versionName;
            versionCode = pi.versionCode;
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
        }
        SharedPreferencesHelper helper = new SharedPreferencesHelper(getActivity(), "login");
        String address = helper.getData(getActivity(), "Address", "");
        alertDialogUtil = new AlertDialogUtil(getActivity());
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
        SharedPreferencesHelper sharedPreferencesHelper = new SharedPreferencesHelper(getActivity(), "login");
        String userName = sharedPreferencesHelper.getData(getActivity(), "userName", "");
        String found = sharedPreferencesHelper.getData(MyApplication.getContextObject(), "Found", "");
        String BASE_URL = "http://" + sharedPreferencesHelper.getData(MyApplication.getContextObject(), "Ip", "")
                + ":" + sharedPreferencesHelper.getData(MyApplication.getContextObject(), "Socket", "") + "/" + found + "/";
        final String Url = BASE_URL + "system/getStatusModuleManagement.do" + "?userName=" + userName;
        final Message message = new Message();
        ProgressDialogUtil.startLoad(getActivity(),"获取数据中");
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
        return view;
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
                    for (int i = 0; i < bean.getData().size(); i++) {
                        if (bean.getData().get(i).getModuleName().equals("公司流程")){
                            if (superRoleName.equals("分管领导")||superRoleName.equals("总经理")
                                    ||superRoleName.equals("副总经理")||superRoleName.equals("董事长")){
                                mainDataList.add(bean.getData().get(i));
                            }
                        }else if (bean.getData().get(i).getModuleName().equals("部门流程")){
                            if (superRoleName.equals("分管领导")||superRoleName.equals("总经理")
                                    ||superRoleName.equals("副总经理")||superRoleName.equals("董事长")){
//                                mainDataList.add(bean.getData().get(i))
                            }else {
                                mainDataList.add(bean.getData().get(i));
                            }
                        }else {
                            mainDataList.add(bean.getData().get(i));
                        }
                    }
                    getData(start, limit);
                    break;
                case TAG_TWO:
                    Toast.makeText(getActivity(), "请求数据失败", Toast.LENGTH_SHORT).show();
                    ProgressDialogUtil.stopLoad();
                    break;
                case TAG_FIVE:
                    try {
                        JSONObject jsonObject = new JSONObject(res);
                        JSONArray jsonArray = jsonObject.getJSONArray("result");
                        if (jsonArray.length()!=0){
                            tag = "Y";
                        }
                        ProgressDialogUtil.stopLoad();
                        mainDataAdapter = new MainDataAdapter(getActivity(), mainDataList, imageList,tag);
                        recyclerView.setAdapter(mainDataAdapter);
                        mainDataAdapter.sendOnGetAdapterPositionListener(new MainDataAdapter.OnGetAdapterPositionListener() {
                            @Override
                            public void getAdapterPosition(int position) {
                                String tag = mainDataList.get(position).getModuleCode();
                                if (mainDataList.get(position).getModuleCode().equals("SGGL")) {
                                    intent = new Intent(getActivity(), ShiGuActivity.class);
                                    startActivity(intent);
                                } else if (mainDataList.get(position).getModuleCode().equals("QD")) {
                                    intent = new Intent(getActivity(), NewSignActivity.class);
                                    startActivity(intent);
                                } else if (mainDataList.get(position).getModuleCode().equals("GG")) {
                                    intent = new Intent(getActivity(), NoticeActivity.class);
                                    intent.putExtra("heard", getResources().getString(R.string.notice));
                                    startActivity(intent);
                                } else if (mainDataList.get(position).getModuleCode().equals("XW")) {
                                    intent = new Intent(getActivity(), NewsActivity.class);
                                    intent.putExtra("heard", getResources().getString(R.string.news));
                                    startActivity(intent);
                                } else if (mainDataList.get(position).getModuleCode().equals("WSJC")) {
                                    intent = new Intent(getActivity(), InspectYeWuActivity.class);
                                    startActivity(intent);
                                } else if (mainDataList.get(position).getModuleCode().equals("GRZX")) {
                                    intent = new Intent(getActivity(), MyPersonalActivity.class);
                                    startActivity(intent);
                                } else if (mainDataList.get(position).getModuleCode().equals("TXL")) {
                                    intent = new Intent(getActivity(), PhoneListActivity.class);
                                    startActivity(intent);
                                } else if (mainDataList.get(position).getModuleCode().equals("ZGJNKH")) {
                                    intent = new Intent(getActivity(), com.hy.powerplatform.business_inspect.newactivity.InspectAllActivity.class);
                                    startActivity(intent);
                                } else if (mainDataList.get(position).getModuleCode().equals("YFSFJKH")) {
                                    intent = new Intent(getActivity(), com.hy.powerplatform.business_inspect.newactivity.InspectStarteActivity.class);
                                    startActivity(intent);
                                } else if (mainDataList.get(position).getModuleCode().equals("FWWSJZ")) {
                                    intent = new Intent(getActivity(), com.hy.powerplatform.business_inspect.newactivity.InspectHealthActivity.class);
                                    startActivity(intent);
                                } else if (mainDataList.get(position).getModuleCode().equals("AQZXJC")) {
                                    intent = new Intent(getActivity(), com.hy.powerplatform.business_inspect.newactivity.InspectSufferActivity.class);
                                    startActivity(intent);
                                } else if (mainDataList.get(position).getModuleCode().equals("JSZKJC")) {
                                    intent = new Intent(getActivity(), com.hy.powerplatform.business_inspect.newactivity.InspectKillActivity.class);
                                    startActivity(intent);
                                } else if (mainDataList.get(position).getModuleCode().equals("JLWX")) {
                                    intent = new Intent(getActivity(), MainTainActivity1.class);
                                    startActivity(intent);
                                } else if (mainDataList.get(position).getModuleCode().equals("FQSQ")) {
                                    intent = new Intent(getActivity(), ListActivity.class);
                                    startActivity(intent);
                                }else if (mainDataList.get(position).getModuleCode().equals("DBLC")) {
                                    intent = new Intent(getActivity(), ListActivity1.class);
                                    startActivity(intent);
                                }else if (mainDataList.get(position).getModuleCode().equals("GSLC")) {
                                    intent = new Intent(getActivity(), HistoryListActivity.class);
                                    startActivity(intent);
                                }else if (mainDataList.get(position).getModuleCode().equals("BMLC")) {
                                    intent = new Intent(getActivity(), ListActivity2.class);
                                    startActivity(intent);
                                }else if (mainDataList.get(position).getModuleCode().equals("YBLC")) {
                                    intent = new Intent(getActivity(), ListActivity3.class);
                                    startActivity(intent);
                                }else if (mainDataList.get(position).getModuleCode().equals("SYS")) {
                                    startQrCode();
                                }else if (mainDataList.get(position).getModuleCode().equals("SJX")) {
                                    intent = new Intent(getActivity(), InboxActivity.class);
                                    startActivity(intent);
                                } else if (mainDataList.get(position).getModuleCode().equals("LCZH")) {
                                    intent = new Intent(getActivity(), MyBackFlowListActivity.class);
                                    startActivity(intent);
                                }else if (mainDataList.get(position).getModuleCode().equals("ZHQR")) {
                                    intent = new Intent(getActivity(), MyBackSureFlowListActivity.class);
                                    startActivity(intent);
                                }else if (mainDataList.get(position).getModuleCode().equals("ZB")) {
                                    intent = new Intent(getActivity(), WeeklyListActivity.class);
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

    // 开始扫码
    private void startQrCode() {
        // 申请相机权限
        if (ActivityCompat.checkSelfPermission(getActivity(), Manifest.permission.CAMERA) != PackageManager.PERMISSION_GRANTED) {
            // 申请权限
            ActivityCompat.requestPermissions(getActivity(), new String[]{Manifest.permission.CAMERA}, Constant.REQ_PERM_CAMERA);
            return;
        }
        // 申请文件读写权限（部分朋友遇到相册选图需要读写权限的情况，这里一并写一下）
        if (ActivityCompat.checkSelfPermission(getActivity(), Manifest.permission.READ_EXTERNAL_STORAGE) != PackageManager.PERMISSION_GRANTED) {
            // 申请权限
            ActivityCompat.requestPermissions(getActivity(), new String[]{Manifest.permission.READ_EXTERNAL_STORAGE}, Constant.REQ_PERM_EXTERNAL_STORAGE);
            return;
        }
        // 二维码扫码
        Intent intent = new Intent(getActivity(), CaptureActivity.class);
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
                    Toast.makeText(getActivity(), "请至权限中心打开本应用的相机访问权限", Toast.LENGTH_LONG).show();
                }
                break;
            case Constant.REQ_PERM_EXTERNAL_STORAGE:
                // 文件读写权限申请
                if (grantResults.length > 0 && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                    // 获得授权
                    startQrCode();
                } else {
                    // 被禁止授权
                    Toast.makeText(getActivity(), "请至权限中心打开本应用的文件读写权限", Toast.LENGTH_LONG).show();
                }
                break;
        }
    }

}
