public class Multiplication_without_astrisk {

    public static void main(String[] args) {

        int a = 10;
        int b = 26;

        System.out.println(helper(a , b));

    }

    private static int helper(int a , int b){

        int count = 0 ;
        int res =0;

        while(b!=0){

            if((b&1) == 1){
                res+=( a<< count);
            }

            count++;
            b = b>>1;

        }

        return res;
    }




}
