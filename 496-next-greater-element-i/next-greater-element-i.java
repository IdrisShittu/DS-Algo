class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int val;
        HashMap<Integer,Integer> nums3 = new HashMap<>();
        Stack<Integer> myStack =new Stack<>();
        for(int i=0;i<nums2.length;i++)nums3.put(nums2[i],i);
        for(int i=nums2.length-1;i>=0;i--){
            val=nums2[i];
           
            while(!myStack.isEmpty() && myStack.peek()<val)myStack.pop();
            if(!myStack.isEmpty())nums2[i]=myStack.peek();
            else nums2[i]=-1;
            myStack.add(val);
        }
        System.out.println(Arrays.toString(nums2));
        System.out.println(myStack.toString());

        for(int i=0;i<nums1.length;i++){
            nums1[i]=nums2[nums3.get(nums1[i])];
        }
        return nums1;
    }
}