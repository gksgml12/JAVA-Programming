import java.util.Scanner;

public class Test2{
	public static void main(String [] args){
		Scanner s = new Scanner(System.in);
		int a, b;
		System.out.print("정수1(a) : ");
		a = s.nextInt();
		System.out.print("정수2(b) : ");
		b = s.nextInt();
		
		
		System.out.println("\n실행 결과");
		System.out.printf("a+b: %+15d\n", a+b);
		System.out.printf("a*b: %#15o\n", a*b);
		System.out.printf("a-b: %#-x\n", a-b);
		
	}
}
