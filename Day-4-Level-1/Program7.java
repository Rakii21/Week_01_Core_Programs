import java.util.Scanner;
class Demo{
    public int sum(int number){
        int sum=0;
        while(number>0){
            sum=sum+number;
            number--;

        }
        return sum;
    }
}
public class Program7{
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        Demo obj = new Demo();
        int number = sc.nextInt();
        if(number>0){
        System.out.println("Sum of "+number+ " natural numbers is "+obj.sum(number));
        }
        else System.out.println("Enter natural number");

    } 
}
