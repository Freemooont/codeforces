import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.ExecutorService;

public class InvertBinaryTree {

    static class Node {

        private int val;
        Node left;
        Node right;
        public Node(int val) {
            this.val = val;
        }

    }

    static Node root;
    static Node temp = root;

    static void traverse(Node temp) {
        if (temp == null) {
            return;
        }
        traverse(temp.left);
        System.out.print(temp.val + " ");
        traverse(temp.right);
    }

    static void insert(Node temp, int val) {
        if(temp == null) {
            root = new Node(val);
            return;
        }

        Queue<Node> q = new LinkedList<>();
        q.add(temp);

        while (!q.isEmpty()) {
            temp = q.peek();
            q.remove();

            if(temp.left == null) {
                temp.left = new Node(val);
                break;
            } else {
                q.add(temp.left);
            }

            if (temp.right == null) {
                temp.right = new Node(val);
                break;
            } else {
                q.add(temp.right);
            }
        }
    }

    private static Node invertTree(Node root) {
        if (root == null) {
            return root;
        }
        Node left = invertTree(root.left);
        Node right = invertTree(root.right);

        root.right = left;
        root.left = right;

        return root;
    }

    public static void main(String[] args) {
        root = new Node(10);
        root.left = new Node(11);
        root.left.left = new Node(7);
        root.right = new Node(9);
        root.right.left = new Node(15);
        root.right.right = new Node(8);
        System.out.println("Output:");
        traverse(root);
        System.out.println();
        traverse(invertTree(root));

/*        insert(root, 12);
        insert(root, 12);
        insert(root.right.right, 12);
        System.out.println("\nOutput2:");

        traverse(root);*/
    }
}
