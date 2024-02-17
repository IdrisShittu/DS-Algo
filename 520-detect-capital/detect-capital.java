class Solution {
    public boolean detectCapitalUse(String word) {
        System.out.println("1");
         if (word.equals(word.toUpperCase())) return true;
          System.out.println("2");
        if (word.equals(word.toLowerCase())) return true;
     System.out.println("3");
        // Use StringBuilder for manipulation
        StringBuilder sb = new StringBuilder(word.toLowerCase());
        sb.setCharAt(0, Character.toUpperCase(sb.charAt(0)));
        System.out.println("3 "+sb);
        System.out.println("3 "+word);
        if (word.equals(sb.toString())) return true;

        return false; 
    }
}