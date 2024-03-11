class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> res = new HashSet<Integer>();
        List<Integer> result = new ArrayList<>();
        
        for(int i: nums1){
           res.add(i);
        }
        for(int i: nums2){
           if(res.contains(i)){
               result.add(i);
               res.remove(i);
           }
        }
        
        int[] returnArray = new int[result.size()];
        int j=0;
        for(int i:result)returnArray[j++]=i;

        return returnArray;

    }
}