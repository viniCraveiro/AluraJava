package ImersaoJava.src;

import java.io.InputStream;
import java.net.URL;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws Exception {

        //FAZER A CONEXAO HTTP e buscar os top 250 filmes
        //IMDB
        //String url = "https://raw.githubusercontent.com/alura-cursos/imersao-java/api/TopMovies.json";
        //ExtratorDeConteudo extrator = new ExtratorDeConteudoIMDB();

        //NASA
        String url = "https://api.nasa.gov/planetary/apod?api_key=DEMO_KEY&start_date=2022-06-12&end_date=2022-06-14";
        ExtratorDeConteudo extrator = new ExtratorDeConteudoNasa();

        var http = new ClienteHttp();
        String json  = http.buscaDados (url);

        //exibir e manipular os dados
        List<Conteudo> conteudos = extrator.extraiConteudos(json);
        var geradora = new GeradorSticker();

        for (int i = 0; i < 10; i++){
            Conteudo conteudo = conteudos.get(i);

                String nomeArquivo = conteudo.getTitulo().replace(":"," - ") + ".png";
                InputStream inputStream = new URL(conteudo.getUrlImagem()).openStream();
                System.out.println("\u001b[30;1m\u001b[45m*Gerando Imagem:\u001b[m ("+(i+1)+") [" + conteudo.getTitulo() + "]");
                geradora.cria(inputStream, nomeArquivo);
        }

    }
}
