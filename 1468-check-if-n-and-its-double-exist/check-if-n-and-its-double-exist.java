class Solution {
    public boolean checkIfExist(int[] arr) {
       
        /**using for loop
        for(int i=0; i< arr.length; i++){
           for(int j=i+1; j< arr.length; j++){ 
               if(arr[j]*2==arr[i]||arr[i]*2==arr[j] ) return true;
           }
        }    
        return false;      
        **/
        HashMap<Integer,Integer> hArr = new HashMap<Integer,Integer>();
        
        for(int a : arr){
           if( hArr.containsKey(a*2)|| ( (a%2==0)&&hArr.containsKey(a/2) ) ) return true;
           else hArr.put(a,1);        
        }
        
        return false;
        
        
    }
}