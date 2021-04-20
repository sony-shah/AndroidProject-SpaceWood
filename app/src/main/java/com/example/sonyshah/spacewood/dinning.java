package com.example.sonyshah.spacewood;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.MenuItem;

import java.util.ArrayList;
import java.util.List;

public class dinning extends AppCompatActivity {

    List<furnituredinning> lstfurniture;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dinning);
        getSupportActionBar().setTitle("Dinning");
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        lstfurniture=new ArrayList<>();
        lstfurniture.add(new furnituredinning("Woodness Winston Solid Wood Upholstered 4 Seater Dining Table Set","Rs.10,249.00 ",R.drawable.din1));
        lstfurniture.add(new furnituredinning("Evok Eastern Solidwood Six Seater Dining Table Set","Rs.32,990.00",R.drawable.din2));
        lstfurniture.add(new furnituredinning("Nisha Furniture Sheesham Wooden Dining Table Set | Dining Table Set with 6 Chairs ","Rs.32,499.00 ",R.drawable.din7));
        lstfurniture.add(new furnituredinning("home by Nilkamal Relish Two Seater Dinning Table Set (Oak)"," Rs.5,900.00",R.drawable.din4));
        lstfurniture.add(new furnituredinning("Supreme Cherry Dinning Table (Coke Red)(4 Seater)","Rs.5,500.00",R.drawable.din5));
        lstfurniture.add(new furnituredinning("home by Nilkamal Jewel 4 Seater Dining Table Set (Walnut)"," Rs.12,900.00 ",R.drawable.din6));
        lstfurniture.add(new furnituredinning("Shree Varun Enterprises Sheesham Wood Dining Table Set with 4 Chairs for Room | Mahogany"," Rs.18,400.00",R.drawable.din8));
        lstfurniture.add(new furnituredinning("Royaloak Coco Dining Table Set with 4 Chairs (Walnut)"," Rs.16,990.00",R.drawable.din9));


        RecyclerView myrv =(RecyclerView)findViewById(R.id.recyclerview_id_dinning);
        RecyclerDingAdapter myAdapter=new RecyclerDingAdapter(this,lstfurniture);
        myrv.setLayoutManager(new GridLayoutManager(this,2));
        myrv.setAdapter(myAdapter);

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
