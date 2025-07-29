import java.io.File;

public class Program18 {
    public static void main(String[] args){
        File f1=new File("File1.txt");
        try{
            if(f1.createNewFile()){
                System.out.println("File Name is : "+f1.getName());
                System.out.println("File path is : "+f1.getAbsolutePath());
                System.out.println("File is Readable : "+f1.canRead());
                System.out.println("File is Writeable : "+f1.canWrite());
                System.out.println("File Length is : "+f1.length());
                //System.out.println("File Deleted Sucessfully"+f1.delete());
        }
    }
    catch(Exception e){
    }
    }    
};