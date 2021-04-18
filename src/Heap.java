import java.util.ArrayList;

public class Heap{

    ArrayList<String> heap = new ArrayList<String>();
    int lenght = 0;

    void start()
    {
        heap.add("");
        lenght++ ;
    }
    void insert(String s)
    {
        heap.add(s);
    }

    void verify()
    {
       buscaEq(heap,1);
    }

    private static void buscaEq(ArrayList<String> heap ,int index)
    {
    
        int valor1 = 0;
        int valor2 = 0;

            if(heap.get(index*2) != null)
            {
                if(heap.get(index*2).indexOf("X") == -1)
                {
                    valor1 = Integer.parseInt(heap.get(index*2));
                }
                else 
                {
                    buscaEq(heap,index*2);
                }
            }

            if(heap.get((index*2) + 1) != null)
            {
                if(heap.get((index*2) + 1).indexOf("X") == -1)
                {
                    valor1 = Integer.parseInt(heap.get((index*2) + 1));
                }
                else 
                {
                    buscaEq(heap,(index*2) + 1);
                }
            }

            if(valor1 != 0 || valor2 != 0)
            {
                if(valor1 == valor2)
                {
                    System.out.println("O nodo "+ heap.get(index) + " é equilibrado");
                }
                else
                {
                    System.out.println("O nodo "+ heap.get(index) + " é desequilibrado");
                }
            }
    }

}