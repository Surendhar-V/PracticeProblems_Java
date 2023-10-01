package AirTrafficControl;

public class request extends Thread {

    runway r;
int timeTaken;

    request(runway r,int time){
        this.r= r;
        this.timeTaken=time;
    }


    @Override
    public void run() {

        this.r.status = false;
        System.out.println(this.r.r_name + " is allotted ");

        try{ Thread.sleep(1000*timeTaken); } catch (Exception e){}
        this.r.status = true;

    }
}
