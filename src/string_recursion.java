



public class string_recursion
{


    static int start = 0;
    static int end =0;

    public static void main(String[] args) {

       extractwords("surendhar is a good boy");
       System.out.println(skipword("apple","surendharsurendharapplesuren"));




    }


    private static String skipword(String skip, String s) {


        if(s.isEmpty()){

        return "";
        }
        if (s.startsWith(skip)) {

            return  skipword(skip , s.substring(skip.length()));
        }
        else{

            return s.charAt(0) + skipword(skip,s.substring(1));
        }

    }





    public static void extractwords(String s){


        if(end == s.length()-1){
            System.out.println(s.substring(start,end+1));
        }


        else if(s.charAt(end) == ' ')
        {
            System.out.println(s.substring(start,end));
            start = end+1;
            end++;
            extractwords(s);
        }
        else{
            end++;
            extractwords(s);


        }


    }

}
