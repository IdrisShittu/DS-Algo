/*Problem Statement: You are given a read-only array of N integers with values also in the range [1,N] both inclusive. Each integer appears exactly once except A which appears twice and B which is missing. The task is to find the repeating and missing numbers A and B where A repeats twice and B is missing.

Example 1:

Input Format:  array[] = {3,1,2,5,3}

Result: {3,4)
*/


import java.util.ArrayList;

public class Solution {

    public static int[] missingAndRepeating(ArrayList<Integer> arr, int n) {
       int repeated=0,missing=0;
       int[] temp= new int[n];
       for(int ar: arr)temp[ar-1]=temp[ar-1]+1;
       for(int i=0; i<n; i++){
           if(temp[i]>1)repeated=i+1;
           if(temp[i]==0)missing=i+1;
       }
        
       return new int[]{missing,repeated};
    }
}
