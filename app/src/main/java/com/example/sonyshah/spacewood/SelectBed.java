package com.example.sonyshah.spacewood;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class SelectBed extends AppCompatActivity {

    private TextView furnitureTitle, furnituredesc;
    private ImageView img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_bed);
        getSupportActionBar().setTitle("Bed");
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        furnitureTitle=(TextView)findViewById(R.id.txtitlebed);
        furnituredesc=(TextView)findViewById(R.id.txtdescbed);
        //furnitureprice=(TextView)findViewById(R.id.txtprice);
        img=(ImageView)findViewById(R.id.selectimagebed);

        //receive data
        Intent intent=getIntent();
        String Title=intent.getExtras().getString("Title");
        String  Description=intent.getExtras().getString("Description");
        int image=intent.getExtras().getInt("Imagedesc");


        //setting value
        furnitureTitle.setText(Title);
        furnituredesc.setText(Description);
        img.setImageResource(image);


    }

    //back button
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == android.R.id.home) {
            this.finish();
        }
        return super.onOptionsItemSelected(item);

    }
    public void buy(View view) {

        Intent buy = new Intent(this, OrderDetails.class);
        startActivity(buy);
    }
}
