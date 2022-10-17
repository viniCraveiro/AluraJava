package Cargos;

public class Gerente extends Funcionario implements Autenticacao {
    private int senha;

    @Override
    public boolean autentica(int senha) {
        if (this.senha == senha) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public void setSenha(int senha) {
        this.senha = senha;
    }

    public double getBonificacao() {
        System.out.println("\nChamando o metodo de bonificacao do Cargos.Gerente");
        return super.getSalario();
    }
}
