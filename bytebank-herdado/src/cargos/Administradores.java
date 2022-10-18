package cargos;

public class Administradores extends Funcionario implements Autenticavel {

    private Autenticacao autenticacao;

    public Administradores(){
        this.autenticacao = new Autenticacao();
    }
    @Override
    public boolean autentica(int senha) {
        boolean autentica = this.autenticacao.autentica(senha);
        return autentica;
    }

    @Override
    public void setSenha(int senha) {
        this.autenticacao.setSenha(senha);
    }

    @Override
    public double getBonificacao() {
        return 50;
    }
}
