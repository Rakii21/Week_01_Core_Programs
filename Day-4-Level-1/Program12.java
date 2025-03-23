import java.util.Scanner;
public class Program12{
    public double[] calculateTrignometricFunctions(double angle){
        double radians=Math.toRadians(angle);
        double sin=Math.sin(radians);
        double cos=Math.cos(radians);
        double tan=Math.tan(radians);
        return new double[]{sin,cos,tan};
        
    }
    public static void main(String args[]){
        Program12 obj=new Program12();
        Scanner sc =new Scanner(System.in);
        double angle=sc.nextDouble();
        double[] result=obj.calculateTrignometricFunctions(angle);
        System.out.println("Sin: "+result[0]+", Cos: "+result[1]+", Tan: "+result[2]);
    } 
}