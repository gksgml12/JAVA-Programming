//�迭�� �� ��� ����� �� ������ ���� ���迡�� ���ܵ˴ϴ�~~

public class HW7_1{
	public static void main(String args[]){
		double avg;
		
		Grade g1 = new Grade();
		avg=g1.averageCal(90.3, 80.6, 98.5);//3����
		System.out.printf("1�� �л��� ��� ������ %.2f\n", avg);
		
		Grade g2 = new Grade();
		avg=g2.averageCal(70.3, 50.80); //2����
		System.out.printf("2�� �л��� ��� ������ %.2f\n", avg);
	}
}

class Grade{
	double averageCal(double... dArr){ //���� ���� �޼ҵ� ����, ���ڰ� ��� �� �޼ҵ�� ó�� ����. ���ڸ� dArr��� double�� �迭�� ����
		double sum = 0;
		for(double d: dArr){ //dArr��� �迭�� ���Ҹ� ���ʷ� double�� ���� d�� �Ѱ���. 
			sum += d; //�� ���� sum �� ���ʷ� ����. 
		}
		
		return sum/dArr.length; //�迭�� ��ü�� ó���� �ϴµ�, �迭�� ���̴� length��� �ʵ忡 ����Ǿ� ����. ��, dArr.length�� �迭�� ���̸� �ǹ���. 
	}
}