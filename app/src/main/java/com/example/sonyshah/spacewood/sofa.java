package com.example.sonyshah.spacewood;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.MenuItem;

import java.util.ArrayList;
import java.util.List;

public class sofa extends AppCompatActivity {
    List<furnituresofa> lstfurnituresofa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sofa);
        getSupportActionBar().setTitle("Sofa");
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        lstfurnituresofa=new ArrayList<>();
        lstfurnituresofa.add(new furnituresofa("Furny Lifestyle Three Seater Sectional Sofa (Standard, Grey) Color:Grey","simple ",R.drawable.sofa1));
        lstfurnituresofa.add(new furnituresofa("Furny Brio FHD313 Three Seater Sofa Cum Bed (DarkBlue)","Rs.16,460.00",R.drawable.sofa2));
        lstfurnituresofa.add(new furnituresofa("Aart Store Sofa Cum Bed 1-Seater with 2 Cushion Washable Cover (3x6 ft, Grey)","Rs.5,999.00 view",R.drawable.sofa3));
        lstfurnituresofa.add(new furnituresofa("Freedom Bestway 5 in 1 Infateble Sofa Air Bed Air Pump Free","Rs.2,301.00",R.drawable.sofa4));
        lstfurnituresofa.add(new furnituresofa("Bluday Luxury Sofas Fabric Cum Bed for Living Room (36x73x7-inch)","Rs.6,699.00 ",R.drawable.sofa5));
        lstfurnituresofa.add(new furnituresofa("Shree Decoart Sheesham Wood Two Seater Sofa for Living Room with Storage","Rs.14,989.00 ",R.drawable.sofa6));

        lstfurnituresofa.add(new furnituresofa("Roman Living Hastings 3+1+1 Seater Fabric Sofa Pack (Grey)","Rs.14,298.00 ",R.drawable.sofa7));
        lstfurnituresofa.add(new furnituresofa("Shree Decoart Sheesham Wood 3 Seater Sofa Set for Living Room with Cushion","Rs.17,989.00 ",R.drawable.sofa8));

        RecyclerView myrv =(RecyclerView)findViewById(R.id.recyclerview_id_sofa);
        RecyclerSofaAdapter myAdapter=new RecyclerSofaAdapter(this,lstfurnituresofa);
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
