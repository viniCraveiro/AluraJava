package Cargos;

public abstract interface Autenticacao {

    public abstract boolean autentica(int senha);

    public abstract void setSenha(int senha);

}
