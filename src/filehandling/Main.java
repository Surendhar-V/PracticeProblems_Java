package filehandling;

import java.io.IOException;
import java.io.OutputStream;

public class Main {
    public static void main(String[] args) {

        System.out.println('\u263A');
        OutputStream os = System.out;
        try {

            byte[] smileyBytes = "\u263A".getBytes("UTF-8");
            os.write(smileyBytes);


        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}