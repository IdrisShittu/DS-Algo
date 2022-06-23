/*
Given a string s, find the length of the longest substring without repeating characters.

 

Example 1:

Input: s = "abcabcbb"
Output: 3
Explanation: The answer is "abc", with the length of 3.

O(2N)*/

public class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character,Integer> str = new HashMap<Character,Integer>(); 
        int start=0; int len=0;
        for(int i=0; i<s.length(); i++){
            while(str.containsKey(s.charAt(i))){
                str.remove(s.charAt(start++));
            }
            str.put(s.charAt(i),1);
            len=Math.max(i-start+1,len);
        }
        return len;
    }
}


/* O(n)
public class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character,Integer> str = new HashMap<Character,Integer>(); 
        int start=0; int len=0;
        for(int i=0; i<s.length(); i++){
            if(str.containsKey(s.charAt(i))){
                start=Math.max(
                    (str.get(s.charAt(i))+1),start );
            }
               
          
            str.put(s.charAt(i),i);
            len=Math.max(i-start+1,len);
           
        }
        return len;
    }
}

*/
