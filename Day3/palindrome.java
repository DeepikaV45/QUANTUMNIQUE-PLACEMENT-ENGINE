import java.util.Scanner;
public class palindrome{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(ispalindrome(n)){
            System.out.print("True");
        }else{
            System.out.print("False");
        }
    }
        public static boolean ispalindrome(int n){
            int org=n;
            int rev=0;
            while(n>0){
                int dig=n%10;
                rev=(rev*10)+dig;
                n/=10;
            }
            return org==rev;
        }
}
