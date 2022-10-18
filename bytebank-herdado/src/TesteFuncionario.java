import cargos.Gerente;

public class TesteFuncionario {
    public static void main(String[] args) {
        Gerente funcionario = new Gerente();
        funcionario.setNome("Vinicius Craveiro");
        funcionario.setCpf("086.000.048-49");
        funcionario.setSalario(1500.00);

        System.out.println(funcionario.getNome());
        System.out.println(funcionario.getCpf());
        System.out.println(funcionario.getBonificacao());


    }
}
