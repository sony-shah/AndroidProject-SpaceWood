package com.example.sonyshah.spacewood;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AlertDialog;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ViewFlipper;

public class home extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {
        ViewFlipper v_flipper;
        //for category
        private Button b5;
        private Button b6;
        private Button b7;
        private Button b8;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        //for category button
        b5=(Button)findViewById(R.id.button5);
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent table=new Intent(home.this, table.class);
                startActivity(table);
            }
        });

        b6=(Button)findViewById(R.id.button6);
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent dinning=new Intent(home.this, dinning.class);
                startActivity(dinning);
            }
        });

        b7=(Button)findViewById(R.id.button7);
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent bed=new Intent(home.this, bed.class);
                startActivity(bed);
            }
        });

        b8=(Button)findViewById(R.id.button8);
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent sofa=new Intent(home.this, sofa.class);
                startActivity(sofa);
            }
        });

        //flipper home
        int images[] = {R.drawable.living, R.drawable.reachhall, R.drawable.chair, R.drawable.slide3};
        v_flipper = findViewById(R.id.v_flipper);
        for (int img : images) {
            flipper(img);
        }
    }
    //fipper
    public void flipper(int img){
        ImageView iv=new ImageView(this);
        iv.setBackgroundResource(img);
        v_flipper.addView(iv);
        v_flipper.setFlipInterval(2000);
        v_flipper.setAutoStart(true);
        v_flipper.setInAnimation(this,android.R.anim.slide_in_left);
        v_flipper.setOutAnimation(this,android.R.anim.slide_out_right);

    }


    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.home, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.logout) {
            final AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setMessage("Are you sure to Exit from App?");
            builder.setCancelable(true);
            builder.setPositiveButton("yes", (new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    finish();
                }
            }));
            builder.setNegativeButton("No", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    dialog.cancel();
                }
            });
            AlertDialog alertDialog = builder.create();
            alertDialog.show();
            return true;

        }else if (id == R.id.feedback){
            Intent feed = new Intent(this, feedback.class);
            startActivity(feed);
            return true;

        }else if(id == R.id.action_profile) {
            Intent pro = new Intent(this, profile.class);
            startActivity(pro);
            return true;

        }
            return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_profile) {
            Intent p=new Intent(this,profile.class);
            startActivity(p);


        } else if (id == R.id.nav_home) {
            Intent h=new Intent(this,home.class);
            startActivity(h);

        } else if (id == R.id.nav_login) {
            Intent l = new Intent(this, login.class);
            startActivity(l);
        }else if (id == R.id.nav_table) {
            Intent t = new Intent(this, table.class);
            startActivity(t);
        }else if (id == R.id.nav_dinning) {
            Intent d = new Intent(this, dinning.class);
            startActivity(d);
        }else if (id == R.id.nav_bed) {
            Intent b = new Intent(this, bed.class);
            startActivity(b);
        }else if (id == R.id.nav_sofa) {
            Intent s=new Intent(this,sofa.class);
            startActivity(s);


        }else if (id == R.id.nav_contactus) {
        Intent c=new Intent(this,contactus.class);
        startActivity(c);

        }else if (id == R.id.nav_feedback) {
            Intent f=new Intent(this,feedback.class);
            startActivity(f);

        }else if (id == R.id.nav_about) {

            Intent a=new Intent(this,aboutus.class);
            startActivity(a);

        }else if (id == R.id.nav_logout) {
            Intent lt = new Intent(this, login.class);
            startActivity(lt);
        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
