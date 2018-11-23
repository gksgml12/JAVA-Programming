class HW4_1{
	public static void main(String [] args){
		int x, y;
		for(x=1;x<20;x+=2){
			if(x<=3) 	y = x*x*x - 9*x + 2;// ¶Ç´Â (int)Math.pow(x, 3)- 9*x + 2;
			else 		y = 2*x-4;
			System.out.printf("(%-2d,%2d)\n", x, y);
		}
	}
}