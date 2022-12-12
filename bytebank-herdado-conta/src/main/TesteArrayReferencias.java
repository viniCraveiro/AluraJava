package main;

import model.Cliente;
import model.Conta;
import model.ContaCorrente;
import model.ContaPoupanca;

public class TesteArrayReferencias {
    public static void main(String[] args) {

        ContaCorrente[] contaCorrente = new ContaCorrente[5];
        Object[] referencias = new Object[5];

        ContaCorrente cc1 = new ContaCorrente(22, 11);
        referencias[0] = cc1;

        ContaPoupanca cc2 = new ContaPoupanca(22, 22);
        referencias[1] = cc2;

        Cliente cliente = new Cliente();
        referencias[2] = cliente;

        System.out.println(referencias[1]);

        ContaPoupanca ref = (ContaPoupanca) referencias[1];
        System.out.println(cc2.getNumero());
        System.out.println(ref.getNumero());
    }
}
