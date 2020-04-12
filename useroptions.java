package com.example.bloodbankminor2;


import android.app.ActionBar;
import android.app.Activity;
import android.app.FragmentManager;
import android.content.ClipData;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

public class useroptions extends Activity {

    // private static final MenuItem Item = ;
    DrawerLayout mDrawerLayout;
    Toolbar toolbar;
    NavigationView NavigationView;

    FragmentTransaction FragmentTransaction ;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.useroptions);

        toolbar = (toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

       // mToggle = new ActionBarDrawerToggle(this , mDrawerLayout , R.string.Open , R.string.Close);

       // mDrawerLayout.addDrawerListener(mToggle);
       // mToggle.syncState();

        //getActionBar().setDisplayHomeAsUpEnabled(true);

        FragmentTransaction=getSupportFragmentManager().beginTransaction();
        FragmentTransaction.add(R.id.useroptions,new DonateBlood1());
        FragmentTransaction.commit();

        getSupportActionBar().setTitle("Home");

        NavigationView= (android.support.design.widget.NavigationView) findViewById(R.id.NavigationView);
        DrawerLayout= (DrawerLayout) findViewById(R.id.DrawerLayout);








        NavigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {

    @Override

    public Boolean onOptionsItemSelected(@NonNull MenuItem item) {

       // int id = item.getItemId();
        switch (item.getItemId())
        {
            case R.id.nav_donateblood:
                FragmentTransaction=getSupportFragmentManager().beginTransaction();
                FragmentTransaction.replace(R.id.useroptions,new donateblood());
                FragmentTransaction.commit();

                item.setChecked(true);
                DrawerLayout.closeDrawers();

                return true;

            case R.id.nav_needblood:
                FragmentTransaction=getSupportFragmentManager().beginTransaction();
                FragmentTransaction.replace(R.id.useroptions,new needblood());
                FragmentTransaction.commit();

                item.setChecked(true);
                DrawerLayout.closeDrawers();

                return true;

            case R.id.nav_viewrequests:
                FragmentTransaction=getSupportFragmentManager().beginTransaction();
                FragmentTransaction.replace(R.id.useroptions,new viewrequests());
                FragmentTransaction.commit();

                item.setChecked(true);
                DrawerLayout.closeDrawers();

                return true;

            case R.id.nav_Registerothers:
                FragmentTransaction=getSupportFragmentManager().beginTransaction();
                FragmentTransaction.replace(R.id.useroptions,new registerothers());
                FragmentTransaction.commit();

                item.setChecked(true);
                DrawerLayout.closeDrawers();

                return true;

            case R.id.nav_learnmore:
                FragmentTransaction=getSupportFragmentManager().beginTransaction();
                FragmentTransaction.replace(R.id.useroptions,new learnmore());
                FragmentTransaction.commit();

                item.setChecked(true);
                DrawerLayout.closeDrawers();

                return true;

            case R.id.nav_logout:
                FragmentTransaction=getSupportFragmentManager().beginTransaction();
                FragmentTransaction.replace(R.id.useroptions,new logout());
                FragmentTransaction.commit();

                item.setChecked(true);
                DrawerLayout.closeDrawers();

                return true;
        }

        return false;
    }

    }



}

    private void setSupportActionBar(Toolbar toolbar) {
    }

    private FragmentManager getSupportFragmentManager() {
        
        
    }
    }

