public class HW5_1_ii{
	public static void main(String [] args){
		int i, j, cnt;
		for(i=2; i<=100; i++){
			cnt = 0; //��� ������ ������ ���� 
			for(j=1; j<i; j++){		//i���� ���� ���� ����
				if(i%j==0) cnt++;	
				if(cnt>1) break;	//i�� ��� ������ 1�� ���� ���� ��� �̹� �Ҽ��� �ƴϹǷ� �ݺ��� ����
			}
			System.out.printf("%3d", i);	//����� ������ 1�� ��츸 i���
		}
	}
}