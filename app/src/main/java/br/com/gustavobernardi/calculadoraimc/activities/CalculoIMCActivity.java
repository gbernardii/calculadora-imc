package br.com.gustavobernardi.calculadoraimc.activities;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;

import br.com.gustavobernardi.calculadoraimc.IMCUtil;
import br.com.gustavobernardi.calculadoraimc.R;

public class CalculoIMCActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculo_imcactivity);

        // Referencia os elementos do layout
        EditText inputPeso = findViewById(R.id.input_peso);
        EditText inputAltura = findViewById(R.id.input_altura);
        Button btnCalcular = findViewById(R.id.btn_calcular);
        Button btnLimpar = findViewById(R.id.btn_limpar);
        Button btnFechar = findViewById(R.id.btn_fechar);

        // Configura o listener para calcular o IMC e navegar para a tela de feedback
        btnCalcular.setOnClickListener(v -> {
            // Verifica se os campos estão vazios
            if (inputPeso.getText().toString().trim().isEmpty()) {
                inputPeso.setError("Preencha o peso");
                return;
            }
            if (inputAltura.getText().toString().trim().isEmpty()) {
                inputAltura.setError("Preencha a altura");
                return;
            }

            try {
                // Converte os valores de entrada para double
                double peso = Double.parseDouble(inputPeso.getText().toString());
                double altura = Double.parseDouble(inputAltura.getText().toString());

                // Valida se os valores são maiores que zero e não negativos
                if (peso <= 0) {
                    inputPeso.setError("Peso deve ser maior que zero");
                    return;
                }
                if (altura <= 0) {
                    inputAltura.setError("Altura deve ser maior que zero");
                    return;
                }

                // Calcula o IMC usando a classe utilitária
                double imc = IMCUtil.calcularIMC(peso, altura);

                // Navega para a tela de feedback correspondente
                IMCUtil.navegarParaFeedback(this, peso, altura, imc);
            } catch (NumberFormatException e) {
                // Exibe mensagem de erro se os dados inseridos forem inválidos
                inputPeso.setError("Insira valores numéricos válidos");
            }
        });

        // Configura o listener para limpar os campos de entrada
        btnLimpar.setOnClickListener(v -> {
            inputPeso.setText("");
            inputAltura.setText("");
            inputPeso.setError(null); // Remove mensagens de erro
            inputAltura.setError(null);
        });

        // Configura o listener para fechar a Activity
        btnFechar.setOnClickListener(v -> finish());
    }
}