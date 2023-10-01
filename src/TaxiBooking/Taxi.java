
package TaxiBooking;
import java.util.*;
public class Taxi {

    int freeTime=6;
    char currentLocation;
    int name;
    int earned;

    List<String> TaxiArchieve =new ArrayList<>();

    Taxi(int name){

        this.name=name;
        this.earned=0;
        this.currentLocation='A';

    }




}
