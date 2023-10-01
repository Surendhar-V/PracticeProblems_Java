package TaxiBooking;

import java.util.*;



public class taxiCenter  {


    List<Taxi> taxiArray=new ArrayList<>();
    List<String>Archive=new ArrayList<>();

    int customerId=1111;
    taxiCenter(int n){

    for(int i=0;i<n;i++) {
        taxiArray.add(new Taxi(i));

    }

          }

          /*

          A-65
          B-66
          C-67
          D-68
          E-69

           */

        public boolean fromTo(char from , char to,int TimetoPickup){



            int cost=0;
            int alloted=0;
            int Timetaken=0;
            int distance=0;

            distance=Math.abs(to-from)*15;
        if(!(from >=65 && from <=69 && to >=65 && to <=69)){
            System.out.println("Enter the valid Location");

            cost=0;
            alloted=0;
            Timetaken=0;
            distance=0;

            return false;

        }

        alloted=findNearst(from,to,TimetoPickup);
        if(alloted==-1){
            System.out.println("NO TAXI AVAILABLE AT THAT TIME. TRY AFTER SOME TIME");

            cost=0;
            alloted=0;
            Timetaken=0;
            distance=0;

            return false;
        }

        cost=costCalculation(from ,to);


        Timetaken=Math.abs(from-to);


        String s= customerId + "  " +from+ "  " +to+ "  Cost : "+cost+ "  alloted : "+alloted+ "  Distance : "+distance+" PickUp Time : "+TimetoPickup+ "  Droping Time : "+(TimetoPickup+Timetaken) ;
        customerId++;

        taxiArray.get(alloted).TaxiArchieve.add(s);
        Archive.add(s);

         cost=0;
         alloted=0;
         Timetaken=0;
         distance=0;

        return true;

          }

          public int findNearst(char from,char to,int TimetoPickup){

              int minDistance=0;


              minDistance = taxiArray.get(0).currentLocation - from;

             int alloted =-1;

             int minEarned1=taxiArray.get(0).earned;
             int minEarned2=taxiArray.get(0).earned;



              for(Taxi taxi:taxiArray){

                  int freeTime=taxi.freeTime;

                  if(minDistance>=taxi.currentLocation-from && freeTime<=TimetoPickup){

                      if(minEarned2>=taxi.currentLocation-from){

                          if(minEarned1>taxi.currentLocation-from){

                            minEarned1=taxi.earned;
                              minDistance=taxi.currentLocation-from;
                              alloted=taxi.name;

                          }
                          else{

                              minEarned2=taxi.earned;
                              minDistance=taxi.currentLocation-from;
                              alloted=taxi.name;

                          }

                      }


                  }


              }
              if(alloted !=-1) {

                  taxiArray.get(alloted).earned += costCalculation(from, to);
                  taxiArray.get(alloted).currentLocation = to;

              }


              return alloted;
          }


          public int costCalculation(char from,char to){

            int cost =100;
            int distance=Math.abs((to-from))*15;


            distance-=5;



            cost+=distance*10;

            return cost;


          }

          public void PrintTaxiArchive(){

            for(String item:Archive){
                System.out.println(item);
            }

          }

          public void PrintParticular(int id){


              System.out.println("Total Cost earned : " + taxiArray.get(id).earned);
            for(String s:taxiArray.get(id).TaxiArchieve){

                System.out.println(s);

            }
              System.out.println();
              System.out.println();
              System.out.println();

          }



}
