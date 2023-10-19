import java.util.*;

public class MinPlateforms {

    public static void main(String[] args) {

        int[] from = {900 , 1500 ,950 , 1100 , 940 ,  1800};
        int[] to = {910 , 1200 , 1120, 1130 , 1900 , 2000};


        findPlateforms(from , to);

    }

    public static void findPlateforms(int[] from , int[]to){

        int[] index = new int[from.length];

        for(int i = 0 ; i<index.length ; i++){
            index[i] = i;
        }

        List<Integer> list= new ArrayList<>();
        for(int i = 0 ; i<from.length ; i++){
            list.add(i);
        }

        Collections.sort(list , (a,b) -> from[a] - from[b]);

        mergesort(index , from , 0 , index.length);

        System.out.println(Arrays.toString(index));
        System.out.println(Arrays.toString(from));
        System.out.println(list);

    }

    public static void mergesort(int[] index , int[] value , int start , int end){

        if(end - start == 1){
            return ;
        }

        int mid = (start+end)/2;

        mergesort(index , value , start , mid);
        mergesort(index , value , mid , end);

        merge(index , value , start , mid , end);

    }

    public static void merge(int[] index, int[] value, int start, int mid, int end) {

        int[] mix = new int[end - start];

        int i = start;
        int j = mid;
        int k = 0;

        while (i < mid && j < end) {
            if (value[index[i]] <= value[index[j]]) {
                mix[k] = index[i];

                k++;
                i++;
            } else {
                mix[k] = index[j];

                k++;
                j++;
            }
        }

        while (i < mid) {
            mix[k] = index[i];

            k++;
            i++;
        }

        while (j < end) {
            mix[k] = index[j];

            k++;
            j++;
        }

        for (int l = 0; l < mix.length; l++) {
            index[start + l] = mix[l];

        }
    }


}