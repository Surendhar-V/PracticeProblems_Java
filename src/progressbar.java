public class progressbar {

    public static void main(String[] args) {

        PB obj = new PB();
        obj.start();
    }

    public static class PB extends Thread {

        Thread t;

        PB()
        {
            t=new Thread();

        }

        @Override
        public void run()
        {
            System.out.print("Processing---------");
            for(int i=0;i<=100;i++)
            {
                if(i<10){
                    System.out.print(i+"%");
                    try{
                        sleep(10);} catch(Exception e){}
                    System.out.print("\b\b");
                }
                else if(i>=10&&i<=99){
                    System.out.print(i+"%");
                    try{
                        sleep(50);} catch(Exception e){}
                    System.out.print("\b\b\b");
                }
                else
                {System.out.println(i+"%");}


            }
        }


    }
}






/*
public void run() {
            System.out.print("Progress...................");

            for(int i=0;i<=100;i++)
            {

                if(i>=0 && i<=9){
                    System.out.print(i+"%");
                    System.out.print("\b\b");
                }
                if(i>=10 && i<=99){
                    System.out.print(i+"%");
                    System.out.print("\b\b\b");
                }
                else{
                    System.out.print(i+"%");

                }

                try {
                    t.sleep(50);
                }
                catch (Exception e){

                }

            }
 */