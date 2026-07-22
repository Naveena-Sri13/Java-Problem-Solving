import java.util.Scanner;
class node{
    int data;
    node next;
    node(int data){
        this.data=data;
        this.next=null;
    }
}

class operations{
    node head=null;
    node tail=null;

    public void insert(int n){
        node nn=new node(n);
        if(head== null){
            head=nn;
            tail=nn;
        }
        else{
            tail.next=nn;
            tail=nn;
        }
    }

    public void display(){
        node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }
}
 public class LinkedList{
     public static void main(String[] args){
         Scanner sc=new Scanner(System.in);
         operations ob=new operations();

         int n=sc.nextInt();
         for (int i=0;i<n;i++){
             int a=sc.nextInt();
             ob.insert(a);
         }
         ob.display();
     }
 }
