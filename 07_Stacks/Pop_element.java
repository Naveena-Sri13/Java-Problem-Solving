import java.util.Scanner;

class node8{
    int data;
    node8 next;
    node8(int data){
        this.data=data;
        this.next=null;
    }
}

class operations8{
    node8 top= null;

    public void insert(int n){
        node8 nn=new node8(n);
        if(top==null){
            top=nn;
        }
        else{
            nn.next=top;
            top=nn;
        }
    }

    public void delete() {
        if (top == null) {
            System.out.println("Stack is empty");
            return;
        }

        top = top.next;
    }

    public void display(){
        node8 temp=top;
        while(temp!= null){
            System.out.println(temp.data + " ");
            temp=temp.next;
        }
    }
}

public class insertion_beginning {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        operations8 ob=new operations8();
        int n=sc.nextInt();
        for (int i=0;i<n;i++){
            int a =sc.nextInt();
            ob.insert(a);
        }
        ob.delete();

        ob.display();
    }
}
