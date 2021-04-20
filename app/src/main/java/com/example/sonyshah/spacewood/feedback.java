package com.example.sonyshah.spacewood;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Patterns;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class feedback extends AppCompatActivity {
    EditText et8, et11, et12, et13;
    Button btn3;
    TextView t1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feedback);

        getSupportActionBar().setTitle("Feedback");
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        et8 = (EditText) findViewById(R.id.editText8);
        et11 = (EditText) findViewById(R.id.editText11);
        et12 = (EditText) findViewById(R.id.editText12);
        et13 = (EditText) findViewById(R.id.editText13);
        btn3 = (Button) findViewById(R.id.button3);

        t1 = (TextView) findViewById(R.id.textView3);

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == android.R.id.home) {
            this.finish();
        }
        return super.onOptionsItemSelected(item);


    }

    public void sub(View view) {
        if (validate()) {
            Intent subm = new Intent(this, login.class);
            startActivity(subm);
            Toast.makeText(feedback.this, "thank you for valuable feedback", Toast.LENGTH_SHORT).show();

        } else {
            Toast.makeText(feedback.this, "This field id required", Toast.LENGTH_SHORT).show();
        }
    }

    public boolean validate() {
        boolean result = false;
        if (TextUtils.isEmpty(et8.getText().toString())) {
            et8.setError("Enter the Name");
            result = false;

        } else {
            et8.setError(null);
            result = true;
        }
        if (TextUtils.isEmpty(et11.getText().toString()) || !Patterns.PHONE.matcher(et11.getText().toString()).matches()) {
            et11.setError("Enter a valid number");

        } else {
            et11.setError(null);
            result = true;
        }
        if (TextUtils.isEmpty(et12.getText().toString())) {
            et12.setError("Enter Must Subject");
        } else {
            et12.setError(null);
            result = true;
        }


        if (TextUtils.isEmpty(et13.getText().toString())) {
            et13.setError("Enter must your Message");

        } else {
            t1.setEnabled(true);
            String s = "Thank you for your valuable Feedback";
            t1.setText(s);
            t1.setTextSize(20);
        }
        return result;


    }

}
