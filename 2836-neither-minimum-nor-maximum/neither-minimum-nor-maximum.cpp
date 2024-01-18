class Solution {
public:
    int findNonMinOrMax(vector<int>& nums) {

        int min=101,max=-1,result=-1;
        for(int i : nums){
            if(i>max) max=i;
            if(i<min)min=i;
        }
 
        for(int i : nums){
            if(i<max && i>min) result=i;
        }
        return result;

        
    }
};