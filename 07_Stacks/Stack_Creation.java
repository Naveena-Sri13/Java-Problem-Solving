import java.util.Scanner;
class node6{
    int data;
    node6 next;
    node6(int data){
        this.data=data;
        this.next=null;
    }
}
class operation6{
    node6 top=null;

    public void insert(int n){
        node6 nn=new node6(n);
        if(top==null){
            top=nn;
        }
        else{
            nn.next=top;
            top=nn;
        }
    }
    public void display(){
        node6 temp=top;
        while(temp!=null){
            System.out.print(temp.data +" ");
            temp=temp.next;
        }
        System.out.println();
    }
}

public class stack {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        operation6 ob=new operation6();

        int n=sc.nextInt();
        for (int i=0;i<n;i++){
            int a=sc.nextInt();
            ob.insert(a);
        }
        ob.display();
    }
}
