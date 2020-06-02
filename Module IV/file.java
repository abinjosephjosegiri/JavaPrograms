import java.io.File;
import java.io.IOException;
import java.util.Scanner;
public class file {
    public static void main(final String[] args) {
        try {
            
            Scanner scan = new Scanner(System.in);
            System.out.print("Enter File Name:");
            String s = scan.next();
            File obj = new File(s);
            if (obj.createNewFile()) {
                System.out.println("File Created\nFile Name is :" + obj.getName());
                System.out.println("File Name " + obj.getName());
                System.out.println("File Path " + obj.getPath());
                System.out.println("File AbsolutePath " + obj.getAbsolutePath());
                System.out.println("File Parent " + obj.getParent());
                System.out.println("File Exists " + obj.exists());
                if (obj.exists()){
                    System.out.println("Is Wirteable " + obj.canWrite());
                    System.out.println("Is Readable " + obj.canRead());
                    System.out.println("Is a directory " + obj.isDirectory());
                }
                
        

            } else {

                System.out.println("File Already exists");
                System.out.println("File Name is :" + obj.getName());
                if (obj.exists()){
                    System.out.println("Is Wirteable " + obj.canWrite());
                    System.out.println("Is Readable " + obj.canRead());
                    System.out.println("Is a directory " + obj.isDirectory());
                }
                

            }
        } catch (IOException e) {
            System.out.println("Error");
            e.printStackTrace();
        }

    }
}
