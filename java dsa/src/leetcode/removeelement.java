package leetcode;

public class removeelement {
    public static void main(String[] args) {
        int arr[] = {3,2,2,3};
        System.out.println(remove(arr,2));
    }
    public static int remove(int[] arr,int n){
        int k=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i] != n){
                k++;
            }
        }
        return k;
    }
}
