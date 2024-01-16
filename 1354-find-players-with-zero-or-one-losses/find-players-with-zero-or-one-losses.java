class Solution {
    public List<List<Integer>> findWinners(int[][] matches) {
        HashMap<Integer,Integer> mp = new HashMap<Integer,Integer>();
        List<List<Integer>> rs = new ArrayList<>();
        SortedSet fr = new TreeSet(); 
        SortedSet sc = new TreeSet(); 
        
        rs.add(new ArrayList<>());
        rs.add(new ArrayList<>()); 

        for(int i=0; i<matches.length; i++){
            mp.put(matches[i][1], mp.getOrDefault(matches[i][1],0)+1 );
        }

        for(int i=0; i<matches.length; i++){
            if(!mp.containsKey(matches[i][0])){
                fr.add(matches[i][0]);
            }
        }

        for(int i=0; i<matches.length; i++){
            if (mp.getOrDefault(matches[i][1], 0) == 1 ) {
                sc.add(matches[i][1]);
            }
        }

        rs.get(0).addAll(fr);
        rs.get(1).addAll(sc);

        return rs;
        
    }
}