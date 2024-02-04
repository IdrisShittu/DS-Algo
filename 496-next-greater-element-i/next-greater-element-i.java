class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int j;
        HashMap<Integer,Integer> nums3 = new HashMap<>();
        for(int i=0;i<nums2.length;i++)nums3.put(nums2[i],i);
        for(int i=0;i<nums1.length;i++){
            j=nums3.get(nums1[i]);
            if(j==nums2.length-1)nums1[i]=-1;
            for(int k=j+1; k<nums2.length;k++){
                if(nums2[k]>nums2[j]){
                    nums1[i]=nums2[k];
                    break;
                }
                if(k==nums2.length-1)nums1[i]=-1;         
            }
        }
        return nums1;
    }
}