package com.example.sonyshah.spacewood;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Patterns;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class profile extends AppCompatActivity {
    EditText ed9,ed10,ed11,ed14,ed15,ed16,ed17,ed18;
    TextView tv32;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        getSupportActionBar().setTitle("Profile");
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        ed9=(EditText) findViewById(R.id.editText9);
        ed10=(EditText) findViewById(R.id.editText10);
        ed11=(EditText) findViewById(R.id.editText11);
        ed14=(EditText) findViewById(R.id.editText14);
        ed15=(EditText) findViewById(R.id.editText15);
        ed16=(EditText) findViewById(R.id.editText16);
        ed17=(EditText) findViewById(R.id.editText17);
        ed18=(EditText) findViewById(R.id.editText18);

    }
    //back press
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == android.R.id.home){
            this.finish();
        }
        return super.onOptionsItemSelected(item);
    }

    public void profile(View view){
        if (validate()) {
            Intent pro = new Intent(this, home.class);
            startActivity(pro);
            Toast.makeText(profile.this, "You have Successfully update", Toast.LENGTH_SHORT).show();

        }else {
            Toast.makeText(profile.this, "Some error occured", Toast.LENGTH_SHORT).show();
        }

    }
    public boolean validate() {
        boolean result1 = false;
        if (TextUtils.isEmpty(ed9.getText().toString())) {
            ed9.setError("Enter your Name");
            result1 = false;
        } else {
            ed9.setError(null);
            result1 = true;
        }
        if (TextUtils.isEmpty(ed10.getText().toString()) || !Patterns.EMAIL_ADDRESS.matcher(ed10.getText().toString()).matches()) {
            ed10.setError("Enter valid Email Id");
            result1 = false;
        } else {
            ed10.setError(null);
            result1 = true;
        }
        if (TextUtils.isEmpty(ed15.getText().toString())){
            ed15.setError("Enter your city name");
            result1 = false;
        }  else {
            ed15.setError(null);
            result1 = true;
        }
        if (TextUtils.isEmpty(ed14.getText().toString())) {
            ed14.setError("Enter your Address");
            result1 = false;
        } else {
            ed14.setError(null);
            result1 = true;
        }
        if(TextUtils.isEmpty(ed18.getText().toString()) || !Patterns.PHONE.matcher(ed18.getText().toString()).matches()) {
            ed18.setError("Enter a valid number");
            result1 = false;
        } else{
            ed18.setError(null);
            result1 = true;
        }
        if (TextUtils.isEmpty(ed17.getText().toString()) || (ed17.getText().toString().length() < 6 && (ed17.getText().toString().length() > 7))) {
            ed17.setError("PinCode must be 6 to 7 Number");
            result1 = false;
        } else {
            Toast.makeText(profile.this, "PinCode Must be 7 Number", Toast.LENGTH_SHORT).show();
            ed17.setError(null);
            result1 = true;
        }
        if (TextUtils.isEmpty(ed16.getText().toString())) {
            ed16.setError("Enter your state");
            result1 = false;
        } else {
            ed16.setError(null);
            result1 = true;
        }

        if (TextUtils.isEmpty(ed18.getText().toString())) {
            ed18.setError("Enter a valid number");

        } else {
            tv32.setEnabled(true);
            String s = "You have Successfully Update";
            tv32.setText(s);
            tv32.setTextSize(20);
        }
        return result1;


    }

}
