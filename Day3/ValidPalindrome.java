import java.util.Scanner;
public class ValidPalindrome {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        str=str.toLowerCase().replaceAll("[^a-zA-Z0-9]","");
        int left=0;
        int right=str.length()-1;
        boolean res= true;
        while(left<right){
            if(str.charAt(left)!=str.charAt(right)){
                res=false;
                break;
            }else{
                left++;
                right--;
            }
        }
        System.out.print(res);
    }
}
