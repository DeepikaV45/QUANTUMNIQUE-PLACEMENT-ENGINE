package Day6;
import java.util.Scanner;
public class RemoveDuplicates {
    static int removeDuplicates(int[] nums) {
        if (nums.length==0) {
            return 0;
        }
        int i=0;
        for(int j=1;j<nums.length;j++){
            if(nums[j]!=nums[i]){
                i++;
                nums[i]=nums[j];
            }
        }
        return i+1;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int res=removeDuplicates(arr);
        for(int i=0;i<res;i++){
            System.out.print(arr[i]+" ");
        }
}
}
