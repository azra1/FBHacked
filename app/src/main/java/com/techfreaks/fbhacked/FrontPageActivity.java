package com.techfreaks.fbhacked;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.Timer;
import java.util.TimerTask;


public class FrontPageActivity extends AppCompatActivity {
    Timer t;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_front_page);
        t=new Timer();
        t.schedule(new TimerTask() {
            @Override
            public void run() {
                startActivity(new Intent(FrontPageActivity.this, UserNameActivity.class));
                finish();

            }
        }, 2000);


    }

}
