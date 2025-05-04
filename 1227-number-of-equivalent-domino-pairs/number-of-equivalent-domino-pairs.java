class Solution {
    public int numEquivDominoPairs(int[][] dominoes) {
        Map<Integer,Integer> count = new  HashMap<Integer,Integer>();
        int result = 0;
        for(int domino[] : dominoes){
            int a = domino[0];
            int b = domino[1];

            int key = a>b? a*10+b : b*10+a;
            result+=count.getOrDefault(key,0);
            count.put(key, count.getOrDefault(key,0)+1);
        }
        return result;
    }
}