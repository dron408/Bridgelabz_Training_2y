class Solution {
    public int findLucky(int[] arr) {
        int[] arr1 = new int[arr.length];
        int[] arr2 = new int[arr.length];
        HashMap<Integer,Integer> m1 = new HashMap<>();
        for(int n:arr){
            m1.put(n,m1.getOrDefault(n,0)+1);
        }
        int max = -1;
        for(int key:m1.keySet()){
            if(key==m1.get(key)){
                max = Math.max(max,key);
            }
        }
        return max;
    }
}