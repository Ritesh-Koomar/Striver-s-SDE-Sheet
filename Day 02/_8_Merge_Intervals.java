class Solution {
    public int[][] merge(int[][] intervals) {
       Arrays.sort(intervals, (a, b) -> a[0] - b[0]); 
       List<int[]> li = new ArrayList<>();
       int s = intervals[0][0];
       int e = intervals[0][1];
       for(int i = 1;i<intervals.length;i++)
       {
            int start = intervals[i][0];
            int end = intervals[i][1];
            if(start<=e)
            {
                // if previous end is in this interval, merge
                e = Math.max(end, e);
            }
            else
            {
                // if not, save the interval and move ahead
                 li.add(new int[]{s, e});
                 s = start;
                 e = end;
            }
       }
       // the last interval needs to be added explicitly
       li.add(new int[]{s, e});
       return li.toArray(new int[li.size()][]);        
    }
}
