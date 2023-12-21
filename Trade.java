import java.util.*;
import java.io.*;
public class Trade{
    public static void main(String[] args) {
        ArrayList<Integer> intFile= new ArrayList<>();
        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter the Trade sheet:");
        String fileName=scanner.nextLine();
        try{
            File file=new File(fileName);
            scanner=new Scanner(file);
            while(scanner.hasNextLine()){

            }
        }catch(FileNotFoundException e){
            System.out.println("File not found Askies");
        }finally{
            if(scanner!=null){
                scanner.close();
            }
        }
        for(String lines: f)
        
    }
}