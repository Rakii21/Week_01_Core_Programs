import java.util.Scanner;
class Program1{
    public static boolean compareStrings(String s1,String s2){
        if(s1.length()!=s2.length()) return false;
        for(int i=0;i<s1.length();i++){
            if(s1.charAt(i)!=s2.charAt(i)) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String a=sc.next();
        String b=sc.next();
        if(compareStrings(a, b)) System.out.println("true");
        else System.out.println("false");
        if(a.equals(b)) System.out.println(a+" and "+b+" are equal");
        else System.out.println(a+" and "+b+" are not equal");

    }
}