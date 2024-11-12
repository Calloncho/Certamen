package com.example.prueba;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Spinner sexo;
    EditText peso, estatura, resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        peso = findViewById(R.id.txtPeso);
        estatura = findViewById(R.id.txtEstatura);
        resultado = findViewById(R.id.txtIMC);
    }
    public void calcularIMC(View view){
        String Peso = peso.getText().toString();
        String Estatura = estatura.getText().toString();
        Double EstaturaM = Double.parseDouble(Estatura)/100.0;
        Double IMC = Peso / (EstaturaM * EstaturaM);

        if(!Peso.isEmpty() || Estatura.isEmpty()){

        }else{
            Toast.makeText(this, "El campo del peso o la estatura no pueden quedar vacios", Toast.LENGTH_SHORT).show();
        }
    }
}