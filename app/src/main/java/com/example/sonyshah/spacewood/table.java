package com.example.sonyshah.spacewood;

import android.provider.MediaStore;
import android.support.design.widget.TabLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.MenuItem;

import java.util.ArrayList;
import java.util.List;

public class table extends AppCompatActivity {

    List<furnituretable>lstfurnituretable;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_table);

        getSupportActionBar().setTitle("Tables");
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        lstfurnituretable=new ArrayList<>();
        lstfurnituretable.add(new furnituretable("Ebee Wooden Stool Coffee Table (Beige)","RS.945",R.drawable.table1));
        lstfurnituretable.add(new furnituretable("Children Study Table Mate Without Cup","RS.745",R.drawable.table2));
        lstfurnituretable.add(new furnituretable("Cello Proline Four Seater Dining Table (Marble Beige)","RS.2379",R.drawable.table3));
        lstfurnituretable.add(new furnituretable("Spacecrafts Folding Study Chair with Writing pad ","RS.1850",R.drawable.table4));
        lstfurnituretable.add(new furnituretable("Handpainted Wooden Stool Cum Side Table","RS. 849",R.drawable.table8));
        lstfurnituretable.add(new furnituretable("Night Stand for Small Space, Side Table,Console Table","RS.2,399",R.drawable.table5));
        lstfurnituretable.add(new furnituretable("Home Wooden Stool Coffee Table (Beige) | Dinning Table ","RS. 12,849",R.drawable.tablenew));
        lstfurnituretable.add(new furnituretable("Desk Wooden Stool Cum Side Table | Office desk","RS. 10,499",R.drawable.table9));



        RecyclerView myrv =(RecyclerView)findViewById(R.id.recyclerview_id);
        RecyclerViewAdapter myAdapter=new RecyclerViewAdapter(this,lstfurnituretable);
        myrv.setLayoutManager(new GridLayoutManager(this,2));
        myrv.setAdapter(myAdapter);

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




}