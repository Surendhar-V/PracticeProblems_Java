//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.List;
//
//public class dummy{
//    public static void main(String[] args) {
//
//
//
//
//    }
//
//    public List<List<Integer>> Solution(int r_length , int c_length , int col , int row){
//
//        int count=0;
//        List<List<Integer>> list = new ArrayList<>();
//        while(true){
//            int i;
//
//            count++;
//
//            for(i=col;i<count+col;i++){
//
//                list.add(Arrays.asList( row , i));
//            }
//            col=i;
//
//            if( col == c_length && col != i+count+col-1){
//               col=row
//            }
//
//            for(i=row;i<count+row;i++){
//                list.add(Arrays.asList(i,col ));
//            }
//            row =i;
//
//            count++;
//
//            for(i=col;i>col-count;i--){
//                list.add(Arrays.asList(row , i));
//            }
//            col=i;
//
//            for(i=row ; i>row-count;i--){
//                list.add(Arrays.asList(i ,col));
//            }
//            row=i;
//
//
//        }
//
//
//
//    }
//
//
//}