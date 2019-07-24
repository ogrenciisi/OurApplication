package com.ogrenciisi.ourapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.InputType;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import android.view.View.OnClickListener;

public class MainActivity extends AppCompatActivity {


    private EditText kullaniciadi;
    private EditText sifre;
    private Button login;
    private Button MainKaydol,btnDeneme;

    String url = " ";




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        kullaniciadi = findViewById(R.id.txtAd);
        sifre = findViewById(R.id.txtSifre);
        login = findViewById(R.id.btnLogin);
        btnDeneme =findViewById(R.id.btnDeneme);
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

        btnDeneme.setOnClickListener(new OnClickListener(){
            @Override
            public void onClick(View v) {

          }

        });

    }



}
