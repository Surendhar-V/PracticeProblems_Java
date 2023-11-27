package BinaryTree;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

//        Scanner scanner = new Scanner(System.in);
//
//        BinaryTree tree =new  BinaryTree();
//
//        tree.populate(scanner);
//        tree.display();
//        tree.preetyPrint();

        BinarySearchTree bst = new BinarySearchTree();

        bst.addArray(new int[] {4,2,6,1,3,5,7});

        bst.preetyPrint();
        bst.traverse(traversal.POSTORDER);
        bst.traverse(traversal.INORDER);
        System.out.println(bst.isBalanced());


        AVL tree = new AVL();

        int[] arr = {20,17,23,14,18,24,11,15,16};

        //int[] arr = {10,9,20,30,28};

        tree.insertArr(arr);
        BinarySearchTree tree2 = new BinarySearchTree();
        tree2.addArray(arr);

        tree.preetyPrint();
        System.out.println();
        System.out.println();
        tree2.preetyPrint();
        System.out.println(tree2.isBalanced());



    }
}