class Solution {
public:
    void sortColors(vector<int>& nums) {
        int front=0, back=nums.size()-1, mid=0;
        while(mid<=back){
            if(nums[mid]==0){
                swap(nums[front++],nums[mid++]);
            }else if(nums[mid]==2){
                swap(nums[mid],nums[back--]);
            }else mid++;
        }
    }
};