package com.example.biodata;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button buttonMap, buttonCall, buttonEmail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonMap = findViewById(R.id.button_map);
        buttonCall = findViewById(R.id.button_call);
        buttonEmail = findViewById(R.id.button_email);

        buttonMap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMap();
            }
        });

        buttonCall.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){

                String nomor = "08123456789";
                Intent intent2 = new Intent(Intent.ACTION_DIAL);
                intent2.setData(Uri.parse("tel: "+nomor));
                startActivity(intent2);
            }
        });

        buttonEmail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openEmail();
            }
        });
    }

    public void openMap() {
        Intent intent = new Intent(this, map.class);
       startActivity(intent);
    }

    public void openEmail() {
        Intent intent3 = new Intent(this, email.class);
        startActivity(intent3);
    }
}