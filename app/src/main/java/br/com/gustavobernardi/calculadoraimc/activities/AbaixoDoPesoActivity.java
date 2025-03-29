package br.com.gustavobernardi.calculadoraimc.activities;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

import br.com.gustavobernardi.calculadoraimc.R;

public class AbaixoDoPesoActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_abaixo_do_peso);

        // Referencia os elementos do layout
        TextView txtResultado = findViewById(R.id.txt_resultado);
        Button btnVoltar = findViewById(R.id.btn_voltar);
        Button btnFechar = findViewById(R.id.btn_fechar);

        // Recupera os dados passados pela CalculoIMCActivity
        double peso = getIntent().getDoubleExtra("peso", 0);
        double altura = getIntent().getDoubleExtra("altura", 0);
        double imc = getIntent().getDoubleExtra("imc", 0);

        // Formata e exibe o resultado do cálculo
        String resultado = String.format("Peso: %.2f kg\nAltura: %.2f m\nIMC: %.2f\nClassificação: Abaixo do Peso", peso, altura, imc);
        txtResultado.setText(resultado);

        // Configura o listener para voltar à tela de cálculo
        btnVoltar.setOnClickListener(v -> {
            Intent intent = new Intent(AbaixoDoPesoActivity.this, CalculoIMCActivity.class);
            startActivity(intent);
            finish();
        });

        // Configura o listener para fechar a Activity
        btnFechar.setOnClickListener(v -> finish());
    }
}