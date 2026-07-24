import java.util.Scanner;

class node {
    int data;
    node left;
    node right;

    node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}

class operations {
    node root = null;

    // Insert into BST
    public void insert(int data) {
        node nn = new node(data);

        if (root == null) {
            root = nn;
            return;
        }

        node temp = root;

        while (true) {
            if (data < temp.data) {
                if (temp.left == null) {
                    temp.left = nn;
                    break;
                } else {
                    temp = temp.left;
                }
            } else {
                if (temp.right == null) {
                    temp.right = nn;
                    break;
                } else {
                    temp = temp.right;
                }
            }
        }
    }

    // Inorder Traversal
    public void inorder(node root) {
        if (root != null) {
            inorder(root.left);
            System.out.print(root.data + " ");
            inorder(root.right);
        }
    }

    // Preorder Traversal
    public void preorder(node root) {
        if (root != null) {
            System.out.print(root.data + " ");
            preorder(root.left);
            preorder(root.right);
        }
    }

    // Postorder Traversal
    public void postorder(node root) {
        if (root != null) {
            postorder(root.left);
            postorder(root.right);
            System.out.print(root.data + " ");
        }
    }
}

public class tree_traversal {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        operations obj = new operations();

        while (true) {
            System.out.println("\n1.Insert");
            System.out.println("2.Inorder");
            System.out.println("3.Preorder");
            System.out.println("4.Postorder");
            System.out.println("5.Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter value: ");
                    int n = sc.nextInt();
                    obj.insert(n);
                    break;

                case 2:
                    System.out.println("Inorder Traversal:");
                    obj.inorder(obj.root);
                    System.out.println();
                    break;

                case 3:
                    System.out.println("Preorder Traversal:");
                    obj.preorder(obj.root);
                    System.out.println();
                    break;

                case 4:
                    System.out.println("Postorder Traversal:");
                    obj.postorder(obj.root);
                    System.out.println();
                    break;

                case 5:
                    System.exit(0);

                default:
                    System.out.println("Invalid Choice");
            }
        }
    }
}
