import java.util.Scanner;
class SimpleInterest{
    public int simpleInterest(int principal,int rate, int time){
        int si=principal*rate*time/100;
        return si;
    }
}
public class Program1{
    public static void main(String args[]){
        SimpleInterest obj = new SimpleInterest();
        Scanner sc =new Scanner(System.in);
        int principal=sc.nextInt();
        int rate=sc.nextInt();
        int time=sc.nextInt();
        int result=obj.simpleInterest(principal, rate, time);
        System.out.println("The Simple Interest is "+result+" for Principal "+principal+", Rate of Interest "+rate+" and Time "+time);

    } 
}