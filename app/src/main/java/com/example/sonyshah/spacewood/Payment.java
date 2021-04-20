package com.example.sonyshah.spacewood;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class Payment extends AppCompatActivity {

    RadioGroup rg;
    RadioButton r3, rb,cash1;
    TextView tv31,tv35;
    String email,add;
    EditText ed19, ed20, ed24,ed25;
    Button bt9;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment);
        getSupportActionBar().setTitle("Payment");
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        rg=findViewById(R.id.radioGroup);
        r3=findViewById(R.id.radio_three);

        tv31=findViewById(R.id.textView31);
        ed19 = (EditText) findViewById(R.id.editText19);
        ed20 = (EditText) findViewById(R.id.editText20);
        ed24 = (EditText) findViewById(R.id.editText24);
        ed25 = (EditText) findViewById(R.id.editText25);
        tv35 = (TextView) findViewById(R.id.textView35);
        //Button bt9=findViewById(R.id.button9);


        /*r3.setOnClickListener(new View.OnClickListener() {
           @Override
            public void onClick(View v) {
               if(ed19.getText().toString().length()==0){
                   ed19.setEnabled(false);
                   ed20.setEnabled(false);
                   ed24.setEnabled(false);
                   ed25.setEnabled(false);
           }

          }

        });*/

       Button bt9=findViewById(R.id.button9);
       bt9.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {

               tv31.setText("You have successfully transaction and place order by "+rb.getText());

           }

       });
    }
    public void paydone(View view) {
        Toast.makeText(this,"Successfully Place Order",Toast.LENGTH_SHORT).show();
        Intent i = new Intent(this, home.class);
        startActivity(i);}



    /*public void cl1(View view){
        if(TextUtils.isEmpty(ed19.getText().toString())) {
            ed19.setError("Enter your card number");}

        else{
            Intent intent=new Intent(Intent.ACTION_SENDTO);
            intent.setData(Uri.parse("mailto"));
            intent.putExtra(Intent.EXTRA_EMAIL,email);
            intent.putExtra(Intent.EXTRA_TEXT,"Your order has placed successfully");
            if(intent.resolveActivity(getPackageManager())!=null){
                startActivity(intent);
            }
            tv31.setEnabled(true);
            String s="Your order has placed successfully";
            tv31.setText(s);
            tv31.setTextSize(22);}
        }*/


    public void checkButton(View v){
        int radioId=rg.getCheckedRadioButtonId();
        rb=findViewById(radioId);
        Toast.makeText(this,"You have to Pay by "  + rb.getText(),Toast.LENGTH_SHORT).show();
    }
    public void cashbutton(View v){
        ed19.setEnabled(false);
        ed20.setEnabled(false);
        ed24.setEnabled(false);
        ed25.setEnabled(false);
        bt9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv31.setText("You have successfully transaction and place order by "+rb.getText());


            }
        });

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == android.R.id.home) {
            this.finish();
        }
        return super.onOptionsItemSelected(item);


    }
}



