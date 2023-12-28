package File_Demo;
import java.io.*;
public class WriteFile {
    public static void main(String[] args) {
        try {
            File file = new File("D:/Aaryan/Dj/pubg.txt");
            if(file.createNewFile()){
            System.out.println("File created");
            }
            else{
                System.out.println("File already exists");
            }    
            FileWriter fw =new FileWriter(file,true);
            fw.write("Hello Pollard YZ");
            System.out.println("Content write on file");
            fw.close();
            FileReader fr = new FileReader(file);
            int i;
            while((i=fr.read())!=-1)
            {
                System.out.print((char)i);
            }
            fr.close();

        } catch (Exception e) {
            
        }
    }
}
