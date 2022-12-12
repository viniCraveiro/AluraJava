package main;

import model.CalculadorImposto;
import model.ContaCorrente;
import model.SeguroDeVida;

public class TesteTributavel {
    public static void main(String[] args) {
        ContaCorrente contaCorrente = new ContaCorrente(2222, 2222);
        contaCorrente.deposita(500);
        System.out.println(contaCorrente.getValorImposto());
        contaCorrente.deposita(1000);
        System.out.println(contaCorrente.getValorImposto());

        SeguroDeVida seguroDeVida = new SeguroDeVida();

        CalculadorImposto calculadorImposto = new CalculadorImposto();
        calculadorImposto.registra(contaCorrente);
        calculadorImposto.registra(seguroDeVida);

        System.out.println(calculadorImposto.getTotalImposto());
    }
}
