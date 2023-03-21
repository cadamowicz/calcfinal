package com.example.calcfinal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Main_Tela2 extends AppCompatActivity {
    EditText pg2result;

    Button exibir;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela2);
        pg2result = (findViewById(R.id.pg2result));
        exibir=(findViewById(R.id.exibir));

        exibir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = getIntent();


                String resultado = intent.getStringExtra("resultado");

                pg2result.setText(String.valueOf(resultado));

            }
        });




    }
}