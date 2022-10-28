public class TestaContaComExceptionChecked {
    public static void main(String[] args) {
        Conta c = new Conta();
        try{
            c.deposita();
        }catch (MinhaException exception){
            System.out.println("Tratamento...");
        }
    }
}
