import java.io.FileReader;
import java.io.FileWriter;

public class Program20 {
    public static void main(String[] args){
        try{
        FileWriter f1=new FileWriter("File4.txt");
        FileReader f2=new FileReader("File3.txt");
        try{
            int i;
            while((i=f2.read())!=-1){
                f1.write((char)i);
            }
        }   
        catch(Exception e){
            System.out.println("An error occurred while reading the file");   
        }
        finally{
            System.out.println("Copy Form Fil3 to File4 is Sucessfully");
            f1.close();
            f2.close();
        }
    }
        catch(Exception e){
            System.out.println("An error occurred while creating the file");
        }

    }
};