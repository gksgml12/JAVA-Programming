import java.util.Scanner;

public class Test2{
	public static void main(String [] args){
		Scanner s = new Scanner(System.in);
		int a, b;
		System.out.print("����1(a) : ");
		a = s.nextInt();
		System.out.print("����2(b) : ");
		b = s.nextInt();
		
		
		System.out.println("\n���� ���");
		System.out.printf("a+b: %+15d\n", a+b);
		System.out.printf("a*b: %#15o\n", a*b);
		System.out.printf("a-b: %#-x\n", a-b);
		
	}
}
