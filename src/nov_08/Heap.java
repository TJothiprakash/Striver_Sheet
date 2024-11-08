package nov_08;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Heap<T extends Comparable<T>> {

    private ArrayList<T> list;
    private Comparator<? super T> comparator;

    public Heap() {
        list = new ArrayList<>();
        comparator = Comparator.naturalOrder();
    }

    public Heap(Comparator<? super T> comparator) {
        list = new ArrayList<>();
        this.comparator = comparator;
    }

    private void swap(int first, int second) {
        T temp = list.get(first);
        list.set(first, list.get(second));
        list.set(second, temp);
    }

    private int parent(int index) {
        return (index - 1) / 2;
    }

    private int left(int index) {
        return index * 2 + 1;
    }

    private int right(int index) {
        return index * 2 + 2;
    }

    public void insert(T value) {
        list.add(value);
        upheap(list.size() - 1);
    }

    private void upheap(int index) {
        if (index == 0) {
            return;
        }
        int p = parent(index);
        if (comparator.compare(list.get(index), list.get(p)) < 0) {
            swap(index, p);
            upheap(p);
        }
    }

    public T remove() throws Exception {
        if (list.isEmpty()) {
            throw new Exception("Removing from an empty heap!");
        }

        T temp = list.get(0);

        T last = list.remove(list.size() - 1);
        if (!list.isEmpty()) {
            list.set(0, last);
            downheap(0);
        }

        return temp;
    }

    private void downheap(int index) {
        int min = index;
        int left = left(index);
        int right = right(index);

        if (left < list.size() && comparator.compare(list.get(min), list.get(left)) > 0) {
            min = left;
        }

        if (right < list.size() && comparator.compare(list.get(min), list.get(right)) > 0) {
            min = right;
        }

        if (min != index) {
            swap(min, index);
            downheap(min);
        }
    }

    public ArrayList<T> heapSort() throws Exception {
        ArrayList<T> data = new ArrayList<>();
        while (!list.isEmpty()) {
            data.add(this.remove());
        }
        return data;
    }

    @Override
    public String toString() {
        return "Heap{" +
                "list=" + list +
                '}';
    }
}
