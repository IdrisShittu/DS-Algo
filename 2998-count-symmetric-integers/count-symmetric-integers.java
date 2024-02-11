class Solution {
    public int countSymmetricIntegers(int low, int high) {
        String s; int count=0;
        for(int i=low;i<=high;i++){
            s=Integer.toString(i);
            if(s.length()%2!=0)continue;

            int j=0,k=s.length()-1,sum1=0,sum2=0;
            while(j<k){
                sum1+=s.charAt(j++);
                sum2+=s.charAt(k--);
            }
            if(sum1==sum2)count++;
           /* System.out.println("i-"+i);
            System.out.println("j-"+j);
            System.out.println("k-"+k);
            System.out.println("sum-"+sum);
             System.out.println("count-"+count);*/
        }
        return count;
    }
}