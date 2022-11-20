package model;

import common.Exception.SaldoInsuficienteException;

public class ContaCorrente extends Conta implements Tributacao {
    private CalculadorImposto calculadorImposto;

    public ContaCorrente() {
        this.calculadorImposto = new CalculadorImposto();
    }

    @Override
    public double getValorImposto() {
        return super.saldo * 0.01;
    }

    public ContaCorrente(int agencia, int numero) {
        super(agencia, numero);
    }

    @Override
    public void saca(double valor) throws SaldoInsuficienteException {
        double valorSacar = valor + 0.2;
        super.saca(valorSacar);
    }

    @Override
    public void deposita(double valor) {
        super.saldo += valor;
        System.out.println("Seu saldo é de: " + this.saldo);
    }
}
