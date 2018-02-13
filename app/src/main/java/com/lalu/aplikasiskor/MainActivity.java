package com.lalu.aplikasiskor;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText editTextPlayer1, editTextPlayer2;

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editTextPlayer1 = (EditText) findViewById(R.id.editText1);
        editTextPlayer2 = (EditText) findViewById(R.id.editText2);
    }
    public void onNextButtonClicked(View view) {
        Bundle bundle = new Bundle();
        bundle.putString("Player1", editTextPlayer1.getText().toString());
        bundle.putString("Player2", editTextPlayer2.getText().toString());
        Intent intent = new Intent(MainActivity.this, Main2Activity.class);
        intent.putExtras(bundle);
        startActivity(intent);
    }

}
