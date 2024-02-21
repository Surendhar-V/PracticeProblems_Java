public class permutation_strings{

    public static void main(String[] args){

        // printing the permutations of string using recursion
        StringBuilder p = new StringBuilder();
        permutations(p, "abc");
    }

    private static void permutations(StringBuilder p  , String up  )
    {
        if(up.isEmpty()){

            System.out.println(p);
            return;

        }


        int size = p.length()+1;
        for(int i =0;i<size ; i++){

            permutations(p.insert(i ,up.charAt(0)) , up.substring(1));
            p.deleteCharAt(i);

        }
    }

}




/*
INTUITION - There will be two stringbuffer . P - processed and unprocessed .
             Unprocessed string will be having the main string .
             At each recursive call the element at the index i of UP will be appended to  p .
             When UP becomes null the value of P will be printed .


             Backtracking is used for unmake the made changes for the recursive call .


 */








/*
public class permutation_strings{
    public static void main(String[] args){


        StringBuffer up = new StringBuffer("abc");
        StringBuffer p = new StringBuffer("");

        permutations(p , up);

    }

    private static String  a = "abc";
    public static void permutations(StringBuffer p , StringBuffer up ){


        if( up.length() == 0){
            System.out.println(p);

            return ;
        }

        int size = up.length() ;
        for(int i = 0 ; i<size ; i++){
            permutations( p.append( up.charAt(i)) , up.deleteCharAt(i));


            up.insert(i , p.charAt(p.length()-1) );
            p.deleteCharAt(p.length()-1);

        }




    }

}
*/
