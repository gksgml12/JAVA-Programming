import java.util.Scanner;

class HW1_2{
	public static void main(String [] args){
		int a;
		int b;
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("ù��° ���� ���� : ");
		a = s.nextInt();
		System.out.print("�ι�° ���� ���� : ");
		b = s.nextInt();
	
		System.out.printf("\n\n%-10s|%-10s|%-10s|%-11s|\n", "number","decimal","otcal","hexadecimal");//�������� hexadecimal�� 11�ڿ���
		System.out.printf("%-10s|%+10d|%10o|%11x|\n", "number 1",a,a,a);
		System.out.printf("%-10s|%+10d|%10o|%11x|\n", "number 2",b,b,b);
		System.out.printf("%-10s|%+-10d|%-10o|%-11x|\n", "sum",a+b,a+b,a+b);
		System.out.printf("ȣȣȣȣ"+a);
	}
}