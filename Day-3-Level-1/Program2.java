import java.util.Scanner;
public class Program2{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int[] arr=new int[5];
        for(int i=0;i<5;i++){
            arr[i]=sc.nextInt();
        }
        for(int j=0;j<arr.length;j++){
            if(arr[j]>0){
                if(arr[j]%2==0){
                    System.out.println(arr[j]+" is Even");
                }
                else System.out.println(arr[j]+" is Odd");
            }
            else if(arr[j]<0) System.out.println(arr[j]+" is Negative");
            else System.out.println(arr[j]+" is Zero");

        }
        if(arr[0]==arr[4]) System.out.println("First and last elements are equal");
        else if(arr[0]>arr[4]) System.out.println("First element is greater than the last element");
        else System.out.println("First element is less than the last element");
    }
}