package com.example.bloodbankminor2;

import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class register extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        Spinner dropdown=findViewById(R.id.spinner);
        String[] items=new String[]{"Select","A+","A-","B+","B-","AB+","AB-","O+","O-"};
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, items);

        dropdown.setAdapter(adapter);
    }
    public void health(View view)
    {
        Intent intent=new Intent(this, health.class);
        startActivity(intent);
    }
}