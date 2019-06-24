package com.hy.powerplatform.oa_flow.util;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;

import com.hy.powerplatform.R;
import com.hy.powerplatform.business_inspect.utils.DBHandler;
import com.hy.powerplatform.my_utils.base.BaseRequestBackLisenter;
import com.hy.powerplatform.my_utils.base.Constant;
import com.hy.powerplatform.my_utils.utils.ProgressDialogUtil;

import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by Administrator on 2019/6/24.
 */

public class AlertDialogEditText {
    public void showDialog(final Context context, final String runId, final BaseRequestBackLisenter backLisenter){
        AlertDialog.Builder builder = new AlertDialog.Builder(context);
        builder.setTitle("是否要追回");
        //    通过LayoutInflater来加载一个xml的布局文件作为一个View对象
        View view = LayoutInflater.from(context).inflate(R.layout.dialog_item, null);
        //    设置我们自己定义的布局文件作为弹出框的Content
        builder.setView(view);
        final EditText username = (EditText) view.findViewById(R.id.editText);

        builder.setPositiveButton("确定", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                ProgressDialogUtil.startLoad(context, "提交数据中");
                final String a = username.getText().toString().trim();
                new Thread(new Runnable() {
                    @Override
                    public void run() {
                        String url = Constant.BASE_URL2 + Constant.BACKFLOW + runId+"&reason="+a;
                        DBHandler dbA = new DBHandler();
                        String res = dbA.FlowBack(url);
                        String msg = null;
                        if (res.equals("获取数据失败") || res.equals("")) {
                            backLisenter.fail("提交数据失败");
                        } else {
                            try {
                                JSONObject jsonObject = new JSONObject(res);
                                msg = jsonObject.getString("msg");
                            } catch (JSONException e) {
                                e.printStackTrace();
                            }
                            backLisenter.success(msg);
                        }
                    }
                }).start();
            }
        });
        builder.setNegativeButton("取消", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

            }
        });
        builder.show();
    }
}
