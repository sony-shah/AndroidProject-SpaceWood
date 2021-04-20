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

//import com.google.firebase.analytics.FirebaseAnalytics;
//import com.google.firebase.auth.FirebaseAuthException;

//import com.google.firebase.auth.FirebaseAuthException;

public class register extends AppCompatActivity {
    EditText ed, ed3, ed4, ed5, ed6, ed7;
    Button bt;
    private TextView tv36;
    //private FirebaseAnalytics mFirebaseAnalytics;
    //private FirebaseAuthException firebaseAuthException;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        getSupportActionBar().setTitle("Registration");
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        setUpUIViews();
        //mFirebaseAnalytics = FirebaseAnalytics.getInstance(this);

        //firebaseAuthException =firebaseAuthException.getInstance();


        tv36.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(register.this,login.class));

            }
        });


    }

    //database

    private void setUpUIViews(){
        ed = (EditText) findViewById(R.id.editText);
        ed3 = (EditText) findViewById(R.id.editText3);
        ed4 = (EditText) findViewById(R.id.editText4);
        ed5 = (EditText) findViewById(R.id.editText5);
        ed6 = (EditText) findViewById(R.id.editText6);
        ed7 = (EditText) findViewById(R.id.editText7);
        bt = (Button) findViewById(R.id.button);
        tv36=(TextView)findViewById(R.id.textView36);

    }
    //back press
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == android.R.id.home) {
            this.finish();
        }
        return super.onOptionsItemSelected(item);
    }

    public void login(View view) {
        if (validate()) {
            //String email=ed.getText().toString().trim();
            //String password=ed6.getText().toString().trim();
            //firebaseAuthException.createUserWithPassword(email,password).addOnCompleteLisener()

            Intent log = new Intent(this, login.class);
            Toast.makeText(register.this, "You have Successfully register", Toast.LENGTH_SHORT).show();
            startActivity(log);

        } else {
            Toast.makeText(register.this, "Some error occured", Toast.LENGTH_SHORT).show();
        }

    }
    private boolean validate() {
        boolean result1 = false;

        /*String email=ed.getText().toString();
        String name=ed3.getText().toString();
        String address=ed4.getText().toString();
        String phone=ed5.getText().toString();
        String password=ed6.getText().toString();
        String Cpassword=ed7.getText().toString();*/

        if (TextUtils.isEmpty(ed.getText().toString()) || !Patterns.EMAIL_ADDRESS.matcher(ed.getText().toString()).matches()) {
            ed.setError("Enter valid Email Id");
            result1 = false;
        } else {
            ed.setError(null);
            result1 = true;
        }
        if (TextUtils.isEmpty(ed3.getText().toString())) {
            ed3.setError("Enter your Name");
            result1 = false;
        } else {
            ed3.setError(null);
            result1 = true;
        }
        if (TextUtils.isEmpty(ed5.getText().toString()) || !Patterns.PHONE.matcher(ed5.getText().toString()).matches()) {
            ed5.setError("Enter a valid number");
            result1 = false;
        } else {
            ed5.setError(null);
            result1 = true;
        }
        if (TextUtils.isEmpty(ed4.getText().toString())) {
            ed4.setError("Enter your Address");
            result1 = false;
        } else {
            ed4.setError(null);
            result1 = true;
        }
        /*if (TextUtils.isEmpty(ed6.getText().toString()) || (ed6.getText().toString().length() < 8 && (ed6.getText().toString().length() > 10))) {
            ed6.setError("Password Must be 8 to 10 Characters");
            result1 = false;
        } else {
            Toast.makeText(register.this, "Password Must be 8 letter", Toast.LENGTH_SHORT).show();
            ed6.setError(null);
            result1 = true;
        }
        if (TextUtils.isEmpty(ed7.getText().toString()) || (ed7.getText().toString()).equals(ed6.getText().toString())) {
            ed7.setError("Password Does not match");
            result1 = false;
        } else {
            ed7.setError(null);
            result1 = true;
        }*/
        return result1;

    }
}
