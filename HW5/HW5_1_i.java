public class HW5_1_i{
	public static void main(String [] args){
		int i;
		int cnt = 0;
		for(i=1; i<=100; i++){
			if(i%2==0||i%3==0||i%5==0||i%7==0)	continue;	
				System.out.printf("%3d", i);
				cnt++;	//����� ����ŭ ī�����Ѵ�(10�� ������� �ٳѱ��ϱ� ����)
				if(cnt%5==0)	System.out.println();	//���� ��� ���� 10�� ����� ��� ����
			
		}
	}
}