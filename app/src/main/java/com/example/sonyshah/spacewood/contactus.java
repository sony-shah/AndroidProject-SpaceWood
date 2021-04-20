package com.example.sonyshah.spacewood;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

public class contactus extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contactus);

        getSupportActionBar().setTitle("Contact Us");
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == android.R.id.home) {
            this.finish();
        }
        return super.onOptionsItemSelected(item);


    }

    public void callsony(View view) {
        Intent cs = new Intent(Intent.ACTION_DIAL);
        cs.setData(Uri.parse("tel: +91 8070850076"));
        startActivity(cs);


    }
    public void callspacewood(View view) {
        Intent co = new Intent(Intent.ACTION_DIAL);
        co.setData(Uri.parse("tel:+91 9702386767"));
        startActivity(co);
    }
}
