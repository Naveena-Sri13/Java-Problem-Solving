import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Node{
    int data;
    Node left, right;
    Node(int data){
        this.data = data;
        this.left = null;
        this.right = null;
    }
}
class Tree{

    Node root = null;

    public void createTree(int[] arr){
        Queue<Node> que = new LinkedList<>();
        root = new Node(arr[0]);
        que.add(root);

        int i = 1;
        while(i < arr.length){
            Node cur = que.poll();
            cur.left = new Node(arr[i]);
            que.add(cur.left);

            i++;

            if(i >= arr.length) break;

            cur.right = new Node(arr[i]);
            que.add(cur.right);
            i++;
        }
    }

    public void display(){
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            Node cur = q.poll();
            System.out.print(cur.data +" ");
            if(cur.left != null){
                q.add(cur.left);
            }

            if(cur.right != null){
                q.add(cur.right);
            }
        }
    }
}
public class BinaryTree{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Tree ob = new Tree();
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        ob.createTree(arr);
        ob.display();
    }
}
