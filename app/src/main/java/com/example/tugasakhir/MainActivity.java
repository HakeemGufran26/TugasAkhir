package com.example.tugasakhir;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button btnLogin, btnRegis;
    EditText edemail, edpassword;
    TextView txtlogin;
    String nama, password;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnLogin = findViewById(R.id.btSignin);
        edemail = findViewById(R.id.edEmail);
        edpassword = findViewById(R.id.edPassword);
        btnRegis = findViewById(R.id.Regis);
        txtlogin = findViewById(R.id.Login);

        btnRegis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), Register.class);
                startActivity(i);
            }
        });

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nama = edemail.getText().toString();
                password = edpassword.getText().toString();
                String email = "Hakeem@mail.com";
                String pass = "123";

                if (nama.isEmpty() || password.isEmpty()) {
                    Toast t = Toast.makeText(getApplicationContext(),
                            "Email and Password is empty", Toast.LENGTH_LONG);
                    edemail.setError("Email and Password is empty");
                    edpassword.setError("Email and Password is empty");
                    t.show();

                } else {

                    if (nama.equals(email) && password.equals(pass)) {
                        Toast t = Toast.makeText(getApplicationContext(),
                                "Login Success", Toast.LENGTH_LONG);
                        t.show();
                        Bundle b = new Bundle();

                        b.putString("a", nama.trim());

                        b.putString("b", password.trim());

                        Intent i = new Intent(getApplicationContext(), ActivityHome.class);

                        i.putExtras(b);

                        startActivity(i);

                    } else {
                        Toast t = Toast.makeText(getApplicationContext(),
                                "Login Failed", Toast.LENGTH_LONG);
                        edemail.setError("Login Failed");
                        edpassword.setError("Login Failed");
                        t.show();
                    }
                }
            }
        });
    }
}
//souce code ini di gunakan untuk login. jika email dan password benar maka program akan mengarahkan nya ke "ActivityHome"
// dan akan muncul toast "Login Success" dan jika gagal maka program akan stay di "MainActivity" dan mengeluarkan toast "Login Failed"