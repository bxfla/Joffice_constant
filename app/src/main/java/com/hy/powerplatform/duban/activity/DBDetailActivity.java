package com.hy.powerplatform.duban.activity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.google.gson.Gson;
import com.hy.powerplatform.R;
import com.hy.powerplatform.duban.bean.DBList;
import com.hy.powerplatform.duban.bean.DBUp1;
import com.hy.powerplatform.my_utils.base.BaseActivity;
import com.hy.powerplatform.my_utils.base.Constant;
import com.hy.powerplatform.my_utils.base.OkHttpUtil;
import com.hy.powerplatform.my_utils.myViews.Header;
import com.hy.powerplatform.my_utils.utils.ProgressDialogUtil;

import java.io.IOException;
import java.util.HashMap;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import okhttp3.Request;
import okhttp3.Response;

public class DBDetailActivity extends BaseActivity {

    @BindView(R.id.header)
    Header header;
    @BindView(R.id.tvType)
    TextView tvType;
    @BindView(R.id.tvRW)
    TextView tvRW;
    @BindView(R.id.tvJHWCSJ)
    TextView tvJHWCSJ;
    @BindView(R.id.tvContent)
    TextView tvContent;
    @BindView(R.id.tvDBR)
    TextView tvDBR;
    @BindView(R.id.tvZXR)
    TextView tvZXR;
    @BindView(R.id.tvFBSJ)
    TextView tvFBSJ;
    @BindView(R.id.tvLXR)
    TextView tvLXR;
    @BindView(R.id.tvFJ)
    TextView tvFJ;
    @BindView(R.id.btn)
    Button btn;
    String data = "";
    String workId = "";
    String status = "";
    private OkHttpUtil httpUtil;
    String path_url = Constant.BASE_URL1 + Constant.DBDEL;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ButterKnife.bind(this);
        httpUtil = OkHttpUtil.getInstance(this);
        Intent intent = getIntent();
        DBList.ResultBean bean = (DBList.ResultBean) intent.getSerializableExtra("bean");
        status = String.valueOf(bean.getTaskStatus());
        tvType.setText(bean.getTaskType());
        tvRW.setText(bean.getTaskName());
        tvJHWCSJ.setText(bean.getPlanFinishTime());
        tvContent.setText(bean.getTaskContext());
        tvDBR.setText(bean.getSupervisorNames());
        tvZXR.setText(bean.getOperatorNames());
        tvFBSJ.setText(bean.getApproveTime());
        tvLXR.setText(bean.getApproverName());
        tvFJ.setText(bean.getFileNames() + "");
        workId = String.valueOf(bean.getWorkId());
        if (!status.equals("1")){
            btn.setVisibility(View.GONE);
        }
    }

    @Override
    protected int provideContentViewId() {
        return R.layout.activity_dndetail;
    }

    @Override
    protected boolean isHasHeader() {
        return true;
    }

    @Override
    protected void rightClient() {

    }

    @OnClick({R.id.tvFJ, R.id.btn})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.tvFJ:
                break;
            case R.id.btn:
                HashMap<String, String> map = new HashMap();
                map.put("ids", workId);
                ProgressDialogUtil.startLoad(this, getResources().getString(R.string.up_data));
                httpUtil.postForm(path_url, map, new OkHttpUtil.ResultCallback() {
                    @Override
                    public void onError(Request request, Exception e) {
//                Log.i("main", "response:" + e.toString());
                        Message message = new Message();
                        Bundle b = new Bundle();
                        b.putString("error", e.toString());
                        message.setData(b);
                        message.what = Constant.TAG_ONE;
                        handler.sendMessage(message);
                    }

                    @Override
                    public void onResponse(Response response) throws IOException {
//                      Log.i("main", "response:" + response.body().string());
                        data = response.body().string();
                        Message message = new Message();
                        Bundle b = new Bundle();
                        b.putString("data", data);
                        message.setData(b);
                        message.what = Constant.TAG_TWO;
                        handler.sendMessage(message);
                    }
                });
                break;
        }
    }

    Handler handler = new Handler() {
        @Override
        public void handleMessage(Message msg) {
            super.handleMessage(msg);
            switch (msg.what) {
                case Constant.TAG_ONE:
                    Bundle b = msg.getData();
                    String error = b.getString("error");
                    ProgressDialogUtil.stopLoad();
                    Toast.makeText(DBDetailActivity.this, error, Toast.LENGTH_SHORT).show();
                    break;
                case Constant.TAG_TWO:
                    Bundle b1 = msg.getData();
                    String data = b1.getString("data");
                    Gson gsonF = new Gson();
                    DBUp1 bean = gsonF.fromJson(data, DBUp1.class);
                    if (bean.isSuccess()){
                        Toast.makeText(DBDetailActivity.this, "删除成功", Toast.LENGTH_SHORT).show();
                    }
                    ProgressDialogUtil.stopLoad();
                    finish();
                    break;
            }
        }
    };
}
