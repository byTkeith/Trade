import java.util.*;
import java.io.*;
public class Trade{
    public static void main(String[] args) {
        ArrayList<String> intFile= new ArrayList<>();
        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter the Trade sheet:");
        String fileName=scanner.nextLine();
        try{
            File file=new File(fileName);
            scanner=new Scanner(file);
            while(scanner.hasNextLine()){//go throught the file until there is no longer a line
                intFile.add(scanner.nextLine());

            }
        }catch(FileNotFoundException e){//exception for when the file is not found
            System.out.println("File not found Askies");
        }finally{
            if(scanner!=null){
                scanner.close();
            }
        }
        for(String lines: intFile){
            //System.out.println(lines);
            String[] splitValues=lines.split(",");//split the line into int values
            for(String eachValue: splitValues){
                int intValue=Integer.parseInt(eachValue);// converts the string numbers to int
            }
            //int[] intValues=Integer.parseInt(splitValues);
        }
        
    }
}