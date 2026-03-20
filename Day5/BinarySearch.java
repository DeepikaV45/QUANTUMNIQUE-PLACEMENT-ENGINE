package Day5;
import java.util.Scanner;

public class BinarySearch {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int nums[]=new int[n];
        for(int i= 0;i<n;i++){
            nums[i]=sc.nextInt();
        }
        int target = sc.nextInt();
        int result = -1;
        int start = 0;
        int end = n - 1;

            while(start<=end) {
            int mid = start + (end - start) / 2;
            
            if (nums[mid] == target) {
                result = mid;
                break;
            } else if (nums[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        
        System.out.println(result);
    }
}
