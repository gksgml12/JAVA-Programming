public class HW9_1{
    public static void main(String [] args){
		int [] scores = new int[50]; //�� �л��� ���� ���� �迭
		int [] arr = new int[10]; //������ ���� �ο� ���� �迭
		
		for(int i=0; i<scores.length; i++){
			scores[i] = (int)(Math.random()*101);
			if(scores[i]==100) arr[9]++; //100���̶�� 90����
			else arr[scores[i]/10]++; //100���� �ƴ϶�� �� �����뿡 �´� �迭 ���� ����
		}
		
		//������׷��� �ְ� ���� ���
		int max = arr[0];
		for(int i=1; i<arr.length; i++){
			if(max<arr[i]) 
				max = arr[i];
		}
		//�Ǵ� 	for(int i:arr)	if(max<i) max=i; �� ����
		
		for(;max>0; max--){//�� max�����ϱ�?
			for(int i=0; i<arr.length; i++){
				if(arr[i]>=max){
					System.out.print("  * ");
				}
				else System.out.print("    ");
			}
			System.out.println();
		}
		
		for(int i=0;i<10;i++) System.out.printf(" %2d ", 10*i+5);
    } 
}