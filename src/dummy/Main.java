package dummy;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[] lps = lps("AAAAABAAABA");
        System.out.println(Arrays.toString(lps));

    }

    private static int[] lps(String s){

        int[] lps = new int[s.length()];

        int i =0;
        int j =1;

        while(j<s.length()){

            if(s.charAt(i)==s.charAt(j)){

                lps[j] =i+1;
                    i++;
                    j++;

            }else{

                if(i==0){
                    j++;
                }else{
                    i = lps[i-1];

                }

            }

        }

        return lps;
    }


}