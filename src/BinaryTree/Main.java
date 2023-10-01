package BinaryTree;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Main{
    public static void main(String[] args){


        Binarytree<Integer> tree=new Binarytree<>(1);

        tree.left=new Binarytree<>(2);
        tree.left.left=new Binarytree<>(3);
        tree.left.right=new Binarytree<>(4);
        tree.right=new Binarytree<>(5);

        LinkedList<Integer> arr=new LinkedList<>();
        tree.DFSrecursive(tree,arr);
        System.out.println(arr);

        Queue<Integer> brr=new LinkedList<>();
        tree.BFSiterative(tree,brr);
        System.out.println(brr);


    }




}