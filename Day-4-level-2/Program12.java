import java.util.Arrays;
import java.util.Scanner;
public class Program12 {
    public int[] generate4DigitRandomArray(int size){
        int[] arr=new int[size];
        for(int i=0;i<size;i++){
            arr[i]= (int)(Math.random()*9000)+1000;
        }
        return arr;
    }
    public double[] findAverageMinMax(int[] arr){
        int min=arr[0];
        int max=arr[0];
        double sum=0;
        for(int n:arr){
            sum+=n;
            min=Math.min(min,n);
            max=Math.max(max,n);
        }
        double average=sum/arr.length;
        return new double[]{average,min,max};
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Program12 obj=new Program12();
        int size= sc.nextInt();
        int[] arr=obj.generate4DigitRandomArray(size);
        double[] results=obj.findAverageMinMax(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println("Average: "+results[0]);
        System.out.println("Minimum: "+results[1]);
        System.out.println("Maximum: "+results[2]);
    }
    
}
