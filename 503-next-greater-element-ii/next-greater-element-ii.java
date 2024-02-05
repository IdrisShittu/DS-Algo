class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int[] nums1= new int[nums.length];
        int val;
        Arrays.fill(nums1,-1);
        Stack<Integer> myStack = new Stack();
        for(int i=0; i<2*nums.length; i++){
            val=i%nums.length;
            while(!myStack.isEmpty() && nums[i%nums.length]>nums[myStack.peek()])
                            nums1[myStack.pop()]=nums[i%nums.length];
            myStack.add(val);
        }
        return nums1;
    }
}