public class FluxoComErroJVM {
    public static void main(String[] args) {
        System.out.println("Inicio do main");
        try {
            metodo1();
        } catch (Exception exception) {
            String msg = exception.getMessage();
            System.out.println("Exception" + msg);
            exception.printStackTrace();
        }
        System.out.println("Fim do main");
    }

    private static void metodo1() {
        System.out.println("Inicio do metodo1");
            metodo2();
        System.out.println("Fim do metodo1");
    }

    private static void metodo2(){
        System.out.println("Inicio do metodo2");
        metodo2();
        System.out.println("Fim do Metado 2");
    }
}
