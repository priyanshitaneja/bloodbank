package com.example.bloodbankminor2;


import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class userchoice extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_userchoice);
    }
    public void changeactivity1(View view)
    {
        Intent intent=new Intent(this,Register.class);
        startActivity(intent);
    }
    public void changeactivity2(View view)
    {
        Intent intent=new Intent(this,bankinfo.class);
        startActivity(intent);
    }
}