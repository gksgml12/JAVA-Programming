public class HW5_1_iiV2{
	public static void main(String [] args){
		int i, j;
		for(i=2; i<100; i++){
			for(j=2; j<i; j++){		//i�� i���� ���� ��(j, �� 1�� ����)�� ����
				if(i%j==0) break;	//i�� �ڽź��� ���� ���� �����������ٸ� �ݺ��� ����
			}
			if(i == j) System.out.printf("%3d", i);	//� j�� i�� ����� �ƴ϶�� �ѹ��� break �Ȱɸ��� �ݺ��� ���� �� ���̹Ƿ� i�� j�� ���� ����. 
			//���� i�� j�� ���ٸ� �Ҽ�			
		}
	}
}