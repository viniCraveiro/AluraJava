package Cargos;

public class Administradores extends Funcionario implements Autenticacao {
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

    @Override
    public double getBonificacao() {
        return 50;
    }
}
