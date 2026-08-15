class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2){
        boolean[] used = new boolean[arr1.length];
        List<Integer> l1 = new ArrayList<>();
        int[] arr = new int[arr1.length];
        int j = 0;
        int k=0;
        int i=0;
        
        while(i<arr2.length){
            int num = arr2[i];
            while(k<arr1.length){
                if(arr1[k]==num){
                    arr[j]=num;
                    j++;
                    used[k]=true;
                }
                k++;
            }
            k=0;
            i++;
        }

        for(k=0;k<arr1.length;k++){
            if(!used[k]){
                l1.add(arr1[k]);
            }
        }
        Collections.sort(l1);
        for(int z=0;z<l1.size();z++){
            arr[j] = l1.get(z);
            j++;
        }
        
        
        return arr;  
    }
}