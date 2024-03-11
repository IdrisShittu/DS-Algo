class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Map<Integer, Integer> mp = new HashMap<>();
        Set<Integer> st = new HashSet<>();
        
        for(int i: nums1){
           mp.put(i,mp.getOrDefault(i,0)+1);
        }
        System.out.println(mp);
        for(int i: nums2){
           if(mp.containsKey(i))st.add(i);
        }
      
        int[] returnArray = new int[st.size()];
        int j=0;
        for(int i:st)returnArray[j++]=i;

        return returnArray;

    }
}