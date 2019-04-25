package com.hy.powerplatform;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.hy.powerplatform.my_utils.myViews.FixGridLayout;

import butterknife.BindView;
import butterknife.ButterKnife;

public class TestActivity extends AppCompatActivity {

    Context context;
    @BindView(R.id.llEMaintain)
    LinearLayout llEMaintain;
    @BindView(R.id.tvEMaintain)
    TextView tvEMaintain;
    @BindView(R.id.llCarVideo)
    LinearLayout llCarVideo;
    @BindView(R.id.tvCarVideo)
    TextView tvCarVideo;
    @BindView(R.id.llDorm)
    LinearLayout llDorm;
    @BindView(R.id.tvDorm)
    TextView tvDorm;
    @BindView(R.id.llNewGC)
    LinearLayout llNewGC;
    @BindView(R.id.tvNewGC)
    TextView tvNewGC;
    @BindView(R.id.llGCCheck)
    LinearLayout llGCCheck;
    @BindView(R.id.tvGCCheck)
    TextView tvGCCheck;
    @BindView(R.id.llCompliain)
    LinearLayout llCompliain;
    @BindView(R.id.tvCompliain)
    TextView tvCompliain;
    @BindView(R.id.llJZGC)
    LinearLayout llJZGC;
    @BindView(R.id.tvJZGC)
    TextView tvJZGC;
    @BindView(R.id.llInstall)
    LinearLayout llInstall;
    @BindView(R.id.tvInstall)
    TextView tvInstall;
    @BindView(R.id.imageView9)
    ImageView imageView9;
    @BindView(R.id.llReceiveDinner)
    LinearLayout llReceiveDinner;
    @BindView(R.id.tvReceiveDinner)
    TextView tvReceiveDinner;
    @BindView(R.id.llContractSign)
    LinearLayout llContractSign;
    @BindView(R.id.tvContractSign)
    TextView tvContractSign;
    @BindView(R.id.ll)
    FixGridLayout ll;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);
        ButterKnife.bind(this);
        context = this;
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
//        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }
}
