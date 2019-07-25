package com.ogrenciisi.ourapplication;
//şuraya bi yorum satırı ekleyelim bakalım nolucak
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.StrictMode;
import android.text.InputType;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import android.view.View.OnClickListener;

public class MainActivity extends AppCompatActivity {


    private EditText kullaniciadi;
    private EditText sifre;
    private Button login;
    private Button MainKaydol;

    String url = " ";




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if (android.os.Build.VERSION.SDK_INT > 9)
        {
            StrictMode.ThreadPolicy policy = new
                    StrictMode.ThreadPolicy.Builder().permitAll().build();
            StrictMode.setThreadPolicy(policy);
        }


        kullaniciadi = findViewById(R.id.txtAd);
        sifre = findViewById(R.id.txtSifre);
        login = findViewById(R.id.btnLogin);

        MainKaydol = findViewById(R.id.btnMaingoster);
        sifre.setHint("Password"); sifre.setInputType(InputType.TYPE_CLASS_TEXT | InputType.TYPE_TEXT_VARIATION_PASSWORD);


        login.setOnClickListener(new OnClickListener(){
            @Override
            public void onClick(View v) {
//Ardından Intent methodunu kullanarak nereden nereye gideceğini söylüyoruz.
                Intent intent = new Intent(MainActivity.this, Home.class);
                startActivity(intent);            }

        });

        MainKaydol.setOnClickListener(new OnClickListener(){
            @Override
            public void onClick(View v) {
//Ardından Intent methodunu kullanarak nereden nereye gideceğini söylüyoruz.
                Intent intent = new Intent(MainActivity.this, Kaydol.class);
                startActivity(intent);            }

        });


    }



}
