/*

INTUITION - This algorithm is based on TAKEN and NOT TAKEN A approach.


 */

public class subsequence {

    public static void main(String[] args) {

         String p = "";
         String up = "abc";
        subseq(p , up);  //  p - processed ; up - unprocessed


    }

    private static void subseq(String p, String up) {

        if(up.isEmpty()){
            System.out.println(p);
            return;
        }

        subseq(p+up.charAt(0) , up.substring(1));   //taken
        subseq(p , up.substring(1));  //not taken

    }

}