import java.util.Scanner;

public class firstNonRepeatingCharacter {
    public static char firstnonrepeating(String str){
        int count[]=new int[256];
        for(int i=0;i<str.length();i++){
            count[str.charAt(i)]++;
        }
        for(int i=0;i<str.length();i++){
            if(count[str.charAt(i)]==1){
                return str.charAt(i);
            }
        }
        return '\0';
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        char result=firstnonrepeating(str);
        System.out.print(result);

    }
}
