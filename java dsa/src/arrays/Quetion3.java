//isprime;
package Assienment1;

public class Quetion3 {
    public static boolean prime(int n){
        if(n<=1){
            return false;
        }
        for(int i=2;i*i<=n;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String args[]){
        int n=3;
        System.out.println(prime(n));
    }
}
