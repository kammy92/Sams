package com.actiknow.sams.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.actiknow.sams.R;

public class MainActivity extends AppCompatActivity {
    TextView tvLocateMe;

    @Override
    protected void onCreate (Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_main);
        tvLocateMe=(TextView)findViewById(R.id.tvLocateMe);
        tvLocateMe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,ScanActivity.class);
                startActivity(intent);
                overridePendingTransition (R.anim.slide_in_right, R.anim.slide_out_left);
            }
        });

    }

}
