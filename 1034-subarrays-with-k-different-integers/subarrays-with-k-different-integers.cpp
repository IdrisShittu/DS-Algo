class Solution {
public:
    //helper function
    int goodarr(vector<int> &nums,int k)
    {
        unordered_map<int,int> mp;   //to store the frequencies of current window
        int j=0,cnt=0,res=0;
    //j is the right end of the window and i is the left end
        for(int i=0;i<nums.size();i++)
        {
            j=max(i,j);     //ensure j doesn't move back
        //expand the window until we get k distinct elements in it
            while(j<nums.size()&&cnt<k)
            {
                mp[nums[j]]++;
                if(mp[nums[j]]==1)
                cnt++;
                j++;
            }
            if(cnt==k)
            res+=(nums.size()-j+1);

        //shrink the window by 1 element and reduce count if nums[i] is occuring only once inside the window
            if(mp[nums[i]]==1)
            cnt--;
            mp[nums[i]]--;
        }
        return res;
    }
    int subarraysWithKDistinct(vector<int>& nums, int k) {
        return goodarr(nums,k)-goodarr(nums,k+1);
    }
};