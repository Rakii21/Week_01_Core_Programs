import java.util.Scanner;
public class Program3{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int[] arr=new int[10];
        for(int i=0;i<10;i++){
            arr[i]= number*(i+1);
        }
        for(int j=1;j<=10;j++){
            System.out.println(number+" * "+j+" = "+number*j);
        }
    }
}
