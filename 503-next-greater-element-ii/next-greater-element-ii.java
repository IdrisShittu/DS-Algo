class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int[] nums1= new int[nums.length];
        int val;
        Stack<Integer> myStack = new Stack();
        for(int i=2*nums.length-1; i>=0; i--){
            val=nums[i%nums.length];
            while(!myStack.isEmpty() && nums[i%nums.length]>=myStack.peek())myStack.pop();
            if(i<nums.length && !myStack.isEmpty())nums1[i%nums.length]=myStack.peek();
            else nums1[i%nums.length]=-1;
            myStack.add(val);
        }
        return nums1;
    }
}
//