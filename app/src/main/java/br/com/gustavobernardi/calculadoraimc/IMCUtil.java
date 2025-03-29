package br.com.gustavobernardi.calculadoraimc;

import android.content.Context;
import android.content.Intent;

import br.com.gustavobernardi.calculadoraimc.activities.AbaixoDoPesoActivity;
import br.com.gustavobernardi.calculadoraimc.activities.PesoNormalActivity;
import br.com.gustavobernardi.calculadoraimc.activities.SobrepesoActivity;
import br.com.gustavobernardi.calculadoraimc.activities.Obesidade1Activity;
import br.com.gustavobernardi.calculadoraimc.activities.Obesidade2Activity;
import br.com.gustavobernardi.calculadoraimc.activities.Obesidade3Activity;

public class IMCUtil {

    /**
     * Calcula o IMC com base no peso e altura.
     *
     * @param peso   Peso em kg
     * @param altura Altura em metros
     * @return O valor do IMC
     */
    public static double calcularIMC(double peso, double altura) {
        return peso / (altura * altura);
    }

    /**
     * Determina a Activity de feedback com base no valor do IMC e inicia a navegação.
     *
     * @param context Contexto da Activity atual
     * @param peso    Peso em kg
     * @param altura  Altura em metros
     * @param imc     Valor do IMC
     */
    public static void navegarParaFeedback(Context context, double peso, double altura, double imc) {
        Intent intent;
        if (imc < 18.5) {
            intent = new Intent(context, AbaixoDoPesoActivity.class);
        } else if (imc < 25) {
            intent = new Intent(context, PesoNormalActivity.class);
        } else if (imc < 30) {
            intent = new Intent(context, SobrepesoActivity.class);
        } else if (imc < 35) {
            intent = new Intent(context, Obesidade1Activity.class);
        } else if (imc < 40) {
            intent = new Intent(context, Obesidade2Activity.class);
        } else {
            intent = new Intent(context, Obesidade3Activity.class);
        }

        // Passa os dados para a Activity de feedback
        intent.putExtra("peso", peso);
        intent.putExtra("altura", altura);
        intent.putExtra("imc", imc);
        context.startActivity(intent);
    }
}