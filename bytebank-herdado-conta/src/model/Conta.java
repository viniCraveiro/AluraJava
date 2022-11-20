package model;

import common.Exception.AgenciaInvalidaException;
import common.Exception.NumeroContaInvalidoException;
import common.Exception.SaldoInsuficienteException;

public abstract class Conta {

    protected double saldo;
    private int agencia;
    private int numero;
    private Cliente titular;
    private static int total = 0;

    protected Conta() {

    }

    /**
     * Construtor para inicializar o objeto Conta, precisa passar agencia e numero da conta como parametro.
     * @param agencia  da conta
     * @param numero da conta
     */

    protected Conta(int agencia, int numero) {
        Conta.total++;
        this.agencia = agencia;
        this.numero = numero;
    }

    public abstract void deposita(double valor);

    public void saca(double valor) throws SaldoInsuficienteException {
        if (this.saldo < valor) {
            throw new SaldoInsuficienteException("Saldo " + this.saldo + ", Valor: " + valor);
        }
        this.saldo -= valor;
    }

    public void transfere(double valor, Conta destino) throws SaldoInsuficienteException {
        this.saca(valor);
        destino.deposita(valor);
    }

    public double getSaldo() {
        return this.saldo;
    }

    public int getNumero() {
        return this.numero;
    }

    public void setNumero(int numero) throws NumeroContaInvalidoException{
        if (numero <= 0) {
            throw new NumeroContaInvalidoException("O numero da Conta não pode ser menor ou igual a 0");
        }
        this.numero = numero;
    }

    public int getAgencia() {
        return this.agencia;
    }

    public void setAgencia(int agencia) throws AgenciaInvalidaException {
        if (agencia <= 0) {
            throw new AgenciaInvalidaException("O numero da Agencia nao pode ser menor ou igual a 0");
        }
        this.agencia = agencia;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    public Cliente getTitular() {
        return this.titular;
    }

    public static int getTotal() {
        return Conta.total;
    }

}