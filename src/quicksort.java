import java.util.*;
public class quicksort
{
    /*

    INTUITION - The intuition of this type of algorithm is , we have to choose the pivot element and make the element lies right side of
                pivot element less than pivot element and right side of the pivot element greater than the pivot element.

     */
    public static void main(String[] args) {

        //quick sort using recursion

        int[] arr = {2,4,3,1,5,6,7};
        sort(arr , 0 , arr.length-1);

        System.out.println(Arrays.toString(arr));




    }

    private static void sort(int[] arr , int low , int high){


        int s = low ;
        int e = high ;

        int mid = (s+e)/2;
        int pivot = arr[mid];

        int i=0;
        int j=0;
        // making the pivot the stand in correct position .

        while(s<=e) {
            while(arr[s]<pivot){
                s++;
            }

            while(arr[e]>pivot){
                e--;
            }

            if(s<=e){

                swap(arr , s , e);
                s++;
                e--;
            }

        }


        if(low >= high){
            return;
        }

        sort(arr , low , e);
        sort(arr,s , high);




    }

    public static void swap(int[] arr , int first , int second){

        int temp = arr[first];
        arr[first] = arr[second];
        arr[second]=temp;

    }

}
