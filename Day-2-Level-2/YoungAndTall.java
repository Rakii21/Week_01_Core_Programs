import java.util.Scanner;
public class YoungAndTall{
    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int ageAmar=sc.nextInt();
		int ageAkbar=sc.nextInt();
		int ageAnthony=sc.nextInt();
		int heightAmar=sc.nextInt();
		int heightAkbar=sc.nextInt();
		int heightAnthony=sc.nextInt();
        if(ageAmar<ageAkbar && ageAmar<ageAnthony) System.out.println("Amar");
		else if(ageAkbar<ageAnthony) System.out.println("Akbar");
		else System.out.println("Anthony");
		if(heightAmar>heightAkbar && heightAmar>heightAnthony) System.out.println("Amar");
		else if(heightAkbar>heightAnthony) System.out.println("Akbar");
		else System.out.println("Anthony");
		sc.close();
		}
	}