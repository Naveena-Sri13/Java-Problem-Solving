import java.util.Scanner;

class node7{
    int data;
    node7 next;
    node7(int data){
        this.data=data;
        this.next=null;
    }
}

class operations7{
    node7 top=null;

    public void insert(int n){
        node7 nn=new node7(n);
        if(top==null){
            top=nn;
        }
        else{
            nn.next=top;
            top=nn;
        }
    }

    public void insertPosition(int ele, int pos){
        node7 nn = new node7(ele);

        if(pos == 1){
            nn.next = top;
            top = nn;

        }

        node7 temp = top;

        for(int i=1; i<pos-1 && temp!=null; i++){
            temp = temp.next;
        }

        if(temp == null){
            System.out.println("Invalid Position");

        }

        nn.next = temp.next;
        temp.next = nn;
    }


    public void display(){
        node7 temp=top;
        while(temp!=null){
            System.out.println(temp.data + " ");
            temp=temp.next;
        }
    }
}

public class insertion_end {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        operations7 ob=new operations7();
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            int a=sc.nextInt();
            ob.insert(a);
        }
        System.out.println("Enter the elemnet to insert:");
        int ele=sc.nextInt();

        System.out.println("Enter the position of elemnet to be inserted:");
        int pos = sc.nextInt();

        ob.insertPosition(ele, pos);

        ob.display();
    }
}
