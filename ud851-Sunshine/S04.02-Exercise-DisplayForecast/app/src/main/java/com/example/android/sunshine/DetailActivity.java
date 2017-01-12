package com.example.android.sunshine;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import org.w3c.dom.Text;

public class DetailActivity extends AppCompatActivity {

    private static final String FORECAST_SHARE_HASHTAG = " #SunshineApp";
    private TextView mWeatherData;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        mWeatherData = (TextView)findViewById(R.id.weatherData);

        // TODO (2) Display the weather forecast that was passed from MainActivity
        Intent activitiForThisScreen = getIntent();

        if(activitiForThisScreen !=null){
            if(activitiForThisScreen.hasExtra(Intent.EXTRA_TEXT)){
                mWeatherData.setText(activitiForThisScreen.getStringExtra(Intent.EXTRA_TEXT));
            }
        }
    }
}