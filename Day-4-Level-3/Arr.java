import java.util.Scanner;
public class Arr{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int number=sc.nextInt();
        int[] marks = new int[number];
        double[] percentage = new double[number];
        char[] grade = new char[number];
        for(int i=0;i<number;i++){
            int physics;
            while(true){
                if(sc.hasNextInt()){
                    physics=sc.nextInt();
                    if(physics>=0) break;
                } else sc.next();
                System.out.println("Enter a positive value");
            }
            int chemistry;
            while(true){
                if(sc.hasNextInt()){
                    chemistry=sc.nextInt();
                    if(chemistry>=0) break;
                } else sc.next();
                System.out.println("Enter a positive value");
            }
            int maths;
            while(true){
                if(sc.hasNextInt()){
                    maths=sc.nextInt();
                    if(maths>=0) break;
                } else sc.next();
                System.out.println("Enter a positive value");
            }
            marks[i]=physics+chemistry+maths;
            percentage[i]=(marks[i]/3.0);
            if(percentage[i]<=100 && percentage[i]>=80) grade[i]='A';
            else if(percentage[i]>=70) grade[i]='B';
            else if(percentage[i]>=60) grade[i]='C';
            else if(percentage[i]>=50) grade[i]='D';
            else if(percentage[i]>=40) grade[i]='E';
            else grade[i]='R';
        }
        for(int k=0;k<number;k++){
            System.out.println("Marks: "+marks[k]+", Percentage: "+String.format("%.2f",percentage[k])+", Grade: "+grade[k]);
        }
    }
}
