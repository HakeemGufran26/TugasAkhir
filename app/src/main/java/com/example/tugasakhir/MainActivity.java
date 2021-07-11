package com.example.tugasakhir;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast; //fungsi import untuk memanggil activity, menambah fungsi, membaca data string/int, menampilkan data dan masih banyak lagi

public class MainActivity extends AppCompatActivity {
    Button btnLogin, btnRegis;
    EditText edemail, edpassword; //mendeklarasikan variable yang akan di gunakan
    TextView txtlogin;
    String nama, password; //untuk menyimpan email dan password


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnLogin = findViewById(R.id.btSignin);
        edemail = findViewById(R.id.edEmail);
        edpassword = findViewById(R.id.edPassword);
        btnRegis = findViewById(R.id.Regis); //menghubungkan dengan button, edit text dan text view yang di gunakan pada layout
        txtlogin = findViewById(R.id.Login);

        btnRegis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), Register.class); //untke memindah layout saat di klik pada button regis
                startActivity(i);
            }
        });

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nama = edemail.getText().toString();
                password = edpassword.getText().toString(); // untuk mengeset email dan pass saat login
                String email = "Hakeem@mail.com";
                String pass = "123";

                if (nama.isEmpty() || password.isEmpty()) { //memastikan nama dan password tidak boleh kososng
                    Toast t = Toast.makeText(getApplicationContext(),
                            "Email and Password is empty", Toast.LENGTH_LONG); //memunculkan error saat email dan password kosong
                    edemail.setError("Email and Password is empty");
                    edpassword.setError("Email and Password is empty");
                    t.show();

                } else {

                    if (nama.equals(email) && password.equals(pass)) {
                        Toast t = Toast.makeText(getApplicationContext(), //verivikasi email dan password sesuai dengan yang telah di setting
                                "Login Success", Toast.LENGTH_LONG);
                        t.show();
                        Bundle b = new Bundle();

                        b.putString("a", nama.trim());

                        b.putString("b", password.trim());

                        Intent i = new Intent(getApplicationContext(), ActivityHome.class);  //jiks login sukses maka akan berpindah ke ActivityHome

                        i.putExtras(b);

                        startActivity(i);

                    } else {
                        Toast t = Toast.makeText(getApplicationContext(), //memunculkan error gagal saat verivikasi login tidak sesuai
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
