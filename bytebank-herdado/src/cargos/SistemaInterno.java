package cargos;

public class SistemaInterno {
    private int senha = 2222;

    public void autentica(Autenticavel autenticavel){
        boolean autenticado = autenticavel.autentica(this.senha);
        if (autenticado){
            System.out.println("Acesso liberado !");
        }else
        System.out.println("Acesso negado !");
    }
}
