package com.hy.powerplatform.my_utils.utils;

import android.content.Context;
import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;

import com.hy.powerplatform.R;
import com.hy.powerplatform.my_utils.base.AlertDialogCallBack;
import com.hy.powerplatform.my_utils.base.ItemCallBack;
import com.hy.powerplatform.my_utils.base.ItemMoreCallBack;
import com.hy.powerplatform.oa_flow.bean.Name;

import java.util.ArrayList;
import java.util.List;

public class AlertDialogUtil {
    private Context context;
    AlertDialog dialog;

    public AlertDialogUtil(Context context) {
        this.context = context;
    }

    public void showDialog(String description, final AlertDialogCallBack alertDialogCallBack) {
        if (dialog == null || !dialog.isShowing()) {
            dialog = new AlertDialog.Builder(context).create();
            dialog.setCancelable(false);
            dialog.setCanceledOnTouchOutside(false);
            dialog.show();
            LayoutInflater inflater = LayoutInflater.from(context);
            View view = inflater.inflate(R.layout.dialog_with_title, null, false);
            TextView tv_content = (TextView) view.findViewById(R.id.content);
            TextView tv_yes = (TextView) view.findViewById(R.id.yes);
            TextView tv_no = (TextView) view.findViewById(R.id.no);
            tv_content.setText(description);
            tv_no.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    dialog.dismiss();
                    alertDialogCallBack.cancel();
                }
            });

            tv_yes.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    dialog.dismiss();
                    alertDialogCallBack.confirm();
                }
            });
            dialog.getWindow().setContentView(view);
        }
    }

//    public void showProgressBarDialog( final AlertDialogProgressBarCallBack alertDialogCallBack) {
//        if (dialog == null || !dialog.isShowing()) {
//            dialog = new AlertDialog.Builder(context).create();
//            dialog.setCancelable(false);
//            dialog.setCanceledOnTouchOutside(true);
//            dialog.show();
//            LayoutInflater inflater = LayoutInflater.from(context);
//            View view = inflater.inflate(R.layout.diolag_with_progressbar, null, false);
//            HorizontalProgressBarWithNumber progressBar = (HorizontalProgressBarWithNumber) view.findViewById(R.id.progressBar);
//            TextView tv_size = (TextView) view.findViewById(R.id.size);
//            TextView tv_speed = (TextView) view.findViewById(R.id.speed);
//            Button btn_start = (Button) view.findViewById(R.id.start);
//            Button btn_stop = (Button) view.findViewById(R.id.stop);
//            Button btn_cancel = (Button) view.findViewById(R.id.cancel);
//            btn_start.setOnClickListener(new View.OnClickListener() {
//                @Override
//                public void onClick(View v) {
//                    alertDialogCallBack.onStart();
//                }
//            });
//
//            btn_stop.setOnClickListener(new View.OnClickListener() {
//                @Override
//                public void onClick(View v) {
//                    alertDialogCallBack.onStop();
//                }
//            });
//            btn_cancel.setOnClickListener(new View.OnClickListener() {
//                @Override
//                public void onClick(View v) {
//                    dialog.dismiss();
//                    alertDialogCallBack.onCancle();
//                }
//            });
//            dialog.getWindow().setContentView(view);
//        }
//    }

    public void showSmallDialog(String description) {
        if (dialog == null || !dialog.isShowing()) {
            dialog = new AlertDialog.Builder(context).create();
            dialog.setCancelable(false);
            dialog.setCanceledOnTouchOutside(false);
            dialog.show();
            LayoutInflater inflater = LayoutInflater.from(context);
            View view = inflater.inflate(R.layout.dialog_with_one_title, null, false);
            TextView tv_content = (TextView) view.findViewById(R.id.content);
            TextView tv_yes = (TextView) view.findViewById(R.id.yes);
            tv_content.setText(description);
            tv_yes.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    dialog.dismiss();
                }
            });
            dialog.getWindow().setContentView(view);
        }
    }

    public void showPictureSmallDialog(String description, final AlertDialogCallBack alertDialogCallBack) {
        if (dialog == null || !dialog.isShowing()) {
            dialog = new AlertDialog.Builder(context).create();
            dialog.setCancelable(false);
            dialog.setCanceledOnTouchOutside(false);
            dialog.show();
            LayoutInflater inflater = LayoutInflater.from(context);
            View view = inflater.inflate(R.layout.dialog_with_one_title, null, false);
            TextView tv_content = (TextView) view.findViewById(R.id.content);
            TextView tv_yes = (TextView) view.findViewById(R.id.yes);
            tv_content.setText(description);
            tv_yes.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    dialog.dismiss();
                    alertDialogCallBack.confirm();
                }
            });
            dialog.getWindow().setContentView(view);
        }
    }

    /**
     * alert列表（单选）
     */
    public void showPictureOnlyDialog(List<String> namelist, final ItemCallBack itemCallBack) {
        int checkedItem = 0; //默认选中的item
        final AlertDialog.Builder builder = new AlertDialog.Builder(context);
        AlertDialog dialog = builder.create();
        String[] array = new String[namelist.size()];
        for (int i = 0; i < namelist.size(); i++) {
            array[i] = (String) namelist.get(i);
        }
        //单选
        builder.setSingleChoiceItems(array, checkedItem, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                itemCallBack.ItemPosition(which);
                dialog.dismiss();
            }
        });
        dialog.show();
    }

    /**
     * alert列表（多选）
     */
    public void showPictureMoreDialog(final List<Name.DataBean> namelist, final boolean[] checkedItems,
                                      final ItemMoreCallBack itemCallBack) {
        final AlertDialog.Builder builder = new AlertDialog.Builder(context);
        final String[] array = new String[namelist.size()];
        for (int i = 0; i < namelist.size(); i++) {
            array[i] = namelist.get(i).getActivityName();
        }
        //多选
        builder.setMultiChoiceItems(array, checkedItems, new DialogInterface.OnMultiChoiceClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which, boolean isChecked) {
                checkedItems[which] = isChecked;
            }
        });
        builder.setPositiveButton("确定", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                List<Name.DataBean> dataList = new ArrayList<Name.DataBean>();
                for (int i = 0; i < namelist.size(); i++) {
                    if (checkedItems[i]) {
                        dataList.add(namelist.get(i));
                    }
                }
                itemCallBack.ItemPosition(dataList);
                dialog .dismiss();
            }
        });
        builder.show();
    }

}
