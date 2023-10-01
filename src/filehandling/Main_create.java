package filehandling;
import java.io.File;

public class Main_create {

    public static void main(String[] args) {

    File file =new File("/home/suren/IdeaProjects/PracticeProblems_java/src/filehandling/MyFolder/suren.txt");
    File folder =new File("/home/suren/IdeaProjects/PracticeProblems_java/src/filehandling/MyFolder");
    try{
        if(folder.mkdir() && file.createNewFile()){
            if(file.exists()) {
                System.out.println("Readable : " + file.canRead());
                System.out.println("Writable : " + file.canWrite());
                System.out.println("Size : " + file.length());
                System.out.println("Absolute path : " + file.getAbsolutePath());
            }
            else{
                System.out.println("File does not exist");
            }
        }
        else{
            System.out.println("Not done");
        }


    }
    catch (Exception e){
        System.out.println("An error occurred");
    }


    }


}
