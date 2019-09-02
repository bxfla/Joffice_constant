package com.hy.powerplatform.oa_flow.activity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.google.gson.Gson;
import com.hy.powerplatform.R;
import com.hy.powerplatform.business_inspect.utils.DBHandler;
import com.hy.powerplatform.my_utils.base.AlertDialogCallBackP;
import com.hy.powerplatform.my_utils.base.BaseActivity;
import com.hy.powerplatform.my_utils.base.BaseRequestBackLisenter;
import com.hy.powerplatform.my_utils.base.Constant;
import com.hy.powerplatform.my_utils.myViews.Header;
import com.hy.powerplatform.my_utils.myViews.MyAlertDialog;
import com.hy.powerplatform.my_utils.utils.ProgressDialogUtil;
import com.hy.powerplatform.oa_flow.adapter.FlowMessageAdapter;
import com.hy.powerplatform.oa_flow.bean.File;
import com.hy.powerplatform.oa_flow.bean.FlowDinnerDetail;
import com.hy.powerplatform.oa_flow.bean.FlowMessage1;
import com.hy.powerplatform.oa_flow.util.AlertDialogEditText;
import com.hy.powerplatform.oa_flow.util.MyStringSpilt;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

import static com.hy.powerplatform.my_utils.base.Constant.TAG_FIVE;
import static com.hy.powerplatform.my_utils.base.Constant.TAG_NINE;
import static com.hy.powerplatform.my_utils.base.Constant.TAG_ONE;
import static com.hy.powerplatform.my_utils.base.Constant.TAG_SIX;
import static com.hy.powerplatform.my_utils.base.Constant.TAG_TWO;

public class FlowDinnerDetailActivity extends BaseActivity {


    @BindView(R.id.tvTime)
    TextView tvTime;
    @BindView(R.id.tvPerson)
    TextView tvPerson;
    @BindView(R.id.tvDpartment)
    TextView tvDpartment;
    @BindView(R.id.tvPCPerson)
    TextView tvPCPerson;
    @BindView(R.id.tvLKDepartment)
    TextView tvLKDepartment;
    @BindView(R.id.tvLKPerson)
    TextView tvLKPerson;
    @BindView(R.id.tvEatBZ)
    TextView tvEatBZ;
    @BindView(R.id.tvBigMoney)
    TextView tvBigMoney;
    @BindView(R.id.tvSmallMoney)
    TextView tvSmallMoney;
    @BindView(R.id.tvData)
    TextView tvData;
    @BindView(R.id.tvLeader)
    TextView tvLeader;
    @BindView(R.id.tvLeader1)
    TextView tvLeader1;
    @BindView(R.id.tvLeader2)
    TextView tvLeader2;
    @BindView(R.id.btnUp)
    Button btnUp;
    @BindView(R.id.header)
    Header header;
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
    @BindView(R.id.etLeader)
    EditText etLeader;
    @BindView(R.id.etLeader1)
    EditText etLeader1;
    @BindView(R.id.etLeader2)
    EditText etLeader2;
    @BindView(R.id.btnT)
    FloatingActionButton btnT;
    @BindView(R.id.tvText)
    TextView tvText;
    @BindView(R.id.btnHistory)
    Button btnHistory;
    @BindView(R.id.recyclerView)
    RecyclerView recyclerView;
    @BindView(R.id.llData)
    LinearLayout llData;
    @BindView(R.id.tvLeaderW)
    TextView tvLeaderW;
    @BindView(R.id.tvLeader1W)
    TextView tvLeader1W;
    @BindView(R.id.tvLeader2W)
    TextView tvLeader2W;
    private String res;

