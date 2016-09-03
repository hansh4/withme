package com.restart.withme;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class AlarmActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alarm);
    }

    public void onMainButtonClicked(View v){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    public void onSearchButtonClicked(View v){
        Intent intent = new Intent(this, SearchActivity.class);
        startActivity(intent);
    }

    public void onWriteButtonClicked(View v){
        Intent intent = new Intent(this, WriteActivity.class);
        startActivity(intent);
    }

    public void onAlarmButtonClicked(View v){
        Intent intent = new Intent(this, AlarmActivity.class);
        startActivity(intent);
    }

    public void onMypageButtonClicked(View v){
        Intent intent = new Intent(this, MypageActivity.class);
        startActivity(intent);
    }
}
