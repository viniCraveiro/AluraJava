package bytebank;

public class TestaMetado {
    public static void main(String[] args) {
       Conta contaTeste = new Conta();
       contaTeste.saldo = 100;
       contaTeste.deposita(50);
        System.out.println(contaTeste.saldo);
    }
}