    String xiangguanfujian = "";
    String runID = "";
    String flowMessage = "";
    String downloadData = "";
    FlowMessageAdapter adapter;
    List<FlowMessage1.DataBean> flowList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ButterKnife.bind(this);
        tvLeaderW.setTextColor(getResources().getColor(R.color.order_stop_black));
        tvLeader1W.setTextColor(getResources().getColor(R.color.order_stop_black));
        tvLeader2W.setTextColor(getResources().getColor(R.color.order_stop_black));
        header.setTvRight("追回");
        LinearLayoutManager manager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(manager);
        btnT.setVisibility(View.GONE);
        tvText.setVisibility(View.GONE);
        btnUp.setVisibility(View.GONE);
        Intent intent = getIntent();
        final String runId = intent.getStringExtra("bean");
        ProgressDialogUtil.startLoad(this, "获取数据中");
        new Thread(new Runnable() {
            @Override
            public void run() {
                String url = Constant.BASE_URL2 + Constant.MYLISTDETAIL + runId;
                DBHandler dbA = new DBHandler();
                res = dbA.OAQingJiaMyDetail(url);
                if (res.equals("获取数据失败") || res.equals("")) {
                    handler.sendEmptyMessage(TAG_TWO);
                } else {
                    handler.sendEmptyMessage(TAG_ONE);
                }
            }
        }).start();
    }

    @Override
    protected int provideContentViewId() {
        return R.layout.activity_receivedinner_data;
    }

    @Override
    protected boolean isHasHeader() {
        return true;
    }

    @Override
    protected void rightClient() {
        new AlertDialogEditText().showDialog(this, runID, new BaseRequestBackLisenter() {
            @Override
            public void success(Object o) {
                Message message = new Message();
                message.what = TAG_FIVE;
                Bundle bundle = new Bundle();
                bundle.putString("msg", o.toString());
                message.setData(bundle);
                handler.sendMessage(message);
                finish();
            }

            @Override
            public void fail(String message) {
                Message message1 = new Message();
                message1.what = TAG_SIX;
                handler.sendMessage(message1);
            }
        });
    }

    @OnClick({R.id.tvData, R.id.btnHistory})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.btnHistory:
                recyclerView.setVisibility(View.VISIBLE);
                ProgressDialogUtil.startLoad(FlowDinnerDetailActivity.this, "获取数据中");
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
        }
    }

    private Handler handler = new Handler() {
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
                    adapter = new FlowMessageAdapter(FlowDinnerDetailActivity.this, flowList);
                    recyclerView.setAdapter(adapter);
                    ProgressDialogUtil.stopLoad();
                    break;
                case TAG_ONE:
                    Gson gson = new Gson();
                    FlowDinnerDetail bean = gson.fromJson(res, FlowDinnerDetail.class);
                    final String person = bean.getMainform().get(0).getSqr();
                    final String department = bean.getMainform().get(0).getSqbm();
                    final String pcPerson = bean.getMainform().get(0).getPcry();
                    final String lkDepartment = bean.getMainform().get(0).getLkdwhbm();
                    final String lkPerson = bean.getMainform().get(0).getLkrs();
                    final String eatBz = bean.getMainform().get(0).getYcbz();
                    final String bigMoney = bean.getMainform().get(0).getJine();
                    final String smallMoney = bean.getMainform().get(0).getXiaoxie();

                    String bmfzryj = bean.getMainform().get(0).getBmfzryj();
                    String fgldyj = bean.getMainform().get(0).getFgldyj();
                    String zjlyj = bean.getMainform().get(0).getZjlyj();
                    xiangguanfujian = bean.getMainform().get(0).getXiangguanfujian();
                    if (xiangguanfujian.equals("")) {
                        llData.setVisibility(View.GONE);
                    } else {
                        tvData.setText(xiangguanfujian);
                    }
                    runID = bean.getMainform().get(0).getRunId();
                    tvData.setText(xiangguanfujian);
                    tvPerson.setText(person);
                    tvDpartment.setText(department);
                    tvPCPerson.setText(pcPerson);
                    tvLKDepartment.setText(lkDepartment);
                    tvLKPerson.setText(lkPerson);
                    tvEatBZ.setText(eatBz);
                    tvBigMoney.setText(smallMoney);
                    tvSmallMoney.setText(bigMoney);
                    if (!bmfzryj.equals("")) {
                        tvLeader.setText(getJSONData(bmfzryj));
                    }
                    if (!fgldyj.equals("")) {
                        tvLeader1.setText(getJSONData(fgldyj));
                    }
                    if (!zjlyj.equals("")) {
                        tvLeader2.setText(getJSONData(zjlyj));
                    }
                    ProgressDialogUtil.stopLoad();
                    break;
                case TAG_TWO:
                    Toast.makeText(FlowDinnerDetailActivity.this, "获取数据失败", Toast.LENGTH_SHORT).show();
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
                case TAG_FIVE:
                    Toast.makeText(FlowDinnerDetailActivity.this, msg.getData().getString("msg"), Toast.LENGTH_SHORT).show();
                    ProgressDialogUtil.stopLoad();
                    finish();
                    break;
                case TAG_SIX:
                    Toast.makeText(FlowDinnerDetailActivity.this, "提交数据失败", Toast.LENGTH_SHORT).show();
                    ProgressDialogUtil.stopLoad();
                    break;
            }
        }
    };

    private String getJSONData(String data) {
        String yijian = "";
        try {
            JSONArray jsonArray = new JSONArray(data);
            int size = jsonArray.length();
            JSONObject jsonObject = jsonArray.getJSONObject(size - 1);
            yijian = jsonObject.getString("v") + "\u3000" + jsonObject.getString("un") + ":" + jsonObject.getString("c");
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return yijian;
    }
}
