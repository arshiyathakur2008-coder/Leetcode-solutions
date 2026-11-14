
import java.util.*;

class Solution {
    public int[][] merge(int[][] intervals) {

        // Step 1: Sort intervals by starting value
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);

        // Step 2: Create an ArrayList to store merged intervals
        List<int[]> result = new ArrayList<>();

        // Step 3: Add the first interval
        result.add(intervals[0]);

        // Step 4: Traverse the remaining intervals
        for (int i = 1; i < intervals.length; i++) {

            int[] current = intervals[i];

            // Get the last interval from the result
            int[] last = result.get(result.size() - 1);

            // Check if intervals overlap
            if (current[0] <= last[1]) {

                // Merge intervals by updating the ending value
                last[1] = Math.max(last[1], current[1]);

            } else {

                // If no overlap, add the current interval
                result.add(current);
            }
        }

        // Step 5: Convert ArrayList into 2D array
        return result.toArray(new int[result.size()][]);
    }
}
