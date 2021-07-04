package com.example.tugasakhir;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

// source code ini di gunakan untuk menampilakan menu
public class ActivityHome extends AppCompatActivity {
    Button btnBlackforest, btnPandan, btnCaramel, btnBundle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        btnBlackforest = findViewById(R.id.buyblackforrest);
        btnPandan = findViewById(R.id.buypandan);
        btnCaramel = findViewById(R.id.buycaramelM);
        btnBundle = findViewById(R.id.buybp);

        btnBlackforest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), ActivityBlackforest.class);
                startActivity(i);
            }
        });
        //code ini di gunakan untuk mengarahkan ke activity atau tampilan detail dari menu Blackforest

        btnPandan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), ActivityPandan.class);
                startActivity(i);
            }
        });
        //code ini di gunakan untuk mengarahkan ke activity atau tampilan detail dari menu Pandan


        btnCaramel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), ActivityCaramel.class);
                startActivity(i);
            }
        });
        //code ini di gunakan untuk mengarahkan ke activity atau tampilan detail dari menu Caramel


        btnBundle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), ActivityBundle.class);
                startActivity(i);
            }
        });
        //code ini di gunakan untuk mengarahkan ke activity atau tampilan detail dari menu Bundle
    }
}