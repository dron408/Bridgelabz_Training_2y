package leetcode;

import java.util.Arrays;

public class plusone {
    public static int[] plus(int[] arr){
        int[] arr2 = new int[arr.length];

        int newnum = 0;
        for(int i=0;i<arr.length;i++){
            newnum = newnum*10 + arr[i];
        }
        newnum = newnum + 1;
         int i =arr.length-1;
        while(newnum > 0){
            int digit = newnum%10;
            arr2[i] = digit;
            newnum/=10;
            i--;
        }
        return arr2;
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3};
        System.out.println(Arrays.toString(plus(arr)));


    }
}
