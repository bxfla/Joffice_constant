package com.hy.powerplatform.oa_flow.activity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.Editable;
import android.text.TextWatcher;
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
import com.hy.powerplatform.oa_flow.bean.FlowContractPerson;
import com.hy.powerplatform.oa_flow.bean.FlowGoodsPuechase;
import com.hy.powerplatform.oa_flow.bean.FlowMessage1;
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

public class FlowGoodsPuechaseWillDetailActivity extends BaseActivity {
    @BindView(R.id.header)
    Header header;
    @BindView(R.id.tvDepartment)
    TextView tvDepartment;
    @BindView(R.id.tvPerson)
    TextView tvPerson;
    @BindView(R.id.tvTime)
    TextView tvTime;
    @BindView(R.id.tvData)
    TextView tvData;
    @BindView(R.id.tvName1)
    TextView tvName1;
    @BindView(R.id.tvName2)
    TextView tvName2;
    @BindView(R.id.tvName3)
    TextView tvName3;
    @BindView(R.id.tvName4)
    TextView tvName4;
    @BindView(R.id.tvNum1)
    TextView tvNum1;
    @BindView(R.id.tvNum2)
    TextView tvNum2;
    @BindView(R.id.tvNum3)
    TextView tvNum3;
    @BindView(R.id.tvNum4)
    TextView tvNum4;
    @BindView(R.id.tvMoney1)
    TextView tvMoney1;
    @BindView(R.id.tvMoney2)
    TextView tvMoney2;
    @BindView(R.id.tvMoney3)
    TextView tvMoney3;
    @BindView(R.id.tvMoney4)
    TextView tvMoney4;
    @BindView(R.id.tvAllMoney1)
    TextView tvAllMoney1;
    @BindView(R.id.tvAllMoney2)
    TextView tvAllMoney2;
    @BindView(R.id.tvAllMoney3)
    TextView tvAllMoney3;
    @BindView(R.id.tvAllMoney4)
    TextView tvAllMoney4;
    @BindView(R.id.tvApplication)
    TextView tvApplication;
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
    @BindView(R.id.etLeader)
    EditText etLeader;
    @BindView(R.id.tvLeader)
    TextView tvLeader;
    @BindView(R.id.etLeader1)
    EditText etLeader1;
    @BindView(R.id.tvLeader1)
    TextView tvLeader1;
    @BindView(R.id.etLeader2)
    EditText etLeader2;
    @BindView(R.id.tvLeader2)
    TextView tvLeader2;
    @BindView(R.id.etLeader3)
    EditText etLeader3;
    @BindView(R.id.tvLeader3)
    TextView tvLeader3;
    @BindView(R.id.etLeader4)
    EditText etLeader4;
    @BindView(R.id.tvLeader4)
    TextView tvLeader4;
    @BindView(R.id.btnUp)
    Button btnUp;
    @BindView(R.id.tvName5)
    TextView tvName5;
    @BindView(R.id.tvNum5)
    TextView tvNum5;
    @BindView(R.id.tvMoney5)
    TextView tvMoney5;
    @BindView(R.id.tvAllMoney5)
    TextView tvAllMoney5;
    @BindView(R.id.ll5)
    LinearLayout ll5;
    @BindView(R.id.cb7)
    CheckBox cb7;
    @BindView(R.id.cb8)
    CheckBox cb8;
    @BindView(R.id.cb9)
    CheckBox cb9;
    @BindView(R.id.tvOther)
    TextView tvOther;
    @BindView(R.id.tvAllNum)
    TextView tvAllNum;
    @BindView(R.id.tvAllMoney)
    TextView tvAllMoney;
    @BindView(R.id.btnT)
    FloatingActionButton btnT;
    @BindView(R.id.tvText)
    TextView tvText;
    @BindView(R.id.btnHistory)
    Button btnHistory;
    @BindView(R.id.recyclerView)
    RecyclerView recyclerView;
    @BindView(R.id.etNum1)
    EditText etNum1;
    @BindView(R.id.etNum2)
    EditText etNum2;
    @BindView(R.id.etNum3)
    EditText etNum3;
    @BindView(R.id.etNum4)
    EditText etNum4;
    @BindView(R.id.etNum5)
    EditText etNum5;
    @BindView(R.id.etMoney1)
    EditText etMoney1;
    @BindView(R.id.etMoney2)
    EditText etMoney2;
    @BindView(R.id.etMoney3)
    EditText etMoney3;
    @BindView(R.id.etMoney4)
    EditText etMoney4;
    @BindView(R.id.etMoney5)
    EditText etMoney5;
    @BindView(R.id.tvzc)
    TextView tvzc;
    @BindView(R.id.tvtype)
    TextView tvtype;
    @BindView(R.id.etLeaderJG)
    EditText etLeaderJG;
    @BindView(R.id.tvLeaderJG)
    TextView tvLeaderJG;
    @BindView(R.id.etDepartment1)
    TextView etDepartment1;
    @BindView(R.id.etDepartment2)
    TextView etDepartment2;
    @BindView(R.id.etDepartment3)
    TextView etDepartment3;
    @BindView(R.id.etDepartment4)
    TextView etDepartment4;
    @BindView(R.id.etDepartment5)
    TextView etDepartment5;
    @BindView(R.id.tvDepartment5)
    TextView tvDepartment5;
    @BindView(R.id.llData)
    LinearLayout llData;
    @BindView(R.id.tvLeaderW)
    TextView tvLeaderW;
    @BindView(R.id.tvLeader1W)
    TextView tvLeader1W;
    @BindView(R.id.tvLeader2W)
    TextView tvLeader2W;
    @BindView(R.id.tvLeader3W)
    TextView tvLeader3W;
    @BindView(R.id.tvLeader4W)
    TextView tvLeader4W;
    @BindView(R.id.ll)
    LinearLayout ll;
    private String name, taskId, res, bmfzryj, jcbmyj, zcgkbmyj, fgldyj, cwzjyj, zjl = "";
    private String mainId, signaName, destName, destType, checkTask, qianzhiData = "";
    String leader = "";
    String leaderCode = "";
    String leaderName = "";
    boolean assigned;
    String tag = "noEnd";
    String comment = "";
    String aboutDep = "";
    String bmreout, jcbmreout, zcreout, fgreout, cwreout, zjlreout, flowAssignld, serialNumber = "";
    String hejidj, hejije, hejisl = "";
    String[] bigNametemp = null;
    String[] bigCodetemp = null;
    String name1, name2, name3, name4, name5 = "";
    String num1, num2, num3, num4, num5 = "";
    String money1, money2, money3, money4, money5 = "";
    String allMoney1, allMoney2, allMoney3, allMoney4, allMoney5 = "";
    String danwei1, danwei2, danwei3, danwei4, danwei5 = "";
    List<String> resultList = new ArrayList<>();
    List<String> resultList1 = new ArrayList<>();
    List<String> bigResultList = new ArrayList<>();
    List<String> bigResultList1 = new ArrayList<>();

