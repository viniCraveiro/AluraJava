package aluraEnum;

public enum Prioridade {
    MIN(1),MED(5),MAX(10);

    private int valor;
    Prioridade(int valor) {
        this.valor = valor;
    }


    public int getValor(){
        return this.valor;
    }
}
