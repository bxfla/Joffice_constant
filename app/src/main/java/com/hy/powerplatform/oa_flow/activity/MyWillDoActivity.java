package com.hy.powerplatform.oa_flow.activity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.v7.widget.LinearLayoutManager;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.example.refreshview.CustomRefreshView;
import com.hy.powerplatform.R;
import com.hy.powerplatform.business_inspect.utils.DBHandler;
import com.hy.powerplatform.my_utils.base.BaseActivity;
import com.hy.powerplatform.my_utils.base.Constant;
import com.hy.powerplatform.my_utils.myViews.Header;
import com.hy.powerplatform.my_utils.utils.ProgressDialogUtil;
import com.hy.powerplatform.oa_flow.adapter.MyWillDoAdapter;
import com.hy.powerplatform.oa_flow.bean.MyWillDo;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

import static com.hy.powerplatform.my_utils.base.Constant.TAG_ONE;
import static com.hy.powerplatform.my_utils.base.Constant.TAG_THERE;
import static com.hy.powerplatform.my_utils.base.Constant.TAG_TWO;

public class MyWillDoActivity extends BaseActivity implements MyWillDoAdapter.OnGetAdapterPositionListener {

    @BindView(R.id.header)
    Header header;
    @BindView(R.id.recyclerView)
    CustomRefreshView recyclerView;
    MyWillDoAdapter adapter;
    List<MyWillDo.ResultBean> beanList = new ArrayList<>();
    int limit = 20;
    int start = 0;
    String res = "";
    String tag = "";
    @BindView(R.id.liContent1)
    LinearLayout llNoContent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ButterKnife.bind(this);
        recyclerView.setRefreshEnable(false);
        LinearLayoutManager manager = new LinearLayoutManager(this);
        recyclerView.getRecyclerView().setLayoutManager(manager);
        adapter = new MyWillDoAdapter(this, beanList);
        adapter.sendOnGetAdapterPositionListener(this);
        recyclerView.setAdapter(adapter);
        ProgressDialogUtil.startLoad(this, "获取数据中");
        getData(start, limit);
        setClient();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        beanList.clear();
        adapter.notifyDataSetChanged();
        ProgressDialogUtil.startLoad(this, "获取数据中");
        getData(0, 20);
        setClient();
    }

    /**
     * 获取数据
     *
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
                    handler.sendEmptyMessage(TAG_ONE);
                }
            }
        }).start();
    }

    /**
     * 滑动监听
     */
    private void setClient() {
        recyclerView.setOnLoadListener(new CustomRefreshView.OnLoadListener() {
            @Override
            public void onRefresh() {
                beanList.clear();
                start = 0;
                limit = 20;
                getData(start, limit);
            }

            @Override
            public void onLoadMore() {
                start = limit;
                limit += 20;
                getData(start, limit);
            }
        });
    }

    @Override
    protected int provideContentViewId() {
        return R.layout.activity_my_will_do;
    }

    @Override
    protected boolean isHasHeader() {
        return true;
    }

    @Override
    protected void rightClient() {

    }

    @Override
    public void getAdapterPosition(int position) {
        Intent intent = null;
        if (beanList.get(position).getFormDefId().equals(Constant.EMAINTAIN)){
            intent = new Intent(this, FlowEMainatinWillDetailActivity.class);
            intent.putExtra("activityName", beanList.get(position).getActivityName());
            intent.putExtra("taskId", beanList.get(position).getTaskId());
            intent.putExtra("piId", beanList.get(position).getPiId());
            startActivity(intent);
        }else if (beanList.get(position).getFormDefId().equals(Constant.CARVIDEO)){
            intent = new Intent(this, FlowCarVideoWillDetailActivity.class);
            intent.putExtra("activityName", beanList.get(position).getActivityName());
            intent.putExtra("taskId", beanList.get(position).getTaskId());
            intent.putExtra("piId", beanList.get(position).getPiId());
            startActivity(intent);
        }else if (beanList.get(position).getFormDefId().equals(Constant.DORM)){
            intent = new Intent(this, FlowDormWillDetailActivity.class);
            intent.putExtra("activityName", beanList.get(position).getActivityName());
            intent.putExtra("taskId", beanList.get(position).getTaskId());
            intent.putExtra("piId", beanList.get(position).getPiId());
            startActivity(intent);
        }else if (beanList.get(position).getFormDefId().equals(Constant.GCADD)){
            intent = new Intent(this, FlowGCAddWillDetailActivity.class);
            intent.putExtra("tag","1");
            intent.putExtra("activityName", beanList.get(position).getActivityName());
            intent.putExtra("taskId", beanList.get(position).getTaskId());
            intent.putExtra("piId  ", beanList.get(position).getPiId());
            startActivity(intent);
        }else if (beanList.get(position).getFormDefId().equals(Constant.GCCHECK)){
            intent = new Intent(this, FlowGCAddWillDetailActivity.class);
            intent.putExtra("tag","2");
            intent.putExtra("activityName", beanList.get(position).getActivityName());
            intent.putExtra("taskId", beanList.get(position).getTaskId());
            intent.putExtra("piId  ", beanList.get(position).getPiId());
            startActivity(intent);
        }else if (beanList.get(position).getFormDefId().equals(Constant.COMPLAIN)){
            intent = new Intent(this, FlowComplainWillDetailActivity.class);
            intent.putExtra("activityName", beanList.get(position).getActivityName());
            intent.putExtra("taskId", beanList.get(position).getTaskId());
            intent.putExtra("piId  ", beanList.get(position).getPiId());
            startActivity(intent);
        }else if (beanList.get(position).getFormDefId().equals(Constant.GCQD)){
            intent = new Intent(this, FlowJSGCWillDetailActivity.class);
            intent.putExtra("activityName", beanList.get(position).getActivityName());
            intent.putExtra("taskId", beanList.get(position).getTaskId());
            intent.putExtra("piId  ", beanList.get(position).getPiId());
            startActivity(intent);
        }else if (beanList.get(position).getFormDefId().equals(Constant.INSTALL)){
            intent = new Intent(this, FlowInstallWillDetailActivity.class);
            intent.putExtra("activityName", beanList.get(position).getActivityName());
            intent.putExtra("taskId", beanList.get(position).getTaskId());
            intent.putExtra("piId  ", beanList.get(position).getPiId());
            startActivity(intent);
        }else if (beanList.get(position).getFormDefId().equals(Constant.DINNER)){
            intent = new Intent(this, FlowreceiveDinnerWillDetailActivity.class);
            intent.putExtra("activityName", beanList.get(position).getActivityName());
            intent.putExtra("taskId", beanList.get(position).getTaskId());
            intent.putExtra("piId  ", beanList.get(position).getPiId());
            startActivity(intent);
        }else if (beanList.get(position).getFormDefId().equals(Constant.CONTRACTSIGN)){
            intent = new Intent(this, FlowContractSignWillDetailActivity.class);
            intent.putExtra("activityName", beanList.get(position).getActivityName());
            intent.putExtra("taskId", beanList.get(position).getTaskId());
            intent.putExtra("piId  ", beanList.get(position).getPiId());
            startActivity(intent);
        }else if (beanList.get(position).getFormDefId().equals(Constant.APPEAL)){
            intent = new Intent(this, FlowAppealWillDetailActivity.class);
            intent.putExtra("activityName", beanList.get(position).getActivityName());
            intent.putExtra("taskId", beanList.get(position).getTaskId());
            intent.putExtra("piId  ", beanList.get(position).getPiId());
            startActivity(intent);
        }else if (beanList.get(position).getFormDefId().equals(Constant.CARSAFE)){
            intent = new Intent(this, FlowCarSafeWillDetailActivity.class);
            intent.putExtra("activityName", beanList.get(position).getActivityName());
            intent.putExtra("taskId", beanList.get(position).getTaskId());
            intent.putExtra("piId  ", beanList.get(position).getPiId());
            startActivity(intent);
        }else if (beanList.get(position).getFormDefId().equals(Constant.SAFER1)){
            intent = new Intent(this, FlowSaferWillDetailActivity.class);
            intent.putExtra("tag","1");
            intent.putExtra("activityName", beanList.get(position).getActivityName());
            intent.putExtra("taskId", beanList.get(position).getTaskId());
            intent.putExtra("piId  ", beanList.get(position).getPiId());
            startActivity(intent);
        }else if (beanList.get(position).getFormDefId().equals(Constant.SAFER2)){
            intent = new Intent(this, FlowSaferWillDetailActivity.class);
            intent.putExtra("tag","2");
            intent.putExtra("activityName", beanList.get(position).getActivityName());
            intent.putExtra("taskId", beanList.get(position).getTaskId());
            intent.putExtra("piId  ", beanList.get(position).getPiId());
            startActivity(intent);
        }else if (beanList.get(position).getFormDefId().equals(Constant.USERCAR)){
            intent = new Intent(this, FlowUseCarWillDetailActivity.class);
            intent.putExtra("activityName", beanList.get(position).getActivityName());
            intent.putExtra("taskId", beanList.get(position).getTaskId());
            intent.putExtra("piId  ", beanList.get(position).getPiId());
            startActivity(intent);
        }else if(beanList.get(position).getFormDefId().equals(Constant.ENTRY)){
            intent = new Intent(this, FlowEntryWillDetailActivity.class);
            intent.putExtra("activityName", beanList.get(position).getActivityName());
            intent.putExtra("taskId", beanList.get(position).getTaskId());
            intent.putExtra("piId  ", beanList.get(position).getPiId());
            startActivity(intent);
        }else if (beanList.get(position).getFormDefId().equals(Constant.LEAVER)){
            intent = new Intent(this, FlowLeaveWillDetailActivity.class);
            intent.putExtra("activityName", beanList.get(position).getActivityName());
            intent.putExtra("taskId", beanList.get(position).getTaskId());
            intent.putExtra("piId  ", beanList.get(position).getPiId());
            startActivity(intent);
        }else if(beanList.get(position).getFormDefId().equals(Constant.CHUCAI)){
            intent = new Intent(this, FlowChuCaiWillDetailActivity.class);
            intent.putExtra("activityName", beanList.get(position).getActivityName());
            intent.putExtra("taskId", beanList.get(position).getTaskId());
            intent.putExtra("piId  ", beanList.get(position).getPiId());
            startActivity(intent);
        }else if (beanList.get(position).getFormDefId().equals(Constant.DRIVERASSESS)){
            intent = new Intent(this, FlowDriverAssessWillDetailActivity.class);
            intent.putExtra("activityName", beanList.get(position).getActivityName());
            intent.putExtra("taskId", beanList.get(position).getTaskId());
            intent.putExtra("piId  ", beanList.get(position).getPiId());
            startActivity(intent);
        }else if (beanList.get(position).getFormDefId().equals(Constant.OVERTIME)){
            intent = new Intent(this, FlowOverTimeWillDetailActivity.class);
            intent.putExtra("activityName", beanList.get(position).getActivityName());
            intent.putExtra("taskId", beanList.get(position).getTaskId());
            intent.putExtra("piId  ", beanList.get(position).getPiId());
            startActivity(intent);
        }else if(beanList.get(position).getFormDefId().equals(Constant.BILL)){
            intent = new Intent(this, FlowBillWillDetailActivity.class);
            intent.putExtra("activityName", beanList.get(position).getActivityName());
            intent.putExtra("taskId", beanList.get(position).getTaskId());
            intent.putExtra("piId  ", beanList.get(position).getPiId());
            startActivity(intent);
        }else if (beanList.get(position).getFormDefId().equals(Constant.CONTRACEPAY)){
            intent = new Intent(this, FlowContracterPayWillDetailActivity.class);
            intent.putExtra("activityName", beanList.get(position).getActivityName());
            intent.putExtra("taskId", beanList.get(position).getTaskId());
            intent.putExtra("piId  ", beanList.get(position).getPiId());
            startActivity(intent);
        }else if (beanList.get(position).getFormDefId().equals(Constant.PAYFLOW)){
            intent = new Intent(this, FlowPayLiuChengWillDetailActivity.class);
            intent.putExtra("activityName", beanList.get(position).getActivityName());
            intent.putExtra("taskId", beanList.get(position).getTaskId());
            intent.putExtra("piId  ", beanList.get(position).getPiId());
            startActivity(intent);
        }else if (beanList.get(position).getFormDefId().equals(Constant.GHPAYFLOW)){
            intent = new Intent(this, FlowGHPayWillDetailActivity.class);
            intent.putExtra("activityName", beanList.get(position).getActivityName());
            intent.putExtra("taskId", beanList.get(position).getTaskId());
            intent.putExtra("piId  ", beanList.get(position).getPiId());
            startActivity(intent);
        }else if (beanList.get(position).getFormDefId().equals(Constant.GHCONTRACTSINGLE)) {
            intent = new Intent(this, FlowGHContractSignWillDetailActivity.class);
            intent.putExtra("activityName", beanList.get(position).getActivityName());
            intent.putExtra("taskId", beanList.get(position).getTaskId());
            intent.putExtra("piId  ", beanList.get(position).getPiId());
            startActivity(intent);
        }else if(beanList.get(position).getFormDefId().equals(Constant.WORKPUECHASE)){
            intent = new Intent(this, FlowWorkPuechaseWillDetailActivity.class);
            intent.putExtra("activityName", beanList.get(position).getActivityName());
            intent.putExtra("taskId", beanList.get(position).getTaskId());
            intent.putExtra("taskName", beanList.get(position).getTaskName());
            intent.putExtra("piId  ", beanList.get(position).getPiId());
            startActivity(intent);
        }else if (beanList.get(position).getFormDefId().equals(Constant.GOODSPUECHASE)){
            intent = new Intent(this, FlowGoodsPuechaseWillDetailActivity.class);
            intent.putExtra("activityName", beanList.get(position).getActivityName());
            intent.putExtra("taskId", beanList.get(position).getTaskId());
            intent.putExtra("taskName", beanList.get(position).getTaskName());
            intent.putExtra("piId  ", beanList.get(position).getPiId());
            startActivity(intent);
        }else if (beanList.get(position).getFormDefId().equals(Constant.PUECHASEFLOW)){
            intent = new Intent(this, FlowPuechaseWillDetailActivity.class);
            intent.putExtra("activityName", beanList.get(position).getActivityName());
            intent.putExtra("taskId", beanList.get(position).getTaskId());
            intent.putExtra("taskName", beanList.get(position).getTaskName());
            intent.putExtra("piId  ", beanList.get(position).getPiId());
            startActivity(intent);
        }else if (beanList.get(position).getFormDefId().equals(Constant.REPAIR)){
            intent = new Intent(this, FlowRepairWillDetailActivity.class);
            intent.putExtra("activityName", beanList.get(position).getActivityName());
            intent.putExtra("taskId", beanList.get(position).getTaskId());
            intent.putExtra("piId  ", beanList.get(position).getPiId());
            startActivity(intent);
        }else if (beanList.get(position).getFormDefId().equals(Constant.CCTPUECHASE)){
            intent = new Intent(this, FlowCCTPuechaseWillDetailActivity.class);
            intent.putExtra("activityName", beanList.get(position).getActivityName());
            intent.putExtra("taskId", beanList.get(position).getTaskId());
            intent.putExtra("piId  ", beanList.get(position).getPiId());
            startActivity(intent);
        }else if (beanList.get(position).getFormDefId().equals(Constant.GHPUECHASE)){
            intent = new Intent(this, FlowGHPuechaseWillDetailActivity.class);
            intent.putExtra("activityName", beanList.get(position).getActivityName());
            intent.putExtra("taskId", beanList.get(position).getTaskId());
            intent.putExtra("piId  ", beanList.get(position).getPiId());
            startActivity(intent);
        }else if (beanList.get(position).getFormDefId().equals(Constant.OUTMESSAGE)){
            intent = new Intent(this, FlowOutMessageWillDetailActivity.class);
            intent.putExtra("activityName", beanList.get(position).getActivityName());
            intent.putExtra("taskId", beanList.get(position).getTaskId());
            intent.putExtra("piId  ", beanList.get(position).getPiId());
            startActivity(intent);
        }else if (beanList.get(position).getFormDefId().equals(Constant.HUIQIAN)){
            intent = new Intent(this, FlowHuiQianWillDetailActivity.class);
            intent.putExtra("activityName", beanList.get(position).getActivityName());
            intent.putExtra("taskId", beanList.get(position).getTaskId());
            intent.putExtra("piId  ", beanList.get(position).getPiId());
            startActivity(intent);
        }else if (beanList.get(position).getFormDefId().equals(Constant.COMPMESSAGE)){
            intent = new Intent(this, FlowCompMessageWillDetailActivity.class);
            intent.putExtra("activityName", beanList.get(position).getActivityName());
            intent.putExtra("taskId", beanList.get(position).getTaskId());
            intent.putExtra("piId  ", beanList.get(position).getPiId());
            startActivity(intent);
        }else {
            Toast.makeText(this, "当前流程已调整，不支持查看", Toast.LENGTH_SHORT).show();
        }
    }


    Handler handler = new Handler() {
        @Override
        public void handleMessage(Message msg) {
            super.handleMessage(msg);
            switch (msg.what) {
                case TAG_ONE:
                    try {
                        JSONObject jsonObject = new JSONObject(res);
                        JSONArray jsonArray = jsonObject.getJSONArray("result");
                        if (jsonArray.length() == 0 && beanList.size() == 0) {
                            if (recyclerView != null) {
                                recyclerView.setVisibility(View.GONE);
                                llNoContent.setVisibility(View.VISIBLE);
                            }
                            ProgressDialogUtil.stopLoad();
                            break;
                        } else if (jsonArray.length() == 0 && beanList.size() != 0) {
                            if (recyclerView != null) {
                                recyclerView.complete();
                                recyclerView.onNoMore();
                            }
                        }
                        for (int i = 0; i < jsonArray.length(); i++) {
                            JSONObject jsonOnjectData = jsonArray.getJSONObject(i);
                            MyWillDo.ResultBean bean = new MyWillDo.ResultBean();
                            bean.setTaskName(jsonOnjectData.getString("taskName"));
                            bean.setActivityName(jsonOnjectData.getString("activityName"));
                            if (!jsonOnjectData.isNull("assignee")) {
                                bean.setAssignee(jsonOnjectData.getString("assignee"));
                            }
                            bean.setCreateTime(jsonOnjectData.getString("createTime"));
                            bean.setExecutionId(jsonOnjectData.getString("executionId"));
                            bean.setPiId(jsonOnjectData.getString("piId"));
                            bean.setTaskId(jsonOnjectData.getString("taskId"));
                            bean.setState(jsonOnjectData.getString("state"));
                            bean.setFormDefId(jsonOnjectData.getString("formDefId"));
                            bean.setIsMultipleTask(jsonOnjectData.getString("isMultipleTask"));
                            bean.setCandidateUsers(jsonOnjectData.getString("candidateUsers"));
                            bean.setCandidateRoles(jsonOnjectData.getString("candidateRoles"));
                            bean.setCreator(jsonOnjectData.getString("creator"));
                            bean.setCreateTime(jsonOnjectData.getString("createTime"));
                            bean.setTaskName(jsonOnjectData.getString("taskName"));
                            beanList.add(bean);
                        }
                        if (jsonArray.length() < 20) {
                            if (tag.equals("down")) {
                                if (recyclerView != null) {
                                    adapter.notifyDataSetChanged();
                                    recyclerView.complete();
                                    recyclerView.onNoMore();
                                }
                            } else {
                                if (recyclerView != null) {
                                    adapter.notifyDataSetChanged();
                                    recyclerView.complete();
                                    recyclerView.onNoMore();
                                }
                            }
                        } else {
                            if (recyclerView != null) {
                                adapter.notifyDataSetChanged();
                                recyclerView.complete();
                            }
                        }
                        if (start == 0) {
                            ProgressDialogUtil.stopLoad();
                            if (recyclerView != null) {
                                recyclerView.complete();
                            }
                        }
                    } catch (JSONException e) {
                        e.printStackTrace();
                        handler.sendEmptyMessage(TAG_THERE);
                    }
                    ProgressDialogUtil.stopLoad();
                    break;
                case TAG_TWO:
                    Toast.makeText(MyWillDoActivity.this, "获取数据失败", Toast.LENGTH_SHORT).show();
                    ProgressDialogUtil.stopLoad();
                    break;
                case TAG_THERE:
                    Toast.makeText(MyWillDoActivity.this, "解析失败", Toast.LENGTH_SHORT).show();
                    ProgressDialogUtil.stopLoad();
                    break;
            }
        }
    };
}
