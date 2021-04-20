
package com.example.sonyshah.spacewood;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.Patterns;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class OrderDetails extends AppCompatActivity {
    EditText ed21,ed22,ed23,ed26,ed27,ed28;
    Button bt10;
    TextView tv22;
    TextView tv23;
    TextView tv24;
    TextView tv25;
    TextView tv26;
    TextView tv27;
    TextView tv28;
    TextView tv29;
    String totalprice,result1,re1;
    String p,tot;int p1,r3,r4,result;
    double tot1;
    Editable r2;
    String add,email;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order_details);

        getSupportActionBar().setTitle("Order Details");
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        tv29=(TextView)findViewById(R.id.textView29);
        tv28=(TextView)findViewById(R.id.textView28);
        ed22=(EditText) findViewById(R.id.editText22);
        ed21=(EditText) findViewById(R.id.editText21);
        tv26=(TextView)findViewById(R.id.textView26);
        ed26=(EditText) findViewById(R.id.editText26);
        ed27=(EditText)findViewById(R.id.editText27);
        ed28=(EditText) findViewById(R.id.editText28);
        ed23=(EditText)findViewById(R.id.editText23);
        bt10=(Button)findViewById(R.id.button10);

        tv26.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(ed26.getText().toString().length()==0){
                    ed26.setText("0");
                }
                if(ed27.getText().toString().length()==0){
                    ed27.setText("0");
                }

                int quantity=Integer.parseInt(ed26.getText().toString());
                Double price=Double.parseDouble(ed27.getText().toString());
                Double total=quantity*price;
                tv28.setText(Double.toString(total));
                tv29.setText(String.valueOf("Your Total Amount:" +total));

            }
        });
        /*ed26.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                r2=ed26.getText();
                r3=Integer.parseInt(String.valueOf(r2));
                result=r3*r4;
                result1=Integer.toString(result);
                tv28.setText(result1);
                tv28.setTextSize(22);
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        //add();*/




    }
    /*public void rate(int txt) {
        String text1 = Integer.toString(txt);
        ed27.setText(text1);
        ed27.setTextSize(20);
        r4 = Integer.parseInt(text1);}*/

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == android.R.id.home) {
            this.finish();
        }
        return super.onOptionsItemSelected(item);


    }
    public void paybill(View view) {
        if (validate()) {
            Intent log = new Intent(this, Payment.class);
            Toast.makeText(OrderDetails.this, "You have successful Confirm Order", Toast.LENGTH_SHORT).show();
            startActivity(log);
        } else {
            Toast.makeText(OrderDetails.this, "Some error occured", Toast.LENGTH_SHORT).show();
        }

    }
    public boolean validate() {
        boolean result1 = false;

        if (TextUtils.isEmpty(ed22.getText().toString())) {
            ed22.setError("Enter your Name");
            result1 = false;
        } else {
            ed22.setError(null);
            result1 = true;
        }
        if (TextUtils.isEmpty(ed23.getText().toString()) || !Patterns.PHONE.matcher(ed23.getText().toString()).matches()) {
            ed23.setError("Enter a valid number");
            result1 = false;
        } else {
            ed23.setError(null);
            result1 = true;
        }
        if (TextUtils.isEmpty(ed28.getText().toString())) {
            ed28.setError("Enter your Address");
            result1 = false;
        } else {
            ed28.setError(null);
            result1 = true;
        }
        if (TextUtils.isEmpty(ed21.getText().toString()) ) {
            ed21.setError("Enter a valid PinCode");
            result1 = false;
        } else {
            ed21.setError(null);
            result1 = true;
        }
        if (TextUtils.isEmpty(ed26.getText().toString()) ) {
            ed26.setError("quantity of product");
            result1 = false;
        } else {
            ed26.setError(null);
            result1 = true;
        }
        if (TextUtils.isEmpty(ed27.getText().toString())) {
            ed27.setError("Enter the Price must compulsory");

        } else {
            ed27.setError(null);
            result1 = true;

        }
        return result1;


    }


}
