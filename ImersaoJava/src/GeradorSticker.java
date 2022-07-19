package ImersaoJava.src;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.InputStream;


public class GeradorSticker {

    public void cria(InputStream inputStream, String nomeArquivo) throws Exception {

        //Leitura da imagem
        //InputStream inputStream = new FileInputStream(new File("ImersaoJava\\entrada/filme-maior.jpg") );
        //InputStream inputStream = new URL("https://imersao-java-apis.s3.amazonaws.com/TopMovies_1.jpg").openStream();
        BufferedImage imagemOriginal = ImageIO.read(inputStream);

        //Cria nova imagem em memoria com transparencia e com tamanho novo
        int largura = imagemOriginal.getWidth();
        int altura = imagemOriginal.getHeight();
        int novaAltura = altura + 200;
        BufferedImage novaImagem = new BufferedImage(largura, novaAltura, BufferedImage.TRANSLUCENT);

        //Copiar a imagem original para novo imagem (em memoria)
        Graphics2D graphics = (Graphics2D) novaImagem.getGraphics();
        graphics.drawImage(imagemOriginal, 0, 0, null);

        //Configurar a fonte
        var fonte = new Font(Font.SANS_SERIF, Font.BOLD, 85);
        graphics.setColor(Color.yellow);
        graphics.setFont(fonte);

        //Escrever uma frase na nova imagem
        graphics.drawString("TOPZERA", 100 , novaAltura - 100);

        //Escrever a nova imagem em um arquivo
        ImageIO.write(novaImagem,"png", new File("nomeArquivo"));
        File figurinha = new File("C:\\Workspace\\AluraJava\\ImersaoJava\\saida/"+nomeArquivo);
            if(figurinha.mkdirs())
                ImageIO.write(novaImagem, "png", figurinha);

    }
}
