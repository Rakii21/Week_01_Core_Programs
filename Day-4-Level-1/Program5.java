import java.util.Scanner;
class Demo{
    public int find(int n){
        if(n>0) return 1;
        else if(n<0) return -1;
        else return 0;
    }
}
public class Program5{
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        Demo obj = new Demo();
        int number = sc.nextInt();
        System.out.println(obj.find(number));

    } 
}
