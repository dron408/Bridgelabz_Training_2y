class Solution {
    public int busyStudent(int[] startTime, int[] endTime, int queryTime) {
        int n = startTime.length;
        int n2 = endTime.length;
        int count=0;

        for(int i=0;i<n;i++){
            if(endTime[i] > queryTime && startTime[i]<queryTime){
                count++;
            }
            else if(endTime[i] == queryTime || startTime[i]==queryTime){
                count++;
            }
        }
        return count;
    }
}