class Figure{
	protected double perimeter;	//둘레길이
	protected double area;	//넓이
	Figure(){} //여기에서 디폴트 생성자는 아무 일도 하지 않음
	Figure(double perimeter, double area){
		this.perimeter = perimeter;
		this.area = area;
	}
	public String toString(){	//(Object 클래스의)toString메서드 재정의
		return String.format("이 도형은 %s이고, 둘레는 %.2f, 넓이는 %.2f입니다.\n", this.getClass().getName(), perimeter, area); //this.getClass().getName()은 다음 시간에 배울 동적 바인딩을 알아야 이해 할 수 있는 부분이라 그냥 넘어가시기 바랍니다. 
	}
}

class Circle extends Figure{
	protected double radius;
	Circle(){ //디폴트 생성자는 비워둬도 되지만 여기에선 반지름이 1인 원 생성하게 작성
		super(Math.PI*2, Math.PI);
		radius = 1;
	}
	Circle(double r){	//반지름을 인자로 받아 반지름, 넓이, 둘레길이 필드 초기화
		super(Math.PI*2*r, Math.PI*r*r);
		radius = r;
	}
	public String toString(){	//toString메서드 재정의
		return super.toString()+"이 원의 반지름은 "+radius+"입니다.\n";		
	} 
}

class EquilateralTriangle extends Figure{//원과 유사.
	protected double side;
	protected double height;
	EquilateralTriangle(){ //원과 마찬가지로 디폴트 생성자는 한변의 길이가 1인 정삼각형 생성
		super(3, Math.sqrt(3)/4);
		side = 1;
		height = Math.sqrt(3)/2;
	}
	EquilateralTriangle(double s){ 
		super(3*s, Math.sqrt(3)/4*s*s);
		side = s;
		height = Math.sqrt(3)/2*side;
	}
	public String toString(){
		return String.format("%s이 삼각형의 한변의 길이는 %.2f이고, 높이는 %.2f입니다.\n", super.toString(),side, height);		
	} 
}

class HW10_1{
	public static void main(String args []){
		Circle c = new Circle(3);	//반지름 3인 원 객체 생성 & 참조형 변수 c가 생성한 원 객체 참조
		System.out.println(c);		//c가 가리키는 원의 toString()메서드가 반환한 string 출력
		EquilateralTriangle r = new EquilateralTriangle(3);	//위와 유사.
		System.out.println(r);
	}	
}
