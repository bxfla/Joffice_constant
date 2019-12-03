package com.hy.powerplatform.duban.activity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.google.gson.Gson;
import com.hy.powerplatform.R;
import com.hy.powerplatform.SharedPreferencesHelper;
import com.hy.powerplatform.business_inspect.bean.CheckPerson;
import com.hy.powerplatform.business_inspect.bean.Person;
import com.hy.powerplatform.business_inspect.newactivity.CheckPersonActivity;
import com.hy.powerplatform.business_inspect.newactivity.CheckPersonActivity1;
import com.hy.powerplatform.business_inspect.presenter.CheckPersonPresenter;
import com.hy.powerplatform.business_inspect.presenter.carcodepresenterimpl.CheckPersonPresenterimpl;
import com.hy.powerplatform.business_inspect.view.CheckPersonView;
import com.hy.powerplatform.duban.bean.DBUp;
import com.hy.powerplatform.my_utils.base.BaseActivity;
import com.hy.powerplatform.my_utils.base.Constant;
import com.hy.powerplatform.my_utils.base.OkHttpUtil;
import com.hy.powerplatform.my_utils.myViews.Header;
import com.hy.powerplatform.my_utils.utils.ProgressDialogUtil;
import com.hy.powerplatform.my_utils.utils.time_select.CustomDatePickerDay;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import okhttp3.Request;
import okhttp3.Response;

import static com.hy.powerplatform.my_utils.base.Constant.TAG_FIVE;
import static com.hy.powerplatform.my_utils.base.Constant.TAG_SIX;

public class DBUpActivity extends BaseActivity implements CheckPersonView {

