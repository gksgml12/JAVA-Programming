import java.util.Scanner;

public class HW3_1{
	public static void main(String [] args){
		Scanner s = new Scanner(System.in);
		double operand1, operand2, result;
		String operator;
		
		while(true){
			System.out.print("계산 식을 입력하세요(ex. 41 / 5): ");
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
						System.out.println("0으로는 나눌 수 없습니다.");
						return; //return을 만날 경우 프로그램 종료
					}
					result = operand1/operand2;
					break;
				case "%":
					if(operand2==0){
						System.out.println("0으로는 나눌 수 없습니다.");
						return;
					}
					result = operand1%operand2;
					break;
				default:
					System.out.println("[입력오류]: 잘못된 식을 입력하셨습니다.");
					return;
			}
			
			if(result==(int)result) //결과가 정수라면
				System.out.println("= "+(int)result);//정수형태로 출력
			else
				System.out.printf("= %.2f\n",result);
			
			System.out.println();
		}
	}
}
