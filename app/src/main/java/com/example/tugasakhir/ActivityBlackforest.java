package com.example.tugasakhir;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ActivityBlackforest extends AppCompatActivity {
    Button btnbtlBF, btnbeliBF;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_blackforest);

        btnbeliBF = findViewById(R.id.beliBlacforest);
        btnbtlBF = findViewById(R.id.batalBlackforest);

        btnbeliBF.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), ActivityDetailPemesanan.class);
                startActivity(i);
            }
        });

        btnbtlBF.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), ActivityHome.class);
                startActivity(i);
            }
        });
    }
}
// source code ini di gunakan untuk membeli menu blackforest dan cancel untuk kembali ke ActivityHome

