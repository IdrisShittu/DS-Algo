class Solution {
    public int countSymmetricIntegers(int low, int high) {
        int count=0, sum, num,j;
        Stack<Integer> myStack = new Stack<>();

        for(int i=low;i<=high;i++){
            if(i<10)continue;
            num=i;
          //  System.out.println("Num-"+num);
            while(num>0){
                myStack.push(num%10);
                num/=10;
            }

            if(myStack.size()%2!=0)continue;

            num=myStack.size();
            sum=0;
            j=1;
           // System.out.println("Stack-"+myStack);
            while(j<=num/2){
                //System.out.println("First-"+myStack.peek());
                sum+=myStack.pop();
                //System.out.println("Sum-"+sum);
                j++;
            }
            while(j<=num){
               // System.out.println("Second-"+myStack.peek());
                sum-=myStack.pop();
               // System.out.println("Sum-"+sum);
                j++;
            }

            if(sum==0)count++;
        }
        return count;
    }
}