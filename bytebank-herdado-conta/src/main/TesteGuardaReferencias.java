package main;

import model.Conta;
import model.ContaCorrente;
import model.GuardaReferencias;

public class TesteGuardaReferencias {
    public static void main(String[] args) {
        GuardaReferencias guardador = new GuardaReferencias();

        Conta cc = new ContaCorrente(22, 11);
        guardador.adiciona(cc);

        Conta cc2 = new ContaCorrente(22, 22);
        guardador.adiciona(cc2);

        int tamanho = guardador.getQuantidadeElementos();
        System.out.println(tamanho);

        Conta ref = (Conta) guardador.getReferencia(1);
        System.out.println(ref.getNumero());

    }
}
