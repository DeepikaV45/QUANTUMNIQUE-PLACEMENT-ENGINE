package Day9;
import java.util.Scanner;

public class SecontMaximumNum {
    public static int SecontLargest(int arr[]){
        int max=0;
        int secontmax=0;
        if(arr[0]>arr[1]){
            max=arr[0];
            secontmax=arr[1];
        }else{
            max=arr[1];
            secontmax=arr[0];
        }
        for(int i=2;i<arr.length;i++){
            if(arr[i]>max){
                secontmax=max;
                max=arr[i];
            }else if(arr[i]>secontmax){
                secontmax=arr[i];
            }
        }
        return secontmax;
    }

    
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.print(SecontLargest(arr));
    }
}
