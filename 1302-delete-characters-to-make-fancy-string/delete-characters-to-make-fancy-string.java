class Solution {
    public String makeFancyString(String s) {
        int count=0;
        char prev='@';
        char str[]=s.toCharArray();
        
        for(int i=0; i<str.length; i++){
            if(str[i]==prev)count++;
            else count=1;
            prev=str[i];
            if(count>=3)str[i]='@';
        }

        StringBuilder res = new StringBuilder();
        for(int i=0; i<str.length; i++){
            if(str[i]=='@')continue;
            res.append(str[i]);
        }

        return res.toString();
        
    }
}