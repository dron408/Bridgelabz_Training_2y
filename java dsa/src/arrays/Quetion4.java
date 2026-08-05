//sum of numbers
package Assienment1;

public class Quetion4 {
    public static int sum(int n){
        int sum = 0;
        int original = n;
        while(n>0){
            int digit = n%10;
            sum = sum + digit;
            n=n/10;
        }
        return sum;
    }

    public static void main(String[] args) {
        int n = 123;
        System.out.println(sum(n));
    }
}
