import java.util.*;
public class sort_binary
{
    public static void main(String[] args) {



        sort(new int[]{1,0,1,0});







    }



    public static void sort(int[] arr){



        int j = arr.length-1;
        int i =0;

        while(i < j){

            if(arr[i]==1){
                swap(j, i,arr);
                j--;
            }
            if(arr[i]==0){
                i++;
            }

        }

        System.out.println(Arrays.toString(arr));


    }

    public static void swap(int j, int i, int[] arr){

        int temp = arr[j];
        arr[j] = arr[i];
        arr[i]=temp;

    }

}
