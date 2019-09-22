package com.example.menghitungsegitiga;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

   private TextView txtDataK;
    private TextView txtDataL;
   private EditText alas;
   private EditText tinggi;
   private Button btnShow;
    private Button btnPersegi;
    private Button btnLingkaran;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtDataK = (TextView) findViewById(R.id.txtHasilKeliling);
        txtDataL = (TextView) findViewById(R.id.txtHasilLuas);
        btnShow = (Button) findViewById(R.id.show);
        btnPersegi = (Button) findViewById(R.id.showpersegi);
        btnLingkaran = (Button) findViewById(R.id.showlingkaran);
        alas = (EditText) findViewById(R.id.alas);
        tinggi = (EditText) findViewById(R.id.tinggi);


    btnShow.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            String Alas, Tinggi;

            Alas = alas.getText().toString();
            Tinggi = tinggi.getText().toString();

            double a;
            a = Double.parseDouble(Alas);
            double t;
            t = Double.parseDouble(Tinggi);

            double luas;
            luas = a * t / 2;

            double c = Math.sqrt( Math.pow(a,2) + Math.pow(t,2) );

            double keliling = a+t+c;
            txtDataK.setText("Hasil Luas = " +luas);
            txtDataL.setText("Hasil Keliling = " +keliling);

        }
    });

    btnPersegi.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            String Alas, Tinggi;

            Alas = alas.getText().toString();
            Tinggi = tinggi.getText().toString();

            double a;
            a = Double.parseDouble(Alas);
            double t;
            t = Double.parseDouble(Tinggi);

            double luas;
            luas = a * t ;

            double keliling = 2 * (a+t);

            txtDataL.setText("Hasil Luas = " +luas);
            txtDataK.setText("Hasil Keliling = " +keliling);

        }
    });

    btnLingkaran.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {

            String Alas;

            Alas = alas.getText().toString();


            double a;
            a = Double.parseDouble(Alas);
            double a1 = a/2;


            double luas;
            luas = ((a1 * a1) * 22/7 );

            double keliling = 3.14 * a;

            txtDataL.setText("Hasil Luas = " +luas);
            txtDataK.setText("Hasil Keliling = " +keliling);
        }
    });

    }
}
