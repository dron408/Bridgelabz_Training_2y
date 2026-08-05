//febunachi series;
package Assienment1;

public class quetion5 {
    public static void fac(int n) {
        int first=0;
        int second=1;

        for(int i=0;i<n;i++){
            System.out.println(first+" ");
            int next = first+second;
            first = second;
            second = next;
       }
   }

    public static void main(String[] args) {
        int n=5;
        fac(n);
    }
}