package filehandling;

import java.io.FileWriter;

public class Main_write {


    public static void main(String[] args) {


        try{



                FileWriter myWriter = new FileWriter("/home/suren/IdeaProjects/PracticeProblems_java/src/filehandling/MyFolder/suren.txt");
                myWriter.write("hi ! this is my first writing in this file");
                myWriter.close();

        }
        catch (Exception e){
            System.out.println("An error occured");
            e.printStackTrace();
        }




    }




}
