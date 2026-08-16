class Solution {
    public int minNumber(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int newnum = 0;
        for(int i=0;i<nums1.length;i++){
            for(int j=0;j<nums2.length;j++){
                if(nums1[i]==nums2[j]){
                    return nums1[i];
                }
            }
        }
        if(nums1[0]>nums2[0]){
            newnum = newnum*10 + nums2[0];
            newnum = newnum*10 + nums1[0];
        }
        else{
            newnum = newnum*10 + nums1[0];
            newnum = newnum*10 + nums2[0];
        }
        
        return newnum;
    }
}