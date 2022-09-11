package ImersaoJava.src;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class ExtratorDeConteudoNasa implements ExtratorDeConteudo{
    public List<Conteudo> extraiConteudos(String json){

        JsonParser parser = new JsonParser();
        List<Map<String, String>> listaDeAtributos = parser.parse(json);

        List<Conteudo> conteudos = new ArrayList<>();


        //popular a lista de conteudos;
        for (Map<String, String> atributos : listaDeAtributos){
            String urlImagem = atributos.get("url");
            String titulo = (atributos.get("title"));

            var conteudo = new Conteudo(titulo, urlImagem);

            conteudos.add(conteudo);
        }

        return conteudos;
    }
}
