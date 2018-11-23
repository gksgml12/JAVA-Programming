class Test7{
	public static void main(String [] args){
		StringM sm = new StringM();
		String s1 = "Hello";
		String s2 = "Hi";
		String s3 = "Hello";
		System.out.printf("\"%s\"의 역순: %s\n", s1, sm.revString(s1));
		System.out.printf("\"%s\"와 \"%s\" 일치? %s\n", s1, s2, sm.stringEqual(s1, s2));
		System.out.printf("\"%s\"와 \"%s\" 일치? %s\n", s1, s3, sm.stringEqual(s1, s3));
		System.out.printf("\"%s\"에서 대문자를 소문자로: ", s1);
		sm.toLower(s1);
	}
}

class StringM{
	String revString(String s){
		String rev="";
		for(int i=0; i<s.length(); i++){
			rev = s.charAt(i)+rev;
		}
		return rev;
	}
	boolean stringEqual(String s1, String s2){
		if(s1.length() != s2.length()) return false;
		for(int i=0; i<s1.length(); i++)
			if(s1.charAt(i)!=s2.charAt(i)) return false;
		return true;
	}
	void toLower(String s){
		for(int i=0; i<s.length(); i++){
			if(s.charAt(i)>='A' && s.charAt(i)<='Z') System.out.print((char)(s.charAt(i)+32));
			else System.out.print(s.charAt(i));			
		}
	}
}