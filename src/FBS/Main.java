package FBS;

import java.util.Scanner;

public class Main {
    static Scanner input = new Scanner(System.in);
    static airport obj1 = new airport();
    public static void booktickets()
    {


        obj1.showflights();
        System.out.println("Enter the flight");
        int f=input.nextInt();
        System.out.println("how many tickets are you going to book");
        int t = input.nextInt();
        airport.estimation(t,f);
        System.out.println("Are you sure to proceed ?  true or false");

        if(input.nextBoolean()) {



            for (int i = 0; i < t; i++) {

                obj1.book(f);

            }

            System.out.println("Booking successful");
            System.out.print("Passenger ID           ");
            airport.printbookedIDs(t,f);
            System.out.println("---------------------------------------------------");
            System.out.println("");
        }


    }




    public static void canceltickets()
    {

        obj1.showflights();
        System.out.println("Enter the flight");
        int f=input.nextInt();

        System.out.println("How many tickets you have to remove ?");
        int t =input.nextInt();

        for(int i=0; i<t;i++) {

            System.out.println("Enter the passenger ID");
            int passengerID = input.nextInt();

            if(airport.Flightlist.get(airport.arr[f]).contains(passengerID)) {

                obj1.cancel(passengerID ,f );

            }
            else{
                System.out.println("Enter the correct passenger ID");
                i--;
            }
        }
        System.out.println("canceled sucessfully ! \n Your payment will be  refunded  ");

    }



    public static void main(String[] args){


        int a =0;








        while(true){

            System.out.println("Select the option");
            System.out.println(" 1  -   Booking");
            System.out.println(" 2  -   Canceling");
            System.out.println(" 3  -   printdetails");
            System.out.println(" 4  -   Exit");
            a= input.nextInt();


            switch(a){

                case 1:booktickets();
                       System.out.println("");
                       break;

                case 2:canceltickets();
                       System.out.println("");
                       break;

                case 3:
                    obj1.printdetails();
                    break;

                case 4:
                    System.exit(0);
                default:
                    System.out.println(" ENTER THE VALID NUMBER ");

            }



        }




    }




}
