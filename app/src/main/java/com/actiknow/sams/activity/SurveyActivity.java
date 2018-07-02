package com.actiknow.sams.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.actiknow.sams.R;
import com.warkiz.widget.IndicatorSeekBar;
import com.warkiz.widget.IndicatorStayLayout;
import com.warkiz.widget.IndicatorType;

import static java.security.AccessController.getContext;

public class SurveyActivity extends AppCompatActivity {
    IndicatorSeekBar seekBar;


    @Override
    protected void onCreate (Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_survey);
        seekBar=(IndicatorSeekBar)findViewById(R.id.seekbar);

        IndicatorSeekBar seekbar = IndicatorSeekBar
                .with(SurveyActivity.this)
                .max(50)
                .min(10)
                .showIndicatorType(IndicatorType.RECTANGLE) //show indicator can not be NONE
                .build();

        new IndicatorStayLayout(SurveyActivity.this).attachTo(seekbar);
    }
}
