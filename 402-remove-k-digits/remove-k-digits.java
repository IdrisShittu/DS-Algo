import java.math.BigInteger;
class Solution {
    public String removeKdigits(String num, int k) {
        Stack<Character> stck = new Stack<>();
        for(int i=0; i<num.length(); i++){
            while(!stck.empty() && stck.peek()>num.charAt(i) && k>0){
                    k--;
                    stck.pop();
            }
            stck.add(num.charAt(i));
        }
        for(;k>0;k--)stck.pop();

        StringBuilder result= new StringBuilder();
        for(char c: stck){
            if(c=='0'&& result.length()==0)continue;
            result.append(c);
        }
        if(result.length()==0)return "0";
        return result.toString();

    }
}