package cargos;

public class Gerente extends Funcionario implements Autenticavel {
    private int senha;
    private Autenticacao autenticacao;

    public Gerente(){
        this.autenticacao = new Autenticacao();
    }

    @Override
    public boolean autentica(int senha) {
        boolean autentica = this.autenticacao.autentica(senha);
        return autentica;
    }

        @Override
    public void setSenha(int senha) {
        autenticacao.setSenha(senha);
    }

    public double getBonificacao() {
        System.out.println("\nChamando o metodo de bonificacao do Cargos.Gerente");
        return super.getSalario();
    }
}
