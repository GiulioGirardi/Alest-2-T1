import java.io.IOException;
import java.util.ArrayList;
public class Main
{
    public static void main(String args[]) throws IOException
    {
        ArrayList<String> lista = new ArrayList<>();
        Heap heap = new Heap();
        Leitura leitura = new Leitura();
        
        heap.start();
        lista = leitura.LeituraArquivo();

        for (int i = 0; i < lista.size(); i++) {
            heap.insert(lista.get(i));
        }

        heap.verify();

        System.out.println("\nO total de nodos equilibrados foi de "+ heap.getCount());
    }
}