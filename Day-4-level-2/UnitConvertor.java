import java.util.Scanner;
public class UnitConvertor{
    public static double convertFarhenheitToCelsius(double farhenheit){
        double farhenhiet2celsius=(farhenheit-32)*5/9;
        return farhenhiet2celsius;
        
    }
    public static double convertCelsiusToFarhenheit(double celsius){
        double celsius2farhenheit=(celsius*9/5)+32;
        return celsius2farhenheit;
        
    }
    public static double convertPoundsToKilo(double pounds){
        double pounds2kilograms=0.453592;
        return pounds*pounds2kilograms;
        
    }
    public static double convertKiloToPounds(double kg){
        double kilograms2pounds=2.20462;
        return kg*kilograms2pounds;
        
    }
    public static double convertGallonsToLiters(double gallons){
        double gallons2liters=3.78541;
        return gallons*gallons2liters;
        
    }
    public static double convertLiters2gallons(double liters){
        double liters2gallons=0.264172;
        return liters*liters2gallons;
    }
    

    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        System.out.println("Choose a conversion:");
        System.out.println("1. Farhenheit to Celsius");
        System.out.println("2. Celsius to Farhenheit");
        System.out.println("3. Pounds to Kilograms");
        System.out.println("4. Kilograms to Pounds");
        System.out.println("5. Gallons to Liters");
        System.out.println("6. Liters to Gallons:");
        System.out.print("Enter your choice (1-6): ");
        
        int choice = sc.nextInt();
        double input, result = 0;
        
        switch (choice) {
            case 1:
                System.out.print("Enter Farhenheit: ");
                input = sc.nextDouble();
                result = convertFarhenheitToCelsius(input);
                System.out.println(input + " farhenheit = " + result + " celsius");
                break;
            case 2:
                System.out.print("Enter Celsius: ");
                input = sc.nextDouble();
                result = convertCelsiusToFarhenheit(input);
                System.out.println(input + " celsius = " + result + " farhenheit");
                break;
            case 3:
                System.out.print("Enter Pounds: ");
                input = sc.nextDouble();
                result = convertPoundsToKilo(input);
                System.out.println(input + " pounds = " + result + " kilograms");
                break;
            case 4:
                System.out.print("Enter Kilograms: ");
                input = sc.nextDouble();
                result = convertKiloToPounds(input);
                System.out.println(input + " kilograms = " + result + " pounds");
                break;
            case 5:
                System.out.print("Enter Gallons: ");
                input =sc.nextDouble();
                result = convertGallonsToLiters(input);
                System.out.println(input+" gallons = "+result+" liters");
            case 6:
                System.out.print("Enter Liters: ");
                input =sc.nextDouble();
                result = convertLiters2gallons(input);
                System.out.println(input+" liters = "+result+" gallons");
            default:
                System.out.println("Invalid choice! Please select between 1-6.");
        }

        sc.close();
    } 
}
