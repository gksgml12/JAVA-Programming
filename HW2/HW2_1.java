import java.util.Scanner;

public class HW2_1{
	public static void main(String [] args){
		Scanner s = new Scanner(System.in);
		
		int num, tmp;
		System.out.print("1�� �̸��� ����: ");
		num = s.nextInt();
		
		tmp = num/10000;
		num %= 10000;		
		if(tmp==1) 		System.out.print("�� ");
		else if(tmp!=0) System.out.print(tmp+"�� ");
		
		tmp = num/1000;
		num %= 1000;		
		if(tmp==1) 		System.out.print("õ ");
		else if(tmp!=0) System.out.print(tmp+"õ ");
		
		tmp = num/100;
		num %= 100;
		if(tmp==1) 		System.out.print("�� ");
		else if(tmp!=0) System.out.print(tmp+"�� ");
			
		tmp = num/10;
		num %= 10;
		if(tmp==1) 		System.out.print("�� ");
		else if(tmp!=0) System.out.print(tmp+"�� ");
		
		if(num!=0) System.out.println(num+"�Դϴ�.");
		else System.out.println("�Դϴ�.");//�߰�
	}
}