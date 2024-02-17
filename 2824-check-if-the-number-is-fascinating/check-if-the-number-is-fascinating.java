class Solution {
    public boolean isFascinating(int n) {
        int[] freq = new int[10];
        int num = 2*n;

        while(num>0){
            System.out.println("num1 "+num%10);
            freq[num%10]++;
            num/=10;
        }

        num = 3*n;
        while(num>0){
           // System.out.println("num2 "+num%10);
            freq[num%10]++;
            num/=10;
        }

        while(n>0){
            freq[n%10]++;
            n/=10;
        }

        for(int i=1;i<freq.length;i++){
            System.out.println("freq " + freq[i]);
            if(freq[i]!=1)return false;
        }

        return true;
        
    }
}