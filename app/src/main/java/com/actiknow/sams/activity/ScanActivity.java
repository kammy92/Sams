package com.actiknow.sams.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import com.actiknow.sams.R;

public class ScanActivity extends AppCompatActivity {
    TextView tvSurvey;


    @Override
    protected void onCreate (Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_scan);
        tvSurvey=(TextView)findViewById(R.id.tvSurveyProduct);

        tvSurvey.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(ScanActivity.this,SurveyActivity.class);
                startActivity(intent);
                overridePendingTransition (R.anim.slide_in_right, R.anim.slide_out_left);
            }
        });


    }
}
