public class reduce_zero_rec{
  public static void main(String[] args){


    int num = 555;
    System.out.println(toreduce(num));
    
  }
  
  public static int toreduce(int n){
    
    if(n==0){
      return n;
    }
    if(n%2 == 0) {
      return 1+toreduce(n/2); 
    }
    else{
      return 1+toreduce(n-1);
    }
    
    
  }
  
  
}
