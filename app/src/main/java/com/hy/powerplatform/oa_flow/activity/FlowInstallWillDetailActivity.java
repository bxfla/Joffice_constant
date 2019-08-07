package com.hy.powerplatform.oa_flow.activity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
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
import com.hy.powerplatform.my_utils.myViews.Header;
import com.hy.powerplatform.my_utils.myViews.MyAlertDialog;
import com.hy.powerplatform.my_utils.utils.ProgressDialogUtil;
import com.hy.powerplatform.my_utils.utils.time_select.CustomDatePickerDay;
import com.hy.powerplatform.oa_flow.adapter.FlowMessageAdapter;
import com.hy.powerplatform.oa_flow.bean.File;
import com.hy.powerplatform.oa_flow.bean.FlowContractPerson;
import com.hy.powerplatform.oa_flow.bean.FlowInstallWillDetail;
import com.hy.powerplatform.oa_flow.bean.FlowMessage1;
import com.hy.powerplatform.oa_flow.util.MyStringSpilt;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

import static com.hy.powerplatform.my_utils.base.Constant.TAG_EIGHT;
import static com.hy.powerplatform.my_utils.base.Constant.TAG_FIVE;
import static com.hy.powerplatform.my_utils.base.Constant.TAG_FOUR;
import static com.hy.powerplatform.my_utils.base.Constant.TAG_NINE;
import static com.hy.powerplatform.my_utils.base.Constant.TAG_ONE;
import static com.hy.powerplatform.my_utils.base.Constant.TAG_SEVEN;
import static com.hy.powerplatform.my_utils.base.Constant.TAG_SIX;
import static com.hy.powerplatform.my_utils.base.Constant.TAG_THERE;
import static com.hy.powerplatform.my_utils.base.Constant.TAG_TWO;

public class FlowInstallWillDetailActivity extends BaseActivity {
    @BindView(R.id.header)
    Header header;
    @BindView(R.id.tvDepartment)
    TextView tvDepartment;
    @BindView(R.id.tvDate)
    TextView tvDate;
    @BindView(R.id.tvData)
    TextView tvData;
    @BindView(R.id.tvDataW)
    TextView tvDataW;
    @BindView(R.id.cb1)
    CheckBox cb1;
    @BindView(R.id.cb2)
    CheckBox cb2;
    @BindView(R.id.cb3)
    CheckBox cb3;
    @BindView(R.id.ll1)
    LinearLayout ll1;
    @BindView(R.id.cb4)
    CheckBox cb4;
    @BindView(R.id.cb5)
    CheckBox cb5;
    @BindView(R.id.cb6)
    CheckBox cb6;
    @BindView(R.id.ll2)
    LinearLayout ll2;
    @BindView(R.id.cb7)
    CheckBox cb7;
    @BindView(R.id.cb8)
    CheckBox cb8;
    @BindView(R.id.cb9)
    CheckBox cb9;
    @BindView(R.id.ll5)
    LinearLayout ll5;
    @BindView(R.id.rb1)
    CheckBox rb1;
    @BindView(R.id.rb2)
    CheckBox rb2;
    @BindView(R.id.rb3)
    CheckBox rb3;
    @BindView(R.id.ll3)
    LinearLayout ll3;
    @BindView(R.id.rb4)
    CheckBox rb4;
    @BindView(R.id.rb5)
    CheckBox rb5;
    @BindView(R.id.rb6)
    CheckBox rb6;
    @BindView(R.id.ll4)
    LinearLayout ll4;
    @BindView(R.id.tvLeader)
    TextView tvLeader;
    @BindView(R.id.etLeader)
    EditText etLeader;
    @BindView(R.id.tvLeader1)
    TextView tvLeader1;
    @BindView(R.id.etLeader1)
    EditText etLeader1;
    @BindView(R.id.tvLeader2)
    TextView tvLeader2;
    @BindView(R.id.etLeader2)
    EditText etLeader2;
    @BindView(R.id.tvLeader3)
    TextView tvLeader3;
    @BindView(R.id.etLeader3)
    EditText etLeader3;
    @BindView(R.id.tvLeader4)
    TextView tvLeader4;
    @BindView(R.id.etLeader4)
    EditText etLeader4;
    @BindView(R.id.tvLeader5)
    TextView tvLeader5;
    @BindView(R.id.etLeader5)
    EditText etLeader5;
    @BindView(R.id.tvDate1)
    TextView tvDate1;
    @BindView(R.id.tvLeader6)
    TextView tvLeader6;
    @BindView(R.id.etLeader6)
    EditText etLeader6;
    @BindView(R.id.btnUp)
    Button btnUp;
    @BindView(R.id.btnT)
    FloatingActionButton btnT;
    @BindView(R.id.tvText)
    TextView tvText;
    @BindView(R.id.btnHistory)
    Button btnHistory;
    @BindView(R.id.recyclerView)
    RecyclerView recyclerView;
    @BindView(R.id.tvLeaderzjl)
    TextView tvLeaderzjl;
    @BindView(R.id.etLeaderzjl)
    EditText etLeaderzjl;
    private String name, taskId, res, bmfzryj, fgldyj, jbfgldyj, jbbmyj, zjlyj, bjap, bjr, bjpj, liushuihao;
    private String mainId, signaName, destName, destType, checkTask, qianzhiData = "";
    String leader = "";
    String leaderCode = "";
    String leaderName = "";
    boolean assigned;
    String tag = "noEnd";
    String comment = "";
    String bmreout, zjlreout, fgreout, jbfgreout, jbreout, bjapreout, bjrreout, bjpjreout, flowAssignld, serialNumber = "";

