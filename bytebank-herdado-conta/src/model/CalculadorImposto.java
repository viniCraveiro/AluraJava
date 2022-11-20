package model;

//Implementar Calculador de Imposto nas classe
//model.Conta Corrente
//Seguro de vida
//model.AcaoBolsaValores
public class CalculadorImposto {
    private double totalImposto;

    public void registra(Tributacao tributacao) {
        double imposto = tributacao.getValorImposto();
        this.totalImposto += imposto;
    }

    public double getTotalImposto() {
        return totalImposto;
    }
}
