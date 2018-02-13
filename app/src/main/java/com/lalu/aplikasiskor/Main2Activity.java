package com.lalu.aplikasiskor;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {
    int setSkor1, setSkor2 = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        TextView setPlayer1 = (TextView) findViewById(R.id.Player1);
        TextView setPlayer2 = (TextView) findViewById(R.id.Player2);

        /**
         * Kita cek apakah ada Bundle atau tidak
         */
        if(getIntent().getExtras()!=null) {
            Bundle bundle = getIntent().getExtras();
            setPlayer1.setText(bundle.getString("Player1"));
            setPlayer2.setText(bundle.getString("Player2"));
        }
        else {
            setPlayer1.setText(getIntent().getStringExtra("Player1"));
            setPlayer2.setText(getIntent().getStringExtra("Player2"));
        }
    }

    public void displaySkor1(int score) {
        TextView scoreView = (TextView) findViewById(R.id.Skor1);
        scoreView.setText(String.valueOf(score));
    }
    public void displaySkor2(int score) {
        TextView scoreView = (TextView) findViewById(R.id.Skor2);
        scoreView.setText(String.valueOf(score));
    }

    // tombol Tambah
    public void TambahSkor1 (View v) {
        setSkor1 = setSkor1 + 1;
        displaySkor1(setSkor1);
    }
    public void TambahSkor2 (View v) {
        setSkor2 = setSkor2 + 1;
        displaySkor2(setSkor2);
    }

    //tombol Kurangi
    public void KurangiSkor1 (View v) {
        setSkor1 = setSkor1 - 1;
        if(setSkor1 <= 0){
            setSkor1 = 0;
        }
        displaySkor1(setSkor1);
    }
    public void KurangiSkor2 (View v) {
        setSkor2 = setSkor2 - 1;
        if(setSkor2 <= 0){
            setSkor2 = 0;
        }
        displaySkor2(setSkor2);
    }

    // tombol reset
    public void resetSkor1 (View v) {
        setSkor1 = 0;
        displaySkor1(setSkor1);
    }
    public void resetSkor2 (View v) {
        setSkor2 = 0;
        displaySkor2(setSkor2);
    }
}
