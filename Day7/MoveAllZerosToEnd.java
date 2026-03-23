package Day7;
import java.util.Scanner;
public class MoveAllZerosToEnd {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]= new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int size=arr.length;
        if(size ==0 || size==1){
            return;
        }
        int nz=0,z=0;
        while(nz<size){
            if(arr[nz]!=0){
                int temp=arr[nz];
                arr[nz]=arr[z];
                arr[z]=temp;
                nz++;
                z++;
            }else{
                nz++;
            }
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }

        // int count =0;
        // for(int i=0;i<size;i++){
        //     if(arr[i]!=0){
        //         arr[count]=arr[i];
        //         count++;
        //     }
        // }while(count<size){
        //     arr[count]=0;
        //     count++;
        // }
        // for(int i=0;i<n;i++){
        //     System.out.print(arr[i]+ " ");
        // }
    }
}
