package com.example.calculadora3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.renderscript.Sampler;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public class MainActivity extends AppCompatActivity {
    String operador = new String();
    double resultado = 0;
    TextView concatenarTexto;
    int cont = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView numero = findViewById(R.id.num1);
        Button btnCero = findViewById(R.id.buttonCero);
        Button btnUno = findViewById(R.id.buttonUno);
        Button btnDos = findViewById(R.id.buttonDos);
        Button btnTres = findViewById(R.id.buttonTres);
        Button btnCuatro = findViewById(R.id.buttonCuatro);
        Button btnCinco = findViewById(R.id.buttonCinco);
        Button btnSeis = findViewById(R.id.buttonSeis);
        Button btnSiete = findViewById(R.id.buttonSiete);
        Button btnOcho = findViewById(R.id.buttonOcho);
        Button btnNueve = findViewById(R.id.buttonNueve);
        Button btnMas = findViewById(R.id.buttonMas);
        Button btnMenos = findViewById(R.id.buttonMenos);
        Button btnMultiplicar = findViewById(R.id.buttonMultiplicar);
        Button btnDividir = findViewById(R.id.buttonDividir);
        Button btnIgual = findViewById(R.id.buttonIgual);
        Button btnClear = findViewById(R.id.buttonClear);
        Button btnDecimal = findViewById(R.id.buttonDecimal);
        Button btnNegativo = findViewById(R.id.Negativo);

        btnCero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                concatenarTexto = findViewById(R.id.num1);
                numero.setText(concatenarTexto.getText().toString() + "0");
            }
        });
        btnUno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                concatenarTexto = findViewById(R.id.num1);
                numero.setText(concatenarTexto.getText().toString() + "1");
            }
        });
        btnDos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                concatenarTexto = findViewById(R.id.num1);
                numero.setText(concatenarTexto.getText().toString() + "2");
            }
        });
        btnTres.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                concatenarTexto = findViewById(R.id.num1);
                numero.setText(concatenarTexto.getText().toString() + "3");
            }
        });
        btnCuatro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                concatenarTexto = findViewById(R.id.num1);
                numero.setText(concatenarTexto.getText().toString() + "4");
            }
        });
        btnCinco.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                concatenarTexto = findViewById(R.id.num1);
                numero.setText(concatenarTexto.getText().toString() + "5");
            }
        });
        btnSeis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                concatenarTexto = findViewById(R.id.num1);
                numero.setText(concatenarTexto.getText().toString() + "6");
            }
        });
        btnSiete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                concatenarTexto = findViewById(R.id.num1);
                numero.setText(concatenarTexto.getText().toString() + "7");
            }
        });
        btnOcho.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                concatenarTexto = findViewById(R.id.num1);
                numero.setText(concatenarTexto.getText().toString() + "8");
            }
        });
        btnNueve.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                concatenarTexto = findViewById(R.id.num1);
                numero.setText(concatenarTexto.getText().toString() + "9");
            }
        });
        btnDecimal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                concatenarTexto = findViewById(R.id.num1);
                if (numero.getText().length() == 0){
                    numero.setText("0");
                }
                numero.setText(concatenarTexto.getText().toString() + ".");
            }
        });
        btnMas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                concatenarTexto = findViewById(R.id.num1);
                if (concatenarTexto.getText().length() == 0){
                    numero.setText("0");
                }
                operador = "+";
                numero.setText(concatenarTexto.getText().toString() + operador);
            }
        });
        btnMenos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                concatenarTexto = findViewById(R.id.num1);
                if (concatenarTexto.getText().length() == 0){
                    numero.setText("0");
                }
                operador = "-";
                numero.setText(concatenarTexto.getText().toString() + operador);
            }
        });
        btnMultiplicar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                concatenarTexto = findViewById(R.id.num1);
                if (concatenarTexto.getText().length() == 0){
                    numero.setText("0");
                }
                operador = "*";
                numero.setText(concatenarTexto.getText().toString() + operador);
            }
        });
        btnDividir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                concatenarTexto = findViewById(R.id.num1);
                if (concatenarTexto.getText().length() == 0){
                    numero.setText("0");
                }
                operador = "/";
                numero.setText(concatenarTexto.getText().toString() + operador);
            }
        });
        btnIgual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                concatenarTexto = findViewById(R.id.num1);
                //String[] oprs = {"+","-","*","/"};
                String[] op = concatenarTexto.getText().toString().split("\\+");
                for(int i = 0; i < op.length; i++){
                    resultado += Double.parseDouble((op[i]));
                }
                numero.setText(String.valueOf(resultado));
            }
        });
        btnClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numero.setText("");
            }
        });
    }
}