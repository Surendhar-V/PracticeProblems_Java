/*
INTUITION  -  If we obsever the given array carefully the , first occurence of the element lies is odd index and second occurence of the element
              lies in even index .
              Using this clue , we check wheter the mid element follows the clue .
              If yes , It is obvious that every other element from start to mid is in correct oder ( every element occurs twice ).
                       So no need to check those.
                       Hence START = MID +1 ;
              If no ,  There is a element that interupted within the twice occuring element , resulting index change ( in that case the part of our array does not follow the clue )
                       Hence END = MID -1 ;
 */


public class twice_once_bs{
    public static void main(String[] args) {
        int[] arr ={2,1,1,3,3,4,4,8,8};
        function(arr);
    }

    private static void function(int[] arr) {
        int start =0;
        int end = arr.length-2;
        while(start<=end){
            int mid = (start+end)/2;

            //left half
            //1st instance - EVEN index
            //2nd instance - ODD index

            if((mid%2 == 1 && arr[mid]==arr[mid-1]) || (mid%2 == 0 && arr[mid]==arr[mid+1]))
            {
                start=mid+1;
            }
            else{
                end =mid-1;
            }

        }
        System.out.println(arr[start]);
    }
}

//condition in if statement in line 17 can be replaced with arr[mid] == arr[mid^1]
// remind that (odd) n^1 = n-1 (even)
// (even) n^1 == n+1 (odd)
// for our problem condition is similar to the xor of 1 . So we can use that.


