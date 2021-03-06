import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;


public class Leitura {
    ArrayList listaNumeros;

    Leitura() {
        listaNumeros = new ArrayList();
    }

    public ArrayList LeituraArquivo() throws IOException {


        String linhas[] = new String[100000];
        int numLinhas = 0;

        //TODO: Alterar nome do arquivo que será lido

        Path filePath = Paths.get("teste5.txt");

        // Ler o arquivo
        try (BufferedReader reader = Files.newBufferedReader(filePath, Charset.defaultCharset())) {
            String line;
            while ((line = reader.readLine()) != null) {
                linhas[numLinhas] = line;
                numLinhas++;
            }
        } catch (IOException e) {
            System.err.format("Erro na leitura do arquivo: ", e);
        }

        ArrayList<String> linhaNumero = new ArrayList<String>();
        String aux[];
        for (int i = 0; i < numLinhas; i++) {
            aux = linhas[i].split(" ");
            for (int j = 0; j < aux.length; j++) {

                if (linhaNumero.contains(aux[j])) {
                    if (aux[j].indexOf("X") == -1) {
                        linhaNumero.add(aux[j]);
                    }
                    continue;
                } else {
                    linhaNumero.add(aux[j]);
                }
            }

        }

        return linhaNumero;
    }

}