package BST;

import java.util.*;

public class BinaryTree {
    static class Node{
        int data;
        Node left, right;

        Node(int data){
            this.data = data;
        }
    }
    Node root;

    BinaryTree() {
        root = null;
    }

    void insert(int data){
        Node newnode = new Node(data);
        if(root == null){
            root = newnode;
            return;
        }

        Queue<Node> q = new LinkedList<>();
        q.add(root);

        while(!q.isEmpty()){
            Node temp = q.poll();
            if(temp.left == null){
                temp.left = newnode;
                break;
            }else q.add(temp.left);

            if(temp.right == null){
                temp.right = newnode;
                break;
            }else q.add(temp.right);
        }
    }

    void inorder(Node node){
        if(node != null){
            inorder(node.left);
            System.out.print(node.data+" ");
            inorder(node.right);
        }
    }

    void iterativeInorder(Node root){
        if(root == null) return;
        Stack<Node> st = new Stack<>();
        Node node = root;
        while(true){
            if(node != null){
                st.push(node);
                node = node.left;
            }
            else{
                if(st.isEmpty()) break;
                node = st.pop();
                System.out.print(node.data+" ");
                node = node.right;
            }
        }
    }    

    void preorder(Node node){
        if(node != null){
            System.out.print(node.data+" ");
            preorder(node.left);
            preorder(node.right);
        }
    }

    void iterativePreorder(Node root){
        Stack<Node> st = new Stack<>();
        if(root == null) return;
        st.push(root);

        while(!st.isEmpty()){
            Node curr = st.pop();
            System.out.print(curr.data+" ");
            if(curr.right != null) st.push(curr.right);
            if(curr.left != null) st.push(curr.left);
        }

    }

    void postorder(Node node){
        if(node != null){
            postorder(node.left);
            postorder(node.right);
            System.out.print(node.data+" ");
        }
    }

    void iterativePostorder(Node root){
        if(root == null) return;

        Stack<Node> st1 = new Stack<>();
        Stack<Node> st2 = new Stack<>();
        st1.push(root);
        while(!st1.isEmpty()){
            Node curr = st1.pop();
            st2.add(curr);

            if(curr.left != null) st1.push(curr.left);
            if(curr.right != null) st1.push(curr.right);
        }

        while(!st2.isEmpty()){
            Node val = st2.pop();
            System.out.print(val.data+" ");
        }
    }

    void levelorder(Node root){
        if(root == null) return;
        Queue<Node> q = new LinkedList<>();
        q.offer(root);

        int level = 0;
        while(!q.isEmpty()){
            int size = q.size();
            System.out.print("Level " +level+ " --> ");
            for(int i = 0;i<size;i++){
                Node temp = q.poll();
                System.out.print(temp.data + " ");
                if(temp.left != null) q.offer(temp.left);
                if(temp.right != null) q.offer(temp.right);
            }
            System.out.println();
            level++;
        }
    }

    public static void main(String[] args) {
           BinaryTree bt = new BinaryTree();
           bt.insert(1);
           bt.insert(2);
           bt.insert(3);
           bt.insert(4);
           bt.insert(5);
           bt.insert(6);
           bt.insert(7);

           System.out.print("(Recursive) Inorder Traversal ---> ");
           bt.inorder(bt.root);
           System.out.println();

           System.out.print("(Iterative) Inorder Traversal ---> ");
           bt.iterativeInorder(bt.root);
           System.out.println();
           
           System.out.print("(Recursive) Preorder Traversal ---> ");
           bt.preorder(bt.root);
           System.out.println();

           System.out.print("(Iterative) Preorder Traversal ---> ");
           bt.iterativePreorder(bt.root);
           System.out.println();

           System.out.print("(Recursive) Postorder Traversal ---> ");
           bt.postorder(bt.root);
           System.out.println();

           System.out.print("(Iterative) Postorder Traversal ---> ");
           bt.iterativePostorder(bt.root);
           System.out.println();
           
           System.out.println("level order Traversal : ");
           bt.levelorder(bt.root);
           
    }
}