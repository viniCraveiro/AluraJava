import java.net.URI;
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
        for (Map<String,String> filme: listaDeFilmes){
            System.out.println("\u001b[30;1m\u001b[42mTítulo:\u001b[m"+" "+filme.get("title"));
            System.out.println("\u001b[30;1m\u001b[44mBanner:\u001b[m"+" "+filme.get("image"));
            System.out.println("\u001b[30;1m\u001b[45mClassificação:\u001b[m"+" "+filme.get("imDbRating"));
            System.out.println();
        }


    }
}
