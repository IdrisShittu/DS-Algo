class Solution {
    public int[] separateDigits(int[] nums) {
        int[] result=new int[10000];
        int j=0,divider;
        for(int i:nums){
            divider=10;
            divider=(int)Math.pow(divider,Integer.toString(i).length()-1);
            while(i>0){
                if(divider==0)break;
                result[j++]=(i/divider)%10;
                divider/=10;
            }
            
        }
        return Arrays.copyOfRange(result,0,j);
    }
}