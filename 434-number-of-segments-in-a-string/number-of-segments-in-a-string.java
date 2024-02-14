class Solution {
    public int countSegments(String s) {
        int count=0;
        String str[] = s.split(" ");
        for(String st: str){
            if(st.length()!=0)count++;
        }
        return count;
    }
}