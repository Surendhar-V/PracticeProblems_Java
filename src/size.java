import java.util.*;
public class size{
    public static void main(String[] args){

        List<Integer> ls =new ArrayList<>();
        for(int i =1;i<10;i++){
            ls.add(i);
        }

        int[] arr=new int[9];

        for(int i =1;i<10;i++){
            arr[i-1]=i;
        }

        String s = "surendhar";


        System.out.println(s.length());
        System.out.println(arr.length);
        System.out.println(ls.size());

    }
}