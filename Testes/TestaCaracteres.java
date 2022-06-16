package Testes;

public class TestaCaracteres {
    public static void main(String[] args) {
        System.out.println("Testando condicionais");
        int idade = 20;
        int quantidadePessoas = 3;
        if (idade >= 18) {
            System.out.println("Você tem mais de 18 anos");
            System.out.println("Sejam bem vindo");
            } else if (quantidadePessoas >= 2){
                System.out.println ("Você não tem 18, mas pode entrar" +
                        " pois esta acompanhado");
                } else {
            System.out.println("Infelizmente você nao pode entrar,");

        }

    }

}
