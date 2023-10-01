
import java.util.*;
public class rev_rec {
public static void main (String [] args){

int n = 2814 ;
int count=0;

while (n>0){
count++;
n=n/10;
}
count--;

System.out.println(rev(n,count));
}
public static int rev(int n,int count){

if(n<9){
return n;
}


return (n%10)*(int)Math.pow(10,count) + rev(n/10,count);
}
}
