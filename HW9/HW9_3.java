import java.util.Scanner;

public class HW9_3{
	public static void main(String [] args){
		Scanner s = new Scanner(System.in);
		int [][] seats = new int [10][10];
		Theater.initSeats(seats);
		Theater.showSeats(seats);
		char rsv;
		while(true){
			System.out.print("예약 하시겠습니까?(Y(y)/N(n))");
			rsv = s.next().charAt(0); //next()메소드를 통해 문자열을 입력받고, 그 문자열의 첫문자를 rsv 변수에 저장. 
			if(rsv!='n'&&rsv!='N'&&rsv!='y'&&rsv!='Y'){
				System.out.println("올바른 값을 입력하세요.");
				continue;
			}
			if(rsv=='n'||rsv=='N'){
				System.out.println("예약 시스템을 종료합니다.");
				break;
			}
			Theater.reserve(seats);
		}
	}
}

class Theater{ //극장 클래스 작성
	public static void initSeats(int [][] seats){//모든 좌석을 임의로 예약완료(1), 미예약(0)으로 설정하는 메소드
		for(int i=0; i<seats.length;i++){
			for(int j=0; j<seats[i].length; j++){
				seats[i][j] = (int)(Math.random()*2);
			}
		}
	}
	public static void showSeats(int [][] seats){//현재 예약상태를 보여주는 메소드
		System.out.println("현재 좌석 예약 상태");
		System.out.print("   ");		
		for(int i=0; i<seats[0].length;){
			System.out.printf("  %2d  ", ++i);
		}
		System.out.println();
		for(int i=0; i<seats.length;i++){
			System.out.printf(" %c ", (char)('a'+i));	
			for(int j=0; j<seats[i].length; j++){
				if(seats[i][j]==1) System.out.printf("  %2c  ", 'X');
				else System.out.printf("  %2c  ", ' ');
			}
			System.out.println();
		}
	}
	public static void reserve(int [][] seats){//예약하는 메소드
		Scanner s = new Scanner(System.in);
		int row, col;
		while(true){
			System.out.print("좌석의 행: ");	
			row = (int)(s.next().charAt(0)-'a');
			System.out.print("좌석의 열: ");	
			col = s.nextInt()-1;
			if(seats[row][col]==1){
				System.out.println("이미 예약된 좌석입니다. 좌석을 다시 선택하세요.");
				continue;
			}
			else{
				seats[row][col]=1;
				System.out.printf("%c열 %d열 예약 성공!\n", (char)('a'+row), col+1);
				showSeats(seats);
				break;
			}
		}
	}
}