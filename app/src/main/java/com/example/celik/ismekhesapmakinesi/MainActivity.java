package com.example.celik.ismekhesapmakinesi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button topla;
    Button cikar;
    Button yuzde;
    Button carp;
    Button bol;
    EditText sayi1,sayi2;
    TextView sonuc;
    String sayiAl,sayiAl2;
    int a,b;
    int islem=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        topla = (Button) findViewById(R.id.topla);
        cikar = (Button) findViewById(R.id.cikar);
        yuzde = (Button) findViewById(R.id.yuzde);
        carp = (Button) findViewById(R.id.carp);
        bol = (Button) findViewById(R.id.bol);
        sayi1 = (EditText) findViewById(R.id.sayi1);
        sayi2 = (EditText) findViewById(R.id.sayi2);
        sonuc = (TextView) findViewById(R.id.sonuc);


    }


    public void toplam(View view) {

        sayiAl = sayi1.getText().toString();
        sayiAl2= sayi2.getText().toString();

        a = Integer.parseInt(sayiAl);
        b = Integer.parseInt(sayiAl2);

        islem = a+b;

        sonuc.setText(" " + islem);
    }

    public void cikarma(View view) {


        sayiAl = sayi1.getText().toString();
        sayiAl2= sayi2.getText().toString();

        a = Integer.parseInt(sayiAl);
        b = Integer.parseInt(sayiAl2);

        islem = a-b;

        sonuc.setText(" " + islem);


    }

    public void yuzdeal(View view) {

        sayiAl= sayi1.getText().toString();
        sayiAl2 = sayi2.getText().toString();

        a=Integer.parseInt(sayiAl);
        b= Integer.parseInt(sayiAl2);

        islem = a % b ;

        sonuc.setText(" " + islem);

    }

    public void carpma(View view) {

        sayiAl = sayi1.getText().toString();
        sayiAl2= sayi2.getText().toString();

        a = Integer.parseInt(sayiAl);
        b = Integer.parseInt(sayiAl2);

        islem = a*b;

        sonuc.setText(" " + islem);


    }

    public void bolme(View view) {
        sayiAl = sayi1.getText().toString();
        sayiAl2= sayi2.getText().toString();

        a = Integer.parseInt(sayiAl);
        b = Integer.parseInt(sayiAl2);

        islem = a/b;

        sonuc.setText(" " + islem);
    }
}
