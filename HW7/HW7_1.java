//배열을 안 배운 관계로 이 문제는 내일 시험에선 제외됩니다~~

public class HW7_1{
	public static void main(String args[]){
		double avg;
		
		Grade g1 = new Grade();
		avg=g1.averageCal(90.3, 80.6, 98.5);//3과목
		System.out.printf("1번 학생의 평균 점수는 %.2f\n", avg);
		
		Grade g2 = new Grade();
		avg=g2.averageCal(70.3, 50.80); //2과목
		System.out.printf("2번 학생의 평균 점수는 %.2f\n", avg);
	}
}

class Grade{
	double averageCal(double... dArr){ //가변 인자 메소드 정의, 인자가 몇개라도 이 메소드로 처리 가능. 인자를 dArr라는 double형 배열에 저장
		double sum = 0;
		for(double d: dArr){ //dArr라는 배열의 원소를 차례로 double형 변수 d에 넘겨줌. 
			sum += d; //그 값을 sum 에 차례로 저장. 
		}
		
		return sum/dArr.length; //배열도 객체로 처리를 하는데, 배열의 길이는 length라는 필드에 저장되어 있음. 즉, dArr.length는 배열의 길이를 의미함. 
	}
}