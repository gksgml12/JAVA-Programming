import java.util.Scanner;


public class Test3 {
	public static void main(String[] args){		
		double input;
		int intInput, absInt;
		int quo, res;
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("�Ǽ��� �Է��ϼ���. ");
		input = s.nextDouble();
		
		intInput = (int)input;
				
		if((intInput & 0x80000000) != 0) absInt = ~intInput + 1; 
		else absInt = intInput;
		
		quo = absInt >> 5;
		res = absInt & 0x1f;

		System.out.printf("\"%d�� ������ %d�̰�,\n", intInput, absInt);
		System.out.printf("\t�� ���� 32�� ���� ���� %d�̰�,\n", quo);
		System.out.printf("\t\t�������� %d �Դϴ�.\"", res);	
		
		s.close();
	}	
}