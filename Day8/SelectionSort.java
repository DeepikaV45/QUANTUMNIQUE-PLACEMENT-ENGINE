package Day8;
import java.util.Scanner;

public class SelectionSort{
    public static void Sort(int arr[]){
        for(int i=0;i<arr.length;i++){
            int min=arr[i];
            int indexmin=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<min){
                    min=arr[j];
                    indexmin=j;
                }
            }
            int temp=arr[i];
            arr[i]=arr[indexmin];
            arr[indexmin]=temp;
        }
    }

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        Sort(arr);
        for(int i=0;i<n;i++){
        System.out.print(arr[i]+" ");
        }

    }
}