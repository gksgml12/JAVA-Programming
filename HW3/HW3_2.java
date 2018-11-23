import java.util.Scanner;


public class HW3_2 {
	public static void main(String[] args){

		int input;
		int sum=0;
		int count=0;
		double mean;
		Scanner s = new Scanner(System.in);

		while(true){
			System.out.print("정수를 입력하세요(1111을 입력하시면 계산을 마칩니다) :");
			input = s.nextInt();
			if(input==1111)
				break;
			if(input%2==1 && input%7!=0){//홀수이면서 7의배수가 아닌 값이면
				count++;
				sum= sum + input;
			}
		}
		
		if(count!=0){
			mean = (double) sum / count;
			System.out.printf("입력받은 홀수들의 평균은 : %.1f", mean);
		}
		else{
			System.out.println("평균을 계산할 홀수가 없습니다.");
		}
		s.close();
	}
}
