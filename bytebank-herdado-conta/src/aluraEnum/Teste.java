package aluraEnum;

public class Teste {
    public static void main(String[] args) {
        Thread t = new Thread(() -> System.out.println("Rodando ..."));

        t.start();

        Prioridade prioridadeMin = Prioridade.MIN;
        Prioridade prioridadeMed = Prioridade.MED;
        Prioridade prioridadeMax = Prioridade.MAX;
        System.out.println(prioridadeMin.ordinal());
        System.out.println(prioridadeMax.ordinal());

        System.out.println(prioridadeMin.name());
        System.out.println(prioridadeMax.name());

        System.out.println(prioridadeMin.getValor());
        System.out.println(prioridadeMax.getValor());
    }
}
