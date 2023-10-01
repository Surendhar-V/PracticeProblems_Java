/*

RSB - first occurence of 1 right the right side of the bit .

 */

public class rsb_bit{
  public static void main(String[] args){
    
    int num= 22; //10110
    int counter=1;
    int mask =1;
    
    while((num & mask) == 0){
      mask = mask << 1;
      counter ++ ; 
    }
    
    System.out.println(counter);
      }
}
