package Day2;

import java.util.Scanner;

public class MaximumSubarray {

    static int MaxSubArray(int[] arr){
        int sum=arr[0];
        int maxsum=arr[0];
        for(int i=1;i<arr.length;i++){
            if(sum>=0){
                sum=sum+arr[i];
            }else{
                sum=arr[i];
            }
            if(sum>maxsum){
                maxsum=sum;
            }
        }
        return maxsum;
        
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.print(MaxSubArray(arr));
    }
}
