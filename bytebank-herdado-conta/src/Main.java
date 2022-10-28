public class Main {
    public static void main(String[] args) throws SaldoInsuficienteException {
        Conta cc = new ContaCorrente(111, 111);
        cc.deposita(100);

        ContaPoupanca cp = new ContaPoupanca(222, 222);
        cp.deposita(200);

        cc.transfere(10, cp);
        CalculadorImposto calculadorImposto = new CalculadorImposto();
        System.out.println("\nCC: "+cc.getSaldo());
        System.out.println("CP: "+cp.getSaldo());



    }

}