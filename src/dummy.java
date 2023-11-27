import java.util.HashSet;
import java.util.Set;

class dummy{
    public static void main(String[] args) {

    Set<String> set = new HashSet<>();

    String s = "11001 11010 11100 11000 11110 11101 10010 11011 101010 101011 11111 10110 10111 10011 0000 10000 10001 0011 0110 0100 0101 0010 0001 01110 10100 01111";
    s.trim();
    String[] arr = s.split(" ");

    for(int i = 0 ; i<arr.length ; i++){

            set.add(arr[i]);

    }
        System.out.println(set.size());


    }





}