import java.util.Arrays;

public class shuffle {


    public static void main(String[] args) {


        System.out.println(Arrays.toString(shuffle(new int[] {2,5,1,3,4,7},3)));


    }

    private static int[] shuffle(int[] arr,int n){


        /*

        Intuition - to store the elements using the remainder and quotient method

         */

        int i = 1;
        int k = 1;
        int j = arr.length/2;

        while(j<=arr.length-2 && i<=arr.length/2){



            if(k%2==0){

                int a = arr[k];
                if( a >=3){
                    a-=3;
                }
                int b= arr[i];

                arr[k]=a+(b*n);
                i++;



            }
            else {

                int a = arr[k];
                if( a >=3){
                    a-=3;
                }
                int b= arr[j];

                arr[k]=a+(b*n);

                j++;

            }



            k++;


        }
        System.out.println(Arrays.toString(arr));

        for(int l =1;l<2*n-1;l++){

            arr[l]/=n;

        }

        return arr;
    }



}