class Solution {
    public int[] sortedSquares(int[] nums) {
        int arr[] = new int[nums.length];
        int front=0;
        int back=nums.length-1;
        int i=nums.length-1;
        while(front<=back){
         if(Math.abs(nums[back])< Math.abs(nums[front])){
            arr[i--]= nums[front]*nums[front++];
          }
          else arr[i--] = nums[back]*nums[back--];
        }

        return arr;
    }
}