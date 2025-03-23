import java.util.Scanner;
public class Program10{
    public double findBMI(double weight,double height){
        double bmi=weight/(height*height);
        return bmi;
    }
    public String findStatus(double bmi){
        if(bmi>=40.0) return "Obese";
        else if(bmi>=25.0) return "Overweight";
        else if(bmi>=18.5) return "Normal";
        else return "Underweight";
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Program10 obj=new Program10();
        double[][] arr= new double[10][3];
        String[] statuses=new String[10];
        for(int i=0;i<10;i++){
            arr[i][0]=sc.nextDouble();
            arr[i][1]=sc.nextDouble()/100;
            arr[i][2]=obj.findBMI(arr[i][0],arr[i][1]);
            statuses[i]=obj.findStatus(arr[i][2]);
        }
        for(int i=0;i<10;i++){
            System.out.println("Weight: "+arr[i][0]+" Height: "+arr[i][1]+" BMI: "+arr[i][2]+ " Status: "+statuses[i]);
        }
        
    }

}