package com.example.calculadora;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private String numero = "";
    private double num1 = 0;
    private double num2 = 0;
    private String operacion = "";
    private String symbol = "";


    private TextView resultado;
    private Button key_pad0, key_pad1, key_pad2, key_pad3, key_pad4, key_pad5, key_pad6, key_pad7, key_pad8, key_pad9;
    private Button key_padsuma, key_paddivision, key_padmultiplicacion, key_padresta, key_padlimpiar, key_padigual;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        resultado = findViewById(R.id.solucion);

        key_pad0 = findViewById(R.id.num_cero);
        key_pad1 = findViewById(R.id.num_uno);
        key_pad2 = findViewById(R.id.num_dos);
        key_pad3 = findViewById(R.id.num_tres);
        key_pad4 = findViewById(R.id.num_cuatro);
        key_pad5 = findViewById(R.id.num_cinco);
        key_pad6 = findViewById(R.id.num_seis);
        key_pad7 = findViewById(R.id.num_siete);
        key_pad8 = findViewById(R.id.num_ocho);
        key_pad9 = findViewById(R.id.num_nueve);

        key_padsuma = findViewById(R.id.suma);
        key_paddivision = findViewById(R.id.division);
        key_padmultiplicacion = findViewById(R.id.multiplicacion);
        key_padresta = findViewById(R.id.resta);
        key_padlimpiar = findViewById(R.id.limpiar);
        key_padigual = findViewById(R.id.igual);

        key_pad0.setOnClickListener(this);
        key_pad1.setOnClickListener(this);
        key_pad2.setOnClickListener(this);
        key_pad3.setOnClickListener(this);
        key_pad4.setOnClickListener(this);
        key_pad5.setOnClickListener(this);
        key_pad6.setOnClickListener(this);
        key_pad7.setOnClickListener(this);
        key_pad8.setOnClickListener(this);
        key_pad9.setOnClickListener(this);

        key_padsuma.setOnClickListener(this);
        key_paddivision.setOnClickListener(this);
        key_padmultiplicacion.setOnClickListener(this);
        key_padresta.setOnClickListener(this);
        key_padlimpiar.setOnClickListener(this);
        key_padigual.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        switch (v.getId()) {
            case R.id.num_cero:
                numero = numero + "0";
                operacion += "0";
                resultado.setText(operacion);
                break;
            case R.id.num_uno:
                numero = numero + "1";
                operacion += "1";
                resultado.setText(operacion);
                break;
            case R.id.num_dos:
                numero = numero + "2";
                operacion += "2";
                resultado.setText(operacion);
                break;
            case R.id.num_tres:
                numero = numero + "3";
                operacion += "3";
                resultado.setText(operacion);
                break;
            case R.id.num_cuatro:
                numero = numero + "4";
                operacion += "4";
                resultado.setText(operacion);
                break;
            case R.id.num_cinco:
                numero = numero + "5";
                operacion += "5";
                resultado.setText(operacion);
                break;
            case R.id.num_seis:
                numero = numero + "6";
                operacion += "6";
                resultado.setText(operacion);
                break;
            case R.id.num_siete:
                numero = numero + "7";
                operacion += "7";
                resultado.setText(operacion);
                break;
            case R.id.num_ocho:
                numero = numero + "8";
                operacion += "8";
                resultado.setText(operacion);
                break;
            case R.id.num_nueve:
                numero = numero + "9";
                operacion += "9";
                resultado.setText(operacion);
                break;
            case R.id.suma:
                symbol = "+";
                operacion +="+";
                num1 = Integer.parseInt(numero);
                numero = "";
                resultado.setText(operacion);
                break;
            case R.id.division:
                symbol = "/";
                operacion +="/";
                num1 = Integer.parseInt(numero);
                numero = "";
                resultado.setText(operacion);
                break;
            case R.id.multiplicacion:
                symbol = "*";
                operacion +="*";
                num1 = Integer.parseInt(numero);
                numero = "";
                resultado.setText(operacion);
                break;
            case R.id.resta:
                symbol = "-";
                operacion +="-";
                num1 = Integer.parseInt(numero);
                numero = "";
                resultado.setText(operacion);
                break;

            case R.id.limpiar:
                symbol = "";
                numero = "";
                num1 = 0;
                num2 = 0;
                operacion = "";
                resultado.setText("");
                break;

            case R.id.igual:
                num2 = Integer.parseInt(numero);

                switch (symbol) {
                    case "+":
                        resultado.setText(" " + (num1 + num2));
                        break;
                    case "/":
                        resultado.setText(" " + (num1 / num2));
                        break;
                    case "*":
                        resultado.setText(" " + (num1 * num2));
                        break;
                    case "-":
                        resultado.setText(" " + (num1 - num2));
                        break;
                }

                numero = "";
                num1 = 0;
                num2 = 0;

        }
    }
}
