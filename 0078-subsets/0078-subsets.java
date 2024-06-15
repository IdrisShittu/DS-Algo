class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        generate(nums, new ArrayList<Integer>(), result, 0);
        return result;
    }
    
    public void generate(int[] nums, List<Integer> temp, List<List<Integer>>result, int index ){
        if(index==nums.length){
            result.add(new ArrayList<>(temp));
            return;
        }
        
        
       
            temp.add(nums[index]);
            generate(nums, temp,result,index+1);
            temp.remove(temp.size()-1);
            generate(nums, temp,result,index+1);
        
        
    }
}