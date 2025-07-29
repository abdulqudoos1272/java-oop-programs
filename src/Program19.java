import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class Program19 {
    public static void main(String[] arg){
        Scanner sc=new Scanner(System.in);
        try{
        FileWriter f1=new FileWriter("File2.txt");
        System.out.println("Enter a table number to write in file");
        int tab=sc.nextInt();
        try{
        for(int i=0;i<=10;i++){
            f1.write(tab+" x "+" "+i+" = "+" "+(tab*i)+"\n");
            }
        }
        finally{
            System.out.println("Table Write in File2.txt is Sucessfully");
            f1.close();
        }
        }
        catch(Exception w){
            System.out.println(w.getMessage());
        }
    try{
    FileReader f2=new FileReader("File3.txt");
    try{
        int i;
        while((i=f2.read())!=-1){
            System.out.print((char)i);
        }
    }
    finally{
        System.out.println();
        System.out.println("Read From File Sucessfully");
    }
    }
    catch(Exception e){
        System.out.println(e.getMessage());
    }
}
};
