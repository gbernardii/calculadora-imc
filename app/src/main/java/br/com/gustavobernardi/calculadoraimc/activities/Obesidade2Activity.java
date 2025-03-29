package br.com.gustavobernardi.calculadoraimc.activities;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

import br.com.gustavobernardi.calculadoraimc.R;

public class Obesidade2Activity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_obesidade2);

        // Referencia os elementos do layout
        TextView txtResultado = findViewById(R.id.txt_resultado);
        Button btnVoltar = findViewById(R.id.btn_voltar);
        Button btnFechar = findViewById(R.id.btn_fechar);

        // Recupera os dados passados pela CalculoIMCActivity
        double peso = getIntent().getDoubleExtra("peso", 0);
        double altura = getIntent().getDoubleExtra("altura", 0);
        double imc = getIntent().getDoubleExtra("imc", 0);

        // Formata e exibe o resultado do cálculo
        String resultado = String.format("Peso: %.2f kg\nAltura: %.2f m\nIMC: %.2f\nClassificação: Obesidade Grau 2", peso, altura, imc);
        txtResultado.setText(resultado);

        // Configura o listener para voltar à tela de cálculo
        btnVoltar.setOnClickListener(v -> {
            Intent intent = new Intent(Obesidade2Activity.this, CalculoIMCActivity.class);
            startActivity(intent);
            finish();
        });

        // Configura o listener para fechar a Activity
        btnFechar.setOnClickListener(v -> finish());
    }
}