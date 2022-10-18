import cargos.ControleBonificacao;
import cargos.Designer;
import cargos.EditorVideo;
import cargos.Gerente;

public class TesteReferencias {
    public static void main(String[] args) {
        Gerente g1 = new Gerente();
        g1.setNome("Joao");
        g1.setSalario(5000.00);


        EditorVideo ev = new EditorVideo();
        ev.setSalario(2500);

        Designer d = new Designer();
        d.setSalario(2000);


        ControleBonificacao controle = new ControleBonificacao();
        controle.registra(g1);
        controle.registra(ev);
        controle.registra(d);

        System.out.println(controle.getSoma());
    }
}
