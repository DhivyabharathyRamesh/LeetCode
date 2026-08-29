class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]> result=new ArrayList<>();
        
        int newStart=newInterval[0];
        int newEnd=newInterval[1];

        for(int i=0;i<intervals.length;i++){
            int curentStart=intervals[i][0];
            int curentEnd=intervals[i][1];
            if(curentEnd<newStart){
                result.add(new int[]{curentStart,curentEnd});
            }
            else if(curentStart>newEnd){
                result.add(new int[]{newStart,newEnd});
                for(int j=i;j<intervals.length;j++){
                     result.add(intervals[j]);
                     
                }
                return result.toArray(new int[result.size()][]);
            }
            else{
                newEnd=Math.max(curentEnd,newEnd);
                newStart=Math.min(curentStart,newStart);
             
            }
        }
         // If we never found an interval after newInterval,
        // newInterval belongs at the end.
        result.add(new int[]{newStart, newEnd});

        return result.toArray(new int[result.size()][]);
    }  
    
}