class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        Set<List<Integer>> result = new HashSet<>();
        generate(nums, new ArrayList<Integer>(), result, 0);
        List<List<Integer>> answer = new ArrayList<>();
        answer.addAll(result);
        return answer;
    }
    
    public void generate(int[] nums, List<Integer> temp, Set<List<Integer>>result, int index ){
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