    String role = "";
    String url;
    String uId = "";
    String userCode = "";
    String userName = "";
    String upData = "";
    String[] nametemp = null;
    String[] codetemp = null;
    List<String> namelist = new ArrayList<>();
    List<FlowGoodsPuechase.TransBean> beanList = new ArrayList<>();
    List<String> selectList = new ArrayList<>();
    String xiangguanfujian = "";
    String btnTTag = "N";
    String flowMessage = "";
    String runID = "";
    String piId = "";
    String downloadData = "";
    FlowMessageAdapter adapter;
    double AllMoney1 = 0.0, AllMoney2 = 0.0, AllMoney3 = 0.0, AllMoney4 = 0.0, AllMoney5 = 0.0;
    int numS1 = 0, numS2 = 0, numS3 = 0, numS4 = 0, numS5 = 0;
    double moneyS1 = 0.0, moneyS2 = 0.0, moneyS3 = 0.0, moneyS4 = 0.0, moneyS5 = 0.0;
    List<FlowMessage1.DataBean> flowList = new ArrayList<>();

    private String executionId;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ButterKnife.bind(this);
        LinearLayoutManager manager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(manager);
        Intent intent = getIntent();
        name = intent.getStringExtra("activityName");
        taskId = intent.getStringExtra("taskId");
        String taskName = intent.getStringExtra("taskName");
        piId = intent.getStringExtra("piId");
        executionId = intent.getStringExtra("executionId");
        header.setTvTitle(taskName);
        tvAllMoney1.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                if (!s.toString().equals("")) {
                    AllMoney1 = (Double.valueOf(s.toString()));
//                    tvAllMoney.setText(String.valueOf(AllMoney1 + AllMoney2 + AllMoney3 + AllMoney4 + AllMoney5));
                } else {
                    AllMoney1 = 0.0;
//                    tvAllMoney.setText(String.valueOf(AllMoney1 + AllMoney2 + AllMoney3 + AllMoney4 + AllMoney5));
                }
            }
        });
        tvAllMoney2.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                if (!s.toString().equals("")) {
                    AllMoney2 = (Double.valueOf(s.toString()));
//                    tvAllMoney.setText(String.valueOf(AllMoney1 + AllMoney2 + AllMoney3 + AllMoney4 + AllMoney5));
                } else {
                    AllMoney2 = 0.0;
//                    tvAllMoney.setText(String.valueOf(AllMoney1 + AllMoney2 + AllMoney3 + AllMoney4 + AllMoney5));
                }
            }
        });
        tvAllMoney3.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                if (!s.toString().equals("")) {
                    AllMoney3 = (Double.valueOf(s.toString()));
//                    tvAllMoney.setText(String.valueOf(AllMoney1 + AllMoney2 + AllMoney3 + AllMoney4 + AllMoney5));
                } else {
                    AllMoney3 = 0.0;
//                    tvAllMoney.setText(String.valueOf(AllMoney1 + AllMoney2 + AllMoney3 + AllMoney4 + AllMoney5));
                }
            }
        });
        tvAllMoney4.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                if (!s.toString().equals("")) {
                    AllMoney4 = (Double.valueOf(s.toString()));
//                    tvAllMoney.setText(String.valueOf(AllMoney1 + AllMoney2 + AllMoney3 + AllMoney4 + AllMoney5));
                } else {
                    AllMoney4 = 0.0;
//                    tvAllMoney.setText(String.valueOf(AllMoney1 + AllMoney2 + AllMoney3 + AllMoney4 + AllMoney5));
                }
            }
        });
        tvAllMoney5.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                if (!s.toString().equals("")) {
                    AllMoney5 = (Double.valueOf(s.toString()));
//                    tvAllMoney.setText(String.valueOf(AllMoney1 + AllMoney2 + AllMoney3 + AllMoney4 + AllMoney5));
                } else {
                    AllMoney5 = 0.0;
//                    tvAllMoney.setText(String.valueOf(AllMoney1 + AllMoney2 + AllMoney3 + AllMoney4 + AllMoney5));
                }
            }
        });

        etNum1.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                if (!s.toString().equals("")) {
                    numS1 = (Integer.valueOf(s.toString()));
                    tvAllNum.setText(String.valueOf(numS1 + numS2 + numS3 + numS4 + numS5));
                    if (!etMoney1.getText().toString().equals("")) {
                        tvAllMoney1.setText(String.valueOf(Double.valueOf(etMoney1.getText().toString()) * numS1));
                    } else {
                        tvAllMoney1.setText(String.valueOf(0 * numS1));
                    }
                } else {
                    numS1 = 0;
                    tvAllNum.setText(String.valueOf(numS1 + numS2 + numS3 + numS4 + numS5));
                    tvAllMoney1.setText(String.valueOf(0 * moneyS1));
                }
            }
        });
        etNum2.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                if (!s.toString().equals("")) {
                    numS2 = (Integer.valueOf(s.toString()));
                    tvAllNum.setText(String.valueOf(numS1 + numS2 + numS3 + numS4 + numS5));
                    if (!etMoney2.getText().toString().equals("")) {
                        tvAllMoney2.setText(String.valueOf(Double.valueOf(etMoney2.getText().toString()) * numS2));
                    } else {
                        tvAllMoney2.setText(String.valueOf(0 * numS2));
                    }
                } else {
                    numS2 = 0;
                    tvAllNum.setText(String.valueOf(numS1 + numS2 + numS3 + numS4 + numS5));
                    tvAllMoney2.setText(String.valueOf(0 * moneyS2));
                }
            }
        });
        etNum3.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                if (!s.toString().equals("")) {
                    numS3 = (Integer.valueOf(s.toString()));
                    tvAllNum.setText(String.valueOf(numS1 + numS2 + numS3 + numS4 + numS5));
                    if (!etMoney3.getText().toString().equals("")) {
                        tvAllMoney3.setText(String.valueOf(Double.valueOf(etMoney3.getText().toString()) * numS3));
                    } else {
                        tvAllMoney3.setText(String.valueOf(0 * numS3));
                    }
                } else {
                    numS3 = 0;
                    tvAllNum.setText(String.valueOf(numS1 + numS2 + numS3 + numS4 + numS5));
                    tvAllMoney3.setText(String.valueOf(0 * moneyS3));
                }
            }
        });
        etNum4.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                if (!s.toString().equals("")) {
                    numS4 = (Integer.valueOf(s.toString()));
                    tvAllNum.setText(String.valueOf(numS1 + numS2 + numS3 + numS4 + numS5));
                    if (!etMoney4.getText().toString().equals("")) {
                        tvAllMoney4.setText(String.valueOf(Double.valueOf(etMoney4.getText().toString()) * numS4));
                    } else {
                        tvAllMoney4.setText(String.valueOf(0 * numS4));
                    }
                } else {
                    numS4 = 0;
                    tvAllNum.setText(String.valueOf(numS1 + numS2 + numS3 + numS4 + numS5));
                    tvAllMoney4.setText(String.valueOf(0 * moneyS4));
                }
            }
        });
        etNum5.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                if (!s.toString().equals("")) {
                    numS5 = (Integer.valueOf(s.toString()));
                    tvAllNum.setText(String.valueOf(numS1 + numS2 + numS3 + numS4 + numS5));
                    if (!etMoney5.getText().toString().equals("")) {
                        tvAllMoney5.setText(String.valueOf(Double.valueOf(etMoney5.getText().toString()) * numS5));
                    } else {
                        tvAllMoney5.setText(String.valueOf(0 * numS5));
                    }
                } else {
                    numS5 = 0;
                    tvAllNum.setText(String.valueOf(numS1 + numS2 + numS3 + numS4 + numS5));
                    tvAllMoney5.setText(String.valueOf(0 * moneyS5));
                }
            }
        });

        etMoney1.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                if (!s.toString().equals("")) {
                    moneyS1 = (Double.valueOf(s.toString()));
                    if (!etNum1.getText().toString().equals("")) {
                        tvAllMoney1.setText(String.valueOf(Double.valueOf(etNum1.getText().toString()) * moneyS1));
                    } else {
                        tvAllMoney1.setText(String.valueOf(0 * moneyS1));
                    }
                } else {
                    tvAllMoney1.setText(String.valueOf(0 * moneyS1));
                }
            }
        });
        etMoney2.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                if (!s.toString().equals("")) {
                    moneyS2 = (Double.valueOf(s.toString()));
                    if (!etNum2.getText().toString().equals("")) {
                        tvAllMoney2.setText(String.valueOf(Double.valueOf(etNum2.getText().toString()) * moneyS2));
                    } else {
                        tvAllMoney2.setText(String.valueOf(0 * moneyS2));
                    }
                } else {
                    tvAllMoney2.setText(String.valueOf(0 * moneyS2));
                }
            }
        });
        etMoney3.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                if (!s.toString().equals("")) {
                    moneyS3 = (Double.valueOf(s.toString()));
                    if (!etNum3.getText().toString().equals("")) {
                        tvAllMoney3.setText(String.valueOf(Double.valueOf(etNum3.getText().toString()) * moneyS3));
                    } else {
                        tvAllMoney3.setText(String.valueOf(0 * moneyS3));
                    }
                } else {
                    tvAllMoney3.setText(String.valueOf(0 * moneyS3));
                }
            }
        });
        etMoney4.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                if (!s.toString().equals("")) {
                    moneyS4 = (Double.valueOf(s.toString()));
                    if (!etNum4.getText().toString().equals("")) {
                        tvAllMoney4.setText(String.valueOf(Double.valueOf(etNum4.getText().toString()) * moneyS4));
                    } else {
                        tvAllMoney4.setText(String.valueOf(0 * moneyS4));
                    }
                } else {
                    tvAllMoney4.setText(String.valueOf(0 * moneyS4));
                }
            }
        });
        etMoney5.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                if (!s.toString().equals("")) {
                    moneyS5 = (Double.valueOf(s.toString()));
                    if (!etNum5.getText().toString().equals("")) {
                        tvAllMoney5.setText(String.valueOf(Double.valueOf(etNum5.getText().toString()) * moneyS5));
                    } else {
                        tvAllMoney5.setText(String.valueOf(0 * moneyS5));
                    }
                } else {
                    tvAllMoney5.setText(String.valueOf(0 * moneyS5));
                }
            }
        });
        getData(name, taskId);
    }

    @Override
    protected int provideContentViewId() {
        return R.layout.activity_goodspurchase;
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
                    Toast.makeText(FlowGoodsPuechaseWillDetailActivity.this, getResources().getString(R.string.nullify_reason), Toast.LENGTH_SHORT).show();
                } else {
                    dialog.dismiss();
                    ProgressDialogUtil.startLoad(FlowGoodsPuechaseWillDetailActivity.this, getResources().getString(R.string.get_data));
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
                        .addHeader("Cookie",Session)
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
        ProgressDialogUtil.stopLoad();
//        getLastPerson();
    }

    @OnClick({R.id.btnUp, R.id.tvData, R.id.btnT, R.id.btnHistory})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.btnHistory:
                recyclerView.setVisibility(View.VISIBLE);
                ProgressDialogUtil.startLoad(FlowGoodsPuechaseWillDetailActivity.this, "获取数据中");
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
                        ProgressDialogUtil.startLoad(FlowGoodsPuechaseWillDetailActivity.this, "获取数据中");
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
                        MyAlertDialog.MyListAlertDialog(FlowGoodsPuechaseWillDetailActivity.this, namelist, new AlertDialogCallBackP() {
                            @Override
                            public void oneselect(final String data) {
                                ProgressDialogUtil.startLoad(FlowGoodsPuechaseWillDetailActivity.this, "获取数据中");
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
                    Toast.makeText(FlowGoodsPuechaseWillDetailActivity.this, "审批人为空", Toast.LENGTH_SHORT).show();
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
            case R.id.btnUp:
                Gson gson = new Gson();
                FlowGoodsPuechase bean = gson.fromJson(res, FlowGoodsPuechase.class);
                bmfzryj = bean.getMainform().get(0).getBmfzryj();
                zcgkbmyj = bean.getMainform().get(0).getZcgkbmyj();
                fgldyj = bean.getMainform().get(0).getFgldyj();
                cwzjyj = bean.getMainform().get(0).getCwzjyj();
                zjl = bean.getMainform().get(0).getZjlyj();
                userName = new SharedPreferencesHelper(FlowGoodsPuechaseWillDetailActivity.this,
                        "login").getData(FlowGoodsPuechaseWillDetailActivity.this, "userStatus", "");
                userCode = new SharedPreferencesHelper(FlowGoodsPuechaseWillDetailActivity.this,
                        "login").getData(FlowGoodsPuechaseWillDetailActivity.this, "userId", "");
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

                if (etLeaderJG.getVisibility() == View.VISIBLE) {
                    comment = etLeaderJG.getText().toString();
                    try {
                        jsonObject.put("ui", userCode);
                        jsonObject.put("un", userName);
                        jsonObject.put("c", str);
                        jsonObject.put("v", etLeaderJG.getText().toString());
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                    jsonArray.put(jsonObject);
                    if (jcbmyj.equals("")) {
                        jcbmyj = jsonArray.toString();
                    } else {
                        jcbmyj = jcbmyj + "," + jsonArray.toString();
                        jcbmyj = jcbmyj.toString().replace("],[", ",");
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
                    if (zcgkbmyj.equals("")) {
                        zcgkbmyj = jsonArray.toString();
                    } else {
                        zcgkbmyj = zcgkbmyj + "," + jsonArray.toString();
                        zcgkbmyj = zcgkbmyj.toString().replace("],[", ",");
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
                    if (fgldyj.equals("")) {
                        fgldyj = jsonArray.toString();
                    } else {
                        fgldyj = fgldyj + "," + jsonArray.toString();
                        fgldyj = fgldyj.toString().replace("],[", ",");
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
                    if (cwzjyj.equals("")) {
                        cwzjyj = jsonArray.toString();
                    } else {
                        cwzjyj = cwzjyj + "," + jsonArray.toString();
                        cwzjyj = cwzjyj.toString().replace("],[", ",");
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
                    if (zjl.equals("")) {
                        zjl = jsonArray.toString();
                    } else {
                        zjl = zjl + "," + jsonArray.toString();
                        zjl = zjl.toString().replace("],[", ",");
                    }
                }
                if (comment.equals("")) {
                    if (!bmreout.equals("2") && !jcbmreout.equals("2") && !zcreout.equals("2") && !fgreout.equals("2")
                            && !cwreout.equals("2") && !zjlreout.equals("2")) {
                        comment = "";
                        personSession();
                    } else if (!zjl.equals("") && !cwzjyj.equals("") && !fgldyj.equals("") && !zcgkbmyj.equals("")
                            && !jcbmyj.equals("") && !bmfzryj.equals("")) {
                        comment = "";
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
            if (btnTTag.equals("N")) {
                Gson gson = new Gson();
                FlowGoodsPuechase bean = gson.fromJson(res, FlowGoodsPuechase.class);
                bmfzryj = bean.getMainform().get(0).getBmfzryj();
                jcbmyj = bean.getMainform().get(0).getJcbmyj();
                zcgkbmyj = bean.getMainform().get(0).getZcgkbmyj();
                fgldyj = bean.getMainform().get(0).getFgldyj();
                cwzjyj = bean.getMainform().get(0).getCwzjyj();
                zjl = bean.getMainform().get(0).getZjlyj();
                Toast.makeText(this, "请点击加号选择路径", Toast.LENGTH_SHORT).show();
            } else {
                sendData();
            }
        }
    }

    private void sendData() {
        ProgressDialogUtil.startLoad(FlowGoodsPuechaseWillDetailActivity.this, "提交数据中");
        new Thread(new Runnable() {
            @Override
            public void run() {
                String department = tvDepartment.getText().toString();
                String person = tvPerson.getText().toString();
                String time = tvTime.getText().toString();
                String use = tvApplication.getText().toString();
                String other = tvOther.getText().toString();
                String allMonet = tvAllMoney.getText().toString();
                String allNum = tvAllNum.getText().toString();
                final String userCode = new SharedPreferencesHelper(FlowGoodsPuechaseWillDetailActivity.this,
                        "login").getData(FlowGoodsPuechaseWillDetailActivity.this, "userCode", "");

                if (codetemp != null) {
                    for (String s : codetemp) {
                        resultList.add(s);
                        resultList1.add(s);
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

                if (!cb9.isChecked()) {
                    if (bigResultList.size() >= 9) {
                        bigResultList.remove(8);
                    }
                }
                if (!cb8.isChecked()) {
                    if (bigResultList.size() >= 8) {
                        bigResultList.remove(7);
                    }
                }
                if (!cb7.isChecked()) {
                    if (bigResultList.size() >= 7) {
                        bigResultList.remove(6);
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


                if (bigResultList.size() == 0 && bigResultList1.size() != 0) {
                    String bigUserCodes = bigResultList1.toString();
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
                } else {
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
                }

                String url = Constant.BASE_URL2 + Constant.EXAMINEDATA;
                DBHandler dbA = new DBHandler();
                if (zcreout.equals("2")) {
                    upData = dbA.OAGoodsPurchaseLeader(url, department, person, name, time, name1, name2, name3, name4, name5
                            , etNum1.getText().toString(), etNum2.getText().toString(), etNum3.getText().toString()
                            , etNum4.getText().toString(), etNum5.getText().toString(), etMoney1.getText().toString()
                            , etMoney2.getText().toString(), etMoney3.getText().toString(), etMoney4.getText().toString()
                            , etMoney5.getText().toString(), tvAllMoney1.getText().toString(), tvAllMoney2.getText().toString()
                            , tvAllMoney3.getText().toString(), tvAllMoney4.getText().toString(), tvAllMoney5.getText().toString()
                            , userCode, destName, taskId, flowAssignld, mainId, bmfzryj, zcgkbmyj, fgldyj, cwzjyj, zjl
                            , serialNumber, comment, signaName, hejisl, hejidj, hejije, use, other, jcbmyj
                            , danwei1, danwei2, danwei3, danwei4, danwei5, tvzc.getText().toString(), tvtype.getText().toString());
                } else {
                    upData = dbA.OAGoodsPurchaseLeader(url, department, person, name, time, name1, name2, name3, name4, name5
                            , num1, num2, num3, num4, num5, money1, money2, money3, money4, money5, allMoney1, allMoney2, allMoney3
                            , allMoney4, allMoney5, userCode, destName, taskId, flowAssignld, mainId,
                            bmfzryj, zcgkbmyj, fgldyj, cwzjyj, zjl, serialNumber, comment, signaName, hejisl,
                            hejidj, hejije, use, other, jcbmyj, danwei1, danwei2, danwei3, danwei4, danwei5, tvzc.getText().toString(), tvtype.getText().toString());
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
                case 333:
                    ProgressDialogUtil.stopLoad();
                    Toast.makeText(FlowGoodsPuechaseWillDetailActivity.this,getResources().getString(R.string.c_success), Toast.LENGTH_SHORT).show();
                    finish();
                    break;
                case 444:
                    ProgressDialogUtil.stopLoad();
                    Toast.makeText(FlowGoodsPuechaseWillDetailActivity.this,getResources().getString(R.string.c_false), Toast.LENGTH_SHORT).show();
                    break;
                case 111:
                    Gson gsonF = new Gson();
                    FlowMessage1 beanF = gsonF.fromJson(flowMessage, FlowMessage1.class);
                    for (int i = 0; i < beanF.getData().size(); i++) {
                        flowList.add(beanF.getData().get(i));
                    }
                    adapter = new FlowMessageAdapter(FlowGoodsPuechaseWillDetailActivity.this, flowList);
                    recyclerView.setAdapter(adapter);
                    ProgressDialogUtil.stopLoad();
                    break;
                case TAG_ONE:
                    Gson gson = new Gson();
                    if (res.equals("false")) {
                        Toast.makeText(FlowGoodsPuechaseWillDetailActivity.this, "获取数据失败", Toast.LENGTH_SHORT).show();
                    } else {
                        FlowGoodsPuechase bean = gson.fromJson(res, FlowGoodsPuechase.class);
                        taskId = bean.getTaskId();
                        String department = bean.getMainform().get(0).getBm();
                        String person = bean.getMainform().get(0).getSqr();
                        String time = bean.getMainform().get(0).getSqrq();
                        String use = bean.getMainform().get(0).getYt();
                        String other = bean.getMainform().get(0).getQiTa();
                        String allMoney = bean.getMainform().get(0).getHejije();
                        String allNum = bean.getMainform().get(0).getHejisl();
                        String iszc = bean.getMainform().get(0).getIszc();
                        String goodsType = bean.getMainform().get(0).getGoodsType();
                        aboutDep = bean.getMainform().get(0).getZcDepName();
                        xiangguanfujian = bean.getMainform().get(0).getXgfj();
                        if (xiangguanfujian.equals("")) {
                            llData.setVisibility(View.GONE);
                        } else {
                            tvData.setText(xiangguanfujian);
                        }
                        runID = bean.getMainform().get(0).getRunId();
                        tvData.setText(xiangguanfujian);
                        if (iszc.equals("非资产类")) {
                            ll.setVisibility(View.GONE);
                        }
                        tvzc.setText(iszc);
                        tvtype.setText(goodsType);
                        name1 = bean.getMainform().get(0).getMingcheng1();
                        name2 = bean.getMainform().get(0).getMingcheng2();
                        name3 = bean.getMainform().get(0).getMingcheng3();
                        name4 = bean.getMainform().get(0).getMingcheng4();
                        name5 = bean.getMainform().get(0).getMingcheng5();

                        num1 = bean.getMainform().get(0).getShuliang1();
                        num2 = bean.getMainform().get(0).getShuliang2();
                        num3 = bean.getMainform().get(0).getShuliang3();
                        num4 = bean.getMainform().get(0).getShuliang4();
                        num5 = bean.getMainform().get(0).getShuliang5();

                        danwei1 = bean.getMainform().get(0).getDanwei1();
                        danwei2 = bean.getMainform().get(0).getDanwei2();
                        danwei3 = bean.getMainform().get(0).getDanwei3();
                        danwei4 = bean.getMainform().get(0).getDanwei4();
                        danwei5 = bean.getMainform().get(0).getDanwei5();

                        money1 = bean.getMainform().get(0).getDanjia1();
                        money2 = bean.getMainform().get(0).getDanjia2();
                        money3 = bean.getMainform().get(0).getDanjia3();
                        money4 = bean.getMainform().get(0).getDanjia4();
                        money5 = bean.getMainform().get(0).getDanjia5();

                        allMoney1 = bean.getMainform().get(0).getJine1();
                        allMoney2 = bean.getMainform().get(0).getJine2();
                        allMoney3 = bean.getMainform().get(0).getJine3();
                        allMoney4 = bean.getMainform().get(0).getJine4();
                        allMoney5 = bean.getMainform().get(0).getJine5();

                        etDepartment1.setText(bean.getMainform().get(0).getDanwei1());
                        etDepartment2.setText(bean.getMainform().get(0).getDanwei2());
                        etDepartment3.setText(bean.getMainform().get(0).getDanwei3());
                        etDepartment4.setText(bean.getMainform().get(0).getDanwei4());
                        etDepartment5.setText(bean.getMainform().get(0).getDanwei5());

                        hejisl = bean.getMainform().get(0).getHejisl();
                        hejidj = bean.getMainform().get(0).getHejidj();
                        hejije = bean.getMainform().get(0).getHejije();

                        bmfzryj = bean.getMainform().get(0).getBmfzryj();
                        zcgkbmyj = bean.getMainform().get(0).getZcgkbmyj();
                        fgldyj = bean.getMainform().get(0).getFgldyj();
                        cwzjyj = bean.getMainform().get(0).getCwzjyj();
                        zjl = bean.getMainform().get(0).getZjlyj();
                        jcbmyj = bean.getMainform().get(0).getJcbmyj();
                        mainId = String.valueOf(bean.getMainform().get(0).getMainId());
                        for (int i = 0; i < bean.getTrans().size(); i++) {
                            beanList.add(bean.getTrans().get(i));
                        }
                        ProgressDialogUtil.stopLoad();

                        String formRights = bean.getFormRights();
                        try {
                            JSONObject jsonObject = new JSONObject(formRights);
                            bmreout = jsonObject.getString("bmfzryj");
                            zcreout = jsonObject.getString("zcgkbmyj");
                            fgreout = jsonObject.getString("fgldyj");
                            cwreout = jsonObject.getString("cwzjyj");
                            zjlreout = jsonObject.getString("zjlyj");
                            jcbmreout = jsonObject.getString("jcbmyj");
                            if (bmreout.equals("2")) {
                                tvLeader.setVisibility(View.GONE);
                                etLeader.setVisibility(View.VISIBLE);
                            } else {
                                tvLeader.setVisibility(View.VISIBLE);
                                etLeader.setVisibility(View.GONE);
                                tvLeaderW.setTextColor(getResources().getColor(R.color.order_stop_black));
                            }
                            if (zcreout.equals("2")) {
                                tvLeader1.setVisibility(View.GONE);
                                etLeader1.setVisibility(View.VISIBLE);
                                tvNum1.setVisibility(View.GONE);
                                tvNum2.setVisibility(View.GONE);
                                tvNum3.setVisibility(View.GONE);
                                tvNum4.setVisibility(View.GONE);
                                tvNum5.setVisibility(View.GONE);
                                tvMoney1.setVisibility(View.GONE);
                                tvMoney2.setVisibility(View.GONE);
                                tvMoney3.setVisibility(View.GONE);
                                tvMoney4.setVisibility(View.GONE);
                                tvMoney5.setVisibility(View.GONE);
                                etNum1.setVisibility(View.VISIBLE);
                                etNum2.setVisibility(View.VISIBLE);
                                etNum3.setVisibility(View.VISIBLE);
                                etNum4.setVisibility(View.VISIBLE);
                                etNum5.setVisibility(View.VISIBLE);
                                etMoney1.setVisibility(View.VISIBLE);
                                etMoney2.setVisibility(View.VISIBLE);
                                etMoney3.setVisibility(View.VISIBLE);
                                etMoney4.setVisibility(View.VISIBLE);
                                etMoney5.setVisibility(View.VISIBLE);
                            } else {
                                tvLeader1.setVisibility(View.VISIBLE);
                                etLeader1.setVisibility(View.GONE);
                                tvNum1.setVisibility(View.VISIBLE);
                                tvNum2.setVisibility(View.VISIBLE);
                                tvNum3.setVisibility(View.VISIBLE);
                                tvNum4.setVisibility(View.VISIBLE);
                                tvNum5.setVisibility(View.VISIBLE);
                                tvMoney1.setVisibility(View.VISIBLE);
                                tvMoney2.setVisibility(View.VISIBLE);
                                tvMoney3.setVisibility(View.VISIBLE);
                                tvMoney4.setVisibility(View.VISIBLE);
                                tvMoney5.setVisibility(View.VISIBLE);
                                etNum1.setVisibility(View.GONE);
                                etNum2.setVisibility(View.GONE);
                                etNum3.setVisibility(View.GONE);
                                etNum4.setVisibility(View.GONE);
                                etNum5.setVisibility(View.GONE);
                                etMoney1.setVisibility(View.GONE);
                                etMoney2.setVisibility(View.GONE);
                                etMoney3.setVisibility(View.GONE);
                                etMoney4.setVisibility(View.GONE);
                                etMoney5.setVisibility(View.GONE);
                                tvLeader2W.setTextColor(getResources().getColor(R.color.order_stop_black));
                            }
                            if (fgreout.equals("2")) {
                                tvLeader2.setVisibility(View.GONE);
                                etLeader2.setVisibility(View.VISIBLE);
                            } else {
                                tvLeader2.setVisibility(View.VISIBLE);
                                etLeader2.setVisibility(View.GONE);
                                tvLeader3W.setTextColor(getResources().getColor(R.color.order_stop_black));
                            }
                            if (cwreout.equals("2")) {
                                tvLeader3.setVisibility(View.GONE);
                                etLeader3.setVisibility(View.VISIBLE);
                            } else {
                                tvLeader3.setVisibility(View.VISIBLE);
                                etLeader3.setVisibility(View.GONE);
                                tvLeader4W.setTextColor(getResources().getColor(R.color.order_stop_black));
                            }
                            if (zjlreout.equals("2")) {
                                tvLeader4.setVisibility(View.GONE);
                                etLeader4.setVisibility(View.VISIBLE);
                            } else {
                                tvLeader4.setVisibility(View.VISIBLE);
                                etLeader4.setVisibility(View.GONE);
                                tvLeader4W.setTextColor(getResources().getColor(R.color.order_stop_black));
                            }

                            if (jcbmreout.equals("2")) {
                                tvLeaderJG.setVisibility(View.GONE);
                                etLeaderJG.setVisibility(View.VISIBLE);
                            } else {
                                tvLeaderJG.setVisibility(View.VISIBLE);
                                etLeaderJG.setVisibility(View.GONE);
                                tvLeader1W.setTextColor(getResources().getColor(R.color.order_stop_black));
                            }
                            if (bmreout.equals("1") && fgreout.equals("1") && cwreout.equals("1")
                                    && zcreout.equals("1") && zjlreout.equals("1") && jcbmreout.equals("1")) {
                                Toast.makeText(FlowGoodsPuechaseWillDetailActivity.this, "您对当前流程只有读取权限", Toast.LENGTH_SHORT).show();
                            }
                        } catch (JSONException e) {
                            e.printStackTrace();
                        }

                        tvDepartment.setText(department);
                        tvPerson.setText(person);
                        tvTime.setText(time);
                        tvApplication.setText(use);
                        tvName1.setText(name1);
                        tvName2.setText(name2);
                        tvName3.setText(name3);
                        tvName4.setText(name4);
                        tvName5.setText(name5);
                        if (zcreout.equals("2")) {
                            etNum1.setText(num1);
                            etNum2.setText(num2);
                            etNum3.setText(num3);
                            etNum4.setText(num4);
                            etNum5.setText(num5);
                        } else {
                            tvNum1.setText(num1);
                            tvNum2.setText(num2);
                            tvNum3.setText(num3);
                            tvNum4.setText(num4);
                            tvNum5.setText(num5);
                        }
                        if (zcreout.equals("2")) {
                            etMoney1.setText(money1);
                            etMoney2.setText(money2);
                            etMoney3.setText(money3);
                            etMoney4.setText(money4);
                            etMoney5.setText(money5);
                        } else {
                            tvMoney1.setText(money1);
                            tvMoney2.setText(money2);
                            tvMoney3.setText(money3);
                            tvMoney4.setText(money4);
                            tvMoney5.setText(money5);
                        }
                        tvOther.setText(bean.getMainform().get(0).getQiTa());
                        tvApplication.setText(use);
                        tvAllMoney.setText(allMoney);
                        tvAllNum.setText(allNum);

                        tvAllMoney1.setText(allMoney1);
                        tvAllMoney2.setText(allMoney2);
                        tvAllMoney3.setText(allMoney3);
                        tvAllMoney4.setText(allMoney4);
                        tvAllMoney5.setText(allMoney5);

                        String word5 = "";
                        if (zjl != null && !zjl.equals("")) {
                            try {
                                JSONArray jsonArray = new JSONArray(zjl);
                                for (int i = 0; i < jsonArray.length(); i++) {
                                    JSONObject jsonObject = jsonArray.getJSONObject(i);
                                    if (!jsonObject.getString("v").toString().equals("")) {
                                        word5 = word5 + jsonObject.getString("v") + "\u3000" + jsonObject.getString("un") + ":" + jsonObject.getString("c") + "\n";
                                    }
                                }
                            } catch (JSONException e) {
                                e.printStackTrace();
                            }
                            if (tvLeader4.getVisibility() == View.VISIBLE) {
                                tvLeader4.setText(word5);
                            } else {
                                etLeader4.setHint(word5);
                            }
                        }

                        String word14 = "";
                        if (cwzjyj != null && !cwzjyj.equals("")) {
                            try {
                                JSONArray jsonArray = new JSONArray(cwzjyj);
                                for (int i = 0; i < jsonArray.length(); i++) {
                                    JSONObject jsonObject = jsonArray.getJSONObject(i);
                                    if (!jsonObject.getString("v").toString().equals("")) {
                                        word14 = word14 + jsonObject.getString("v") + "\u3000" + jsonObject.getString("un") + ":" + jsonObject.getString("c") + "\n";
                                    }
                                }
                            } catch (JSONException e) {
                                e.printStackTrace();
                            }
                            if (tvLeader3.getVisibility() == View.VISIBLE) {
                                tvLeader3.setText(word14);
                            } else {
                                etLeader3.setHint(word14);
                            }
                        }

                        String word13 = "";
                        if (fgldyj != null && !fgldyj.equals("")) {
                            try {
                                JSONArray jsonArray = new JSONArray(fgldyj);
                                for (int i = 0; i < jsonArray.length(); i++) {
                                    JSONObject jsonObject = jsonArray.getJSONObject(i);
                                    if (!jsonObject.getString("v").toString().equals("")) {
                                        word13 = word13 + jsonObject.getString("v") + "\u3000" + jsonObject.getString("un") + ":" + jsonObject.getString("c") + "\n";
                                    }
                                }
                            } catch (JSONException e) {
                                e.printStackTrace();
                            }
                            if (tvLeader2.getVisibility() == View.VISIBLE) {
                                tvLeader2.setText(word13);
                            } else {
                                etLeader2.setHint(word13);
                            }
                        }

                        String word2 = "";
                        if (zcgkbmyj != null && !zcgkbmyj.equals("")) {
                            try {
                                JSONArray jsonArray = new JSONArray(zcgkbmyj);
                                for (int i = 0; i < jsonArray.length(); i++) {
                                    JSONObject jsonObject = jsonArray.getJSONObject(i);
                                    if (!jsonObject.getString("v").toString().equals("")) {
                                        word2 = word2 + jsonObject.getString("v") + "\u3000" + jsonObject.getString("un") + ":" + jsonObject.getString("c") + "\n";
                                    }
                                }
                            } catch (JSONException e) {
                                e.printStackTrace();
                            }
                            if (tvLeader1.getVisibility() == View.VISIBLE) {
                                tvLeader1.setText(word2);
                            } else {
                                etLeader1.setHint(word2);
                            }
                        }

                        String word = "";
                        if (jcbmyj != null && !jcbmyj.equals("")) {
                            try {
                                JSONArray jsonArray = new JSONArray(jcbmyj);
                                for (int i = 0; i < jsonArray.length(); i++) {
                                    JSONObject jsonObject = jsonArray.getJSONObject(i);
                                    if (!jsonObject.getString("v").toString().equals("")) {
                                        word = word + jsonObject.getString("v") + "\u3000" + jsonObject.getString("un") + ":" + jsonObject.getString("c") + "\n";
                                    }
                                }
                            } catch (JSONException e) {
                                e.printStackTrace();
                            }
                            if (tvLeaderJG.getVisibility() == View.VISIBLE) {
                                tvLeaderJG.setText(word);
                            } else {
                                etLeaderJG.setHint(word);
                            }
                        }

                        String word11 = "";
                        if (bmfzryj != null && !bmfzryj.equals("")) {
                            try {
                                JSONArray jsonArray = new JSONArray(bmfzryj);
                                for (int i = 0; i < jsonArray.length(); i++) {
                                    JSONObject jsonObject = jsonArray.getJSONObject(i);
                                    if (!jsonObject.getString("v").toString().equals("")) {
                                        word11 = word11 + jsonObject.getString("v") + "\u3000" + jsonObject.getString("un") + ":" + jsonObject.getString("c") + "\n";
                                    }
                                }
                            } catch (JSONException e) {
                                e.printStackTrace();
                            }
                            if (tvLeader.getVisibility() == View.VISIBLE) {
                                tvLeader.setText(word11);
                            } else {
                                etLeader.setHint(word11);
                            }
                        }
                        if (bean.isRevoke()) {
                            Toast.makeText(FlowGoodsPuechaseWillDetailActivity.this, "当前流程已被追回", Toast.LENGTH_SHORT).show();
                        }
                    }
                    break;
                case TAG_TWO:
                    Toast.makeText(FlowGoodsPuechaseWillDetailActivity.this, "操作数据失败", Toast.LENGTH_SHORT).show();
                    ProgressDialogUtil.stopLoad();
                    break;
                case TAG_THERE:
                    Toast.makeText(FlowGoodsPuechaseWillDetailActivity.this, "提交数据成功", Toast.LENGTH_SHORT).show();
                    ProgressDialogUtil.stopLoad();
                    finish();
                    break;
                case TAG_FOUR:
                    Toast.makeText(FlowGoodsPuechaseWillDetailActivity.this, upData, Toast.LENGTH_SHORT).show();
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
                    FlowContractPerson bean1 = gson1.fromJson(qianzhiData, FlowContractPerson.class);
                    if (bean1.getData() != null) {
                        if (bean1.getData().size() > 1) {
                            role = bean1.getData().get(1).getRole();
                            userCode = bean1.getData().get(1).getUserNames();
                            userName = bean1.getData().get(1).getUserCodes();
                            nametemp = userName.split(",");
                            codetemp = userCode.split(",");
                        }
                        if (bean1.getData().size() > 2) {
                            role = bean1.getData().get(1).getRole() + ":" + bean1.getData().get(2).getRole();
                            userCode = bean1.getData().get(1).getUserNames() + ":" + bean1.getData().get(2).getUserNames();
                            userName = bean1.getData().get(1).getUserCodes() + "," + bean1.getData().get(2).getUserCodes();
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
//                    setDialog();
                    break;
                case TAG_EIGHT:
                    Toast.makeText(FlowGoodsPuechaseWillDetailActivity.this, "流程已到最后一步，请提交", Toast.LENGTH_SHORT).show();
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

    private void setDialog() {
        final AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(this);
        final AlertDialog alertDialog3 = alertDialogBuilder.create();
//                alertDialogBuilder.setTitle("java EE 常用框架");
        // 参数介绍
        // 第一个参数：弹出框的信息集合，一般为字符串集合
        // 第二个参数：被默认选中的，一个布尔类型的数组
        // 第三个参数：勾选事件监听
        final boolean[] checkedItems = new boolean[bigNametemp.length + 1];
        for (int i = 0; i < bigNametemp.length; i++) {
            checkedItems[i] = false;
        }
        new AlertDialog.Builder(this)
                .setTitle("选择审核人")//标题栏
                .setMultiChoiceItems(bigNametemp, checkedItems, new DialogInterface.OnMultiChoiceClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which, boolean isChecked) {
                        // dialog：不常使用，弹出框接口
                        // which：勾选或取消的是第几个
                        // isChecked：是否勾选
                        if (isChecked) {
                            // 选中
                            checkedItems[which] = isChecked;
                        } else {
                            // 取消选中
                            checkedItems[which] = isChecked;
                        }
                    }
                }).setPositiveButton("确定", new DialogInterface.OnClickListener() {

            @Override
            public void onClick(DialogInterface arg0, int arg1) {
                //TODO 业务逻辑代码
                for (int i = 0; i < checkedItems.length; i++) {
                    if (checkedItems[i]) {
                        selectList.add(bigCodetemp[i]);
                    }
                }
                getListData();
                sendData();
                // 关闭提示框
                alertDialog3.dismiss();
                flowAssignld = role + "|" + uId;
            }
        }).setNegativeButton("取消", new DialogInterface.OnClickListener() {

            @Override
            public void onClick(DialogInterface arg0, int arg1) {
                // TODO 业务逻辑代码
                // 关闭提示框
                alertDialog3.dismiss();
            }
        }).show();
    }

    private String getListData() {
        if (selectList.size() == 1) {
            //uName = backlist.get(0).getActivityName();
            uId = selectList.get(0);
        }
        if (selectList.size() > 1) {
            for (int i = 0; i < selectList.size(); i++) {
                if (i == selectList.size() - 1) {
                    uId = uId + selectList.get(i);
                } else {
                    uId = uId + selectList.get(i) + ",";
                }
            }
        }
        return uId;
    }

}
