package model;

public class GuardaReferencias {

    private Object[] referencias;
    private int posicaoLivre;

    public GuardaReferencias() {
        this.referencias = new Conta[10];
        this.posicaoLivre = 0;
    }

    public void adiciona(Conta ref){
        this.referencias[this.posicaoLivre] = ref;
        this.posicaoLivre++;
    }

    public int getQuantidadeElementos() {
        return this.posicaoLivre;
    }


    public Object getReferencia(int posicao) {
        return this.referencias[posicao];
    }
}
