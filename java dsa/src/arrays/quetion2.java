//palindrome;
package Assienment1;

public class quetion2 {
    public static int digit(int n){
        int original = n;
        int newnum = 0;
       while(n>0){
           int digit = n%10;
           newnum = newnum*10  + digit;
            n/=10;
       }
        return newnum;
    }
    public static boolean check(int n){
        if(digit(n)==n){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String args[]){
        int n=111;
        System.out.println(check(n));
    }
}
