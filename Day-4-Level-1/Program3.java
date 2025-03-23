import java.util.Scanner;
public class Program3{
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        int numberOfStudents =sc.nextInt();
        int result= (numberOfStudents*(numberOfStudents-1)/2);
        System.out.println("The possible number of handshakes "+result);

    } 
}
