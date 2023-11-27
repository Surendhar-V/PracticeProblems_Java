package BinaryTree;

public class AVL {
    private Node root ;

    public void insertArr(int[] arr){

        for(int a : arr){

            insert(root , a);

        }
    }
    public void preetyPrint(){

        PreetyPrint(root ,0);

    }
    private void PreetyPrint(Node root , int index){

        if(root==null){
            return;
        }

        PreetyPrint(root.right ,index+1);

        for(int i = 0 ; i<index-1 ; i++){
            System.out.print("|\t\t");
        }

        if(index!=0)
            System.out.println("|------"+root.value+"("+root.height+")");
        else System.out.println(root.value+"("+root.height+")");

        PreetyPrint(root.left , index+1);

    }
    public Node insert(Node node , int value){

        if(root == null){
             root = new Node();
            root.value = value;
            return root;
        }

        if(node == null){
            Node newNode = new Node();
            newNode.value = value;
            return newNode;
        }


        if(value < node.value){
            node.left = insert(node.left , value);
        }
        if(value > node.value){
            node.right = insert(node.right , value);
        }

        node.height = Math.max(getHeight(node.left) , getHeight(node.right))+1;


        return balance(node ,value);
    }
    private Node balance(Node node , int value){

        if(getHeight(node.left) - getHeight(node.right) >1){   //left heavy
            if(getHeight(node.left.left) - getHeight(node.left.right) >0){ // left-right
                return rightRotate(node);
            }
            node.left = leftRotate(node.left);
            return rightRotate(node);
        }

        if(getHeight(node.right) - getHeight(node.left) >1){   //right heavy
            if(getHeight(node.right.right) - getHeight(node.right.left) > 0){ // right-left
                return leftRotate(node);
            }
            node.right = rightRotate(node.right);
            return leftRotate(node);

        }


        return node;
    }
    public Node rightRotate(Node node) {



            Node childRight = node.left.right;
            node.left.right = node;
            node = node.left;
            node.right.left = childRight;

        if(node.left != null) node.left.height = Math.max(getHeight(node.left.left), getHeight(node.left.right)) + 1;
        if(node.right != null) node.right.height = Math.max(getHeight(node.right.left), getHeight(node.right.right)) + 1;
        node.height = Math.max(getHeight(node.left) , getHeight(node.right))+1;

        return node;
    }
    public Node leftRotate(Node node) {

        Node ChildLeft = node.right.left;
        node.right.left = node;
        Node Child = node.right;
        node.right = ChildLeft;
        node = Child;

        if(node.left != null) node.left.height = Math.max(getHeight(node.left.left), getHeight(node.left.right)) + 1;
        if(node.right != null) node.right.height = Math.max(getHeight(node.right.left), getHeight(node.right.right)) + 1;
        node.height = Math.max(getHeight(node.left) , getHeight(node.right))+1;

        return node;
    }
    public int getHeight(Node node){

        if(node == null){
            return -1;
        }

        return node.height;

    }

    public void print(Node node){

        if(node == null){
            return;
        }

        System.out.println(node.value);

        print(node.left);
        print(node.right);

    }
    static class Node {
        int value;
        int height;
        Node left ;
        Node right;

    }

}