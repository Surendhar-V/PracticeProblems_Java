package FBS;



import java.util.ArrayList;
import java.util.HashMap;

public class airport {




    static HashMap<Integer , ArrayList<Object>> Flightlist = new HashMap<>();
    static int[] arr = {1234,9874};





    airport(){





        Flightlist.put(1234,new ArrayList<Object>());
        Flight a = new Flight();
        Flightlist.get(1234).add(a);
        Flightlist.get(1234).add(5000);
        Flightlist.get(1234).add("Chennai to Delhi");


        Flightlist.put(9874,new ArrayList<Object>());
        Flight b = new Flight();
        Flightlist.get(9874).add(b);
        Flightlist.get(9874).add(5000);
        Flightlist.get(9874).add("Chennai to Kolkata");

    }




    public static  void estimation(int t , int f){

        System.out.println("--------------------------------------------------------");
        System.out.println("");



        System.out.println("Total cost = " + ((Integer)Flightlist.get(arr[f-1]).get(1) + (t-1) *200) + "  Rs" );
        System.out.println("");
        System.out.println("--------------------------------------------------------");

    }


    public void showflights(){

int i =1;
        for(int a : arr){

            System.out.print(i+" " +a + "   ");
            System.out.println(Flightlist.get(a).get(2));
            i++;
        }

    }

    public void printdetails() {
        System.out.println("    ");
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i]+"           ");

            for(int j=3;j<Flightlist.get(arr[i]).size();j++){

                System.out.print(Flightlist.get(arr[i]).get(j)+"   ");

            }
            System.out.println("");



            }

    }

    public static void printbookedIDs(int t,int f){

        for(int i =0;i<t;i++){


            System.out.print("    "+Flightlist.get(arr[f-1]).get(Flightlist.get(arr[f-1]).size()-1-i));
        }
        System.out.println("");

    }




public void cancel(int passengerID ,int f){

    airport.Flightlist.get(airport.arr[f]).remove(Integer.valueOf(passengerID));
    airport.Flightlist.get(arr[f]).set(1,(Integer)airport.Flightlist.get(arr[f]).get(1)-200);

}



    public static int passengerId=0;

    public  void book(int f ){


        passengerId=passengerId+1;
        airport.Flightlist.get(arr[f-1]).add(passengerId);
        airport.Flightlist.get(arr[f-1]).set(1,(Integer)airport.Flightlist.get(arr[f-1]).get(1)+200);


    }

}








