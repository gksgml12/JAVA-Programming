import java.util.Scanner;

public class HW3_3{
	public static void main(String args[]){
		Scanner s = new Scanner(System.in);
		int i, input, sum = 0;
		
		System.out.print("1���� ū ������ �Է��ϼ���: ");
		input = s.nextInt();
		
		for(i=1; i<=input; i++){
			if(i%2==0){
				System.out.printf(" %d��+", i);
				sum -= i*i; 
			}else{
				System.out.printf(" %d��-", i);				
				sum += i*i;
			}
		}
		System.out.printf("\b= %d\n",sum);// \b�� Ŀ���� ��ĭ ������ �̵�: �����ð��� �ٽ� ����ϰڽ��ϴ�. //������ ��ȣ �������
	}
}
