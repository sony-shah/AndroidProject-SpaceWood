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

public class login extends AppCompatActivity {
    private EditText ed1,ed2;
    private TextView tv33;
    private Button b1,b2;
    private int counter=5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        getSupportActionBar().setTitle("Login");
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        ed1=(EditText)findViewById(R.id.editText1);
        ed2=(EditText)findViewById(R.id.editText2);
        //tv33=(TextView) findViewById(R.id.textView33);
        b1=(Button) findViewById(R.id.button1);
        b2=(Button)findViewById(R.id.button2);

        //tv33.setText("No of attempts remaining:5");

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                validate(ed1.getText().toString(),ed2.getText().toString());

            }
        });

    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == android.R.id.home){
            this.finish();
        }
        return super.onOptionsItemSelected(item);
    }
    public void regis(View view) {

        Intent i = new Intent(this, register.class);
        startActivity(i);
    }

    private void validate(String userEmail, String userPassword) {
        if ((userEmail.equals("gateshivam3@gmail.com")) && (userPassword.equals("12345678"))) {
            Intent home = new Intent(this, home.class);
            startActivity(home);
            Toast.makeText(login.this, "Successfully Login", Toast.LENGTH_SHORT).show();
        }
        else {
            //counter--;
            //tv33.setText("No of attempt remaining:" +String.valueOf(counter));

                Toast.makeText(this, "Some error occured", Toast.LENGTH_SHORT).show();
            }



    }


    /*public boolean validate(){
        boolean result=false;
        if(TextUtils.isEmpty(ed1.getText().toString()) || !Patterns.EMAIL_ADDRESS.matcher(ed1.getText().toString()).matches()){
            ed1.setError("Enter valid Email Id");
            result=false;
        }
        else{
            ed1.setError(null);
            result=true;
        }
        if(TextUtils.isEmpty(ed2.getText().toString())||(ed2.getText().toString().length()<8 && (ed2.getText().toString().length()>10))){
            ed2.setError("Password Must be 8 to 10 Characters");
            result=false;
        }
        else{
            ed2.setError(null);
            result=true;
        }
        return result;
  }*/

}
