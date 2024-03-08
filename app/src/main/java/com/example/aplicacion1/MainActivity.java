package com.example.aplicacion1;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private EditText valor1;
    private EditText valor2;
    private TextView resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        valor1 = findViewById(R.id.cuadrito1);
        valor2 = findViewById(R.id.cuadrito2);
        resultado = findViewById(R.id.respuesta);
    }

    public void sumar(View view) {
        int suma = Integer.parseInt(valor1.getText().toString()) + Integer.parseInt(valor2.getText().toString());
        resultado.setText(String.valueOf(suma));
    }

    public void resta(View view) {
        int resta = Integer.parseInt(valor1.getText().toString()) - Integer.parseInt(valor2.getText().toString());
        resultado.setText(String.valueOf(resta));
    }

    public void multiplicacion(View view) {
        int multiplicacion = Integer.parseInt(valor1.getText().toString()) * Integer.parseInt(valor2.getText().toString());
        resultado.setText(String.valueOf(multiplicacion));
    }

    public void division(View view) {
        int divisor = Integer.parseInt(valor2.getText().toString());
        if (divisor == 0) {
            resultado.setText("No se puede dividir por cero");
        } else {
            int division = Integer.parseInt(valor1.getText().toString()) / divisor;
            resultado.setText(String.valueOf(division));
        }
    }

    public void calcularFibonacci(View view) {
        try {
            int numero = Integer.parseInt(valor2.getText().toString());
            int a = 0;
            int b = 1;

            if (numero == 0) {
                resultado.setText("0");
            } else if (numero == 1) {
                resultado.setText("1");
            } else {
                for (int i = 2; i <= numero; i++) {
                    int temp = b;
                    b = a + b;
                    a = temp;
                }
                resultado.setText(String.valueOf(b));
            }
        } catch (NumberFormatException e) {
            resultado.setText("Ingrese un número válido en cuadrito1");
        }
    }

    public void calcularFactorial(View view) {
        try {
            int numero = Integer.parseInt(valor2.getText().toString());
            long factorial = 1;

            for (int i = 2; i <= numero; i++) {
                factorial *= i;
            }

            resultado.setText(String.valueOf(factorial));
        } catch (NumberFormatException e) {
            resultado.setText("Ingrese un número válido en cuadrito1");
        }
    }
}
