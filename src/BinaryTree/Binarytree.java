package BinaryTree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Binarytree<T> {



        T value;
    Binarytree right;
    Binarytree left;


    Binarytree(T value) {
                this.value = value;
                this.right = null;
                this.left = null;

            }


            public void DFSrecursive(Binarytree<T> tree,LinkedList<T> arr){

            if(tree==null){
                return ;
            }
                arr.add(tree.value);
                DFSrecursive(tree.left,arr);
                DFSrecursive(tree.right,arr);

            }

            public void BFSiterative(Binarytree<T> tree, Queue<T> arr){

            Queue<Binarytree>brr=new LinkedList<>();

            brr.add(tree);

            while(!brr.isEmpty()){

                Binarytree temp=brr.poll();
                arr.add((T) temp.value);

                if(temp.left!=null){
                    brr.add(temp.left);
                }
                if(temp.right!=null){
                    brr.add(temp.right);
                }


            }



            }





}



                                        /*


                                        a
                                      /    \
                                     b      c
                                   /  \    /  \
                                  d    e  f    g


                                         */










