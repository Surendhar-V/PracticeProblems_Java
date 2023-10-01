
package AirTrafficControl;
import java.util.*;

public class Airport {
    static Scanner input;
    static List<runway> Runways = new ArrayList<>();


    Airport(){

        input= new Scanner(System.in);

        Runways.add(new runway(40,"RUNWAY 1"));
        Runways.add(new runway(60,"RUNWAY 2"));
        Runways.add(new runway(80,"RUNWAY 3"));
        Runways.add(new runway(90,"RUNWAY 4"));




    }





    public static int PrintOptions(){

        int a=0;
        while(true) {
            System.out.println("Select one of the following");
            System.out.println();

            System.out.println("1 - Take Off ");
            System.out.println("2 - Landing ");
            System.out.println("3 - Show Details ");
            System.out.println("4 - Close ");
            System.out.println();


            a = input.nextInt();


            if (a >= 1 && a <= 4) {
                break;
            } else {
                System.out.println("********** ENTER THE CORRECT NUMBER ***********");

            }
        }
        return a;

    }

    public static int showFlights(){
       int choice =0;
       int time = 0;
        while(true) {

            System.out.println("Enter the type of the flight");
            System.out.println();

            System.out.println("1 - ATR");
            System.out.println("2 - Airbus");
            System.out.println("3 - Boeing");
            System.out.println("4 - Cargo");

           choice = input.nextInt();


            System.out.println("Enter the Total Weight of the flight  ");
            int weight = input.nextInt();

            if( choice <=4 && choice >=1 )
            {

                time = ComputeTime(choice , weight);

                if( time == 0){
                    continue;
                }
                break;

            }

        }


        return time;


    }


    public static  int ComputeTime(int choice , int weight){

        int time =0;

        switch ( choice)
        {

            case 1:

                //ATR
                if(weight<=12){

                    time = 30;

                    int percentage =0;

                    percentage = (weight / 12 ) * 100;

                    if(percentage > 75){

                        time =30;

                    }
                    else if ( 50 < percentage && percentage < 75){

                        time = time-3;

                    }
                    else{
                        time = time-6;
                    }


                }
                else{
                    System.out.println("Enter the correct value");
                    return 0;
                }
                break;

            case 2:

                //AirBus

                if(weight<=20){

                    time = 40 ;

                    int percentage =0;

                    percentage = (weight / 20 ) * 100;

                    if( percentage > 75 )
                    {

                        time =40;

                    }
                    else if( 50 < percentage && percentage < 75){

                        time = time-4;

                    }
                    else{
                        time = time-8;
                    }


                }

                else{
                    System.out.println("Enter the correct value");
                    return 0;
                }
                break;

            case 3:
                //Boeing

                if(weight<=40){

                    time = 50 ;



                   int percentage = (weight / 40 ) * 100;

                    if( percentage > 75 )
                    {

                        time =50;

                    }
                    else if( 50 < percentage && percentage < 75){

                        time = time-5;

                    }
                    else{
                        time = time-10;
                    }


                }

                else{
                    System.out.println("Enter the correct weight value");
                    return 0;
                }
                break;

            case 4:
                //Cargo

                if(weight<=100){

                    time = 60 ;


                    int percentage = (weight / 100 ) * 100;

                    if( percentage > 75 )
                    {

                        time =60;

                    }
                    else if( 50 < percentage && percentage < 75){

                        time = time-6;

                    }
                    else{
                        time = time-12;
                    }


                }

                else{
                    System.out.println("Enter the correct weight value");
                    return 0;
                }

                break;


        }





        return time+10;
    }

    public static void takeoff(){





    }

    public static void assginRunway(int time){

        for(runway a : Runways){

            if(a.max_time >=time && a.status ){

                request obj =new request(a,time);
                obj.start();

                return ;

            }

        }


    }





    public static void CollectDetails(int choice){

        switch (choice){

            case 1 :

                //take Off
                int Timetaken = showFlights();

                assginRunway(Timetaken);

                System.out.println(" ");
                break;

            case 2 :


            case 3 :





            case 4 :
                // show details
                for(runway a: Runways){
                    System.out.print(a.r_name+":");
                    System.out.print("        ");
                    if(a.status)
                    {
                        System.out.println("free");
                    }
                    else{
                        System.out.println("Engaged");
                    }
                }
                break;
        }
    }




public static void main(String[] args) {

Airport obj1 = new Airport();

while(true) {
    int choice = obj1.PrintOptions();

    obj1.CollectDetails(choice);

    if(choice == 4){
        break;
    }

}


    }

}