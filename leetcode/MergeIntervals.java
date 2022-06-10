/*Given an array of intervals where intervals[i] = [starti, endi], merge all overlapping intervals, and return an array of the non-overlapping intervals that cover all the intervals in the input.

 

Example 1:

Input: intervals = [[1,3],[2,6],[8,10],[15,18]]
Output: [[1,6],[8,10],[15,18]]
Explanation: Since intervals [1,3] and [2,6] overlap, merge them into [1,6].*/

class Solution {
    public int[][] merge(int[][] intervals) {
        
        Arrays.sort(intervals,(a,b)-> Integer.compare(a[0],b[0]));
        LinkedList<int[]>result = new LinkedList<int[]>();
        
        for(int[] interval : intervals ){
            if(result.isEmpty() || result.getLast()[1]<interval[0]) result.add(interval);
            else result.getLast()[1] = Math.max(interval[1],result.getLast()[1]);
            
        }
        
        return result.toArray(new int[result.size()][2]);
        
       /*Brute Force 
        int count =0 ;
        
        for(int i=0; i<intervals.length; i++){
            if(intervals[i][0]==-1) continue;
            for(int j=0 ;j<intervals.length; j++){
               if(j==i || intervals[j][0]==-1)continue;
               if ( (intervals[j][0] >= intervals[i][0])&&( intervals[j][0] <= intervals[i][1]) ||
                    (intervals[i][0] >= intervals[j][0])&&( intervals[i][0] <= intervals[j][1])
                  )
               
               {
                   
                   intervals[i][0]= Math.min(intervals[i][0], intervals[j][0]);
                   intervals[i][1]= Math.max(intervals[i][1], intervals[j][1]);
                   intervals[j][0]=-1;
                   j=0;
                   
                   count++;
                   
               }
                    
                   
            }
        }
        
        
        int[][] res = new int[intervals.length-count][2];
        
        int counter=0;
        
        for(int i=0; i < intervals.length; i++ ){
            if(intervals[i][0] == -1 ) continue;
            res[counter][0]= intervals[i][0];
            res[counter][1]= intervals[i][1];
            counter++;
        }
        
        return res;*/
        
        
    }
}
