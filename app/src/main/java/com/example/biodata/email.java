package com.example.biodata;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class email extends AppCompatActivity {

    EditText etTo, etSubject, etMessage;
    Button btSend;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_email);

        etTo = findViewById(R.id.et_to);
        etSubject = findViewById(R.id.et_subject);
        etMessage = findViewById(R.id.et_message);
        btSend = findViewById(R.id.bt_send);

        btSend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(Intent.ACTION_VIEW, Uri.parse("mailto:" + etTo.getText().toString()));
                intent1.putExtra(Intent.EXTRA_SUBJECT,etSubject.getText().toString());
                intent1.putExtra(Intent.EXTRA_TEXT,etMessage.getText().toString());
                startActivity(intent1);
            }
        });
    }
}