package main;

import model.Cliente;
import model.ContaCorrente;
import model.ContaPoupanca;

public class TesteArrayString {
    public static void main(String[] args) {
        System.out.println("Funcionou");

        for (int i =0; i<args.length; i++){
            System.out.println(args[i]);
        }
    }
}
