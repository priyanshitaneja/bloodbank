package com.example.bloodbankminor2;


import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
public class health extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_health);
        Spinner dropdown=findViewById(R.id.spinner2);
        String[] items=new String[]{"Select","Heart","Digestive","Respiratory","Bones","Brain","ENT","Hair","Skin"};
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, items);

        dropdown.setAdapter(adapter);
    }
    public void user(View view)
    {
        Intent intent=new Intent(this,User.class);
        startActivity(intent);
    }
}

