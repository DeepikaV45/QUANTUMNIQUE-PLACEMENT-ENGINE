package Day5;
import java.util.Scanner;
public class SquareRootOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n < 0) {
            System.out.println("Invalid input");
            return;
        }
        if (n == 0 || n == 1) {
            System.out.println(n);
            return;
        }
         long low = 1, high = n, ans = 0;
        
        while (low <= high) {
            long mid = low + (high - low) / 2;
            
            if (mid * mid == n) {
                ans = mid;
                break;
            } else if (mid * mid < n) {
                ans = mid;
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        
        System.out.println(ans);
}
}
