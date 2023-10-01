import java.util.Arrays;

public class KMP{

    public static void main(String[] args) {


        String s2 = "AAAA";
        String s1 = "AAAAABAAABA";
        int res = kmp(s1 , s2);
        System.out.println(res);
    }

    public static int kmp(String s1 , String s2){

        int[] crr = lps1(s2.toCharArray());


        int res = lps2(s1.toCharArray() , s2.toCharArray() , crr);

        return res;

    }

    public static int[] lps1(char[] brr){

        int[] crr = new int[brr.length];

        int i = 0;
        int j = 1;

        while(j < brr.length){

            if(brr[i] == brr[j]){

                crr[j] = i+1;
                i++;
                j++;

            }else{

                if(i==0){
                    j++;
                }else{
                    i = crr[i-1];

                }
            }


        }

        return crr;
    }

    public static int lps2(char[] arr , char[] brr , int[] crr){

        int i =0 ;
        int j = 0;

        while( i < arr.length  ){

            if(j >= brr.length){
                break;
            }

            if(arr[i] == brr[j]){

                i++;
                j++;

            }else{

                if(j == 0){

                    i++;

                }else{

                    j = crr[j-1];

                }

            }

        }


        if(j >= brr.length){
            return i-brr.length;
        }
        return -1;

    }

}