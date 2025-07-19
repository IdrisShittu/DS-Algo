class Solution {
    public List<String> removeSubfolders(String[] folder) {
        Arrays.sort(folder);
        List<String> arr= new LinkedList<>();
        int i=0,j=1;
        while(i<folder.length && j<folder.length){
            if(isSubFolder(folder[i],folder[j])){
                j++;
            }else{
                arr.add(folder[i]);
                i=j;
                j=i+1;
            }

        }
        arr.add(folder[i]);

        return arr;
    }

    Boolean isSubFolder(String s,String t){
        if(s.length()>=t.length())return false;
        String[] a = s.split("/");
        String[] b = t.split("/");
        for(int i=0; i<a.length; i++){
            if(!(a[i]).equals(b[i]))return false;
            System.out.println(" "+a[i]);
            System.out.println(b[i]);
        }
        return true;
    }
}