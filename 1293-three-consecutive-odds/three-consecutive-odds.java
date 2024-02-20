class Solution {
    public boolean threeConsecutiveOdds(int[] arr) {
        return isKConsecutiveOdd(arr,3);
    }

    public boolean isKConsecutiveOdd(int[] arr, int k){
        int count=0;
        for(int num : arr){
            if((num&1)!=1)count=0;
            else count++;
            if(count==k)return true;
        }
        return false;
    }
}