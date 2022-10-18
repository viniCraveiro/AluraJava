import cargos.Administradores;
import cargos.Gerente;
import cargos.SistemaInterno;

public class TesteSistema {
    public static void main(String[] args) {
        Gerente g = new Gerente();
        g.setSenha(2222);
        Administradores adm = new Administradores();
        adm.setSenha(3333);

        SistemaInterno sistemaInterno = new SistemaInterno();
        sistemaInterno.autentica(g);
        sistemaInterno.autentica(adm);
    }
}
