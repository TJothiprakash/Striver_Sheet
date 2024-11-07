package nov_05;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeSubIntervals {
    public static void main(String[] args) {
        int[][] intervals = {{1, 3}, {2, 6}, {5, 10}, {15, 18}};
        System.out.println("Merged Intervals:");
        printMergedIntervals(mergeIntervals(intervals));
    }

    private static int[][] mergeIntervals(int[][] intervals) {
        if (intervals.length <= 1) return intervals;

        // Sort by starting time, which is already done in your code
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

        List<int[]> merged = new ArrayList<>();
        int[] currentInterval = intervals[0];
        System.out.println(currentInterval[0] + " " + currentInterval[1]);
        merged.add(currentInterval);

        for (int[] interval : intervals) {
            int currentEnd = currentInterval[1];
            int nextStart = interval[0];
            int nextEnd = interval[1];

            if (currentEnd >= nextStart) {
                currentInterval[1] = Math.max(currentEnd, nextEnd); // Merge intervals
            } else {
                System.out.println(currentInterval[1]);
                currentInterval = interval; // Move to the next interval
              //  System.out.println(currentInterval[0] + " before adding" + currentInterval[1]);
                merged.add(currentInterval);
                System.out.println(currentInterval[0] + " after adding" + currentInterval[1]);
            }
        }

        return merged.toArray(new int[merged.size()][]);
    }

    private static void printMergedIntervals(int[][] mergedIntervals) {
        for (int[] interval : mergedIntervals) {
            System.out.println("[" + interval[0] + ", " + interval[1] + "]");
        }
    }
}
