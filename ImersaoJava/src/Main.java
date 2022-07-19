package ImersaoJava.src;

import java.io.InputStream;
import java.net.URI;
import java.net.URL;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws Exception {

        //FAZER A CONEXAO HTTP e buscar os top 250 filmes
        String url = "https://api.mocki.io/v2/549a5d8b";
        URI endereco = URI.create(url);
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder(endereco).GET().build();
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
        String body = response.body();

        //pegar os dados interessantes(título, imagem, classificação)
        JsonParser parser = new JsonParser();
        List<Map<String, String>> listaDeFilmes = parser.parse(body);

        //exibir e manipular os dados
        var geradora = new GeradorSticker();
        for (Map<String,String> filme: listaDeFilmes){

            String urlImagem = filme.get("image");
            String titulo = (filme.get("title"));
            InputStream inputStream = new URL(urlImagem).openStream();

            String nomeArquivo = titulo + ".png";

            geradora.cria(inputStream, nomeArquivo);

            System.out.println();
            System.out.println("\u001b[30;1m\u001b[45mClassificação:\u001b[m"+" "+filme.get("title"));
            System.out.println();
        }


    }
}
