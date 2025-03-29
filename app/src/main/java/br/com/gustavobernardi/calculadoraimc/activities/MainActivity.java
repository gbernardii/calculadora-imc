package br.com.gustavobernardi.calculadoraimc.activities;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

import br.com.gustavobernardi.calculadoraimc.R;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Referencia o botão "Calcular IMC" do layout
        Button btnCalculadora = findViewById(R.id.btn_calculadora);

        // Configura o listener para navegar até a tela de cálculo ao clicar no botão
        btnCalculadora.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, CalculoIMCActivity.class);
            startActivity(intent);
        });
    }
}