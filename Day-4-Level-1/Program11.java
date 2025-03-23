import java.util.Scanner;
public class Program11{
    public double calculateWindChill(double temperature,double windSpeed){
        double windChill= 35.74 + 0.6215*temperature+(0.4275*temperature-35.75)*Math.pow(windSpeed,0.16);
        return windChill;
        
    }
    public static void main(String args[]){
        Program11 obj=new Program11();
        Scanner sc =new Scanner(System.in);
        double temperature=sc.nextDouble();
        double windSpeed=sc.nextDouble();
        double result= obj.calculateWindChill(temperature, windSpeed);
        System.out.println("WindChill: "+result);

    } 
}