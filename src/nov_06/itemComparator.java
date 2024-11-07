package nov_06;

import java.util.Comparator;

public class itemComparator implements Comparator<Item> {

    @Override
    public int compare(Item o1, Item o2) {
        double r1 = (double) o1.value / (double) o1.weight;
        double r2 = (double) o2.value / (double) o2.weight;

        return Double.compare(r2, r1); // Sort in descending order
    }
}
