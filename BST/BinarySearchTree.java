package BST;

public class BinarySearchTree {
    static class Node{
        int data;
        Node left, right;

        Node(int value){
            data = value;
            left = right = null;
        }
    }

    static Node root;

    BinarySearchTree() {
        root = null;
    }

//---> Insertion
    void insert(int key){
        root = insertRec(root, key);
    }

    Node insertRec(Node root, int key){
        if(root == null){
            root = new Node(key);
            return root;
        }
        if(key < root.data){
            root.left = insertRec(root.left, key);
        }else if(key > root.data){
            root.right = insertRec(root.right, key);
        }
        
        return root;
    }

//---> Searching
    boolean search(int key){
       return searchRec(root, key);
    }

    boolean searchRec(Node root, int key){
        if(root == null) return false;
        if(root.data == key) return true;
        if(root.data > key){
            return searchRec(root.left, key);
        }
        return searchRec(root.right, key);
    }

//---> Types of traversal
    void preorder(Node root){
        if(root != null){
            System.out.print(root.data+" ");
            preorder(root.left);
            preorder(root.right);
        }
    }

    void inorder(Node root){
        if(root != null){
            inorder(root.left);
            System.out.print(root.data+" ");
            inorder(root.right);
        }
    }

    void postorder(Node root){
        if(root != null){
            postorder(root.left);
            postorder(root.right);
            System.out.print(root.data+" ");
        }
    }

//---> Deletion
    Node delete(Node root, int key){
        if(root == null) return null;
        if(root.data == key){
            return helper(root);
        }

        Node dummy = root;
        while(root != null){
            if(root.data < key){
                if(root.right != null && root.right.data == key){
                    root.right = helper(root.right);
                    break;
                }else{
                    root = root.right;
                }
            }else{
                if(root.left != null && root.left.data == key){
                    root.left = helper(root.left);
                    break;
                }else{
                    root = root.left;
                }
            }
        }
        return dummy;
    }

    Node helper(Node root){
        if(root.left == null){
            return root.right;
        }else if(root.right == null){
            return root.left;
        }else{
            Node rightchild = root.right;
            Node lastright = findlastright(root.left);
            lastright.right = rightchild;
            return root.left;
        }
    }

    Node findlastright(Node root){
        if(root.right == null) return root;
        return findlastright(root.right);
    }

    
//---> Main function
    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();

        int[] values = {50,30,20,40,70,60,80};
        for(int val : values){
            bst.insert(val);
        }
        int key = 100;
        System.out.println("Is "+key+" present in BST : "+bst.search(key));

        System.out.print("Preorder Traversal --> ");
        bst.preorder(root);
        System.out.println();

        System.out.print("Inorder Traversal --> ");
        bst.inorder(root);
        System.out.println();

        System.out.print("Postorder Traversal --> ");
        bst.postorder(root);
        System.out.println();

        root = bst.delete(root, 30);
        System.out.print("Tree after deletion of 30: ");
        bst.inorder(root);
    }
}
