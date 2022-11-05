public class ExemploMaxHeap {

    public static void main(String[] args) {

        MaxHeap heap = new MaxHeap(50);

        heap.put(9);
        heap.put(6);
        heap.put(2);
        heap.put(3);
        heap.put(5);
        heap.put(1);
        heap.put(0);
        heap.put(4);
        heap.put(8);
        heap.printArray();

        //Testar essa mesma ordem visualizando passo a passo em http://btv.melezinek.cz/binary-heap.html


    }

}
