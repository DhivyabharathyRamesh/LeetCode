import java.util.*;

class Solution {
    public int[][] merge(int[][] intervals) {

        // 1. Sort intervals by start value
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

        // 2. Store merged intervals
        List<int[]> result = new ArrayList<>();

        // 3. Start with the first interval
        int curStart = intervals[0][0];
        int curEnd = intervals[0][1];

        // 4. Check remaining intervals
        for (int i = 1; i < intervals.length; i++) {

            int nextStart = intervals[i][0];
            int nextEnd = intervals[i][1];

            // Overlap
            if (curEnd >= nextStart) {
                curEnd = Math.max(curEnd, nextEnd);
            }

            // No overlap
            else {
                result.add(new int[]{curStart, curEnd});

                curStart = nextStart;
                curEnd = nextEnd;
            }
        }

        // 5. Save the final interval
        result.add(new int[]{curStart, curEnd});

        // 6. Convert List<int[]> → int[][]
        return result.toArray(new int[result.size()][]);
    }
}