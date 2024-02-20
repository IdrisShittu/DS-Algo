class Solution {
    public boolean isSameAfterReversals(int num) {
       if(reverseInt(reverseInt(num))==num)return true;
       return false;
    }

    public int reverseInt(int n){
        int res=0;
        while(n>0){
            res=res*10+n%10;
            n/=10;
        }
        return res;
    }
}