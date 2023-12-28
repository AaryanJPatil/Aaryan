package File_Demo;

import java.io.File;

public class CreateFile {
    public static void main(String[] args) {
        try {
            File file = new File("D:/Aaryan/Dj/pubg.txt");
            if (file.createNewFile()){
                System.out.println("File Created");
            }else{
                System.out.println("File already exists");
            }
            System.out.println("Absolute path is"+file.getAbsolutePath());
             System.out.println("File name is"+file.getName()); 
            System.out.println("Parent file is"+file.getParent());
             System.out.println("File path is"+file.getPath());

             File file2 = new File("D:/val");
             if(file2.mkdir()){
                System.out.println("File created");

             }else{
                System.out.println("file already exists");
             }
        } catch (Exception e) {
            e.printStackTrace();

            
        }
    }
}
