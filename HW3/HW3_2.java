import java.util.Scanner;


public class HW3_2 {
	public static void main(String[] args){

		int input;
		int sum=0;
		int count=0;
		double mean;
		Scanner s = new Scanner(System.in);

		while(true){
			System.out.print("������ �Է��ϼ���(1111�� �Է��Ͻø� ����� ��Ĩ�ϴ�) :");
			input = s.nextInt();
			if(input==1111)
				break;
			if(input%2==1 && input%7!=0){//Ȧ���̸鼭 7�ǹ���� �ƴ� ���̸�
				count++;
				sum= sum + input;
			}
		}
		
		if(count!=0){
			mean = (double) sum / count;
			System.out.printf("�Է¹��� Ȧ������ ����� : %.1f", mean);
		}
		else{
			System.out.println("����� ����� Ȧ���� �����ϴ�.");
		}
		s.close();
	}
}
