package com.example.bloodbankminor2;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class user extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user);
    }
    public void changeactivity(View view)
    {
        Intent intent=new Intent(this,useroptions.class);
        startActivity(intent);
    }
}
