package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button toplama, cıkartma, carpma, bolme;
    EditText birinci, ikinci;
    TextView sonucText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initialize();
    }

    public void initialize() {
        toplama = findViewById(R.id.toplama);
        cıkartma = findViewById(R.id.cıkartma);
        bolme = findViewById(R.id.bolme);
        carpma = findViewById(R.id.carpma);
        birinci = findViewById(R.id.birinciDeger);
        ikinci = findViewById(R.id.ikinciDeger);
        sonucText = findViewById(R.id.sonuc);
    }

    public void toplamaYap(View view) {
        float sayi1 = Float.parseFloat(birinci.getText().toString());
        float sayi2 = Float.parseFloat(ikinci.getText().toString());
        float sonuc = sayi1 + sayi2;
        sonucText.setText(toplama.getText()+ " " + "işleminin sonucu : " + sonuc);
    }

    public void cıkartmaYap(View view){
        float sayi1 = Float.parseFloat(birinci.getText().toString());
        float sayi2 = Float.parseFloat(ikinci.getText().toString());
        float sonuc = sayi1 - sayi2;
        sonucText.setText(cıkartma.getText()+ " işleminin sonucu : " + sonuc);
    }

    public void carpmaYap(View view){
        float sayi1 = Float.parseFloat(birinci.getText().toString());
        float sayi2 = Float.parseFloat(ikinci.getText().toString());
        float sonuc = sayi1 * sayi2;
        sonucText.setText(carpma.getText()+" işleminin sonucu : " + sonuc);
    }

    public void bolmeYap(View view){
        float sayi1 = Float.parseFloat(birinci.getText().toString());
        float sayi2 = Float.parseFloat(ikinci.getText().toString());
        float sonuc = sayi1 / sayi2;
        sonucText.setText(bolme.getText()+" işleminin sonucu : " + sonuc);
    }
}
