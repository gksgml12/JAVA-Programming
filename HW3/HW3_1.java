import java.util.Scanner;

public class HW3_1{
	public static void main(String [] args){
		Scanner s = new Scanner(System.in);
		double operand1, operand2, result;
		String operator;
		
		while(true){
			System.out.print("��� ���� �Է��ϼ���(ex. 41 / 5): ");
			operand1 = s.nextDouble();
			operator = s.next();		
			operand2 = s.nextDouble();
			
			switch(operator){
				case "+":
					result = operand1+operand2;
					break;
				case "-":
					result = operand1-operand2;
					break;
				case "*":
					result = operand1*operand2;
					break;
				case "/":
					if(operand2==0){
						System.out.println("0���δ� ���� �� �����ϴ�.");
						return; //return�� ���� ��� ���α׷� ����
					}
					result = operand1/operand2;
					break;
				case "%":
					if(operand2==0){
						System.out.println("0���δ� ���� �� �����ϴ�.");
						return;
					}
					result = operand1%operand2;
					break;
				default:
					System.out.println("[�Է¿���]: �߸��� ���� �Է��ϼ̽��ϴ�.");
					return;
			}
			
			if(result==(int)result) //����� �������
				System.out.println("= "+(int)result);//�������·� ���
			else
				System.out.printf("= %.2f\n",result);
			
			System.out.println();
		}
	}
}
