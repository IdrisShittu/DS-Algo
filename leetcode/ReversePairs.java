/* Given an integer array nums, return the number of reverse pairs in the array.

A reverse pair is a pair (i, j) where 0 <= i < j < nums.length and nums[i] > 2 * nums[j]. 

Example 1:

Input: nums = [1,3,2,3,1]
Output: 2
Example 2:

Input: nums = [2,4,3,5,1]
Output: 3

Note: Almost same as GetInversion (Use Mergesort) but do counting first in a seperate loop before the merging.
Edge Case : watch for int overflow when multiplying largest number
*/

class Solution {
    public int reversePairs(int[] nums) {
        int[] temp= new int[nums.length];
        return mergeSort(nums,temp,0,nums.length-1);
    }

    public static int mergeSort(int[] arr,int[] temp,int l, int r){
        int count=0;
        int m;
        if(l<r){
          m=(l+r)/2;
          count=mergeSort(arr,temp,l,m);
          count+=mergeSort(arr,temp,m+1,r);
          count+=merge(arr,temp,l,m,r);
         }
         return count;
    }
    
    public static int merge(int[] arr, int[] temp, int l,int m,int r){
        int i=l, j=m+1, k=l, count=0;
        while(i<=m && j<=r){   
            if(arr[i]<= (long)  2*arr[j])i++;
            else{
                j++;
                count+=m-i+1;
            }
        }
        
     	i=l;j=m+1;k=l;       
        while(i<=m && j<=r){
            if(arr[i]<=arr[j]){
                temp[k++]=arr[i++];
            }
            else{
               temp[k++]=arr[j++];
            }
        }
        
        while(i<=m)temp[k++]=arr[i++];
        while(j<=r)temp[k++]=arr[j++];
        
        for(int a=l; a<=r; a++)arr[a]=temp[a];
        return count;
    }
}


