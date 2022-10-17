public class TestaValores {
    public static void main(String[] args) {
        Conta conta = new Conta(1227, 508);
        Conta conta2 = new Conta(1227, 508);
        Conta conta3 = new Conta(1227, 508);
        System.out.println(conta.getAgencia());

        System.out.println(Conta.getTotal());

    }
}
