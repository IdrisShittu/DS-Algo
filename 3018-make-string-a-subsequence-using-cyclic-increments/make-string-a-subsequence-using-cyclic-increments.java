class Solution {
    public boolean canMakeSubsequence(String str1, String str2) {
        char st[] = str1.toCharArray();
        char sub[] = str2.toCharArray();
        
        
        
        int i=0,j=0;
        while(i<sub.length && j<st.length ){
            
            if(sub[i]==st[j]){
                i++;
                j++;
                System.out.println("In"+" "+i+" "+j);
            }else{
                if(st[j]=='z')st[j]='a';
                else {
                   
                    st[j] =(char)('a' + Character.getNumericValue(st[j]) -10 +1);
                  
                }
                if(sub[i]==st[j]){
                     i++;
                     j++;
                }else{
                    j++;
                }
            }
        }
                   
        if(i>=sub.length)return true;
        else return false;
    }
}