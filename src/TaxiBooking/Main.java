package TaxiBooking;

import java.util.*;

public class Main {


    public static void main(String[] args) {


        taxiCenter obj1= new taxiCenter(4);

        Scanner input=new Scanner(System.in);

        obj1.fromTo('A','B',9);
//        obj1.fromTo('B','D',9);
//        obj1.fromTo('B','C',12);
       // obj1.fromTo('A','F',9);

        obj1.PrintTaxiArchive();



     //   obj1.PrintParticular(1);
//        obj1.PrintParticular(1);
      //  obj1.PrintParticular(2);
        obj1.PrintParticular(3);




    }




}
