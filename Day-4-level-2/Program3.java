import java.util.Scanner;
public class Program3{
    public static String leapYear(int year){
        if((year>=1852 && (year%4==0 && year%100!=0) || year%400==0)) return "Leap Year";
        else
            return "Not Leap Year";
        
    }
    

    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        int year=sc.nextInt();
        System.out.println(leapYear(year));
    } 
}