    @BindView(R.id.header)
    Header header;
    @BindView(R.id.spinnerType)
    Spinner spinnerType;
    @BindView(R.id.etRW)
    EditText etRW;
    @BindView(R.id.tvJHWCSJ)
    TextView tvJHWCSJ;
    @BindView(R.id.etContent)
    EditText etContent;
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
    String userName = "",userCode = "";
    String ZXName = "",ZXCode = "";
    String lxrName = "",lxrCode = "";
    private OkHttpUtil httpUtil;
    List<String> listType = new ArrayList<String>();
    CheckPersonPresenter checkPersonPresenter;
    SharedPreferencesHelper sharedPreferencesHelper;
    private List<Person> morenDatas = new ArrayList<>();
    List<CheckPerson.DataBean> checkList = new ArrayList<>();
    String path_url = Constant.BASE_URL1 + Constant.DBQRBJ;
    private CustomDatePickerDay customDatePicker1, customDatePicker2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ButterKnife.bind(this);
        listType.add("公司任务");
        listType.add("部门任务");
        ArrayAdapter adapterType = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, listType);
        adapterType.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerType.setAdapter(adapterType);

        sharedPreferencesHelper = new SharedPreferencesHelper(this, "login");
        lxrName = sharedPreferencesHelper.getData(DBUpActivity.this, "roleName", "");
        lxrCode = sharedPreferencesHelper.getData(DBUpActivity.this, "userCode", "");
        tvLXR.setText(lxrName);
        initDatePicker();

        httpUtil = OkHttpUtil.getInstance(this);
        checkPersonPresenter = new CheckPersonPresenterimpl(this, this);
        checkPersonPresenter.getCheckPersonPresenterData();
        sharedPreferencesHelper = new SharedPreferencesHelper(this, "login");
    }

    @Override
    protected int provideContentViewId() {
        return R.layout.activity_dbup;
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
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        Calendar c = Calendar.getInstance();
        //过去七天
        c.setTime(new Date());
        c.add(Calendar.DATE, +1);
        Date d = c.getTime();
        String day = format.format(d);
        tvJHWCSJ.setText(day);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd", Locale.CHINA);
        String now = sdf.format(new Date());
        tvFBSJ.setText(now.split(" ")[0]);

        customDatePicker1 = new CustomDatePickerDay(this, new CustomDatePickerDay.ResultHandler() {
            @Override
            public void handle(String time) { // 回调接口，获得选中的时间
                tvJHWCSJ.setText(time.split(" ")[0]);
            }
        }, "2000-01-01 00:00", "2030-01-01 00:00"); // 初始化日期格式请用：yyyy-MM-dd HH:mm，否则不能正常运行
        customDatePicker1.showSpecificTime(false); // 不显示时和分
        customDatePicker1.setIsLoop(false); // 不允许循环滚动

        customDatePicker2 = new CustomDatePickerDay(this, new CustomDatePickerDay.ResultHandler() {
            @Override
            public void handle(String time) { // 回调接口，获得选中的时间
                tvFBSJ.setText(time.split(" ")[0]);
            }
        }, "2000-01-01 00:00", "2030-01-01 00:00"); // 初始化日期格式请用：yyyy-MM-dd HH:mm，否则不能正常运行
        customDatePicker2.showSpecificTime(false); // 显示时和分
        customDatePicker2.setIsLoop(false); // 允许循环滚动
    }

    @Override
    public void getCheckPersonViewData(CheckPerson checkPerson) {
        for (int i = 0; i < checkPerson.getData().size(); i++) {
            checkList.add(checkPerson.getData().get(i));
        }
        for (int k = 0; k < checkList.size(); k++) {
            if (checkList.get(k).getFullname().equals("王少云") || checkList.get(k).getFullname().equals("唐根六")
                    || checkList.get(k).getFullname().equals("晏慧锋")) {
                Person person = new Person();
                person.setUserCode(checkList.get(k).getProfileId());
                person.setUserName(checkList.get(k).getFullname());
                morenDatas.add(person);
            }
        }
        String roleName1 = sharedPreferencesHelper.getData(this, "roleName", "");
        String userCode1 = sharedPreferencesHelper.getData(this, "userCode", "");
        Person person = new Person();
        person.setUserCode(userCode1);
        person.setUserName(roleName1);
        morenDatas.add(person);
        if (morenDatas.size() != 0) {
            for (int i = 0; i < morenDatas.size(); i++) {
                if (i != morenDatas.size() - 1) {
                    userName = userName + morenDatas.get(i).getUserName() + ",";
                    userCode = userCode + morenDatas.get(i).getUserCode() + ",";
                } else {
                    userName = userName + morenDatas.get(i).getUserName();
                    userCode = userCode + morenDatas.get(i).getUserCode();
                }
            }
        }
        tvDBR.setText(userName);
    }

    @OnClick({R.id.tvJHWCSJ, R.id.tvDBR, R.id.tvZXR, R.id.tvFBSJ, R.id.btn})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.tvJHWCSJ:
                customDatePicker1.show(tvJHWCSJ.getText().toString());
                break;
            case R.id.tvDBR:
                Intent intent = new Intent(this,CheckPersonActivity.class);
                startActivityForResult(intent, TAG_FIVE);
                break;
            case R.id.tvZXR:
                Intent intent1 = new Intent(this,CheckPersonActivity1.class);
                startActivityForResult(intent1, TAG_SIX);
                break;
            case R.id.tvFBSJ:
                customDatePicker1.show(tvFBSJ.getText().toString());
                break;
            case R.id.btn:
                if (etRW.getText().toString().equals("")){
                    Toast.makeText(this, "督办任务不能为空", Toast.LENGTH_SHORT).show();
                    break;
                }
                if (etContent.getText().toString().equals("")){
                    Toast.makeText(this, "督办内容不能为空", Toast.LENGTH_SHORT).show();
                    break;
                }
                if (tvDBR.getText().toString().equals("")){
                    Toast.makeText(this, "督办任务不能为空", Toast.LENGTH_SHORT).show();
                    break;
                }
                if (tvZXR.getText().toString().equals("")){
                    Toast.makeText(this, "执行人不能为空", Toast.LENGTH_SHORT).show();
                    break;
                }
                if (tvLXR.getText().toString().equals("")){
                    Toast.makeText(this, "联系人不能为空", Toast.LENGTH_SHORT).show();
                    break;
                }
                HashMap<String, String> map = new HashMap();
                map.put("taskType", spinnerType.getSelectedItem().toString().trim());
                map.put("taskName", etRW.getText().toString().trim());
                map.put("planFinishTime", tvJHWCSJ.toString());
                map.put("taskContext", etContent.getText().toString().trim());
                map.put("supervisorIds", userCode);
                map.put("supervisorNames", userName);
                map.put("operatorIds", ZXCode);
                map.put("operatorNames", ZXName);
                map.put("contactsName", lxrName);
                map.put("contactsId", lxrCode);
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
//                Log.i("main", "response:" + response.body().string());
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

    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        switch (requestCode) {
            case Constant.TAG_FIVE:
                if (resultCode == Constant.TAG_SIX) {
                    userName = data.getStringExtra("name");
                    userCode = data.getStringExtra("userCode");
                    tvDBR.setText(userName);
                    Log.e("userName",userName);
                }
                break;
            case Constant.TAG_SIX:
                if (resultCode == Constant.TAG_SEVEN) {
                    ZXName = data.getStringExtra("name");
                    ZXCode = data.getStringExtra("userCode");
                    tvZXR.setText(ZXName);
                    Log.e("ZXName",ZXName);
                }
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
                    Toast.makeText(DBUpActivity.this, error, Toast.LENGTH_SHORT).show();
                    break;
                case Constant.TAG_TWO:
                    Bundle b1 = msg.getData();
                    String data = b1.getString("data");
                    Gson gsonF = new Gson();
                    DBUp bean = gsonF.fromJson(data, DBUp.class);
                    if (bean.isSuccess()){
                        Toast.makeText(DBUpActivity.this, "确认编辑成功", Toast.LENGTH_SHORT).show();
                    }
                    ProgressDialogUtil.stopLoad();
                    break;
            }
        }
    };
}
