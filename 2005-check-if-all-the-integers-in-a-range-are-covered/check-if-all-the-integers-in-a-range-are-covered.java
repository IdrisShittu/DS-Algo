class Solution {
    public boolean isCovered(int[][] ranges, int left, int right) {
        boolean seen=false;
        for(int i=left; i<=right; i++){
            for(int[] range : ranges){
                if(i>=range[0] && i<=range[1]){
                    seen=true;
                    break;
                }
            }
            if(seen==false)return false;
            seen=false;
        }
        return true;
    }
}