/*
INTUITION -  If we add a number to the character it will return the ASCII VALUE
             and we can cast it to char in order to print the ALPHABETS
 */
public class PrintAlphabets {

    public static void main(String[] args) {

        String alphabet ="";
        for(int i =0 ; i< 26;i++){
            alphabet+=(char)('a'+i);
        }
        System.out.println(alphabet);


    }
}
