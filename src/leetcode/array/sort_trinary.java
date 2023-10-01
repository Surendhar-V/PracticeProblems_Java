package leetcode.array;

import java.util.Arrays;

public class sort_trinary{

    public static void main(String[] args) {


        int[] arr={0,1,1,0,1,2,1,2,0,0,0,1};

        int low=0;
        int high=arr.length-1;
        int mid=0;
        int temp=0;

        while(mid<=high){


            if(arr[mid]==0){

                 temp = arr[low];
                arr[low] = arr[mid];
                arr[mid]=temp;

                low++;
                mid++;

            }
            else if(arr[mid]==1){
                mid++;
            }

            else if(arr[mid]==2){

                 temp = arr[mid];
                arr[mid] = arr[high];
                arr[high]=temp;

                high--;
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