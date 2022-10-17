package Cargos;

public class Gerente extends Funcionario {

    public double getBonificacao() {
        System.out.println("\nChamando o metodo de bonificacao do Cargos.Gerente");
        return super.getSalario();
    }
}
