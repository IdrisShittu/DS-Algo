class Solution {
    public String customSortString(String order, String s) {
        Set<Character> st = new HashSet<>();
        Set<Character> st2 = new HashSet<>();
        StringBuilder result = new StringBuilder();
        char[] count = new char[26];
       
        for(char c: s.toCharArray()){
            st2.add(c);
            count[c-'a']++;
        }

        for(char c: order.toCharArray()){
            if(st2.contains(c)){
                 st.add(c);
                 if(count[c-'a']>=1){
                     while(count[c-'a']>0){
                          result.append(c);
                          count[c-'a']--;
                     }
                 }
             
            }
        }

        for(char c: s.toCharArray()){
            if(!st.contains(c)){
                if(count[c-'a']>=1){
                     while(count[c-'a']>0){
                          result.append(c);
                          count[c-'a']--;
                     }
                 }
            }
        }
        return result.toString(); 
    }
}