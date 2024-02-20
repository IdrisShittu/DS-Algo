class Solution {
    public boolean isPalindrome(int x) {
        if(reverseInt(x)==x)return true;
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