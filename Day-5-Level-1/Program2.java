import java.util.Scanner;
class Program2{
    public static String subString(String s,int start,int end){
        String result="";
        for(int i=start;i<end;i++){
            result+=s.charAt(i);
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String a=sc.next();
        int start=sc.nextInt();
        int end=sc.nextInt();
        String b= subString(a, start, end);
        String c= a.substring(2,5);
        if(b.equals(c)) System.out.println(b+" and "+ c +" are equal" );
        else System.out.println(b +" and "+ c+ " are not equal");
    }
}