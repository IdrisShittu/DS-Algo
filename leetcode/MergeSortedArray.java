/*You are given two integer arrays nums1 and nums2, sorted in non-decreasing order, and two integers m and n, representing the number of elements in nums1 and nums2 respectively.

Merge nums1 and nums2 into a single array sorted in non-decreasing order.

The final sorted array should not be returned by the function, but instead be stored inside the array nums1. To accommodate this, nums1 has a length of m + n, where the first m elements denote the elements that should be merged, and the last n elements are set to 0 and should be ignored. nums2 has a length of n.

 

Example 1:

Input: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
Output: [1,2,2,3,5,6]
Explanation: The arrays we are merging are [1,2,3] and [2,5,6].
The result of the merge is [1,2,2,3,5,6] with the underlined elements coming from nums1.

*/

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
    
           if(n==0)return;
           if(m==0){
               for(int i=0;i<nums1.length;i++)nums1[i]=nums2[i];
               return;
           }
           m=m-1; n=n-1;
           int i;
           for( i=nums1.length-1; !(m<0||n<0);  ){
               if(nums1[m]>=nums2[n]){
                   nums1[i]=nums1[m--];
                   i--;
               }
               else {
                   nums1[i]=nums2[n--];
                   i--;
                   
               }
           }
        
           if(m<0){
            for(int j=i; j>=0; j--)
               nums1[j]=nums2[n--]; 
               return;
           }
           if(n<0)for(int j=i; j>=0; j--)nums1[j]=nums1[m--]; 
        
          
            
        /**Brute Force
          int a=0, b=0;
          while(a<m+n && b<n){
            if(n==0)return;
            if(m==0){for(int i=0;i<nums1.length;i++)nums1[i]=nums2[i];return;}
            if(nums1[a]==0 && a>=m+b-1) nums1[a++]=nums2[b++];
            else if(nums1[a]<=nums2[b]){
               a++; 
            }
            else if(nums1[a]>nums2[b] ){
                for(int j=m+b; j>a ; j--)nums1[j]=nums1[j-1];
                nums1[a++]=nums2[b++];
            }
          }**/ 
    }
          
}
