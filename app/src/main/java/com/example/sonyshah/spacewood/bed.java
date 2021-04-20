package com.example.sonyshah.spacewood;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.MenuItem;

import java.util.ArrayList;
import java.util.List;

public class bed extends AppCompatActivity {
    List<furniturebed> lstfurniturebed;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bed);
        getSupportActionBar().setTitle("Bed");
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        lstfurniturebed=new ArrayList<>();
        lstfurniturebed.add(new furniturebed("Spacewood Joy Queen Size Bed (Woodpore Finish, Natural Wenge)","Rs.8,899.00 ",R.drawable.bed1));
        lstfurniturebed.add(new furniturebed("FurnitureKraft Toronto Metal Queen Size Double Bed with Wooden Leg,Multicolor","Rs.6,999.00",R.drawable.bed2));
        lstfurniturebed.add(new furniturebed("BL Wood Furniture Sheesham Wood Canopy Queen Size Poster Bed for Home","Rs.34,971.00 ",R.drawable.bed3));
        lstfurniturebed.add(new furniturebed("Klassic Single Size Folding Bed | Iron Folding Bed for Household Purpose","Rs.2,199.00 ",R.drawable.bed4));
        lstfurniturebed.add(new furniturebed("NA ENTERPRISESS Single Size Foldable Bed (Black)","Rs.1,749.00  ",R.drawable.bed5));
        lstfurniturebed.add(new furniturebed("SS WOOD Furniture Poster Bed Jodhpur for Home","Rs.42,999.0 ",R.drawable.bed6));
        lstfurniturebed.add(new furniturebed("Furny Wallzone Solid Wood King Size Bed (Teak Polish)","Rs.33,989.0 ",R.drawable.bed7));
        lstfurniturebed.add(new furniturebed("parkash steel Smart Folding Plastic Bed with 5 inch Mattress and Casters Wheels","Rs.6,999.0 ",R.drawable.bed8));


        RecyclerView myrv =(RecyclerView)findViewById(R.id.recyclerview_id_bed);
        RecyclerBedAdapter myAdapter=new RecyclerBedAdapter(this,lstfurniturebed);
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