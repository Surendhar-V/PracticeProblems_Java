
public class dummy {
    public static void main(String[] args) {

        String s = "abc";

        combination("",s);
        System.out.println();
        permutation(new StringBuilder("") ,s);
    }

    private static void combination(String processed , String unprocessed){

        if(unprocessed.equals("")){
            System.out.println(processed);
            return;
        }


        combination(processed+unprocessed.charAt(0) , unprocessed.substring(1));
        combination(processed , unprocessed.substring(1));

    }

    private static void permutation(StringBuilder processed , String unprocessed){

        if(unprocessed.equals("")){
            System.out.println(processed);
            return;
        }

        for(int i=0;i<processed.length()+1;i++){
            permutation(processed.insert(i , unprocessed.charAt(0)) , unprocessed.substring(1));
            processed.deleteCharAt(i);
        }

    }

}