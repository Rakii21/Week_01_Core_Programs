import java.util.Scanner;

public class Program5{
    public static void generateException(String s){
        System.out.println(s.charAt(10));
    }
    public static void handleException(String s){
        try{
            System.out.println(s.charAt(10));
        }catch(StringIndexOutOfBoundsException e){
            System.out.println("StringIndexOutOfBounds caught: "+e.getMessage());
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        //generateException(s);
        handleException(s);
        
    }
    
}