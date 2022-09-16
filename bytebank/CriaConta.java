package bytebank;

public class CriaConta {
    public static void main(String[] args) {
        Conta primeiraConta = new Conta();
        primeiraConta.saldo = 200;
        System.out.println("\nPrimeira Conta\n" +
                "Saldo: "+primeiraConta.saldo);

        primeiraConta.saldo += 100;
        System.out.println("\nPrimeira Conta\n" +
                "Saldo Atual: "+primeiraConta.saldo);

        Conta segundaConta = primeiraConta;
        segundaConta.saldo = 50;

        System.out.println("\nPrimeira Conta tem o saldo de R$: " + primeiraConta.saldo);
        System.out.println("Segunda conta tem o saldo de R$: "+ segundaConta.saldo);

        System.out.println(primeiraConta.agencia);
        System.out.println(primeiraConta.numero);

        System.out.println(segundaConta.agencia);
        System.out.println(segundaConta.numero);
        segundaConta.agencia = 146;
        System.out.println("agora a segunda conta esta na agencia " + segundaConta.agencia);
    }
}
