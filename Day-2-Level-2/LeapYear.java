import java.util.Scanner;
public class PowerWhile{
    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int year = sc.nextInt();
		if(year>=1582){
			if(year%4==0){
				if(year%100==0){
					if(year%400==0){
						System.out.println(year +" is a Leap Year");
						} else{
							System.out.println(year +" is not a Leap Year");
							}
						} else{
							System.out.println(year +" is a Leap Year");
						}
					}
				}else{
					System.out.println(year +" is not leap Year);
					}
		if((year%4==0 && year%100!=0)||year%400==0){
			System.out.println(year +" is a Leap year");
			} else{ System.out.println(year +" is not a leap year");
			}
		}
	}