class Solution {
    public int findLeastNumOfUniqueInts(int[] arr, int k) {

        Map<Integer, Integer> count = new HashMap<>();
        for(int num: arr){
            count.put(num,count.getOrDefault(num,0)+1);
        }

        PriorityQueue<Integer> pq = new PriorityQueue<>(count.values());

        while(k>0){
            int l= pq.poll();
            if(l<=k){
                k-=l;
            }else{
                pq.offer(l-k);
                k=0;
            }
        }
        return pq.size();
    }
}