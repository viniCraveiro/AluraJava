package main;

import model.Conta;
import model.ContaCorrente;
import model.GuardaContas;

public class TesteGuardaContas {
    public static void main(String[] args) {
        GuardaContas guardador = new GuardaContas();

        Conta cc = new ContaCorrente(22,11);
        guardador.adiciona(cc);

        Conta cc2 = new ContaCorrente(22,22);
        guardador.adiciona(cc2);

        int tamanho = guardador.getQuantidadeElementos();
        System.out.println(tamanho);

        Conta ref = guardador.getReferencia(1);
        System.out.println(ref.getNumero());

    }
}
