import java.util.Scanner;
public class Program10{
    public static int[] findRemainderAndQuotient(int n1, int n2){
        int remainder=n1%n2;
        int quotient=n1/n2;
        return new int[]{remainder,quotient};
        
    }
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        int numberOfChoco = sc.nextInt();
        int numberOfStudents =sc.nextInt();
        int[] result=findRemainderAndQuotient(numberOfChoco,numberOfStudents);
        System.out.println("Number of chocolates each child gets: "+result[1]+ "\nRemaining chocolate: "+result[0]);

    } 
}