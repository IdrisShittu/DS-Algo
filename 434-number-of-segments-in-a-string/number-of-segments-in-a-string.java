class Solution {
    public int countSegments(String s) {
        int count=0; boolean charSeen=false;
        if(s.length()==0)return 0;
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)==' ' && charSeen){
                charSeen=false;
                count++;
            }
            if(s.charAt(i)!=' ')charSeen=true;
        }
        return (charSeen)?count+1:count;
    }
}