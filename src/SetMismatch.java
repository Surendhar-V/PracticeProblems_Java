
public class SetMismatch {
        public static void main(String[] args) {

            int[] arr = {4,5,2,7,8,2,3,1};
            find(arr);
        }

        private static void find(int[] arr) {

            //cyclic sort
            int i =0;
            while(i<arr.length) {
                int correct = arr[i] - 1;

                if (arr[i] != arr[correct]) {
                    swap(arr, i, correct);
                }  else {
                    i++;
                }
            }

            //finding duplicate numbers and the missing number

            for(int k =0;k<arr.length;k++){
                if(arr[k] != k+1){
                    int missingnum = k+1;
                    System.out.println(arr[k] + " "+ missingnum );

                }
            }



        }
        private static void swap(int[] arr , int first , int second)
        {
            int temp = arr[first];
            arr[first] = arr[second];
            arr[second]=temp;
        }
    }