    String[] bigNametemp = null;
    String[] bigCodetemp = null;
    List<String> resultList = new ArrayList<>();
    List<String> bigResultList = new ArrayList<>();

    String role = "";
    String url;
    String userCode = "";
    String userName = "";
    String upData = "";
    String[] nametemp = null;
    String[] codetemp = null;
    List<String> namelist = new ArrayList<>();
    List<FlowInstallWillDetail.TransBean> beanList = new ArrayList<>();
    List<String> selectList = new ArrayList<>();
    private CustomDatePickerDay customDatePicker1;

    String xiangguanfujian = "";
    String btnTTag = "N";
    String flowMessage = "";
    String runID = "";
    FlowMessageAdapter adapter;
    List<FlowMessage1.DataBean> flowList = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ButterKnife.bind(this);
        LinearLayoutManager manager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(manager);
        initDatePicker();
        Intent intent = getIntent();
        name = intent.getStringExtra("activityName");
        taskId = intent.getStringExtra("taskId");
        getData(name, taskId);
    }

    @Override
    protected int provideContentViewId() {
        return R.layout.activity_install_data;
    }

    @Override
    protected boolean isHasHeader() {
        return true;
    }

    @Override
    protected void rightClient() {

    }

    /**
     * 选择时间
     */
    private void initDatePicker() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm", Locale.CHINA);
        String now = sdf.format(new Date());
        tvDate1.setText(now.split(" ")[0]);
        customDatePicker1 = new CustomDatePickerDay(this, new CustomDatePickerDay.ResultHandler() {
            @Override
            public void handle(String time) {
                // 回调接口，获得选中的时间
                tvDate1.setText(time.split(" ")[0]);
            }
            // 初始化日期格式请用：yyyy-MM-dd HH:mm，否则不能正常运行
        }, "2000-01-01 00:00", "2030-01-01 00:00");
        // 不显示时和分
        customDatePicker1.showSpecificTime(false);
        // 不允许循环滚动
        customDatePicker1.setIsLoop(false);
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
                String url = Constant.BASE_URL2 + Constant.DETAILWILL + Name + "&taskId=" + taskId;
                DBHandler dbA = new DBHandler();
                res = dbA.OAQingJiaWillDoDex(url);
                if (res.equals("获取数据失败") || res.equals("") || res.equals("false")) {
                    handler.sendEmptyMessage(TAG_TWO);
                } else {
                    handler.sendEmptyMessage(TAG_ONE);
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

    //
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
        resultList.clear();
        bigResultList.clear();
        if (codetemp != null) {
            for (String s : codetemp) {
                resultList.add(s);
            }
        }
        if (bigCodetemp != null) {
            for (String s : bigCodetemp) {
                bigResultList.add(s);
            }
        }
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
            if (bigNametemp.length == 6) {
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
            if (bigNametemp.length == 7) {
                cb1.setText(bigNametemp[0]);
                cb2.setText(bigNametemp[1]);
                cb3.setText(bigNametemp[2]);
                cb4.setText(bigNametemp[3]);
                cb5.setText(bigNametemp[4]);
                cb6.setText(bigNametemp[5]);
                cb7.setText(bigNametemp[6]);
                ll1.setVisibility(View.VISIBLE);
                ll2.setVisibility(View.VISIBLE);
                ll5.setVisibility(View.VISIBLE);
                cb1.setVisibility(View.VISIBLE);
                cb2.setVisibility(View.VISIBLE);
                cb3.setVisibility(View.VISIBLE);
                cb4.setVisibility(View.VISIBLE);
                cb5.setVisibility(View.VISIBLE);
                cb6.setVisibility(View.VISIBLE);
                cb7.setVisibility(View.VISIBLE);
            }
            if (bigNametemp.length == 8) {
                cb1.setText(bigNametemp[0]);
                cb2.setText(bigNametemp[1]);
                cb3.setText(bigNametemp[2]);
                cb4.setText(bigNametemp[3]);
                cb5.setText(bigNametemp[4]);
                cb6.setText(bigNametemp[5]);
                cb7.setText(bigNametemp[6]);
                cb8.setText(bigNametemp[7]);
                ll1.setVisibility(View.VISIBLE);
                ll2.setVisibility(View.VISIBLE);
                ll5.setVisibility(View.VISIBLE);
                cb1.setVisibility(View.VISIBLE);
                cb2.setVisibility(View.VISIBLE);
                cb3.setVisibility(View.VISIBLE);
                cb4.setVisibility(View.VISIBLE);
                cb5.setVisibility(View.VISIBLE);
                cb6.setVisibility(View.VISIBLE);
                cb7.setVisibility(View.VISIBLE);
                cb8.setVisibility(View.VISIBLE);
            }
            if (bigNametemp.length >= 9) {
                cb1.setText(bigNametemp[0]);
                cb2.setText(bigNametemp[1]);
                cb3.setText(bigNametemp[2]);
                cb4.setText(bigNametemp[3]);
                cb5.setText(bigNametemp[4]);
                cb6.setText(bigNametemp[5]);
                cb7.setText(bigNametemp[6]);
                cb8.setText(bigNametemp[7]);
                cb9.setText(bigNametemp[8]);
                ll1.setVisibility(View.VISIBLE);
                ll2.setVisibility(View.VISIBLE);
                ll5.setVisibility(View.VISIBLE);
                cb1.setVisibility(View.VISIBLE);
                cb2.setVisibility(View.VISIBLE);
                cb3.setVisibility(View.VISIBLE);
                cb4.setVisibility(View.VISIBLE);
                cb5.setVisibility(View.VISIBLE);
                cb6.setVisibility(View.VISIBLE);
                cb7.setVisibility(View.VISIBLE);
                cb8.setVisibility(View.VISIBLE);
                cb9.setVisibility(View.VISIBLE);
            }
        }
        getLastPerson();
    }

    @OnClick({R.id.btnUp, R.id.tvDate1, R.id.tvData, R.id.btnT, R.id.btnHistory})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.btnHistory:
                recyclerView.setVisibility(View.VISIBLE);
                ProgressDialogUtil.startLoad(FlowInstallWillDetailActivity.this, "获取数据中");
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
                        ProgressDialogUtil.startLoad(FlowInstallWillDetailActivity.this, "获取数据中");
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
                        MyAlertDialog.MyListAlertDialog(FlowInstallWillDetailActivity.this, namelist, new AlertDialogCallBackP() {
                            @Override
                            public void oneselect(final String data) {
                                ProgressDialogUtil.startLoad(FlowInstallWillDetailActivity.this, "获取数据中");
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
                    Toast.makeText(FlowInstallWillDetailActivity.this, "审批人为空", Toast.LENGTH_SHORT).show();
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
                                res = dbA.OAQingJiaMyDetail(url);
                                if (res.equals("获取数据失败") || res.equals("")) {
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
                                        res = dbA.OAQingJiaMyDetail(url);
                                        if (res.equals("获取数据失败") || res.equals("")) {
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
            case R.id.btnUp:
                Gson gson = new Gson();
                FlowInstallWillDetail bean = gson.fromJson(res, FlowInstallWillDetail.class);
                bmfzryj = bean.getMainform().get(0).getBmfzryj();
                fgldyj = bean.getMainform().get(0).getFgldyj();
                jbfgldyj = bean.getMainform().get(0).getJbfgldyj();
                jbbmyj = bean.getMainform().get(0).getJbbmyj();
                bjap = bean.getMainform().get(0).getBjap();
                bjr = bean.getMainform().get(0).getBanJieRen();
                bjpj = bean.getMainform().get(0).getBjpj();
                userName = new SharedPreferencesHelper(FlowInstallWillDetailActivity.this,
                        "login").getData(FlowInstallWillDetailActivity.this, "userStatus", "");
                userCode = new SharedPreferencesHelper(FlowInstallWillDetailActivity.this,
                        "login").getData(FlowInstallWillDetailActivity.this, "userCode", "");
                JSONArray jsonArray = new JSONArray();
                JSONObject jsonObject = new JSONObject();
                SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm");
                Date curDate = new Date(System.currentTimeMillis());
                String str = formatter.format(curDate);
                if (etLeader.getVisibility() == View.VISIBLE) {
                    comment = etLeader.getText().toString();
                    try {
                        jsonObject.put("ui", userCode);
                        jsonObject.put("un", userName);
                        jsonObject.put("c", str);
                        jsonObject.put("v", etLeader.getText().toString());
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                    jsonArray.put(jsonObject);
                    if (bmfzryj.equals("")) {
                        bmfzryj = jsonArray.toString();
                    } else {
                        bmfzryj = bmfzryj + "," + jsonArray.toString();
                        bmfzryj = bmfzryj.toString().replace("],[", ",");
                    }
                }
                if (etLeader1.getVisibility() == View.VISIBLE) {
                    comment = etLeader1.getText().toString();
                    try {
                        jsonObject.put("ui", userCode);
                        jsonObject.put("un", userName);
                        jsonObject.put("c", str);
                        jsonObject.put("v", etLeader1.getText().toString());
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                    jsonArray.put(jsonObject);
                    if (fgldyj.equals("")) {
                        fgldyj = jsonArray.toString();
                    } else {
                        fgldyj = fgldyj + "," + jsonArray.toString();
                        fgldyj = fgldyj.toString().replace("],[", ",");
                    }
                }

                if (etLeaderzjl.getVisibility() == View.VISIBLE) {
                    comment = etLeaderzjl.getText().toString();
                    try {
                        jsonObject.put("ui", userCode);
                        jsonObject.put("un", userName);
                        jsonObject.put("c", str);
                        jsonObject.put("v", etLeaderzjl.getText().toString());
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                    jsonArray.put(jsonObject);
                    if (zjlyj.equals("")) {
                        zjlyj = jsonArray.toString();
                    } else {
                        zjlyj = zjlyj + "," + jsonArray.toString();
                        zjlyj = zjlyj.toString().replace("],[", ",");
                    }
                }

                if (etLeader2.getVisibility() == View.VISIBLE) {
                    comment = etLeader2.getText().toString();
                    try {
                        jsonObject.put("ui", userCode);
                        jsonObject.put("un", userName);
                        jsonObject.put("c", str);
                        jsonObject.put("v", etLeader2.getText().toString());
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                    jsonArray.put(jsonObject);
                    if (jbfgldyj.equals("")) {
                        jbfgldyj = jsonArray.toString();
                    } else {
                        jbfgldyj = jbfgldyj + "," + jsonArray.toString();
                        jbfgldyj = jbfgldyj.toString().replace("],[", ",");
                    }
                }
                if (etLeader3.getVisibility() == View.VISIBLE) {
                    comment = etLeader3.getText().toString();
                    try {
                        jsonObject.put("ui", userCode);
                        jsonObject.put("un", userName);
                        jsonObject.put("c", str);
                        jsonObject.put("v", etLeader3.getText().toString());
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                    jsonArray.put(jsonObject);
                    if (jbbmyj.equals("")) {
                        jbbmyj = jsonArray.toString();
                    } else {
                        jbbmyj = jbbmyj + "," + jsonArray.toString();
                        jbbmyj = jbbmyj.toString().replace("],[", ",");
                    }
                }
                if (etLeader4.getVisibility() == View.VISIBLE) {
                    comment = etLeader4.getText().toString();
                    try {
                        jsonObject.put("ui", userCode);
                        jsonObject.put("un", userName);
                        jsonObject.put("c", str);
                        jsonObject.put("v", etLeader4.getText().toString());
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                    jsonArray.put(jsonObject);
                    if (bjap.equals("")) {
                        bjap = jsonArray.toString();
                    } else {
                        bjap = bjap + "," + jsonArray.toString();
                        bjap = bjap.toString().replace("],[", ",");
                    }
                }
                if (etLeader5.getVisibility() == View.VISIBLE) {
                    comment = etLeader5.getText().toString();
                    bjr = etLeader5.getText().toString();
                    tvDate1.setVisibility(View.VISIBLE);
                }
                if (etLeader6.getVisibility() == View.VISIBLE) {
                    comment = etLeader6.getText().toString();
                    try {
                        jsonObject.put("ui", userCode);
                        jsonObject.put("un", userName);
                        jsonObject.put("c", str);
                        jsonObject.put("v", etLeader6.getText().toString());
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                    jsonArray.put(jsonObject);
                    if (bjpj.equals("")) {
                        bjpj = jsonArray.toString();
                    } else {
                        bjpj = bjpj + "," + jsonArray.toString();
                        bjpj = bjpj.toString().replace("],[", ",");
                    }
                }
                if (comment.equals("")) {
                    if (!bmreout.equals("2") && !fgreout.equals("2") && !jbfgreout.equals("2") && !jbreout.equals("2")
                            && !bjapreout.equals("2") && !bjrreout.equals("2") && !bjpjreout.equals("2")) {
                        comment = "";
                        personSession();
                    } else if (!bjpj.equals("") && !bjr.equals("") && !bjap.equals("") && !jbbmyj.equals("")
                            && !jbfgldyj.equals("") && !fgldyj.equals("") && !bmfzryj.equals("")) {
                        comment = "";
                        personSession();
                    } else {
                        Toast.makeText(this, "请签字", Toast.LENGTH_SHORT).show();
                    }
                } else {
                    personSession();
                }
                break;
            case R.id.tvDate1:
                customDatePicker1.show(tvDate1.getText().toString());
                break;
        }
    }

    private void personSession() {
        if (bigResultList.size() != 0) {
            sendData();
        } else {
            if (btnTTag.equals("N")) {
                Gson gson = new Gson();
                FlowInstallWillDetail bean = gson.fromJson(res, FlowInstallWillDetail.class);
                bmfzryj = bean.getMainform().get(0).getBmfzryj();
                fgldyj = bean.getMainform().get(0).getFgldyj();
                jbfgldyj = bean.getMainform().get(0).getJbfgldyj();
                jbbmyj = bean.getMainform().get(0).getJbbmyj();
                bjap = bean.getMainform().get(0).getBjap();
                bjr = bean.getMainform().get(0).getBanJieRen();
                bjpj = bean.getMainform().get(0).getBjpj();
                Toast.makeText(this, "请点击加号选择路径", Toast.LENGTH_SHORT).show();
            } else {
                sendData();
            }
        }
    }


    private void sendData() {
        ProgressDialogUtil.startLoad(FlowInstallWillDetailActivity.this, "提交数据中");
        new Thread(new Runnable() {
            @Override
            public void run() {
                final String department = tvDepartment.getText().toString();
                final String date = tvDate.getText().toString();
                final String data = tvDataW.getText().toString();
                final String date1 = tvDate1.getText().toString();
                final String userCode = new SharedPreferencesHelper(FlowInstallWillDetailActivity.this,
                        "login").getData(FlowInstallWillDetailActivity.this, "userCode", "");
                if (!rb6.isChecked()) {
                    resultList.remove(5);
                }
                if (!rb5.isChecked()) {
                    resultList.remove(4);
                }
                if (!rb4.isChecked()) {
                    resultList.remove(3);
                }
                if (!rb3.isChecked()) {
                    resultList.remove(2);
                }
                if (!rb2.isChecked()) {
                    resultList.remove(1);
                }
                if (!rb1.isChecked()) {
                    resultList.remove(0);
                }

                if (!cb9.isChecked()) {
                    bigResultList.remove(8);
                }
                if (!cb8.isChecked()) {
                    bigResultList.remove(7);
                }
                if (!cb7.isChecked()) {
                    bigResultList.remove(6);
                }
                if (!cb6.isChecked()) {
                    bigResultList.remove(5);
                }
                if (!cb5.isChecked()) {
                    bigResultList.remove(4);
                }
                if (!cb4.isChecked()) {
                    bigResultList.remove(3);
                }
                if (!cb3.isChecked()) {
                    bigResultList.remove(2);
                }
                if (!cb2.isChecked()) {
                    bigResultList.remove(1);
                }
                if (!cb1.isChecked()) {
                    bigResultList.remove(0);
                }

                String userCodes = resultList.toString();
                userCodes = userCodes.toString().replace("[", "");
                userCodes = userCodes.toString().replace("]", "");

                String bigUserCodes = bigResultList.toString();
                bigUserCodes = bigUserCodes.toString().replace("[", "");
                bigUserCodes = bigUserCodes.toString().replace("]", "");

                if (!bigUserCodes.equals("") && !userCodes.equals("")) {
                    flowAssignld = leader + ":" + role + "|" + bigUserCodes + ":" + userCodes;
                    flowAssignld = flowAssignld.replace(" ", "");
                    flowAssignld = flowAssignld.replace(":|", "|");
                } else if (!bigUserCodes.equals("") && userCodes.equals("")) {
                    flowAssignld = leader + ":" + role + "|" + bigUserCodes;
                    flowAssignld = flowAssignld.replace(" ", "");
                    flowAssignld = flowAssignld.replace(":|", "|");
                } else {
                    flowAssignld = destName + "|" + userCodes;
                    flowAssignld = flowAssignld.replace(" ", "");
                    flowAssignld = flowAssignld.replace(":|", "|");
                    flowAssignld = flowAssignld.replace(":", "");
                }
                String url = Constant.BASE_URL2 + Constant.EXAMINEDATA;
                DBHandler dbA = new DBHandler();
                if (bjrreout.equals("2") && !date1.equals("")) {
                    upData = dbA.OAInstallder1(url, department, date, data, userCode, destName, taskId, flowAssignld, mainId,
                            bmfzryj, fgldyj, jbfgldyj, jbbmyj, bjap, bjr, bjpj, serialNumber, comment, date1, liushuihao,zjlyj);
                } else {
                    upData = dbA.OAInstallder(url, department, date, data, userCode, destName, taskId, flowAssignld, mainId,
                            bmfzryj, fgldyj, jbfgldyj, jbbmyj, bjap, bjr, bjpj, serialNumber, comment, liushuihao, signaName,zjlyj);
                }
                if (upData.equals("")) {
                    handler.sendEmptyMessage(TAG_THERE);
                } else {
                    handler.sendEmptyMessage(TAG_FOUR);
                }
            }
        }).start();
    }

    Handler handler = new Handler() {
        @Override
        public void handleMessage(Message msg) {
            super.handleMessage(msg);
            switch (msg.what) {
                case 111:
                    Gson gsonF = new Gson();
                    FlowMessage1 beanF = gsonF.fromJson(flowMessage, FlowMessage1.class);
                    for (int i = 0; i < beanF.getData().size(); i++) {
                        flowList.add(beanF.getData().get(i));
                    }
                    adapter = new FlowMessageAdapter(FlowInstallWillDetailActivity.this, flowList);
                    recyclerView.setAdapter(adapter);
                    ProgressDialogUtil.stopLoad();
                    break;
                case TAG_ONE:
                    Gson gson = new Gson();
                    FlowInstallWillDetail bean = gson.fromJson(res, FlowInstallWillDetail.class);
                    taskId = bean.getTaskId();
                    final String department = bean.getMainform().get(0).getShenBanBuMen();
                    final String date = bean.getMainform().get(0).getShenBanShiJian();
                    final String data = bean.getMainform().get(0).getShenBanShiXiang();
                    final String date1 = bean.getMainform().get(0).getBanJieShiJian();
                    liushuihao = bean.getMainform().get(0).getLiuShuiHao();
                    xiangguanfujian = bean.getMainform().get(0).getXiangguanfujian();
                    runID = bean.getMainform().get(0).getRunId();
                    tvData.setText(xiangguanfujian);

                    bmfzryj = bean.getMainform().get(0).getBmfzryj();
                    fgldyj = bean.getMainform().get(0).getFgldyj();
                    jbfgldyj = bean.getMainform().get(0).getJbfgldyj();
                    jbbmyj = bean.getMainform().get(0).getJbbmyj();
                    bjap = bean.getMainform().get(0).getBjap();
                    bjr = bean.getMainform().get(0).getBanJieRen();
                    bjpj = bean.getMainform().get(0).getBjpj();
                    zjlyj = bean.getMainform().get(0).getZjlyj();
                    tvDepartment.setText(department);
                    tvDate.setText(date);
                    tvDataW.setText(data);
                    if (!date1.equals("")) {
                        tvDate1.setVisibility(View.VISIBLE);
                        tvDate1.setText(date1);
                    }

                    mainId = String.valueOf(bean.getMainform().get(0).getMainId());
                    for (int i = 0; i < bean.getTrans().size(); i++) {
                        beanList.add(bean.getTrans().get(i));
                    }
                    ProgressDialogUtil.stopLoad();


                    String formRights = bean.getFormRights();
                    try {
                        JSONObject jsonObject = new JSONObject(formRights);
                        bmreout = jsonObject.getString("bmfzryj");
                        fgreout = jsonObject.getString("fgldyj");
                        jbfgreout = jsonObject.getString("jbfgldyj");
                        jbreout = jsonObject.getString("jbbmyj");
                        bjapreout = jsonObject.getString("bjap");
                        bjrreout = jsonObject.getString("BanJieRen");
                        bjpjreout = jsonObject.getString("bjpj");
                        zjlreout = jsonObject.getString("zjlyj");
                        if (bmreout.equals("2")) {
                            tvLeader.setVisibility(View.GONE);
                            etLeader.setVisibility(View.VISIBLE);
                        } else {
                            tvLeader.setVisibility(View.VISIBLE);
                            etLeader.setVisibility(View.GONE);
                        }
                        if (fgreout.equals("2")) {
                            tvLeader1.setVisibility(View.GONE);
                            etLeader1.setVisibility(View.VISIBLE);
                        } else {
                            tvLeader1.setVisibility(View.VISIBLE);
                            etLeader1.setVisibility(View.GONE);
                        }
                        if (zjlreout.equals("2")) {
                            tvLeaderzjl.setVisibility(View.GONE);
                            etLeaderzjl.setVisibility(View.VISIBLE);
                        } else {
                            tvLeaderzjl.setVisibility(View.VISIBLE);
                            etLeaderzjl.setVisibility(View.GONE);
                        }
                        if (jbfgreout.equals("2")) {
                            tvLeader2.setVisibility(View.GONE);
                            etLeader2.setVisibility(View.VISIBLE);
                        } else {
                            tvLeader2.setVisibility(View.VISIBLE);
                            etLeader2.setVisibility(View.GONE);
                        }
                        if (jbreout.equals("2")) {
                            tvLeader3.setVisibility(View.GONE);
                            etLeader3.setVisibility(View.VISIBLE);
                        } else {
                            tvLeader3.setVisibility(View.VISIBLE);
                            etLeader3.setVisibility(View.GONE);
                        }
                        if (bjapreout.equals("2")) {
                            tvLeader4.setVisibility(View.GONE);
                            etLeader4.setVisibility(View.VISIBLE);
                        } else {
                            tvLeader4.setVisibility(View.VISIBLE);
                            etLeader4.setVisibility(View.GONE);
                        }
                        if (bjrreout.equals("2")) {
                            tvLeader5.setVisibility(View.GONE);
                            etLeader5.setVisibility(View.VISIBLE);
                            tvDate1.setVisibility(View.VISIBLE);
                        } else {
                            tvLeader5.setVisibility(View.VISIBLE);
                            etLeader5.setVisibility(View.GONE);
                        }
                        if (bjpjreout.equals("2")) {
                            tvLeader6.setVisibility(View.GONE);
                            etLeader6.setVisibility(View.VISIBLE);
                        } else {
                            tvLeader6.setVisibility(View.VISIBLE);
                            etLeader6.setVisibility(View.GONE);
                        }
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                    if (bjpj != null && !bjpj.equals("")) {
                        if (tvLeader6.getVisibility() == View.VISIBLE) {
                            String word3 = "";
                            try {
                                JSONArray jsonArray = new JSONArray(bjpj);
                                JSONObject jsonObject = jsonArray.getJSONObject(jsonArray.length() - 1);
                                word3 = jsonObject.getString("v") + "\u3000" + jsonObject.getString("un") + ":" + jsonObject.getString("c");
                            } catch (JSONException e) {
                                e.printStackTrace();
                            }
                            tvLeader6.setText(word3);
                        }
                    }

                    if (zjlyj != null && !zjlyj.equals("")) {
                        if (tvLeaderzjl.getVisibility() == View.VISIBLE) {
                            String word3 = "";
                            try {
                                JSONArray jsonArray = new JSONArray(zjlyj);
                                JSONObject jsonObject = jsonArray.getJSONObject(jsonArray.length() - 1);
                                word3 = jsonObject.getString("v") + "\u3000" + jsonObject.getString("un") + ":" + jsonObject.getString("c");
                            } catch (JSONException e) {
                                e.printStackTrace();
                            }
                            tvLeader6.setText(word3);
                        }
                    }

                    if (bjr != null && !bjr.equals("")) {
                        if (tvLeader5.getVisibility() == View.VISIBLE) {
//                            String word2 = "";
//                            try {
//                                JSONArray jsonArray = new JSONArray(bjr);
//                                JSONObject jsonObject = jsonArray.getJSONObject(jsonArray.length() - 1);
//                                word2 = jsonObject.getString("v");
//                            } catch (JSONException e) {
//                                e.printStackTrace();
//                            }
                            tvLeader5.setText(bjr);
                        }
                    }

                    if (bjap != null && !bjap.equals("")) {
                        if (tvLeader4.getVisibility() == View.VISIBLE) {
                            String word1 = "";
                            try {
                                JSONArray jsonArray = new JSONArray(bjap);
                                JSONObject jsonObject = jsonArray.getJSONObject(jsonArray.length() - 1);
                                word1 = jsonObject.getString("v") + "\u3000" + jsonObject.getString("un") + ":" + jsonObject.getString("c");
                            } catch (JSONException e) {
                                e.printStackTrace();
                            }
                            tvLeader4.setText(word1);
                        }
                    }

                    if (jbbmyj != null && !jbbmyj.equals("")) {
                        if (tvLeader3.getVisibility() == View.VISIBLE) {
                            String word1 = "";
                            try {
                                JSONArray jsonArray = new JSONArray(jbbmyj);
                                JSONObject jsonObject = jsonArray.getJSONObject(jsonArray.length() - 1);
                                word1 = jsonObject.getString("v") + "\u3000" + jsonObject.getString("un") + ":" + jsonObject.getString("c");
                            } catch (JSONException e) {
                                e.printStackTrace();
                            }
                            tvLeader3.setText(word1);
                        }
                    }

                    if (jbfgldyj != null && !jbfgldyj.equals("")) {
                        if (tvLeader2.getVisibility() == View.VISIBLE) {
                            String word1 = "";
                            try {
                                JSONArray jsonArray = new JSONArray(jbfgldyj);
                                JSONObject jsonObject = jsonArray.getJSONObject(jsonArray.length() - 1);
                                word1 = jsonObject.getString("v") + "\u3000" + jsonObject.getString("un") + ":" + jsonObject.getString("c");
                            } catch (JSONException e) {
                                e.printStackTrace();
                            }
                            tvLeader2.setText(word1);
                        }
                    }

                    if (fgldyj != null && !fgldyj.equals("")) {
                        if (tvLeader1.getVisibility() == View.VISIBLE) {
                            String word1 = "";
                            try {
                                JSONArray jsonArray = new JSONArray(fgldyj);
                                JSONObject jsonObject = jsonArray.getJSONObject(jsonArray.length() - 1);
                                word1 = jsonObject.getString("v") + "\u3000" + jsonObject.getString("un") + ":" + jsonObject.getString("c");
                            } catch (JSONException e) {
                                e.printStackTrace();
                            }
                            tvLeader1.setText(word1);
                        }
                    }

                    if (bmfzryj != null && !bmfzryj.equals("")) {
                        if (tvLeader.getVisibility() == View.VISIBLE) {
                            String word1 = "";
                            try {
                                JSONArray jsonArray = new JSONArray(bmfzryj);
                                JSONObject jsonObject = jsonArray.getJSONObject(jsonArray.length() - 1);
                                word1 = jsonObject.getString("v") + "\u3000" + jsonObject.getString("un") + ":" + jsonObject.getString("c");
                            } catch (JSONException e) {
                                e.printStackTrace();
                            }
                            tvLeader.setText(word1);
                        }
                    }

                    if (zjlyj != null && !zjlyj.equals("")) {
                        if (tvLeaderzjl.getVisibility() == View.VISIBLE) {
                            String word1 = "";
                            try {
                                JSONArray jsonArray = new JSONArray(zjlyj);
                                JSONObject jsonObject = jsonArray.getJSONObject(jsonArray.length() - 1);
                                word1 = jsonObject.getString("v") + "\u3000" + jsonObject.getString("un") + ":" + jsonObject.getString("c");
                            } catch (JSONException e) {
                                e.printStackTrace();
                            }
                            tvLeaderzjl.setText(word1);
                        }
                    }
                    break;
                case TAG_TWO:
                    Toast.makeText(FlowInstallWillDetailActivity.this, "操作数据失败", Toast.LENGTH_SHORT).show();
                    ProgressDialogUtil.stopLoad();
                    break;
                case TAG_THERE:
                    Toast.makeText(FlowInstallWillDetailActivity.this, "提交数据成功", Toast.LENGTH_SHORT).show();
                    ProgressDialogUtil.stopLoad();
                    finish();
                    break;
                case TAG_FOUR:
                    Toast.makeText(FlowInstallWillDetailActivity.this, upData, Toast.LENGTH_SHORT).show();
                    ProgressDialogUtil.stopLoad();
                    break;
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
                    Log.e("XXXXH", res);
                    FlowContractPerson bean1 = gson1.fromJson(qianzhiData, FlowContractPerson.class);
                    if (bean1.getData() != null) {
                        if (bean1.getData().size() > 1) {
                            role = bean1.getData().get(1).getRole();
                            userCode = bean1.getData().get(1).getUserNames();
                            userName = bean1.getData().get(1).getUserCodes();
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
                    try {
                        JSONObject jsonObject = new JSONObject(checkTask);
                        if (!jsonObject.isNull("assigned")) {
                            assigned = true;
                        } else {
                            assigned = jsonObject.getBoolean("assigned");
                        }
                        tag = "end";
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                    ProgressDialogUtil.stopLoad();
                    break;
                case TAG_NINE:
                    Gson gson2 = new Gson();
                    File file = gson2.fromJson(res, File.class);
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
