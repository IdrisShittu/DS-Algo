class Solution {
    public int countSymmetricIntegers(int low, int high) {
        int count=0;
        for(int i=low;i<=high;i++){
            if(isSymmetric(i))count++;
        }
        return count;
    }

    public boolean isSymmetric(int n){
        int sum=0;
        int len=getNumberOfDigits(n);
        if(len%2!=0)return false;
        for(int i=0;i<len/2;i++){
            sum+=getNthDigit(n,i)-getNthDigit(n,len-i-1);
        }
        return sum==0;
    }

    public int getNumberOfDigits(int n){
        return (int)Math.floor(Math.log10(n))+1;
    }

    public int getNthDigit(int n,int i){
        return (int)Math.floor(n/(Math.pow(10,i))%10);
    }
}