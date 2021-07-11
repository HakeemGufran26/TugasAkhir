package com.example.tugasakhir;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ActivityBundle extends AppCompatActivity {
    Button btnbtlBundle, btnbeliBundle; //deklarani variable

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bundle);

        btnbeliBundle = findViewById(R.id.beliBundle); // menghubungkan variable button pada layout
        btnbtlBundle= findViewById(R.id.batalBundle);

        btnbeliBundle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), ActivityDetailPemesanan.class); //perpindah ke layout DetailPemesanan
                startActivity(i);
            }
        });

        btnbtlBundle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), ActivityHome.class); //berpindah ke layout ActivityHome
                startActivity(i);
            }
        });
    }
}
// source code ini di gunakan untuk membeli menu Bundle dan cancel untuk kembali ke ActivityHome
