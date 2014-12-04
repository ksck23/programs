/*
 *  Java Program that implements Binary Search Tree
 */

import java.util.Scanner;

/* Class BSTNode */
class BSTNode {
    BSTNode left, right;
    int data;

    /* Constructor */
    public BSTNode () {
        left  = null;
        right = null;
        data  = 0;
    };

    /* Constructor */
    public BSTNode (int n) {
        left  = null;
        right = null;
        data  = n;
    };

    /* Function to set left node */
    public void setLeft (BSTNode n) {
        left = n;
    };

    /* Function to set right node */ 
    public void setRight (BSTNode n) {
        right = n;
    };

    /* Function to get left node */
    public BSTNode getLeft () {
        return left;
    };

    /* Function to get right node */
    public BSTNode getRight () {
        return right;
    };

    /* Function to set data to node */
    public void setData (int d) {
        data = d;
    };

    /* Function to get data from node */
    public int getData () {
        return data;
    };
};
 
/* Class BST */
class BST {
    private BSTNode root;

    /* Constructor */
    public BST () {
        root = null;
    };

    private BSTNode insert (BSTNode node, int data) {
        if (node == null)
            node = new BSTNode(data);
        else {
            if (data <= node.getData())
                node.left = insert(node.left, data);
            else
                node.right = insert(node.right, data);
        }
        return node;
    };

    private BSTNode delete (BSTNode root, int k) {
        BSTNode p, p2, n;
        if (root.getData() == k) {
            BSTNode lt, rt;
            lt = root.getLeft();
            rt = root.getRight();
            if (lt == null && rt == null)
                return null;
            else if (lt == null) {
                p = rt;
                return p;
            } else if (rt == null) {
                p = lt;
                return p;
            } else {
                p2 = rt;
                p  = rt;
                while (p.getLeft() != null)
                    p = p.getLeft();
                p.setLeft(lt);
                return p2;
            }
        }

        if (k < root.getData()) {
            n = delete(root.getLeft(), k);
            root.setLeft(n);
        } else {
            n = delete(root.getRight(), k);
            root.setRight(n);
        }
        return root;
    };

    private int countNodes (BSTNode r) {
        if (r == null)
            return 0;
        else {
            int l = 1;
            l += countNodes(r.getLeft());
            l += countNodes(r.getRight());
            return l;
        }
    };

    private boolean search (BSTNode r, int val) {
        boolean found = false;
        while ((r != null) && !found) {
            int rval = r.getData();
            if (val < rval)
                r = r.getLeft();
            else if (val > rval)
                r = r.getRight();
            else {
                found = true;
                break;
            }
            found = search(r, val);
        }
        return found;
    };

    private void inorder (BSTNode r) {
        if (r != null) {
            inorder(r.getLeft());
            System.out.print(r.getData() +" ");
            inorder(r.getRight());
        }
    };

    private void preorder (BSTNode r) {
        if (r != null) {
            System.out.print(r.getData() +" ");
            preorder(r.getLeft());
            preorder(r.getRight());
        }
    };

    private void postorder (BSTNode r) {
        if (r != null) {
            postorder(r.getLeft());
            postorder(r.getRight());
            System.out.print(r.getData() +" ");
        }
    };

    /* check if tree is empty */
    public boolean isEmpty () {
        return root == null;
    };

    /* insert data */
    public void insert (int data) {
        root = insert(root, data);
    };

    /* delete data */
    public void delete (int k) {
        if (isEmpty())
            System.out.println("Can't delete !!! Tree is Empty.");
        else if (search(k) == false)
            System.out.println("Sorry, data " + k + " is not present");
        else {
            root = delete(root, k);
            System.out.println("data " + k + " is deleted from the tree");
        }
    };

    /* count number of nodes */
    public int countNodes () {
        return countNodes(root);
    };

    /* search for an element */
    public boolean search (int val) {
        return search(root, val);
    };

    /* inorder traversal */
    public void inorder () {
        inorder(root);
    };

    /* preorder traversal */
    public void preorder () {
        preorder(root);
    };

    /* postorder traversal */
    public void postorder () {
        postorder(root);
    };
};

/* Class BinarySearchTree */
public class BinarySearchTree {

    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        /* New BST */
        BST bst = new BST();
        char ch;

        /*  Perform tree operations  */
        do {
            System.out.println("======================================");
            System.out.println("Binary Search Tree Operations");
            System.out.println("======================================\n");
            System.out.println("1. insert");
            System.out.println("2. delete");
            System.out.println("3. search");
            System.out.println("4. count nodes");
            System.out.println("5. check empty");
            System.out.println("6. end");

            /*  Display tree  */
            System.out.print("\nCurrent Tree Status :\n");
            System.out.println("--------------------------------------");
            System.out.print("\nIN   order : ");
            bst.inorder();
            System.out.print("\nPRE  order : ");
            bst.preorder();
            System.out.print("\nPOST order : ");
            bst.postorder();

            System.out.println("\n\n======================================");

            System.out.println("ENTER CHOICE: ");
            int choice = scan.nextInt();

            switch (choice) {
                case 1 :
                    System.out.println("Enter integer element to insert");
                    bst.insert(scan.nextInt());
                    break;
                case 2 :
                    if (bst.isEmpty())
                        System.out.println("Can't delete !!! Tree is Empty.");
                    else {
                        System.out.println("Enter integer element to delete");
                        bst.delete(scan.nextInt());
                    }
                    break;
                case 3 :
                    if (bst.isEmpty())
                        System.out.println("Can't search !!! Tree is Empty.");
                    else {
                        System.out.println("Enter integer element to search");
                        System.out.println("Search result : "
                            + bst.search(scan.nextInt()));
                    }
                    break;
                case 4 :
                    System.out.println("Nodes = "+ bst.countNodes());
                    break;
                case 5 :
                    if (bst.isEmpty())
                        System.out.println("Yes. The tree is empty.");
                    else
                        System.out.println("No. The tree is non-empty.");
                    break;
                case 6 :
                    System.exit(0);
                default :
                    System.out.println("Oops, wrong choice entered."
                        + " Only 1-6 accepted...");
                    break;
            };
        } while (true);
    };
};