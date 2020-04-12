package com.example.bloodbankminor2;


import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class needblood extends Activity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.useroptions);

        Button button5= (Button) findViewById(R.id.button5);
        Button button6= (Button) findViewById(R.id.button6);

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                need();
            }
        });

        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                urgentneed();
            }
        });


    }


    public void need() {

        Intent intent=new Intent(this,need.class);
        startActivity(intent);
    }

    public void urgentneed() {
        Intent intent=new Intent(this,urgentneed.class);
        startActivity(intent);

    }





}





