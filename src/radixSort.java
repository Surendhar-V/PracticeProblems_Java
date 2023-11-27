import java.util.Arrays;

public class radixSort {

    public static void main(String[] args) {

        int[] arr = {29,83,471,36,91,8};

        arr = radixSort(arr);
        System.out.println(Arrays.toString(arr));

    }

    private static int[] radixSort(int[] arr){

        int max = Arrays.stream(arr).max().getAsInt();

        for(int expo =1 ; max/expo != 0 ; expo*=10 )
        {
            arr = countSort(arr , expo);
        }

        return arr;

    }

    private static int[] countSort(int[] arr , int expo){

        int[] output= new int[arr.length];
        int[] count = new int[10];                      // Coz we have 10 digits..(0...9)

        for(int i= 0 ; i<arr.length ; i++){

            int digit = (arr[i]/expo)%10;
            count[digit]++;

        }

        for(int i =1 ; i<count.length ; i++){

            count[i] += count[i-1];

        }

        //  Now count array has the value , which indicates the number of value before that value in the resultant array along with the that value

        for(int i = arr.length-1 ; i>= 0 ; i--){
            int idx = (arr[i]/expo)%10;
            output[count[idx]-1] = arr[i];
            count[idx]--;
        }

        return output;


    }


}