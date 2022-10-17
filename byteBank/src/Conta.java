public class Conta {
    private double saldo;
    private int agencia;
    private int numero;
    private Cliente titular;
    private static int total;

    public Conta(int agencia, int numero){
        Conta.total++;
        System.out.println("O total de contas é "+Conta.total);
        this.agencia = agencia;
        this.numero = numero;
        this.saldo = 100;
        System.out.println("Estou criando uma conta"+this.numero);
    }

    public void deposita(double valor){
        if(valor >0) {
            this.saldo += valor;
        }
    }

    public boolean saca(double valor){
        if(saldo > 0 && this.saldo>= valor) {
            this.saldo -= valor;
            return true;
        }else {
            return false;
        }
    }

    public boolean transfere(double valor, Conta destino){
        if(saca(valor)) {
            destino.deposita(valor);
            return true;
        }else
            return false;
    }

    public double getSaldo() {
        return saldo;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        if (numero <= 0){
            System.out.println("Não pode valor negativo");
            return;
        }
        this.numero = numero;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        if (agencia<=0){
            System.out.println("Não pode valor negativo");
            return;
        }
        this.agencia = agencia;
    }

    public Cliente getTitular() {
        return titular;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    public static int getTotal() {
        return Conta.total;
    }
}
