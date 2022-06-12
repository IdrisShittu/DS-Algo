/*Write an efficient algorithm that searches for a value target in an m x n integer matrix matrix. This matrix has the following properties:

Integers in each row are sorted from left to right.
The first integer of each row is greater than the last integer of the previous row.
 

Example 1:

Input: matrix = [[1,3,5,7],[10,11,16,20],[23,30,34,60]], target = 3
Output: true


*/

class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
      
        int m=matrix.length;
        int n=matrix[0].length;
		int low=0;
        int high=m*n-1;
        int middle=0;
        while(low<=high){
            middle=low+(high-low)/2;
            if(matrix[middle/n][middle%n]==target)return true;
            if(matrix[middle/n][middle%n]>target)high=middle-1;
            if(matrix[middle/n][middle%n]<target)low=middle+1;         
        }
        
        return false;
	}
}

        
