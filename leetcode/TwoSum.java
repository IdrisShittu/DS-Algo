class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        
      /**Brute Force
      int[] result= new int[2];
      for(int i=0; i<nums.length; i++){
            for(int j=i; j<nums.length; j++){
                if(i==j)continue;
                if(nums[i] + nums[j]==target){
                    result[0]=i;
                    result[1]=j;
                }
            }
        }    
        
        return result;
       **/
        
       /** Using Sort - Not working   
       Arrays.sort(nums);
       int j=0;int k=0;
       int result[] = new int[2];
      for(int i=0; i< nums.length; i++){
          
          if(nums[i]*2==target){
            if(i==0)j=Arrays.binarySearch(nums,i+1,nums.length-1,target-nums[i]);
            else{
               j= Arrays.binarySearch(nums,0,i-1,target-nums[i]);
               k= Arrays.binarySearch(nums,i+1,nums.length-1,target-nums[i]);
            }
            if(j>0){
                result[0]=i;
                result[1]=j;
                break;
            } 
            if(k>0){
                result[0]=i;
                result[1]=k;
                break;
            }
            continue;
          }
            
          
          j=Arrays.binarySearch(nums,target-nums[i]);
       
          //if(i==j)continue;
          if(j>0){result[0]=i;result[1]=j;}
      }
        
        return result;
        
        **/
        
        //Using HashMap
        
    
        HashMap<Integer,Integer> n = new HashMap<>(nums.length);
        for(int i=0; i<nums.length;i++){
            if(n.containsKey(target-nums[i]))return new int[]{i, n.get(target-nums[i])};
            else n.put(nums[i],i);
        }
        
        return new int[]{};
        
    }
}

