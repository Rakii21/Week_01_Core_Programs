import java.util.Scanner;
class Demo{
    public int handshakes(int n){
        int maxHandshakes=(n*(n-1)/2);
        return maxHandshakes;
    }
}
public class Program2{
    public static void main(String args[]){
        Demo obj = new Demo();
        Scanner sc =new Scanner(System.in);
        int number =sc.nextInt();
        int result=obj.handshakes(number);
        System.out.println("The maximum number of handshakes "+result);

    } 
}