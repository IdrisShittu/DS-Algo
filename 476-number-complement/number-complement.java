class Solution {
    public int findComplement(int num) {
        
        String n = Integer.toBinaryString(num);
        String res="";
        
        for(int i=0; i<n.length(); i++){
            if(n.charAt(i)=='1')res=res+"0";
            else res=res+"1";
        }
        
        return Integer.parseInt(res,2);
        
    }
}