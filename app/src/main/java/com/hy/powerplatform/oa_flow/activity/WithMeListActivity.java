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
import com.hy.powerplatform.oa_flow.adapter.WithMeListAdapter;
import com.hy.powerplatform.oa_flow.bean.WithMeList;

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

public class WithMeListActivity extends BaseActivity implements WithMeListAdapter.OnGetAdapterPositionListener {

    @BindView(R.id.header)
    Header header;
    @BindView(R.id.recyclerView)
    CustomRefreshView recyclerView;
    WithMeListAdapter adapter;
    List<WithMeList.ResultBean> beanList = new ArrayList<>();
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
        adapter = new WithMeListAdapter(this, beanList);
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
        limit = 20;
        start = 0;
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
                String url = Constant.BASE_URL2 + Constant.WithMeLIST + start + "&limit=" + limit;
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
                adapter.notifyDataSetChanged();
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
        if (beanList.get(position).getFormDefId().equals(Constant.EMAINTAIN)) {
            intent = new Intent(this, FlowEMaintainDetailActivity.class);
            intent.putExtra("bean", beanList.get(position).getRunId());
            startActivity(intent);
        }else if (beanList.get(position).getFormDefId().equals(Constant.CARVIDEO)) {
            intent = new Intent(this, FlowCarVideoDetailActivity.class);
            intent.putExtra("bean", beanList.get(position).getRunId());
            startActivity(intent);
        }else if (beanList.get(position).getFormDefId().equals(Constant.DORM)) {
            intent = new Intent(this, FlowDormDetailActivity.class);
            intent.putExtra("bean", beanList.get(position).getRunId());
            startActivity(intent);
        }else if (beanList.get(position).getFormDefId().equals(Constant.GCADD)) {
            intent = new Intent(this, FlowGCAddDetailActivity.class);
            intent.putExtra("tag", "1");
            intent.putExtra("bean", beanList.get(position).getRunId());
            startActivity(intent);
        }else if (beanList.get(position).getFormDefId().equals(Constant.GCCHECK)) {
            intent = new Intent(this, FlowGCAddDetailActivity.class);
            intent.putExtra("tag", "2");
            intent.putExtra("bean", beanList.get(position).getRunId());
            startActivity(intent);
        }else if (beanList.get(position).getFormDefId().equals(Constant.COMPLAIN)) {
            intent = new Intent(this, FlowComplainDetailActivity.class);
            intent.putExtra("bean", beanList.get(position).getRunId());
            startActivity(intent);
        }else if (beanList.get(position).getFormDefId().equals(Constant.GCQD)) {
            intent = new Intent(this, FlowJSGCDetailActivity.class);
            intent.putExtra("bean", beanList.get(position).getRunId());
            startActivity(intent);
        }else if (beanList.get(position).getFormDefId().equals(Constant.INSTALL)) {
            intent = new Intent(this, FlowInstallDetailActivity.class);
            intent.putExtra("bean", beanList.get(position).getRunId());
            startActivity(intent);
        }else if (beanList.get(position).getFormDefId().equals(Constant.DINNER)) {
            intent = new Intent(this, FlowDinnerDetailActivity.class);
            intent.putExtra("bean", beanList.get(position).getRunId());
            startActivity(intent);
        }else if (beanList.get(position).getFormDefId().equals(Constant.CONTRACTSIGN)) {
            intent = new Intent(this, FlowContractSignDetailActivity.class);
            intent.putExtra("bean", beanList.get(position).getRunId());
            startActivity(intent);
        }else if (beanList.get(position).getFormDefId().equals(Constant.APPEAL)) {
            intent = new Intent(this, FlowAppealDetailActivity.class);
            intent.putExtra("bean", beanList.get(position).getRunId());
            startActivity(intent);
        }else if (beanList.get(position).getFormDefId().equals(Constant.CARSAFE)) {
            intent = new Intent(this, FlowCarSafeDetailActivity.class);
            intent.putExtra("bean", beanList.get(position).getRunId());
            startActivity(intent);
        }else if (beanList.get(position).getFormDefId().equals(Constant.SAFER1)) {
            intent = new Intent(this, FlowSaferllDetailActivity.class);
            intent.putExtra("tag", "1");
            intent.putExtra("bean", beanList.get(position).getRunId());
            startActivity(intent);
        }else if (beanList.get(position).getFormDefId().equals(Constant.SAFER2)) {
            intent = new Intent(this, FlowSaferllDetailActivity.class);
            intent.putExtra("tag", "2");
            intent.putExtra("bean", beanList.get(position).getRunId());
            startActivity(intent);
        }else if (beanList.get(position).getFormDefId().equals(Constant.USERCAR)) {
            intent = new Intent(this, FlowUseCarDetailActivity.class);
            intent.putExtra("bean", beanList.get(position).getRunId());
            startActivity(intent);
        }else if(beanList.get(position).getFormDefId().equals(Constant.ENTRY)) {
            intent = new Intent(this, FlowEntryDetailActivity.class);
            intent.putExtra("bean", beanList.get(position).getRunId());
            startActivity(intent);
        }else if (beanList.get(position).getFormDefId().equals(Constant.LEAVER)) {
            intent = new Intent(this, FlowLeaveDetailActivity.class);
            intent.putExtra("bean", beanList.get(position).getRunId());
            startActivity(intent);
        }else if (beanList.get(position).getFormDefId().equals(Constant.CHUCAI)) {
            intent = new Intent(this, FlowChuCaiDetailActivity.class);
            intent.putExtra("bean", beanList.get(position).getRunId());
            startActivity(intent);
        }else if (beanList.get(position).getFormDefId().equals(Constant.DRIVERASSESS)) {
            intent = new Intent(this, FlowDriverAssessDetailActivity.class);
            intent.putExtra("bean", beanList.get(position).getRunId());
            startActivity(intent);
        }else if (beanList.get(position).getFormDefId().equals(Constant.OVERTIME)) {
            intent = new Intent(this, FlowOverTimeDetailActivity.class);
            intent.putExtra("bean", beanList.get(position).getRunId());
            startActivity(intent);
        }else if (beanList.get(position).getFormDefId().equals(Constant.BILL)) {
            intent = new Intent(this, FlowBillDetailActivity.class);
            intent.putExtra("bean", beanList.get(position).getRunId());
            startActivity(intent);
        }else if (beanList.get(position).getFormDefId().equals(Constant.CONTRACEPAY)) {
            intent = new Intent(this, FlowContractPayDetailActivity.class);
            intent.putExtra("bean", beanList.get(position).getRunId());
            startActivity(intent);
        }else if (beanList.get(position).getFormDefId().equals(Constant.PAYFLOW)) {
            intent = new Intent(this, FlowFuKuanLiuChengDetailActivity.class);
            intent.putExtra("bean", beanList.get(position).getRunId());
            startActivity(intent);
        }else if(beanList.get(position).getFormDefId().equals(Constant.WORKPUECHASE)) {
            intent = new Intent(this, FlowWorkPruchaseDetailActivity.class);
            intent.putExtra("bean", beanList.get(position).getRunId());
            startActivity(intent);
        }else if (beanList.get(position).getFormDefId().equals(Constant.GOODSPUECHASE)) {
            intent = new Intent(this, FlowGoodsPruchaseDetailActivity.class);
            intent.putExtra("bean", beanList.get(position).getRunId());
            startActivity(intent);
        }else if (beanList.get(position).getFormDefId().equals(Constant.PUECHASEFLOW)) {
            intent = new Intent(this, FlowPruchaseDetailActivity.class);
            intent.putExtra("bean", beanList.get(position).getRunId());
            startActivity(intent);
        }else if (beanList.get(position).getFormDefId().equals(Constant.REPAIR)) {
            intent = new Intent(this, FlowRepairDetailActivity.class);
            intent.putExtra("bean", beanList.get(position).getRunId());
            startActivity(intent);
        }else if(beanList.get(position).getFormDefId().equals(Constant.OUTMESSAGE)) {
            intent = new Intent(this, FlowOutMessageDetailActivity.class);
            intent.putExtra("bean", beanList.get(position).getRunId());
            startActivity(intent);
        }else if (beanList.get(position).getFormDefId().equals(Constant.HUIQIAN)) {
            intent = new Intent(this, FlowHuiQianDetailActivity.class);
            intent.putExtra("bean", beanList.get(position).getRunId());
            startActivity(intent);
        }else if (beanList.get(position).getFormDefId().equals(Constant.COMPMESSAGE)) {
            intent = new Intent(this, FlowCompMessageDetailActivity.class);
            intent.putExtra("bean", beanList.get(position).getRunId());
            startActivity(intent);
        }else if (beanList.get(position).getFormDefId().equals(Constant.CCTPUECHASE)) {
            intent = new Intent(this, FlowCCTPruchaseDetailActivity.class);
            intent.putExtra("bean", beanList.get(position).getRunId());
            startActivity(intent);
        }else if (beanList.get(position).getFormDefId().equals(Constant.GHPUECHASE)) {
            intent = new Intent(this, FlowGHPruchaseDetailActivity.class);
            intent.putExtra("bean", beanList.get(position).getRunId());
            startActivity(intent);
        }else if (beanList.get(position).getFormDefId().equals(Constant.GHPAYFLOW)) {
            intent = new Intent(this, FlowGHPayDetailActivity.class);
            intent.putExtra("bean", beanList.get(position).getRunId());
            startActivity(intent);
        }else if (beanList.get(position).getFormDefId().equals(Constant.GHCONTRACTSINGLE)) {
            intent = new Intent(this, FlowGHContractSignDetailActivity.class);
            intent.putExtra("bean", beanList.get(position).getRunId());
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
                            WithMeList.ResultBean bean = new WithMeList.ResultBean();
                            bean.setRunId(jsonOnjectData.getString("runId"));
                            bean.setSubject(jsonOnjectData.getString("subject"));
                            bean.setCreatetime(jsonOnjectData.getString("createtime"));
                            bean.setDefId(jsonOnjectData.getString("defId"));
                            bean.setRunStatus(jsonOnjectData.getString("runStatus"));
                            bean.setFormTitle(jsonOnjectData.getString("formTitle"));
                            bean.setFormDefId(jsonOnjectData.getString("formDefId"));
                            bean.setProcessName(jsonOnjectData.getString("processName"));
                            bean.setCreator(jsonOnjectData.getString("creator"));
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
                    Toast.makeText(WithMeListActivity.this, "获取数据失败", Toast.LENGTH_SHORT).show();
                    ProgressDialogUtil.stopLoad();
                    break;
                case TAG_THERE:
                    Toast.makeText(WithMeListActivity.this, "解析失败", Toast.LENGTH_SHORT).show();
                    ProgressDialogUtil.stopLoad();
                    break;
            }
        }
    };
}
