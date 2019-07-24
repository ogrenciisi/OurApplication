package com.ogrenciisi.ourapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.InputType;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import java.util.HashMap;
import java.util.Map;

public class Kaydol extends AppCompatActivity {

    String url_kaydet = "http://10.1.80.215/sqlquery.php";

    public EditText kullaniciadi;
    public EditText Uname;
    public EditText Usurname;
    public EditText UniAd;
    public  EditText Usifre;
    public Button kaydol;
    RequestQueue requestQueue;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kaydol);


        kullaniciadi = findViewById(R.id.txtKulAd);
        Uname= findViewById(R.id.txtUName);
        Usurname = findViewById(R.id.txtUSurname);
        UniAd= findViewById(R.id.txtUniAd);
        Usifre=findViewById(R.id.txtKaydolSifre);
        kaydol= findViewById(R.id.btnMainKaydol2);
        requestQueue = Volley.newRequestQueue(getApplicationContext());

      kaydol.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {

                StringRequest request = new StringRequest(Request.Method.POST, url_kaydet, new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        Toast.makeText(Kaydol.this, "işlemgercekleşti", Toast.LENGTH_SHORT).show();

                    }
                }, new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {
                       Log.wtf("hata oluştu",error.getLocalizedMessage());
                    }
                }) {

                    @Override
                    protected Map<String, String> getParams() throws AuthFailureError {
                        Map<String,String> parameters  = new HashMap<String, String>();
                        parameters.put("Kullanıcı Adı",kullaniciadi.getText().toString());
                        parameters.put("Ad",Uname.getText().toString());
                        parameters.put("Soyad", Usurname.getText().toString());
                        parameters.put("Üniversite Adı", UniAd.getText().toString());
                        parameters.put("Şifre", Usifre.getText().toString());

                        return parameters;
                    }
                };
                requestQueue.add(request);
            }

      });

    }

}
