import java.util.Scanner;

public class Program7{
    public static void generateException(String s){
        Integer.parseInt(s);
    }
    public static void handleException(String s){
        try{
            Integer.parseInt(s);
        }catch(NumberFormatException e){
            System.out.println("NumberFormatException caught: "+e.getMessage());
        }catch(Exception e){
        System.out.println("Generic Exception:"+e.getMessage());
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();

        //generateException(s);
        handleException(s);
        
    }
    
}