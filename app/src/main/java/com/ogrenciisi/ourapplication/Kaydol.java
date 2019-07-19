package com.ogrenciisi.ourapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.InputType;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Kaydol extends AppCompatActivity {


    private EditText eposta;
    private EditText adsoyad;
    private EditText kaydolsifre;
    private Button kaydol;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kaydol);


        eposta = findViewById(R.id.txtMail);
        adsoyad = findViewById(R.id.txtAdSoyad);
        kaydol= findViewById(R.id.btnMainKaydol);
        kaydolsifre = findViewById(R.id.txtKaydolSifre);
        kaydolsifre.setHint("Password"); kaydolsifre.setInputType(InputType.TYPE_CLASS_TEXT | InputType.TYPE_TEXT_VARIATION_PASSWORD);

        kaydol.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
//Ardından Intent methodunu kullanarak nereden nereye gideceğini söylüyoruz.
                Intent intent = new Intent(Kaydol.this, AnaSayfa.class);
                startActivity(intent);            }

        });





    }
}
