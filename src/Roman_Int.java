// valid upto 89 ;
// ALL DONE;
// ALL DONE;


import java.util.Scanner;
public class Roman_Int {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String roman = input.nextLine();
        converter(roman);


    }

    private static void converter(String roman) {
        int sum=0;
        for(int i =0 ; i< roman.length() ;i++){


            if(i!= roman.length()-1 &&  roman.charAt(i) == '1' && roman.charAt(i+1) == 'V' ){
                sum += 4;
                i+=1;
                continue;
            }
            if(i!= roman.length()-1 && roman.charAt(i+1) == 'X' && roman.charAt(i) == '1') {
                sum+= 9;
                i+=1;
                continue;
            }
            if(i!= roman.length()-1 && roman.charAt(i+1) == 'L' && roman.charAt(i) == 'X'){
                sum+=40;
                i+=1;
                continue;
            }

            switch (roman.charAt(i)){
                case '1':
                    sum+=1;
                    break;
                case  'V':
                    sum+=5;
                    break;
                case 'X':
                    sum+=10;
                    break;
                case 'L':
                    sum+=50;
                    break;

            }

        }
        System.out.println(sum);


    }

}
