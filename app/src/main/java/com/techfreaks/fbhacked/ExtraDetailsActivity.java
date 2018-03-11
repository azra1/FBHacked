package com.techfreaks.fbhacked;

import android.app.DatePickerDialog;
import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Calendar;
import java.util.Random;

public class ExtraDetailsActivity extends AppCompatActivity {
    private EditText Dob;
    private EditText Hometown;
    private EditText Relation;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_extra_details);
        final int randomnumber = new Random().nextInt(101) + 20;
        TextView textrandom =findViewById(R.id.random);
        Dob=findViewById(R.id.dob);
        Hometown=findViewById(R.id.hometown);
        Relation=findViewById(R.id.relation);
        Button submitButton=findViewById(R.id.Submit2);
        textrandom.setText("With given user name and country we have found "+randomnumber+" users. Please give more details for specification.");
        Dob.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Calendar newCalendar = Calendar.getInstance();
                int month = newCalendar.get(Calendar.MONTH);
                int year = newCalendar.get(Calendar.YEAR);
                int currentDay=newCalendar.get(Calendar.DAY_OF_MONTH);
                showDatePicker(ExtraDetailsActivity.this, year, month, currentDay);
            }
        });
        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(Dob.getText().toString().length()<=0||Hometown.getText().toString().length()<=0||Relation.getText().toString().length()<=0)
                {
                    Toast.makeText(getApplicationContext(),"Please fill all the entries",Toast.LENGTH_SHORT).show();
                }
                else
                    startActivity(new Intent(ExtraDetailsActivity.this,ProcessingActivity.class));
            }
        });


    }
    public void showDatePicker(Context context, int initialYear, int initialMonth, int initialDay) {

        DatePickerDialog datePickerDialog = new DatePickerDialog(context,
                new DatePickerDialog.OnDateSetListener() {
                    public void onDateSet(DatePicker datepicker, int year, int month, int day) {
                        Calendar calendar = Calendar.getInstance();
                        calendar.set(year, month, day);
                        Dob.setText(day + "/" + (month + 1) + "/" + year);
                    }
                }, initialYear, initialMonth, initialDay);
        datePickerDialog.setTitle("Select Date");
        datePickerDialog.show();

    }
}
