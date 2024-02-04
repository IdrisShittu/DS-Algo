import java.math.BigInteger;
class Solution {
    public String removeKdigits(String num, int k) {
       //  System.out.println(num+"-"+k);
        Stack<Character> stck = new Stack<>();
        int popCount=0,i,size;
        if(num.length()==1)return "0";
        for(i=0; i<num.length(); i++){
            while(!stck.empty() && stck.peek()>num.charAt(i) && k>0){
                    k--;
                    stck.pop();
            }
            stck.add(num.charAt(i));
        }
        for(;k>0;k--)stck.pop();

        StringBuilder result= new StringBuilder();
        for(char c: stck)result.append(c);
        if(stck.size()==0)result.append(0);
      //  System.out.println(result+"res");
        return (new BigInteger(result.toString())).toString();



       // while(result.charAt(0)=='0' && result.length()>1)result.deleteCharAt(0);
      //  return result.toString();
    }
}