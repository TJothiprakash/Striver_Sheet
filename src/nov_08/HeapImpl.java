package nov_08;

import java.util.Collections;

public class HeapImpl {
    public static void main(String[] args) throws Exception {
        Heap heap = new Heap();
        heap.insert(1);
        heap.insert(2);
        heap.insert(3);
        heap.insert(4);
        heap.insert(5);
        heap.insert(20);
        System.out.println(heap.toString());
       // heap.heapSort();
        System.out.println(heap.toString());
        Heap heap1= new Heap(Collections.reverseOrder());

        heap1.insert(1);
        heap1.insert(2);
        heap1.insert(3);
        heap1.insert(4);
        heap1.insert(5);
        heap1.insert(20);
        System.out.println(heap1.toString());
        heap1.heapSort();
        System.out.println(heap1.toString());
    }
}
