package com.example.tugasakhir;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ActivityBundle extends AppCompatActivity {
    Button btnbtlBundle, btnbeliBundle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bundle);

        btnbeliBundle = findViewById(R.id.beliBundle);
        btnbtlBundle= findViewById(R.id.batalBundle);

        btnbeliBundle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), ActivityDetailPemesanan.class);
                startActivity(i);
            }
        });

        btnbtlBundle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), ActivityHome.class);
                startActivity(i);
            }
        });
    }
}
// source code ini di gunakan untuk membeli menu Bundle dan cancel untuk kembali ke ActivityHome
