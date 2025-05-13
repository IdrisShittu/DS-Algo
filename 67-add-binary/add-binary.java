class Solution {
    public String addBinary(String a, String b) {

        int i=a.length()-1, j=b.length()-1, carry=0;
        StringBuilder result = new StringBuilder();

        while(i>=0 && j>=0){
            int val=a.charAt(i)-'0' + b.charAt(j) -'0' +carry;
            System.out.println("val "+val );
                 System.out.println("valmod "+val%2 );
            result.append(val%2);
             System.out.println("car "+carry );
            carry=val/2;
            i--; j--;
        }

        while(i>=0 || j>=0){
            if(i>=0){
                int val=a.charAt(i)-'0'+carry;
                System.out.println("val "+val );
                 System.out.println("valmod "+val%2 );
                result.append(val%2);
                System.out.println("car "+carry );
                carry=val/2;
                i--;
            }
            if(j>=0){
                int val=b.charAt(j)-'0'+carry;
                 System.out.println("val "+val );
                 System.out.println("valmod "+val%2 );
                result.append(val%2);
                 System.out.println("car "+carry );
                carry=val/2;
                j--;
            }
        }

        if(carry!=0)result.append(carry);
        return result.reverse().toString();
        
    }
}