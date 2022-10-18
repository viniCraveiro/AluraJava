package cargos;

public class Cliente implements Autenticavel {
    private Autenticacao autenticacao;

    public Cliente(){
        this.autenticacao = new Autenticacao();
    }

    @Override
    public boolean autentica(int senha) {
        boolean autenticou = this.autenticacao.autentica(senha);
        return autenticou;
    }

    @Override
    public void setSenha(int senha) {
        this.autenticacao.setSenha(senha);
    }
}
