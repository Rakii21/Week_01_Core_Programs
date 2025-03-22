import java.util.Scanner;
public class Program4 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        double[] arr=new double[10];
        double total = 0.0;
        int index=0;
        while(true){
            if(index==10) break;
            int n=sc.nextInt();
            if(n<=0) break;
            else arr[index]=n;
            index++;           
        }
        for (int i=0;i<arr.length;i++){
            total+=arr[i];
        }
        System.out.println("Total is "+total);
    }
}
