public class TestaBanco {
    public static void main(String[] args) {
        Cliente vinicius = new Cliente();
        vinicius.nome = "Vinicius Craveiro";
        vinicius.cpf = "086.269.729-89";
        vinicius.profissao = "Suporte";

        Conta contaDoVinicius = new Conta();
        contaDoVinicius.deposita(100);

        contaDoVinicius.titular = vinicius;
        System.out.println(contaDoVinicius.titular.nome);

    }
}
