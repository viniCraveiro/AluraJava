package br.com.alura.bytebank;

import br.com.alura.bytebank.model.Funcionario;

import java.time.LocalDate;

public class Principal {

    public static void main(String[] args) {
        System.out.println("Bem vindo ao Bytebank");
        Funcionario jose = new Funcionario();
        jose.setNome("Jose");
        jose.setMatricula(1);
        jose.setDataNascimento(LocalDate.of(1990,2,10));
        System.out.println(jose);

    }
}

