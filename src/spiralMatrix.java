public class spiralMatrix {

    public static void main(String[] args) {


        int[][] arr = {
                      {1,2,3,4,5},
                      {16,17,18,19,6},
                      {15,24,25,20,7},
                      {14,23,22,21,8},
                      {13,12,11,10,9},
                    };



        printSpiral(arr);

    }


    public static void  printSpiral(int[][] arr){

        int rowStart=0;
        int colStart=0;
        int rowEnd=arr.length-1;
        int colEnd=arr[0].length-1;


        while(colEnd>=colStart && rowStart <=rowEnd){

            for(int i=colStart;i<=colEnd;i++){
                System.out.print(arr[rowStart][i] +"  ");
            }
            rowStart++;

            for(int j=rowStart;j<=rowEnd;j++){
                System.out.print(arr[j][colEnd] +"  ");
                }

            colEnd--;

            for(int k=colEnd;k>=colStart;k--){
                System.out.print(arr[rowEnd][k] +"  ");
            }

            rowEnd--;
            for(int l=rowEnd;l>=rowStart;l--){
                System.out.print(arr[l][colStart] +"  ");
            }

            colStart++;



        }


    }

}
