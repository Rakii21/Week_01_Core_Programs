import java.util.Scanner;
public class Program5{
    public static double convertYardsToFeet(double yards){
        double yards2feet=3;
        return yards*yards2feet;
        
    }
    public static double convertFeetToYards(double feets){
        double feets2yards=0.333333;
        return feets*feets2yards;
        
    }
    public static double convertMetersToInches(double meters){
        double meters2inches=39.3701;
        return meters*meters2inches;
        
    }
    public static double convertInchesToMeters(double inches){
        double inches2meters=0.0254;
        return inches*inches2meters;
        
    }
    public static double convertInchesToCm(double inches){
        double inches2cm=2.54;
        return inches*inches2cm;
    }
    

    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        System.out.println("Choose a conversion:");
        System.out.println("1. Yards to Feet");
        System.out.println("2. Feet to Yards");
        System.out.println("3. Meters to Inches");
        System.out.println("4. Inches to Meters");
        System.out.println("5. Inches to Centimeters");
        System.out.print("Enter your choice (1-5): ");
        
        int choice = sc.nextInt();
        double input, result = 0;
        
        switch (choice) {
            case 1:
                System.out.print("Enter Yards: ");
                input = sc.nextDouble();
                result = convertYardsToFeet(input);
                System.out.println(input + " yards = " + result + " feets");
                break;
            case 2:
                System.out.print("Enter feet: ");
                input = sc.nextDouble();
                result = convertFeetToYards(input);
                System.out.println(input + " feet = " + result + " yards");
                break;
            case 3:
                System.out.print("Enter meters: ");
                input = sc.nextDouble();
                result = convertMetersToInches(input);
                System.out.println(input + " meters = " + result + " inches");
                break;
            case 4:
                System.out.print("Enter inches: ");
                input = sc.nextDouble();
                result = convertInchesToMeters(input);
                System.out.println(input + " inches = " + result + " meters");
                break;
            case 5:
                System.out.print("Enter inches: ");
                input =sc.nextDouble();
                result = convertInchesToCm(input);
                System.out.println(input+" inches = "+result+" cm");
            default:
                System.out.println("Invalid choice! Please select between 1-4.");
        }

        sc.close();
    } 
}
