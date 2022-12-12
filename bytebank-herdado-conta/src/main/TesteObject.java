package main;

import model.Cliente;
import model.ContaCorrente;
import model.ContaPoupanca;

public class TesteObject {
    public static void main(String[] args) {
//        System.out.println("x");
//        System.out.println(3);
//        System.out.println(false);

        Object cc = new ContaCorrente(22,33);
        Object cp = new ContaPoupanca(11, 44);
        Object cliente = new Cliente();

        System.out.println(cc.toString());
        System.out.println(cp.toString());


    }

    static void println() {

    }

    static void println(int a) {

    }

    static void println(boolean bool) {

    }

    static void println(Object referencia) {

    }


}
