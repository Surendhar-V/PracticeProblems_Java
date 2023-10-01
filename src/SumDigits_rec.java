
public class SumDigits_rec{
public static void main(String[] args){

int n =1235;

System.out.println(sumdigits(n));

}

public static int sumdigits (int n){

if(n<=9)
{
return n ;
}
return  n%10 + sumdigits (n/10) ;

}
}
