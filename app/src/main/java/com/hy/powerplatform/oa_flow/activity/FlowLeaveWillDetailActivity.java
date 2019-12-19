package com.hy.powerplatform.oa_flow.activity;

import android.app.AlertDialog;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.google.gson.Gson;
import com.hy.powerplatform.R;
import com.hy.powerplatform.SharedPreferencesHelper;
import com.hy.powerplatform.business_inspect.utils.DBHandler;
import com.hy.powerplatform.my_utils.base.AlertDialogCallBackP;
import com.hy.powerplatform.my_utils.base.BaseActivity;
import com.hy.powerplatform.my_utils.base.Constant;
import com.hy.powerplatform.my_utils.base.MyApplication;
import com.hy.powerplatform.my_utils.myViews.Header;
import com.hy.powerplatform.my_utils.myViews.MyAlertDialog;
import com.hy.powerplatform.my_utils.utils.ProgressDialogUtil;
import com.hy.powerplatform.oa_flow.adapter.FlowMessageAdapter;
import com.hy.powerplatform.oa_flow.bean.File;
import com.hy.powerplatform.oa_flow.bean.FlowCarVideoWillDetail;
import com.hy.powerplatform.oa_flow.bean.FlowMessage1;
import com.hy.powerplatform.oa_flow.bean.QianZhiData;
import com.hy.powerplatform.oa_flow.bean.QingJiaWillDoDetail;
import com.hy.powerplatform.oa_flow.util.MyStringSpilt;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

import static com.hy.powerplatform.my_utils.base.Constant.TAG_EIGHT;
import static com.hy.powerplatform.my_utils.base.Constant.TAG_FIVE;
import static com.hy.powerplatform.my_utils.base.Constant.TAG_FOUR;
import static com.hy.powerplatform.my_utils.base.Constant.TAG_NINE;
import static com.hy.powerplatform.my_utils.base.Constant.TAG_ONE;
import static com.hy.powerplatform.my_utils.base.Constant.TAG_SEVEN;
import static com.hy.powerplatform.my_utils.base.Constant.TAG_SIX;
import static com.hy.powerplatform.my_utils.base.Constant.TAG_THERE;
import static com.hy.powerplatform.my_utils.base.Constant.TAG_TWO;

public class FlowLeaveWillDetailActivity extends BaseActivity {

    @BindView(R.id.header)
    Header header;
    @BindView(R.id.btnOK)
    Button btnOK;
    @BindView(R.id.etCode)
    TextView etCode;
    @BindView(R.id.tvPerson)
    TextView tvPerson;
    @BindView(R.id.tvTime)
    TextView tvTime;
    @BindView(R.id.tvType)
    TextView tvType;
    @BindView(R.id.tvDays)
    TextView tvDays;
    @BindView(R.id.tvData)
    TextView tvData;
    @BindView(R.id.tvReason)
    TextView tvReason;
    @BindView(R.id.tvStartTime)
    TextView tvStartTime;
    @BindView(R.id.tvAM)
    TextView tvAM;
    @BindView(R.id.tvEndTime)
    TextView tvEndTime;
    @BindView(R.id.tvPM)
    TextView tvPM;
    @BindView(R.id.etLeader)
    EditText etLeader;
    @BindView(R.id.etLeader1)
    EditText etLeader1;
    @BindView(R.id.etLeader2)
    EditText etLeader2;

    String res, taskId, fullname, fullnameUId, signaName, destName, source,
            mainId, destType, qianzhiData, checkTask;
    String flowAssignld = "";
    String comments = "";
    @BindView(R.id.tvLeader)
    TextView tvLeader;
    @BindView(R.id.tvLeader1)
    TextView tvLeader1;
    @BindView(R.id.tvLeader2)
    TextView tvLeader2;
    @BindView(R.id.rb1)
    CheckBox rb1;
    @BindView(R.id.rb2)
    CheckBox rb2;
    @BindView(R.id.rb3)
    CheckBox rb3;
    @BindView(R.id.rb4)
    CheckBox rb4;
    @BindView(R.id.rb5)
    CheckBox rb5;
    @BindView(R.id.rb6)
    CheckBox rb6;

    String leader = "";
    String leaderCode = "";
    String leaderName = "";
    String name = "";

    String[] bigNametemp = null;
    String[] bigCodetemp = null;
    List<String> resultList = new ArrayList<>();
    List<String> resultList1 = new ArrayList<>();
    List<String> bigResultList = new ArrayList<>();
    List<String> bigResultList1 = new ArrayList<>();
    @BindView(R.id.cb1)
    CheckBox cb1;
    @BindView(R.id.cb2)
    CheckBox cb2;
    @BindView(R.id.cb3)
    CheckBox cb3;
    @BindView(R.id.cb4)
    CheckBox cb4;
    @BindView(R.id.cb5)
    CheckBox cb5;
    @BindView(R.id.cb6)
    CheckBox cb6;
    @BindView(R.id.ll1)
    LinearLayout ll1;
    @BindView(R.id.ll2)
    LinearLayout ll2;
    @BindView(R.id.ll3)
    LinearLayout ll3;
    @BindView(R.id.ll4)
    LinearLayout ll4;
    String bmfzr = "";
    String fgfze = "";
    String zjl = "";
    boolean assigned;
    String tag = "noEnd";
    String bmreout = "";
    String fgreout = "";
    String zjlreout = "";

    String role = "";
    String url;
    String userCode = "";
    String userName = "";
    String upData = "";
    String[] nametemp = null;
    String[] codetemp = null;
    List<String> namelist = new ArrayList<>();
    List<QingJiaWillDoDetail.TransBean> beanList = new ArrayList<>();
    List<String> selectList = new ArrayList<>();
    String xiangguanfujian;
    @BindView(R.id.btnT)
    FloatingActionButton btnT;

