
public class Main
{
    public static void main(String args[])
    {
        Heap heap = new Heap();
        Leitura leitura = new Leitura();
        heap.start();

        heap.insert("X0");
        heap.insert("X1");
        heap.insert("X2");
        heap.insert("X3");
        heap.insert("X4");
        heap.insert("X5");
        heap.insert("X6");
        heap.insert("6");
        heap.insert("7");
        heap.insert("8");
        heap.insert("8");
        heap.insert("7");
        heap.insert("7");
        heap.insert("7");
        heap.insert("8");
        

        heap.verify();

        System.out.println("\nO total de nodos equilibrados foi de "+ heap.getCount());
    }
}