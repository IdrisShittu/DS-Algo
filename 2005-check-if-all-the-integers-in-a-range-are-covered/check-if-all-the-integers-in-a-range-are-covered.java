class Solution {
    public boolean isCovered(int[][] ranges, int left, int right) {
        Set<Integer> s = new HashSet();
        for(int i=left; i<=right; i++){
            s.add(i);
        }

        for(int[] range : ranges){
            for(int i=range[0]; i<=range[range.length-1]; i++){
                s.remove(i);
                if(s.size()==0)return true;
            }
        }

        return false;
        
    }
}