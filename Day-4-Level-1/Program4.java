import java.util.Scanner;
class Demo{
    public double compute(double distance,double perimeter){
        double rounds= distance/perimeter;
        return rounds;
    }
}
public class Program4{
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        Demo obj = new Demo();
        int side1 = sc.nextInt();
        int side2 = sc.nextInt();
        int side3 = sc.nextInt();
        double perimeter=side1+side2+side3;
        double distance=5000.0;
        System.out.println("The  number of rounds: "+obj.compute(distance, perimeter));

    } 
}