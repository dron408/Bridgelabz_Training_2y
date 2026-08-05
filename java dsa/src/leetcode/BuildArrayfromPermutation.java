package leetcode;

import java.util.Arrays;

public class BuildArrayfromPermutation {
    public static void main(String[] args){
        int[] nums = {0,2,1,5,4,3};
        System.out.print(Arrays.toString(array(nums)));
    }
    public static int[] array(int[] nums){
        int[] arr2 = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            arr2[i] = nums[nums[i]];
        }
        return arr2;

    }
}
