import java.util.Arrays;

public class countingsort {


    public static void main(String[] args){

        countingsort(new int[]{2,1,1,0,2,5,4,0,2,8,7,7,9,0,2,1,9});
    }

    private static void countingsort(int[] arr){


        int max =arr[0];

        //finding max

        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }


        //calculating the frequency of each element in the array
        int[] arr1=new int[max+1];

        for(int i=0;i<arr.length;i++){
            arr1[arr[i]]++;
        }


        //calculating the maximum possible position of the element
        for(int i=1;i<arr1.length;i++){
            arr1[i]=arr1[i-1]+arr1[i];
        }




        int[] arr2=new int[arr.length];

        for(int i=arr.length-1;i>=0;i--){

            arr2[arr1[arr[i]]-1]=arr[i];
            --arr1[arr[i]];


        }



        System.out.println(Arrays.toString(arr2));




    }


}