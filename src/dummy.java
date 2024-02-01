import java.util.*;

class dummy {

    public static void main(String[] args) {

        prime(1 , 100);

    }

    private static void prime(int start , int end){

        for(int i = start ; i<end ; i++){
            if(isPrime(i)){
                System.out.print(i + " ");
            }
        }

    }


    private static boolean isPrime(int i){

        if(i == 1){
            return false;
        }
        if(i == 2 || i == 3){
            return true;
        }
        if(i%2 == 0 || i%3 == 0){
            return false;
        }

        for(int j=5 ;j<=Math.sqrt(i);j+=6){

            if(i%j == 0 || i%(j+2) == 0){
                return false;
            }

        }


        return true;
    }







}