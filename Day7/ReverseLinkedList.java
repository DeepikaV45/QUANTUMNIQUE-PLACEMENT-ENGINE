package Day7;
import java.util.Scanner;

class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}
public class ReverseLinkedList {
    public static Node reverse(Node head){
        Node prv=null;
        Node current=head;
        Node next;
        while(current!= null){
            next=current.next;
            current.next=prv;
            prv=current;
            current=next;
        }
        return prv;   
    }
    public static void printlist(Node head){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.print("null");
    }




    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Node head=new Node(sc.nextInt());
        Node current=head;
        for(int i=1;i<n;i++){
            current.next=new Node(sc.nextInt());
            current=current.next;
        }

       head=reverse(head);
       printlist(head);
    }
}
