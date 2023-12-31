class dummy{

    public static void main(String[] args){

      node obj1 = new node(1);
      obj1.right = new node(2);
      obj1.left = new node(3);

      obj1.right.right = new node(4);
      obj1.right.left = new node(5);

      obj1.left.right = new node(6);
      obj1.left.left = new node(7);

      insert(obj1 , 10);
      insert(obj1 , 11);
      preOrder(obj1);

    }

    public static void preOrder(node node){

        if(node == null){
            return;
        }

        System.out.println(node.value);

        preOrder(node.left);
        preOrder(node.right);


    }

    public static void inOrder(node node){

        if(node == null){
            return;
        }

        inOrder(node.left);

        System.out.println(node.value);

        inOrder(node.right);

    }

    public static void postOrder(node node){

    if(node == null){
        return;
    }

    postOrder(node.left);
    postOrder(node.right);


    System.out.println(node.value);

    }

    public static boolean insert(node node , int value){

        if(node.left==null){
            node.left = new node(value);
            return true;
        }else if(node.right == null){
            node.right = new node(value);
            return true;
        }

        if(insert(node.left , value)){
          return true;
        }

        if(insert(node.right , value)){
            return true;
        }

        return false;

    }

    static class node {

        node right;
        node left;
        int value;

        node(int value){
            this.value = value;
        }




    }



}