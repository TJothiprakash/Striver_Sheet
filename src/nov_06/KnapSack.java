package nov_06;

import java.util.Arrays;
import java.util.Comparator;

public class KnapSack {
    public static void main(String[] args) {
        int n = 3, weight = 50;
        Item arr[] = {new Item(100, 20), new Item(60, 10), new Item(120, 30)};
        double ans = fractionalKnapsack(weight, arr, n);
        System.out.println("The maximum value is " + ans);
    }

    private static double fractionalKnapsack(int weight, Item[] arr, int n) {
        Arrays.sort(arr, new ItemComparator());
        double currentWeight = 0.0;
        double finalValue = 0.0;

        for (int i = 0; i < n; i++) {
            if (currentWeight + arr[i].weight <= weight) {
                currentWeight += arr[i].weight;
                finalValue += arr[i].value;
            } else {
                int remain = (int) (weight - currentWeight);
                finalValue += ((double) arr[i].value / (double) arr[i].weight) * (double) remain;
                break;
            }
        }

        return finalValue;
    }
}

class Item {
    int value;
    int weight;

    public Item(int value, int weight) {
        this.value = value;
        this.weight = weight;
    }
}

class ItemComparator implements Comparator<Item> {
    @Override
    public int compare(Item o1, Item o2) {
        double r1 = (double) o1.value / (double) o1.weight;
        double r2 = (double) o2.value / (double) o2.weight;

        return Double.compare(r2, r1); // Sort in descending order
    }
}
