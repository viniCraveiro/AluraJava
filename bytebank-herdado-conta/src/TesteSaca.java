public class TesteSaca {
    public static void main(String[] args) {
        Conta contaCorrente = new ContaCorrente();
        contaCorrente.deposita(200);
        try {
            contaCorrente.saca(300);
        } catch (SaldoInsuficienteException exception) {
            System.out.println("Exception: "+exception.getMessage());
        }
        System.out.println(contaCorrente.getSaldo());
    }
}
