import java.util.Arrays;
public class twice_once_array{
  public static void main(String[] args){
   
   int[] arr = {1 ,2,45,3,45,2,9,1,9};
   
   //sorting
   for(int i =0;i<arr.length-1;i++)
   {
     int flag = 0;
   for(int j =0;j<arr.length-1-i;j++){
     if(arr[j]<arr[j+1])
     {
       arr[j]=arr[j]^arr[j+1];
       arr[j+1]=arr[j]^arr[j+1];
       arr[j]=arr[j]^arr[j+1];
       flag = 1;
     }
   }
    if(flag==0)
     break;  

  }
  System.out.println(Arrays.toString(arr));
  
  for(int i =0;i<arr.length;){
    if(arr[i]==arr[i+1]){
      i=i+2;
    }
    else{
      System.out.println(arr[i]);
      break;
    }
  }
  
}
}
