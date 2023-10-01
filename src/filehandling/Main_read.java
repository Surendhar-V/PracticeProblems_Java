package filehandling;
import java.io.File;
import java.util.Scanner;
public class Main_read {


    public static void main(String[] args) {


        try {
            File file = new File("/home/suren/IdeaProjects/PracticeProblems_java/src/filehandling/MyFolder/suren.txt");
            Scanner read = new Scanner(file);
            while(read.hasNextLine()) {
                System.out.println(read.nextLine());
            }
        }
        catch (Exception e){
            System.out.println("An error occurred");
            e.printStackTrace();
        }


    }
}
