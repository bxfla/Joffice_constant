package com.hy.powerplatform.login.fragment;

import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.hy.powerplatform.R;
import com.hy.powerplatform.SharedPreferencesHelper;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by Administrator on 2019/9/25.
 */

public class Fragment02 extends Fragment {
    View view;
    @BindView(R.id.tvmyName)
    TextView tvmyName;
    @BindView(R.id.myinform)
    LinearLayout myinform;
    @BindView(R.id.tvMyStatus)
    TextView tvMyStatus;
    @BindView(R.id.studyArchives)
    LinearLayout studyArchives;
    @BindView(R.id.btnQuit)
    Button btnQuit;

    SharedPreferencesHelper sharedPreferencesHelper;
    @BindView(R.id.tvVersion)
    TextView tvVersion;

    String versionName;
    int versionCode;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment02, container, false);
        ButterKnife.bind(this, view);
        sharedPreferencesHelper = new SharedPreferencesHelper(getActivity(), "login");
        String name = sharedPreferencesHelper.getData(getActivity(), "userName", "");
        String status = sharedPreferencesHelper.getData(getActivity(), "depName", "");
        tvmyName.setText(name);
        tvMyStatus.setText(status);
        PackageManager pm = getActivity().getPackageManager();
        PackageInfo pi = null;
        try {
            pi = pm.getPackageInfo(getActivity().getPackageName(), 0);
            versionName = pi.versionName;
            versionCode = pi.versionCode;
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
        }
        tvVersion.setText(versionName);
        return view;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
    }
}
