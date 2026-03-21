package Day6;
import java.util.Scanner;
public class FirstNonRepeatingElement {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<arr.length;i++){
            boolean rep=false;
            for(int j=0;j<arr.length;j++){
                if(i!=j && arr[i]==arr[j]){
                    rep=true;
                    break;
                }
            }
            if(!rep){
                System.out.print(arr[i]);
                break;
            }
        }
    }
}
