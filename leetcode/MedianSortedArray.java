class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int len =nums1.length+nums2.length;
        
        int[] arr= new int[len];
        int p1=0,p2=0;
        Double median;
        
        for(int i=0; i<arr.length && p1<nums1.length && p2<nums2.length;i++){
            if(nums1[p1]<=nums2[p2])arr[i]=nums1[p1++];
            else arr[i]=nums2[p2++];  
        }
        
        
        
        if(p1<nums1.length){
            for(int i=p1; i<nums1.length;i++){
              arr[p2+i]=nums1[i];
            }        
        }
        if(p2<nums2.length){
            for(int i=p2; i<nums2.length;i++){
              arr[p1+i]=nums2[i];
            }
             for(int i=0; i<arr.length ;i++){
       
        }
   
            
        }
        
        int medIndex = (len-1)/2;
        int medIndex1;
        medIndex1 = (len==1)? medIndex: medIndex+1;
      
        if(len%2==0)median=Double.valueOf((arr[medIndex]+arr[medIndex1])/2.00);
        else median=Double.valueOf(arr[medIndex]);
        
        return median;
        
    }
}
