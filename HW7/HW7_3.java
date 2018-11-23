class StringManipulate{
	
	String concat(String s1, String s2){	//두 문자열 s1, s2를 매개변수로 받아 s1에 s2를 연결시키고 연결시킨 문자열을 반환하는 메소드
		return s1+s2;
	}
	
	void toUpper(String s){	//문자열 s를 매개변수로 받아 소문자가 나타날때마다 대문자로 변환하여 출력하는 메소드, 소문자외의 다른 문자는 변환하지 않고 스킵
		int i;
		for(i=0; i<s.length(); i++){
			if(s.charAt(i)>='a'&&s.charAt(i)<='z')//문자열 s의 i번째 문자가 소문자라면
				System.out.print((char)(s.charAt(i)-32));//대문자로 변환해서 출력
										 //대문자는 소문자에서 32를 빼면 됨. 
			else //문자열 s의 i번째 문자가 소문자가 아니라면 
				System.out.print(s.charAt(i));	//그냥 i번째 문자 그대로 출력
		}
	}
	
	boolean equals(String s1, String s2){//두 문자열을 입력받아 내용이 일치하는지 여부를 반환하는 메소드 
		int i; 
		if(s1.length() != s2.length()) return false;//두 문자열의 길이가 다르다면 불일치하므로 false반환.
		for(i=0; i<s1.length(); i++){
			if(s1.charAt(i)!=s2.charAt(i)) return false;//i번째 문자가 다르다면 false반환
		}
		//마지막문자까지 같은 경우만 반복문 무사히 빠져나옴. 
		return true; //이까지 왔다는 말은 두 문자열이 같다는 말이기 때문에 true 반환
	}
}

class HW7_3{
	public static void main(String [] args){
		String st1 = "Hello ", st2 = "Hi!", st3 = "Hello ";
		StringManipulate sm = new StringManipulate();
		
		System.out.println("st1에 st2를 연결: "+sm.concat(st1, st2));
		sm.toUpper(st2);
		System.out.println();
		System.out.println("st1, st2 일치?: "+sm.equals(st1, st2));
		System.out.println("st1, st3 일치?: "+sm.equals(st1, st3));
		
	}
}