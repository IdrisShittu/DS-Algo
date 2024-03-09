class Solution {
    public boolean isCovered(int[][] ranges, int left, int right) {
        Arrays.sort(ranges, (a,b)->a[0]-b[0]);
        Stack<int[]> merged = new Stack<>();
        for(int[] range : ranges){
            if( merged.isEmpty() || merged.peek()[1]+1 < range[0]){
                merged.push(range);
            }else{
                 merged.peek()[1]=Math.max(merged.peek()[1], range[1]);
            }
        }
        return merged.stream().anyMatch(range->left>=range[0] && right<=range[1]);
 
    }
}