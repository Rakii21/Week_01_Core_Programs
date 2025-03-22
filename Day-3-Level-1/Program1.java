import java.util.Scanner;
public class Program1{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int[] age=new int[10];
        for(int i=0;i<10;i++){
            age[i]=sc.nextInt();
        }
        for(int j=0;j<age.length;j++){
            if(age[j]<0) System.out.println("Invalid age");
            else if(age[j]>=18) System.out.println("The student with age "+ age[j]+" can vote.");
            else System.out.println("The student with age "+age[j]+" cannot vote.");
        }
    }
}