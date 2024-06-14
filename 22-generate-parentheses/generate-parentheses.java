class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        generate(n, result, "", 0, 0);
        return result;
    }
    
    public void generate(int n, List<String> result, String temp, int open, int close){
        
        if(open == close && n==open ){
            result.add(temp);
            return;
        }
        
        if(open>n || close>n) return;
      //  System.out.println(temp);
        generate(n, result, temp+"(", open+1, close);
        if(close<open) generate(n, result, temp+")", open, close+1);
    }
}