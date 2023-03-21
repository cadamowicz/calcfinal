package com.example.calcfinal;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    EditText etn1;
    EditText etn2;
    Button bsub;
    Button bsoma;
    Button bmulti;
    Button bdiv;
    TextView etresultado;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etn1 = findViewById(R.id.etn1);
        etn2 = findViewById(R.id.etn2);
        bsoma = findViewById(R.id.bsoma);
        bsub = findViewById(R.id.bsub);
        bmulti = findViewById(R.id.bmulti);
        bdiv = findViewById(R.id.bdiv);
        etresultado = findViewById(R.id.etresultado);


        bsoma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String numero1 = etn1.getText().toString();
                String numero2 = etn2.getText().toString();
                int num1 = Integer.parseInt(numero1);
                int num2 = Integer.parseInt(numero2);
                int somatotal=num1+num2;
                etresultado.setText(String.valueOf(somatotal));

                Intent intent = new Intent(MainActivity.this, Main_Tela2.class);
                intent.putExtra("resultado",etresultado.getText().toString());
                startActivity(intent);

            }
        });
        bsub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String numero1 = etn1.getText().toString();
                String numero2 = etn2.getText().toString();
                int num1 = Integer.parseInt(numero1);
                int num2 = Integer.parseInt(numero2);
                int somatotal=num1-num2;
                etresultado.setText(String.valueOf(somatotal));

                Intent intent = new Intent(MainActivity.this, Main_Tela2.class);
                intent.putExtra("resultado",etresultado.getText().toString());
                startActivity(intent);

            }
        });
        bmulti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String numero1 = etn1.getText().toString();
                String numero2 = etn2.getText().toString();
                int num1 = Integer.parseInt(numero1);
                int num2 = Integer.parseInt(numero2);
                int somatotal=num1*num2;
                etresultado.setText(String.valueOf(somatotal));

                Intent intent = new Intent(MainActivity.this, Main_Tela2.class);
                intent.putExtra("resultado",etresultado.getText().toString());
                startActivity(intent);

            }
        });
        bdiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String numero1 = etn1.getText().toString();
                String numero2 = etn2.getText().toString();
                int num1 = Integer.parseInt(numero1);
                int num2 = Integer.parseInt(numero2);
                int somatotal=num1/num2;
                etresultado.setText(String.valueOf(somatotal));

                Intent intent = new Intent(MainActivity.this, Main_Tela2.class);
                intent.putExtra("resultado",etresultado.getText().toString());
                startActivity(intent);

            }
        });

    }
}
