import rh.model.Cargo;
import rh.model.Funcionario;

import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) {

        Funcionario funcionario = new Funcionario("Vinicius", "56165546", Cargo.ASSISTENTE, BigDecimal.valueOf(1000));

        System.out.println(funcionario.getSalario());
        funcionario.atualizarSalario(BigDecimal.valueOf(100));
        System.out.println(funcionario.getDataUltimoReajuste());


    }
}