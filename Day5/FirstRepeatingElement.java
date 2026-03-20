package Day5;
import java.util.Scanner;

public class FirstRepeatingElement{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);        
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int result=-1;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    result=arr[i];
                    break;
                }
            }
            if(result!=-1){
                break;
            }
        }
        
        if(result!=-1){
            System.out.println(result);
        } else {
            System.out.println("No repeating element found");
        }
        
        sc.close();
    }
}