    String btnTTag = "N";
    @BindView(R.id.tvText)
    TextView tvText;
    @BindView(R.id.btnHistory)
    Button btnHistory;
    @BindView(R.id.recyclerView)
    RecyclerView recyclerView;
    String flowMessage = "";
    String runID = "";
    String piId = "";
    String downloadData = "";
    FlowMessageAdapter adapter;
    List<FlowMessage1.DataBean> flowList = new ArrayList<>();
    @BindView(R.id.llData)
    LinearLayout llData;
    @BindView(R.id.tvLeaderW)
    TextView tvLeaderW;
    @BindView(R.id.tvLeader1W)
    TextView tvLeader1W;
    @BindView(R.id.tvLeader2W)
    TextView tvLeader2W;

    Gson gson = new Gson();
    QingJiaWillDoDetail bean;
    JSONArray jsonArray;
    JSONObject jsonObject;
    SimpleDateFormat formatter;
    Date curDate;
    String str;
    private String executionId;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ButterKnife.bind(this);
        jsonArray = new JSONArray();
        jsonObject = new JSONObject();
        formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm");
        curDate = new Date(System.currentTimeMillis());
        str = formatter.format(curDate);

        btnOK.setVisibility(View.VISIBLE);
        LinearLayoutManager manager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(manager);
        Intent intent = getIntent();
        name = intent.getStringExtra("activityName");
        taskId = intent.getStringExtra("taskId");
        piId = intent.getStringExtra("piId");
        executionId = intent.getStringExtra("executionId");
        getData(name, taskId);
    }

    @Override
    protected int provideContentViewId() {
        return R.layout.activity_flow_leavewilldetail;
    }

    @Override
    protected boolean isHasHeader() {
        return true;
    }

    @Override
    protected void rightClient() {
        final AlertDialog dialog = new AlertDialog.Builder(this).create();
        dialog.setView(LayoutInflater.from(this).inflate(R.layout.dialog_with_edittext, null));
        dialog.show();
        dialog.getWindow().setContentView(R.layout.dialog_with_edittext);
        final EditText etContent = (EditText) dialog.findViewById(R.id.etContent);
        TextView tv_yes = (TextView) dialog.findViewById(R.id.yes);
        TextView tv_no = (TextView) dialog.findViewById(R.id.no);
        tv_yes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                final String str = etContent.getText().toString();
                if (str.equals("")) {
                    Toast.makeText(FlowLeaveWillDetailActivity.this, getResources().getString(R.string.nullify_reason), Toast.LENGTH_SHORT).show();
                } else {
                    dialog.dismiss();
                    ProgressDialogUtil.startLoad(FlowLeaveWillDetailActivity.this, getResources().getString(R.string.get_data));
                    new Thread(new Runnable() {
                        @Override
                        public void run() {
                            DBHandler dbHandler = new DBHandler();
                            String url = Constant.BASE_URL2 + Constant.NULLIFY;
                            boolean nullifyData = dbHandler.OAFlowNullify(url, taskId, str, executionId);
                            if (nullifyData) {
                                handler.sendEmptyMessage(333);
                            } else {
                                handler.sendEmptyMessage(444);
                            }
                        }
                    }).start();
                }
            }
        });
        tv_no.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                dialog.dismiss();
            }
        });
    }

    /**
     * 获取数据
     *
     * @param Name
     * @param taskId
     */
    private void getData(final String Name, final String taskId) {
        ProgressDialogUtil.startLoad(this, getResources().getString(R.string.get_data));
        new Thread(new Runnable() {
            @Override
            public void run() {
                //String name =URLDecoder.decode(待转值,"utf-8");
                String url = Constant.BASE_URL2 + Constant.DETAILWILL + Name + "&taskId=" + taskId + "&piId=" + piId;
                //                DBHandler dbA = new DBHandler();
//                res = dbA.OAQingJiaWillDoDex(url);
                OkHttpClient okHttpClient = new OkHttpClient();
                String Session = new SharedPreferencesHelper(MyApplication.getContext(), "login").getData(MyApplication.getContext(), "session", "");
                final Request request = new Request.Builder()
                        .url(url)
                        .addHeader("Cookie", Session)
                        .get()//默认就是GET请求，可以不写
                        .build();
                Call call = okHttpClient.newCall(request);
                call.enqueue(new Callback() {
                    @Override
                    public void onFailure(Call call, IOException e) {
                        handler.sendEmptyMessage(TAG_TWO);
                    }

                    @Override
                    public void onResponse(Call call, Response response) throws IOException {
                        res = response.body().string();
                        handler.sendEmptyMessage(TAG_ONE);
                    }
                });
            }
        }).start();
    }

    @OnClick({R.id.btnOK, R.id.tvData, R.id.btnT, R.id.btnHistory})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.btnHistory:
                recyclerView.setVisibility(View.VISIBLE);
                ProgressDialogUtil.startLoad(FlowLeaveWillDetailActivity.this, "获取数据中");
                new Thread(new Runnable() {
                    @Override
                    public void run() {
                        //String name =URLDecoder.decode(待转值,"utf-8");
                        String url = Constant.BASE_URL2 + Constant.FLOWMESSAGE;
                        DBHandler dbA = new DBHandler();
                        flowMessage = dbA.OAFlowMessage(url, runID);
                        if (flowMessage.equals("获取数据失败") || flowMessage.equals("")) {
                            handler.sendEmptyMessage(TAG_TWO);
                        } else {
                            handler.sendEmptyMessage(111);
                        }
                    }
                }).start();
                btnHistory.setEnabled(false);
                break;
            case R.id.btnT:
                btnTTag = "Y";
                if (beanList.size() != 0) {
                    if (beanList.size() == 1) {
                        ProgressDialogUtil.startLoad(FlowLeaveWillDetailActivity.this, "获取数据中");
                        new Thread(new Runnable() {
                            @Override
                            public void run() {
                                DBHandler dbA = new DBHandler();
                                destType = beanList.get(0).getDestType();
                                if (destType.equals("decision") || destType.equals("fork") || destType.equals("join")) {
                                    handler.sendEmptyMessage(TAG_SIX);
                                } else if (destType.indexOf("end") == -1) {
                                    handler.sendEmptyMessage(TAG_FIVE);
                                } else {
                                    getLastPerson();
                                }
                                signaName = beanList.get(0).getName();
                                destName = beanList.get(0).getDestination();
                            }
                        }).start();
                    } else {
                        namelist.clear();
                        for (int i = 0; i < beanList.size(); i++) {
                            namelist.add(beanList.get(i).getDestination());
                        }
                        MyAlertDialog.MyListAlertDialog(FlowLeaveWillDetailActivity.this, namelist, new AlertDialogCallBackP() {
                            @Override
                            public void oneselect(final String data) {
                                ProgressDialogUtil.startLoad(FlowLeaveWillDetailActivity.this, "获取数据中");
                                destName = data;
                                for (int i = 0; i < beanList.size(); i++) {
                                    if (destName.equals(beanList.get(i).getDestination())) {
                                        signaName = beanList.get(i).getName();
                                        destType = beanList.get(i).getDestType();
                                    }
                                }
                                if (destType.equals("decision") || destType.equals("fork") || destType.equals("join")) {
                                    handler.sendEmptyMessage(TAG_SIX);
                                } else if (destType.indexOf("end") == -1) {
                                    handler.sendEmptyMessage(TAG_FIVE);
                                } else {
                                    getLastPerson();
                                }

                            }

                            @Override
                            public void select(List<String> list) {

                            }

                            @Override
                            public void confirm() {

                            }

                            @Override
                            public void cancel() {

                            }
                        });
                    }
                } else {
                    Toast.makeText(FlowLeaveWillDetailActivity.this, "审批人为空", Toast.LENGTH_SHORT).show();
                }
                break;
            case R.id.tvData:
                List<String> dataList = new ArrayList<>();
                if (!xiangguanfujian.equals("")) {
                    dataList = new MyStringSpilt().stringSpiltList(xiangguanfujian);
                    if (dataList.size() == 1) {
                        String id = new MyStringSpilt().stringSpilt(dataList.get(0));
                        final String url = Constant.BASE_URL2 + Constant.FILEDATA + "?fileId=" + id;
                        new Thread(new Runnable() {
                            @Override
                            public void run() {
                                DBHandler dbA = new DBHandler();
                                downloadData = dbA.OAQingJiaMyDetail(url);
                                if (downloadData.equals("获取数据失败") || downloadData.equals("")) {
                                    handler.sendEmptyMessage(TAG_TWO);
                                } else {
                                    handler.sendEmptyMessage(TAG_NINE);
                                }
                            }
                        }).start();
                    } else if (dataList.size() > 1) {
                        MyAlertDialog.MyListAlertDialog(this, dataList, new AlertDialogCallBackP() {
                            @Override
                            public void oneselect(final String data1) {
                                String id = new MyStringSpilt().stringSpilt(data1);
                                final String url = Constant.BASE_URL2 + Constant.FILEDATA + "?fileId=" + id;
                                new Thread(new Runnable() {
                                    @Override
                                    public void run() {
                                        DBHandler dbA = new DBHandler();
                                        downloadData = dbA.OAQingJiaMyDetail(url);
                                        if (downloadData.equals("获取数据失败") || downloadData.equals("")) {
                                            handler.sendEmptyMessage(TAG_TWO);
                                        } else {
                                            handler.sendEmptyMessage(TAG_NINE);
                                        }
                                    }
                                }).start();
                            }

                            @Override
                            public void select(List<String> list) {

                            }

                            @Override
                            public void confirm() {

                            }

                            @Override
                            public void cancel() {

                            }
                        });
                    }
                }
                break;
            case R.id.btnOK:
                gson = new Gson();
                bean = gson.fromJson(res, QingJiaWillDoDetail.class);
                bmfzr = bean.getMainform().get(0).getBmfzryj();
                fgfze = bean.getMainform().get(0).getFgldyj();
                zjl = bean.getMainform().get(0).getZjlyj();
                userName = new SharedPreferencesHelper(FlowLeaveWillDetailActivity.this,
                        "login").getData(FlowLeaveWillDetailActivity.this, "userStatus", "");
                userCode = new SharedPreferencesHelper(FlowLeaveWillDetailActivity.this,
                        "login").getData(FlowLeaveWillDetailActivity.this, "userCode", "");
                jsonArray = new JSONArray();
                jsonObject = new JSONObject();
                formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm");
                curDate = new Date(System.currentTimeMillis());
                str = formatter.format(curDate);
                if (etLeader.getVisibility() == View.VISIBLE) {
                    comments = etLeader.getText().toString();
                    try {
                        jsonObject.put("ui", userCode);
                        jsonObject.put("un", userName);
                        jsonObject.put("c", str);
                        jsonObject.put("v", etLeader.getText().toString());
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                    jsonArray.put(jsonObject);
                    if (bmfzr.equals("")) {
                        bmfzr = jsonArray.toString();
                    } else {
                        bmfzr = bmfzr + "," + jsonArray.toString();
                        bmfzr = bmfzr.toString().replace("],[", ",");
                    }
                }
                if (etLeader1.getVisibility() == View.VISIBLE) {
                    comments = etLeader1.getText().toString();
                    try {
                        jsonObject.put("ui", userCode);
                        jsonObject.put("un", userName);
                        jsonObject.put("c", str);
                        jsonObject.put("v", etLeader1.getText().toString());
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                    jsonArray.put(jsonObject);
                    if (fgfze.equals("")) {
                        fgfze = jsonArray.toString();
                    } else {
                        fgfze = fgfze + "," + jsonArray.toString();
                        fgfze = fgfze.toString().replace("],[", ",");
                    }
                }
                if (etLeader2.getVisibility() == View.VISIBLE) {
                    comments = etLeader2.getText().toString();
                    try {
                        jsonObject.put("ui", userCode);
                        jsonObject.put("un", userName);
                        jsonObject.put("c", str);
                        jsonObject.put("v", etLeader2.getText().toString());
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                    jsonArray.put(jsonObject);
                    if (zjl.equals("")) {
                        zjl = jsonArray.toString();
                    } else {
                        zjl = zjl + "," + jsonArray.toString();
                        zjl = zjl.toString().replace("],[", ",");
                    }
                }
                if (comments.equals("")) {
                    if (!bmreout.equals("2") && !fgreout.equals("2") && !zjlreout.equals("2")) {
                        comments = "";
                        personSession();
                    } else if (!etLeader2.getText().toString().equals("") && !fgfze.equals("") && !bmfzr.equals("")) {
                        comments = "";
                        personSession();
                    } else {
                        Toast.makeText(this, "请签字", Toast.LENGTH_SHORT).show();
                    }
                } else {
                    personSession();
                }
                break;
        }
    }

    private void personSession() {
        if (bigResultList.size() != 0) {
            sendData();
        } else {
            if (btnT.getVisibility() == View.VISIBLE) {
                if (btnTTag.equals("N")) {
                    Gson gson = new Gson();
                    FlowCarVideoWillDetail bean = gson.fromJson(res, FlowCarVideoWillDetail.class);
                    bmfzr = bean.getMainform().get(0).getBmfzryj();
                    fgfze = bean.getMainform().get(0).getXxjsbyj();
                    zjl = bean.getMainform().get(0).getJkczyyj();
                    Toast.makeText(this, "请点击加号选择路径", Toast.LENGTH_SHORT).show();
                } else {
                    sendData();
                }
            } else {
                sendData();
            }
        }
    }

    public void getAppRovePerson() {
        ProgressDialogUtil.startLoad(FlowLeaveWillDetailActivity.this, "获取数据中");
        new Thread(new Runnable() {
            @Override
            public void run() {
                DBHandler dbA = new DBHandler();
                destType = beanList.get(0).getDestType();
                if (destType.equals("decision") || destType.equals("fork") || destType.equals("join")) {
                    handler.sendEmptyMessage(TAG_SIX);
                } else if (destType.indexOf("end") == -1) {
                    handler.sendEmptyMessage(TAG_FIVE);
                } else {
                    getLastPerson();
                }
                signaName = beanList.get(0).getName();
                destName = beanList.get(0).getDestination();
            }
        }).start();
        ProgressDialogUtil.stopLoad();
    }

    private void sendData() {
        ProgressDialogUtil.startLoad(this, "提交数据中");
        new Thread(new Runnable() {
            @Override
            public void run() {
                final String userCode = new SharedPreferencesHelper(FlowLeaveWillDetailActivity.this,
                        "login").getData(FlowLeaveWillDetailActivity.this, "userCode", "");
                String person = tvPerson.getText().toString();
                String time = tvTime.getText().toString();
                String type = tvType.getText().toString();
                String reason = tvReason.getText().toString();
                String beginDate = tvStartTime.getText().toString();
                String endDate = tvEndTime.getText().toString();
                String days = tvDays.getText().toString();
                if (codetemp != null) {
                    for (String s : codetemp) {
                        resultList.add(s);
                    }
                }
                if (bigCodetemp != null) {
                    for (String s : bigCodetemp) {
                        bigResultList.add(s);
                        bigResultList1.add(s);
                    }
                }
                if (!rb6.isChecked()) {
                    if (resultList.size() >= 6) {
                        resultList.remove(5);
                    }
                }
                if (!rb5.isChecked()) {
                    if (resultList.size() >= 5) {
                        resultList.remove(4);
                    }
                }
                if (!rb4.isChecked()) {
                    if (resultList.size() >= 4) {
                        resultList.remove(3);
                    }
                }
                if (!rb3.isChecked()) {
                    if (resultList.size() >= 3) {
                        resultList.remove(2);
                    }
                }
                if (!rb2.isChecked()) {
                    if (resultList.size() >= 2) {
                        resultList.remove(1);
                    }
                }
                if (!rb1.isChecked()) {
                    if (resultList.size() >= 1) {
                        resultList.remove(0);
                    }
                }

                if (!cb6.isChecked()) {
                    if (bigResultList.size() >= 6) {
                        bigResultList.remove(5);
                    }
                }
                if (!cb5.isChecked()) {
                    if (bigResultList.size() >= 5) {
                        bigResultList.remove(4);
                    }
                }
                if (!cb4.isChecked()) {
                    if (bigResultList.size() >= 4) {
                        bigResultList.remove(3);
                    }
                }
                if (!cb3.isChecked()) {
                    if (bigResultList.size() >= 3) {
                        bigResultList.remove(2);
                    }
                }
                if (!cb2.isChecked()) {
                    if (bigResultList.size() >= 2) {
                        bigResultList.remove(1);
                    }
                }
                if (!cb1.isChecked()) {
                    if (bigResultList.size() >= 1) {
                        bigResultList.remove(0);
                    }
                }


                String url = Constant.BASE_URL2 + Constant.EXAMINEDATA;
                DBHandler dbA = new DBHandler();

                String userCodes = "";
                if (resultList.size() == 0) {
                    userCodes = resultList1.toString();
                    userCodes = userCodes.toString().replace("[", "");
                    userCodes = userCodes.toString().replace("]", "");
                } else {
                    userCodes = resultList.toString();
                    userCodes = userCodes.toString().replace("[", "");
                    userCodes = userCodes.toString().replace("]", "");
                }
                String[] nameNum = null;
                nameNum = role.split(",");
                String nameText = "";
                for (int i = 0; i < nameNum.length; i++) {
                    if (i == 0) {
                        nameText = nameNum[0];
                    } else {
                        nameText = nameText + ":" + nameNum[i];
                    }
                }

                String[] codeNum = null;
                codeNum = userCodes.split(",");
                String codeText = "";
                for (int i = 0; i < nameNum.length; i++) {
                    if (i == 0) {
                        codeText = codeNum[0];
                    } else {
                        codeText = codeText + ":" + codeNum[i];
                    }
                }
                String otherCodeText = "";
                for (int i = nameNum.length; i < codeNum.length; i++) {
                    if (i == nameNum.length) {
                        otherCodeText = codeNum[nameNum.length];
                    } else {
                        otherCodeText = otherCodeText + "," + codeNum[i];
                    }
                }
                if (bigResultList.size() == 0 && bigResultList1.size() != 0) {
                    Looper.prepare();
                    ProgressDialogUtil.stopLoad();
                    Toast.makeText(FlowLeaveWillDetailActivity.this, "请选择审批人", Toast.LENGTH_SHORT).show();
                    Looper.loop();
                } else {
                    String bigUserCodes = bigResultList.toString();
                    bigUserCodes = bigUserCodes.toString().replace("[", "");
                    bigUserCodes = bigUserCodes.toString().replace("]", "");

                    if (!bigUserCodes.equals("") && !userCodes.equals("")) {
//                        flowAssignld = leader + ":" + role + "|" + bigUserCodes + ":" + userCodes;
                        flowAssignld = leader + ":" + nameText + "|" + bigUserCodes + ":" + codeText + "," + otherCodeText;
                        flowAssignld = flowAssignld.replace(" ", "");
                        flowAssignld = flowAssignld.replace(":|", "|");
                    } else if (!bigUserCodes.equals("") && userCodes.equals("")) {
                        flowAssignld = leader + ":" + nameText + "|" + bigUserCodes;
                        flowAssignld = flowAssignld.replace(" ", "");
                        flowAssignld = flowAssignld.replace(":|", "|");
                    } else {
                        flowAssignld = destName + "|" + userCodes;
                        flowAssignld = flowAssignld.replace(" ", "");
                        flowAssignld = flowAssignld.replace(":|", "|");
                        flowAssignld = flowAssignld.replace(":", "");
                    }
                }

                upData = dbA.OAQingJiaLeader(url, person, time, type, reason, beginDate, endDate, userName,
                        userCode, signaName, destName, taskId, comments, days, fullnameUId, fullname,
                        flowAssignld, mainId, bmfzr, fgfze, zjl);
                if (upData.equals("")) {
                    handler.sendEmptyMessage(TAG_THERE);
                } else {
                    handler.sendEmptyMessage(TAG_FOUR);
                }
            }
        }).start();
    }

    /**
     * 请求第一个处理人  之后不再让别人处理
     */
    private void getLastPerson() {
        new Thread(new Runnable() {
            @Override
            public void run() {
                String url = Constant.BASE_URL2 + Constant.LASTPERSON;
                DBHandler dbA = new DBHandler();
                checkTask = dbA.OAQingJiaLast(url, taskId);
                if (checkTask.equals("保存失败") || checkTask.equals("")) {
                    handler.sendEmptyMessage(TAG_TWO);
                } else {
                    handler.sendEmptyMessage(TAG_EIGHT);
                }
            }
        }).start();
    }

    /**
     * 获取destType  最后不是end的下一级审核人
     */
    private void getNoEndPerson() {
        new Thread(new Runnable() {
            @Override
            public void run() {
                String url = Constant.BASE_URL2 + Constant.NOENDPERSON;
                DBHandler dbA = new DBHandler();
                qianzhiData = dbA.OAQingJiaFornt1(url, taskId, destName);
                if (qianzhiData.equals("保存失败") || qianzhiData.equals("")) {
                    handler.sendEmptyMessage(TAG_TWO);
                } else {
                    handler.sendEmptyMessage(TAG_SEVEN);
                }
            }
        }).start();
    }

    private void getNextPerson() {
        new Thread(new Runnable() {
            @Override
            public void run() {
                String url = Constant.BASE_URL2 + Constant.NESTPERSON;
                DBHandler dbA = new DBHandler();
                qianzhiData = dbA.OAQingJiaFornt1(url, taskId, destName);
                if (qianzhiData.equals("保存失败") || qianzhiData.equals("")) {
                    handler.sendEmptyMessage(TAG_TWO);
                } else {
                    handler.sendEmptyMessage(TAG_SEVEN);
                }
            }
        }).start();
    }

    /**
     * 设置多选框显示
     */
    private void setCbRbVer() {
        resultList.clear();
        bigResultList.clear();
        if (nametemp != null) {
            if (nametemp.length == 1) {
                rb1.setText(nametemp[0]);
                ll3.setVisibility(View.VISIBLE);
                rb1.setVisibility(View.VISIBLE);
                rb2.setVisibility(View.INVISIBLE);
                rb3.setVisibility(View.INVISIBLE);
            }
            if (nametemp.length == 2) {
                rb1.setText(nametemp[0]);
                rb2.setText(nametemp[1]);
                ll3.setVisibility(View.VISIBLE);
                rb1.setVisibility(View.VISIBLE);
                rb2.setVisibility(View.VISIBLE);
                rb3.setVisibility(View.INVISIBLE);
            }
            if (nametemp.length == 3) {
                rb1.setText(nametemp[0]);
                rb2.setText(nametemp[1]);
                rb3.setText(nametemp[2]);
                ll3.setVisibility(View.VISIBLE);
                rb1.setVisibility(View.VISIBLE);
                rb2.setVisibility(View.VISIBLE);
                rb3.setVisibility(View.VISIBLE);
            }
            if (nametemp.length == 4) {
                rb1.setText(nametemp[0]);
                rb2.setText(nametemp[1]);
                rb3.setText(nametemp[2]);
                rb4.setText(nametemp[3]);
                ll3.setVisibility(View.VISIBLE);
                ll4.setVisibility(View.VISIBLE);
                rb1.setVisibility(View.VISIBLE);
                rb2.setVisibility(View.VISIBLE);
                rb3.setVisibility(View.VISIBLE);
                rb4.setVisibility(View.VISIBLE);
                rb5.setVisibility(View.INVISIBLE);
                rb6.setVisibility(View.INVISIBLE);
            }
            if (nametemp.length == 5) {
                rb1.setText(nametemp[0]);
                rb2.setText(nametemp[1]);
                rb3.setText(nametemp[2]);
                rb4.setText(nametemp[3]);
                rb5.setText(nametemp[4]);
                ll3.setVisibility(View.VISIBLE);
                ll4.setVisibility(View.VISIBLE);
                rb1.setVisibility(View.VISIBLE);
                rb2.setVisibility(View.VISIBLE);
                rb3.setVisibility(View.VISIBLE);
                rb4.setVisibility(View.VISIBLE);
                rb5.setVisibility(View.VISIBLE);
                rb6.setVisibility(View.INVISIBLE);
            }
            if (nametemp.length >= 6) {
                rb1.setText(nametemp[0]);
                rb2.setText(nametemp[1]);
                rb3.setText(nametemp[2]);
                rb4.setText(nametemp[3]);
                rb5.setText(nametemp[4]);
                rb6.setText(nametemp[5]);
                ll3.setVisibility(View.VISIBLE);
                ll4.setVisibility(View.VISIBLE);
                rb1.setVisibility(View.VISIBLE);
                rb2.setVisibility(View.VISIBLE);
                rb3.setVisibility(View.VISIBLE);
                rb4.setVisibility(View.VISIBLE);
                rb5.setVisibility(View.VISIBLE);
                rb6.setVisibility(View.VISIBLE);
            }
        }


        if (bigNametemp != null) {
            if (bigNametemp.length == 1) {
                cb1.setText(bigNametemp[0]);
                ll1.setVisibility(View.VISIBLE);
                cb1.setVisibility(View.VISIBLE);
                cb2.setVisibility(View.INVISIBLE);
                cb3.setVisibility(View.INVISIBLE);
            }
            if (bigNametemp.length == 2) {
                cb1.setText(bigNametemp[0]);
                cb2.setText(bigNametemp[1]);
                ll1.setVisibility(View.VISIBLE);
                cb1.setVisibility(View.VISIBLE);
                cb2.setVisibility(View.VISIBLE);
                cb3.setVisibility(View.INVISIBLE);
            }
            if (bigNametemp.length == 3) {
                cb1.setText(bigNametemp[0]);
                cb2.setText(bigNametemp[1]);
                cb3.setText(bigNametemp[2]);
                ll1.setVisibility(View.VISIBLE);
                cb1.setVisibility(View.VISIBLE);
                cb2.setVisibility(View.VISIBLE);
                cb3.setVisibility(View.VISIBLE);
            }
            if (bigNametemp.length == 4) {
                cb1.setText(bigNametemp[0]);
                cb2.setText(bigNametemp[1]);
                cb3.setText(bigNametemp[2]);
                cb4.setText(bigNametemp[3]);
                ll1.setVisibility(View.VISIBLE);
                ll2.setVisibility(View.VISIBLE);
                cb1.setVisibility(View.VISIBLE);
                cb2.setVisibility(View.VISIBLE);
                cb3.setVisibility(View.VISIBLE);
                cb4.setVisibility(View.VISIBLE);
                cb5.setVisibility(View.INVISIBLE);
                cb6.setVisibility(View.INVISIBLE);
            }
            if (bigNametemp.length == 5) {
                cb1.setText(bigNametemp[0]);
                cb2.setText(bigNametemp[1]);
                cb3.setText(bigNametemp[2]);
                cb4.setText(bigNametemp[3]);
                cb5.setText(bigNametemp[4]);
                ll1.setVisibility(View.VISIBLE);
                ll2.setVisibility(View.VISIBLE);
                cb1.setVisibility(View.VISIBLE);
                cb2.setVisibility(View.VISIBLE);
                cb3.setVisibility(View.VISIBLE);
                cb4.setVisibility(View.VISIBLE);
                cb5.setVisibility(View.VISIBLE);
                cb6.setVisibility(View.INVISIBLE);
            }
            if (bigNametemp.length >= 6) {
                cb1.setText(bigNametemp[0]);
                cb2.setText(bigNametemp[1]);
                cb3.setText(bigNametemp[2]);
                cb4.setText(bigNametemp[3]);
                cb5.setText(bigNametemp[4]);
                cb6.setText(bigNametemp[5]);
                ll1.setVisibility(View.VISIBLE);
                ll2.setVisibility(View.VISIBLE);
                cb1.setVisibility(View.VISIBLE);
                cb2.setVisibility(View.VISIBLE);
                cb3.setVisibility(View.VISIBLE);
                cb4.setVisibility(View.VISIBLE);
                cb5.setVisibility(View.VISIBLE);
                cb6.setVisibility(View.VISIBLE);
            }
        }
        ProgressDialogUtil.stopLoad();
    }

    Handler handler = new Handler() {
        @Override
        public void handleMessage(Message msg) {
            super.handleMessage(msg);
            switch (msg.what) {
                case 333:
                    ProgressDialogUtil.stopLoad();
                    Toast.makeText(FlowLeaveWillDetailActivity.this, getResources().getString(R.string.c_success), Toast.LENGTH_SHORT).show();
                    finish();
                    break;
                case 444:
                    ProgressDialogUtil.stopLoad();
                    Toast.makeText(FlowLeaveWillDetailActivity.this, getResources().getString(R.string.c_false), Toast.LENGTH_SHORT).show();
                    break;
                case 111:
                    Gson gsonF = new Gson();
                    FlowMessage1 beanF = gsonF.fromJson(flowMessage, FlowMessage1.class);
                    for (int i = 0; i < beanF.getData().size(); i++) {
                        flowList.add(beanF.getData().get(i));
                    }
                    adapter = new FlowMessageAdapter(FlowLeaveWillDetailActivity.this, flowList);
                    recyclerView.setAdapter(adapter);
                    ProgressDialogUtil.stopLoad();
                    break;
                case TAG_ONE:
                    Gson gson = new Gson();
                    QingJiaWillDoDetail bean = gson.fromJson(res, QingJiaWillDoDetail.class);
                    taskId = bean.getTaskId();
                    fullnameUId = bean.getMainform().get(0).getFullnameUId();
                    fullname = bean.getMainform().get(0).getFullname();
                    String person = bean.getMainform().get(0).getFullname();
                    String data = bean.getMainform().get(0).getTianDanRiQi();
                    String type = bean.getMainform().get(0).getVocationType();
                    String days = bean.getMainform().get(0).getVocationDays();
                    String reason = bean.getMainform().get(0).getShiyou();
                    String beginDate = bean.getMainform().get(0).getBeginDate();
                    String beginTime = bean.getMainform().get(0).getKsdayType();
                    String endDate = bean.getMainform().get(0).getEndDate();
                    String endTime = bean.getMainform().get(0).getJsdayType();
                    xiangguanfujian = bean.getMainform().get(0).getFuBingLi();
                    runID = bean.getMainform().get(0).getRunId();
                    if (xiangguanfujian.equals("")) {
                        llData.setVisibility(View.GONE);
                    } else {
                        tvData.setText(xiangguanfujian);
                    }
                    bmfzr = bean.getMainform().get(0).getBmfzryj();
                    fgfze = bean.getMainform().get(0).getFgldyj();
                    zjl = bean.getMainform().get(0).getZjlyj();
                    taskId = bean.getTaskId();
                    signaName = bean.getTrans().get(0).getName();
                    mainId = String.valueOf(bean.getMainform().get(0).getMainId());
                    for (int i = 0; i < bean.getTrans().size(); i++) {
                        beanList.add(bean.getTrans().get(i));
                    }
                    String formRights = bean.getFormRights();
                    try {
                        JSONObject jsonObject = new JSONObject(formRights);
                        bmreout = jsonObject.getString("bmfzryj");
                        fgreout = jsonObject.getString("fgldyj");
                        zjlreout = jsonObject.getString("zjlyj");
                        if (bmreout.equals("2")) {
                            tvLeader.setVisibility(View.GONE);
                            etLeader.setVisibility(View.VISIBLE);
                        } else {
                            tvLeader.setVisibility(View.VISIBLE);
                            etLeader.setVisibility(View.GONE);
                            tvLeaderW.setTextColor(getResources().getColor(R.color.order_stop_black));
                        }
                        if (fgreout.equals("2")) {
                            tvLeader1.setVisibility(View.GONE);
                            etLeader1.setVisibility(View.VISIBLE);
                        } else {
                            tvLeader1.setVisibility(View.VISIBLE);
                            etLeader1.setVisibility(View.GONE);
                            tvLeader1W.setTextColor(getResources().getColor(R.color.order_stop_black));
                        }
                        if (zjlreout.equals("2")) {
                            tvLeader2.setVisibility(View.GONE);
                            etLeader2.setVisibility(View.VISIBLE);
                        } else {
                            tvLeader2.setVisibility(View.VISIBLE);
                            etLeader2.setVisibility(View.GONE);
                            tvLeader2W.setTextColor(getResources().getColor(R.color.order_stop_black));
                        }
                        if (bmreout.equals("1") && fgreout.equals("1") && zjlreout.equals("1")) {
                            Toast.makeText(FlowLeaveWillDetailActivity.this, "您对当前流程只有读取权限", Toast.LENGTH_SHORT).show();
                        }
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                    tvPerson.setText(person);
                    tvTime.setText(data);
                    tvType.setText(type);
                    tvDays.setText(days);
                    tvReason.setText(reason);
                    tvStartTime.setText(beginDate);
                    tvAM.setText(beginTime);
                    tvEndTime.setText(endDate);
                    tvPM.setText(endTime);

                    String word2 = "";
                    if (zjl != null && !zjl.equals("")) {
                        try {
                            JSONArray jsonArray = new JSONArray(zjl);
                            for (int i = 0; i < jsonArray.length(); i++) {
                                JSONObject jsonObject = jsonArray.getJSONObject(i);
                                if (!jsonObject.getString("v").toString().equals("")) {
                                    word2 = word2 + jsonObject.getString("v") + "\u3000" + jsonObject.getString("un") + ":" + jsonObject.getString("c") + "\n";
                                }
                            }
                        } catch (JSONException e) {
                            e.printStackTrace();
                        }
                        if (tvLeader2.getVisibility() == View.VISIBLE) {
                            tvLeader2.setText(word2);
                        } else {
                            etLeader2.setHint(word2);
                        }
                    }

                    String word1 = "";
                    if (fgfze != null && !fgfze.equals("")) {
                        try {
                            JSONArray jsonArray = new JSONArray(fgfze);
                            for (int i = 0; i < jsonArray.length(); i++) {
                                JSONObject jsonObject = jsonArray.getJSONObject(i);
                                if (!jsonObject.getString("v").toString().equals("")) {
                                    word1 = word1 + jsonObject.getString("v") + "\u3000" + jsonObject.getString("un") + ":" + jsonObject.getString("c") + "\n";
                                }
                            }
                        } catch (JSONException e) {
                            e.printStackTrace();
                        }
                        if (tvLeader1.getVisibility() == View.VISIBLE) {
                            tvLeader1.setText(word1);
                        } else {
                            etLeader1.setHint(word1);
                        }
                    }

                    String word = "";
                    if (bmfzr != null && !bmfzr.equals("")) {
                        try {
                            JSONArray jsonArray = new JSONArray(bmfzr);
                            for (int i = 0; i < jsonArray.length(); i++) {
                                JSONObject jsonObject = jsonArray.getJSONObject(i);
                                if (!jsonObject.getString("v").toString().equals("")) {
                                    word = word + jsonObject.getString("v") + "\u3000" + jsonObject.getString("un") + ":" + jsonObject.getString("c") + "\n";
                                }
                            }
                        } catch (JSONException e) {
                            e.printStackTrace();
                        }
                        if (tvLeader.getVisibility() == View.VISIBLE) {
                            tvLeader.setText(word);
                        } else {
                            etLeader.setHint(word);
                        }
                    }
                    if (bean.isRevoke()) {
                        Toast.makeText(FlowLeaveWillDetailActivity.this, "当前流程已被追回", Toast.LENGTH_SHORT).show();
                    }
                    ProgressDialogUtil.stopLoad();
                    if (beanList.size() == 1) {
                        btnT.setVisibility(View.GONE);
                        tvText.setVisibility(View.GONE);
                        ProgressDialogUtil.startLoad(FlowLeaveWillDetailActivity.this, "获取审核人");
                        getAppRovePerson();
                    }
                    break;
                case TAG_TWO:
                    Toast.makeText(FlowLeaveWillDetailActivity.this, "提交数据失败", Toast.LENGTH_SHORT).show();
                    ProgressDialogUtil.stopLoad();
                    break;
                case TAG_THERE:
                    Toast.makeText(FlowLeaveWillDetailActivity.this, "提交数据成功", Toast.LENGTH_SHORT).show();
                    ProgressDialogUtil.stopLoad();
                    finish();
                    break;
                case TAG_FOUR:
                    Toast.makeText(FlowLeaveWillDetailActivity.this, upData, Toast.LENGTH_SHORT).show();
                    ProgressDialogUtil.stopLoad();
                    break;
//                case TAG_FIVE:
//                    ProgressDialogUtil.stopLoad();
//                    try {
//                        JSONObject jsonObject = new JSONObject(res);
//                        JSONArray jsonArray = jsonObject.getJSONArray("data");
//                        isShow = jsonObject.getString("isShow");
//                        for (int i = 0; i < jsonArray.length(); i++) {
//                            Name.DataBean name = new Name.DataBean();
//                            JSONObject jsonObjectName = jsonArray.getJSONObject(i);
//                            name.setActivityName(jsonObjectName.getString("userNames"));
//                            name.setUName(jsonObjectName.getString("userCodes"));
//                            datalist.add(name);
//                        }
//                    } catch (JSONException e) {
//                        e.printStackTrace();
//                    }
//                    if (datalist.size() == 1) {
//                        Name.DataBean bean1 = datalist.get(0);
//                        userCode = bean1.getActivityName();
//                        userName = bean1.getUName();
//                        nametemp = userName.split(",");
//                        codetemp = userCode.split(",");
//                        if (codetemp != null) {
//                            for (String s : codetemp) {
//                                codeList.add(s);
//                            }
//                        }
//                        if (nametemp != null) {
//                            for (String s : nametemp) {
//                                nameList.add(s);
//                            }
//                        }
//                        MyAlertDialog.MyListAlertDialog(isShow,codeList, nameList, namelist1, FlowLeaveWillDetailActivity.this, new AlertDialogCallBackP() {
//
//                            @Override
//                            public void select(List<String> data) {
//                                selectList = data;
//                            }
//
//                            @Override
//                            public void oneselect(String s) {
//
//                            }
//
//                            @Override
//                            public void confirm() {
//                                handler.sendEmptyMessage(TAG_SIX);
//                            }
//
//                            @Override
//                            public void cancel() {
//                            }
//                        });
//                    }
//                    getLastPerson();
//                    break;
//                case TAG_SIX:
//                    Toast.makeText(FlowLeaveWillDetailActivity.this, "请选择", Toast.LENGTH_SHORT).show();
//                    MyAlertDialog.MyListAlertDialog(isShow,codeList, nameList, namelist1, FlowLeaveWillDetailActivity.this, new AlertDialogCallBackP() {
//
//                        @Override
//                        public void select(List<String> data) {
//                            selectList = data;
//                        }
//
//                        @Override
//                        public void oneselect(String s) {
//
//                        }
//
//                        @Override
//                        public void confirm() {
//                            handler.sendEmptyMessage(TAG_SIX);
//                        }
//
//                        @Override
//                        public void cancel() {
//
//                        }
//                    });
//                    break;
                case TAG_FIVE:
                    getNoEndPerson();
                    break;
                case TAG_SIX:
                    getNextPerson();
                    break;
                case TAG_SEVEN:
                    bigNametemp = null;
                    bigCodetemp = null;
                    Gson gson1 = new Gson();
                    QianZhiData bean1 = gson1.fromJson(qianzhiData, QianZhiData.class);
                    if (bean1.getData() != null) {
                        if (bean1.getData().size() > 1) {
                            userCode = "";
                            userName = "";
                            role = "";
                            for (int i = 1; i < bean1.getData().size(); i++) {
                                if (i == 1) {
                                    role = role + bean1.getData().get(i).getRole();
                                    userCode = userCode + bean1.getData().get(i).getUserNames();
                                    userName = userName + bean1.getData().get(i).getUserCodes();
                                } else {
                                    role = role + "," + bean1.getData().get(i).getRole();
                                    userCode = userCode + "," + bean1.getData().get(i).getUserNames();
                                    userName = userName + "," + bean1.getData().get(i).getUserCodes();
                                }
                            }
                            nametemp = userName.split(",");
                            codetemp = userCode.split(",");
                        }
                        leader = bean1.getData().get(0).getRole();
                        leaderCode = bean1.getData().get(0).getUserNames();
                        leaderName = bean1.getData().get(0).getUserCodes();
                        bigNametemp = leaderName.split(",");
                        bigCodetemp = leaderCode.split(",");
                    }
                    setCbRbVer();
                    break;
                case TAG_EIGHT:
                    Toast.makeText(FlowLeaveWillDetailActivity.this, "流程已到最后一步，请提交", Toast.LENGTH_SHORT).show();
                    ProgressDialogUtil.stopLoad();
                    break;
                case TAG_NINE:
                    Gson gson2 = new Gson();
                    File file = gson2.fromJson(downloadData, File.class);
                    String filePath = file.getData().getFilePath();
                    String url = Constant.FIELDETAIL + filePath;
                    Intent intent = new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse(url));
                    startActivity(intent);
                    break;
            }
        }
    };
}
