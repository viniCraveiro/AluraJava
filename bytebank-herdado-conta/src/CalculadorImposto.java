//Implementar Calculador de Imposto nas classe
//Conta Corrente
//Seguro de vida
//AcaoBolsaValores
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
