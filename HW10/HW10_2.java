class HW10_2{
	public static void main(String [] args){
		//사람 한 명 생성 후 그 사람의 정보 출력
		Person hong = new Person("홍길동", 20);
		System.out.println(hong);
		//지휘자 한 명 생성후 그 사람의 정보 출력
		Director jang = new Director("장발장", 20);
		System.out.println(jang);
		//지휘자가 빵을 10개 먹음 
		jang.eat("빵", 10);
		
		//피아니스트 한 명 생성후 그 사람의 정보 출력
		Pianist bee = new Pianist("베토벤", 20, "영창피아노");
		System.out.println(bee);
		//피아니스트가 피자를 10조각 먹음 
		bee.eat("피자", 10);
	}
}

class Person{
	protected int age;
	protected String name;
	Person(){}
	Person(String name, int age){
		this.name = name;
		this.age = age;
	}
	public void eat(String menu, int num){
		System.out.printf("%s이(가) %s를 %d개 먹습니다.\n", name, menu, num);
	}	
	public String toString(){
		return String.format("이 %s의 이름은 %s, 나이는 %d입니다.", this.getClass().getName(), name, age);
	}
}

class Player extends Person{
	Player(){}
	Player(String name, int age){
		super(name, age);
	}
	public void play(){
		System.out.println("연주합니다.");
	}
}

class Director extends Person{
	Director(){}
	Director(String name, int age){
		super(name, age);
	}
	public void direct(){
		Pianist p = new Pianist("홍길동", 20, "영창피아노");
		p.play();		
		Violinist v = new Violinist();
		v.play();
		Cellist c = new Cellist();
		c.play();		
	}
}



class Pianist extends Player{
	String typeOfPiano; //피아노 제조회사
	//피아니스트 생성자	
	Pianist(){}
	Pianist(String n, int a, String brand){
		/*
		name = n;
		age = a;*/
		super(n, a);
		typeOfPiano = brand;
	}
	public String toString(){
		//return super.toString()+String.format(", 피아노 브랜드: %s", typeOfPiano);
		return super.toString()+" 그리고 피아노 브랜드는 "+typeOfPiano+"입니다.";
	}
	public void play(){//수퍼(부모)클래스로부터 상속받은 메소드를 자신의 클래스에 적합하게 변경: 메소드 재정의(override)
		System.out.println("피아노를 연주합니다.");
	}
}
class Violinist extends Player{
	@Override
	public void play(){//부모클래스의 play()메소드를 재정의하려는 의도였으나 타이핑을 잘못해 play가 아닌 ply메소드를 만들게 됨. 
		System.out.println("바이올린을 연주합니다.");
	}
}
class Cellist extends Player{
	@Override
	public void play(){
		System.out.print("첼로를 ");
		super.play();
	}
} 