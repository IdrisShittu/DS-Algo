class Solution {
    public int[] separateDigits(int[] nums) {
        int[] result=new int[10000];
        int j=0;
        for(int i:nums){
            int l=Integer.toString(i).length();
            int k=l-1;
            while(i>0){
                result[j+k]=i%10;
                i/=10;
                k--;
            }
            j+=l;
        }
        return Arrays.copyOfRange(result,0,j);
    }
}