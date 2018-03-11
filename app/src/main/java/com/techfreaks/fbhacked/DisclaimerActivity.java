package com.techfreaks.fbhacked;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class DisclaimerActivity extends AppCompatActivity {
    RadioButton rAgree, rDontAgree;
    RadioGroup rg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_disclaimer);
        rAgree = findViewById(R.id.Agree);
        rDontAgree = findViewById(R.id.DontAgree);
        rg=findViewById(R.id.radiogroup);
        rg.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch (checkedId)
                {
                    case R.id.Agree:startActivity(new Intent(DisclaimerActivity.this, LastActivity.class));
                                    finish();
                                    break;
                    case R.id.DontAgree:Toast.makeText(getApplicationContext(),"Please check I AGREE for further use of app",Toast.LENGTH_SHORT).show();
                                        break;
                }
            }
        });
    }

}

