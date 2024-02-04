class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int j;
        for(int i=0; i<nums1.length; i++){
            for(j=0; j<nums2.length;j++)if(nums1[i]==nums2[j])break;
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