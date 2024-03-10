class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> res = new HashSet<Integer>();
        
        for(int i: nums1){
            for(int j: nums2){
                if(i==j)res.add(i);
            }
        }
        
        int[] result = new int[res.size()];
        int i=0;
        for(int j : res){
            result[i++]=j;
        }

        return result;
    }
}