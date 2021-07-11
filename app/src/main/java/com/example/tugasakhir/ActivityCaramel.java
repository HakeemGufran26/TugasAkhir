package com.example.tugasakhir;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ActivityCaramel  extends AppCompatActivity {
    Button btnbtlCaramel, btnbeliCaramel; //deklarasi variabel

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_caramel);

        btnbeliCaramel = findViewById(R.id.beliCaramel); // menghubungkan variable button pada layout
        btnbtlCaramel= findViewById(R.id.batalCaramel);

        btnbeliCaramel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), ActivityDetailPemesanan.class); // berpindah ke layout detail pemesanan
                startActivity(i);
            }
        });

        btnbtlCaramel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), ActivityHome.class); // berpindah ke layout ActivityHome
                startActivity(i);
            }
        });
    }
}
// source code ini di gunakan untuk membeli menu caramel dan cancel untuk kembali ke ActivityHome
