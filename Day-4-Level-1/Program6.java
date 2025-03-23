import java.util.Scanner;
class Demo{
    public boolean find(int month,int day){
        if(month==3 && day>=20 && day<=31) return true;
        else if(month==4 && day>=1 && day<=30) return true;
        else if(month==5 && day>=1 && day<=31) return true;
        else if(month==6 && day>=1 && day<=20) return true;
        else return false;
    }
}
public class Program6{
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        Demo obj = new Demo();
        int month = sc.nextInt();
        int day = sc.nextInt();
        System.out.println(obj.find(month,day));

    } 
}
