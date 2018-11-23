class PlayerTest{//HW8_2클래스
	public static void main(String [] args){
		Player hong = new Player("홍길동"); //첫번째 플레이어 홍길동 생성
		Player jang = new Player("장발장"); //두번째 플레이어 장발장 생성
		int i, ptHong, ptJang;
		
		for(i=0; i<5; i++){//게임을 5번 할 것이기 때문에 5번 반복
			System.out.print(i+1+"번째 결과: ");
			System.out.println(hong.play()+", "+jang.play());
		}
		
		ptHong = hong.getTotalPoint();
		ptJang = jang.getTotalPoint();
		
		System.out.println("최종 결과");
		if(ptHong > ptJang){
			System.out.printf("승자: 홍길동(%d)\n", ptHong);
			System.out.printf("패자: 장발장(%d)\n", ptJang);
		}
		else if(ptHong < ptJang){
			System.out.printf("승자: 장발장(%d)\n", ptJang);
			System.out.printf("패자: 홍길동(%d)\n", ptHong);
		}
		else{
			System.out.println("무승부입니다: "+ptHong);
		}
	}
}

class Player{
	private String name;
	private int totalPoint;
	
	Player(){ } //디폴트 생성자
				//일반적으로는 생성자의 접근지시자는 public이 맞지만 이 경우와 같이 접근 지시자가 없을 수도 있습니다~~: 이경우는 패키지 수준에서 접근이 가능하겠죠~
	Player(String name){
		this.name = name;
	}
	
	int getTotalPoint(){
		return totalPoint;
	}
	
	String play(){
		int point = (int)(Math.random()*7); //주사위 던진 결과 생성
		totalPoint += point;	//이번 결과를 누적 점수에 저장
		return String.format("%s(%d)",this.name, point);//이번 결과 반환
	}
}