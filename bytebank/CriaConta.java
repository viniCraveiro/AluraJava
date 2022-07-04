package bytebank;

public class CriaConta {
    public static void main(String[] args) {
        Conta primeiraConta = new Conta();
        primeiraConta.saldo = 200;
        System.out.println("Primeira Conta");
        System.out.println(primeiraConta.saldo);

        primeiraConta.saldo += 100;
        System.out.println(primeiraConta.saldo);

        Conta segundaConta = new Conta();
        segundaConta.saldo = 50;
        System.out.println("Segunda Conta");
        System.out.println(segundaConta.saldo);


        System.out.println("Primeira Conta tem o saldo de R$: " + primeiraConta.saldo);
        System.out.println("Segunda conta tem o saldo de R$: "+ segundaConta.saldo);

        System.out.println(primeiraConta.agencia);
        System.out.println(primeiraConta.numero);

        System.out.println(segundaConta.agencia);
        System.out.println(segundaConta.numero);
        segundaConta.agencia = 146;
        System.out.println("agora a segunda conta esta na agencia " + segundaConta.agencia);
    }
}
