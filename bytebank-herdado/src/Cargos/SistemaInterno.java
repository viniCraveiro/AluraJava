package Cargos;

public class SistemaInterno {
    private int senha = 2222;

    public void autentica(Autenticacao autenticacao){
        boolean autenticado = autenticacao.autentica(this.senha);
        if (autenticado){
            System.out.println("Acesso liberado !");
        }else
        System.out.println("Acesso negado !");
    }
}
