import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Node {
    int data;
    Node left, right;

    Node(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

class Tree{

    Node root = null;

    public Node createTree(int[] arr){
        Queue<Node> que = new LinkedList<>();

        root = new Node(arr[0]);
        que.add(root);

        int i = 1;

        while(i < arr.length){
            Node cur = que.poll();

             // Adding Left child
            if(arr[i] != -1){
                cur.left = new Node(arr[i]);
                que.add(cur.left);
            }
            i++;

            if(i >= arr.length) break;

            // Adding right child
            if(arr[i] != -1) {
                cur.right = new Node(arr[i]);
                que.add(cur.right);
            }
            i++;
        }
        return root;
    }

    public void Levelorder(){
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

    public void Inorder(Node root){
        if(root == null){
            return;
        }

        Inorder(root.left);
        System.out.print(root.data +" ");
        Inorder(root.right);
    }

    public void Preorder(Node root){
        if(root == null){
            return;
        }

        System.out.print(root.data +" ");
        Preorder(root.left);
        Preorder(root.right);
    }

    public void Postorder(Node root){
        if(root == null){
            return;
        }

        Postorder(root.left);
        Postorder(root.right);
        System.out.print(root.data +" ");
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

        Node root = ob.createTree(arr);

        System.out.print("The LevelOrder Traversal of the Tree is: ");
        ob.Levelorder();
        System.out.println();

        System.out.print("The InOrder Traversal of the Tree is: ");
        ob.Inorder(root);
        System.out.println();

        System.out.print("The PreOrder Traversal of the Tree is: ");
        ob.Preorder(root);
        System.out.println();

        System.out.print("The PostOrder Traversal of the Tree is: ");
        ob.Postorder(root);
        System.out.println();
    }
}