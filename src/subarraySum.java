import java.util.ArrayList;
import java.util.Arrays;

public class subarraySum {

    public static void main(String[] args) {

        int[] arr = {15,2,4,8,9,5,10,23};
        int target = 23;

        for(Integer[] brr : SubrrarySum(arr, arr.length, target)){
            System.out.println(Arrays.toString(brr));
        }

    }

    private static ArrayList<Integer[]> SubrrarySum(int[] arr, int n, int targetSum) {

        int start = 0;
        int last = 0;

        int currsum=0;

        ArrayList<Integer[]> res = new ArrayList<>();

        for(int i=0;i<n;i++)
        {

            currsum+= arr[i];

            if(currsum>=targetSum)
            {
                last=i;

                while(targetSum<currsum && start<last)
                {

                    currsum-= arr[start];
                    ++start;
                }

                if(currsum==targetSum)
                {
                    res.add(new Integer[]{start , last} );

                }
            }
        }

        return res;

    }
}
