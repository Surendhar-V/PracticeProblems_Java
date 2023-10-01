public class remove_duplicates {

    public static void main(String[] args) {

        int[] arr = {1 ,2 , 3, 4 , 4 , 5, 6, 7};

        int res = remove(arr);

        System.out.println(res);

    }

    private static int remove(int[] arr){

        int j = 0;
        int i ;

        for(i = 1 ; i < arr.length ; i++){

            if(arr[i] != arr[j]){

                j++;
                arr[j] = arr[i];

            }

        }

        return j;

    }
}