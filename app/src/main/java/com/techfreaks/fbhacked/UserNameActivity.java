package com.techfreaks.fbhacked;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class UserNameActivity extends AppCompatActivity {
    Button submitButton;
    EditText editUser, editCountry;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_name);
        submitButton=findViewById(R.id.submitButton);
        editCountry=findViewById(R.id.CountryName);
        editUser=findViewById(R.id.userid);
        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(editUser.getText().toString().length()==0&&editCountry.getText().toString().length()<=0)
                   Toast.makeText(getApplicationContext(),"Please fill the details first",Toast.LENGTH_SHORT).show();
               else if(editCountry.getText().toString().length()>0&&editUser.getText().toString().length()>0) {
                    startActivity(new Intent(UserNameActivity.this, ExtraDetailsActivity.class));
                }



            }
        });
    }
}
