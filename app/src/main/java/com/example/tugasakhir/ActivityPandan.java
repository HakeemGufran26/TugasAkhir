package com.example.tugasakhir;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ActivityPandan   extends AppCompatActivity {
    Button btnbtlPandan, btnbeliPandan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pandan);

        btnbeliPandan = findViewById(R.id.beliPandan);
        btnbtlPandan= findViewById(R.id.batalPandan);

        btnbeliPandan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), ActivityDetailPemesanan.class);
                startActivity(i);
            }
        });

        btnbtlPandan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), ActivityHome.class);
                startActivity(i);
            }
        });
    }
}
// source code ini di gunakan untuk membeli menu pandan dan cancel untuk kembali ke ActivityHome
