import java.util.Scanner;

class Test5{
	public static void main(String [] args){
		int gan;
		int size;
		int i, j;
		Scanner s = new Scanner(System.in);
		System.out.print("크기: ");
		size = s.nextInt();
		System.out.print("간격: ");
		gan = s.nextInt();
		
		for(i=0; i<size; i++){
			for(j=size-1-i;j>0;j--) System.out.print(" ");
			for(j=0;j<=i;j++) System.out.print("*");
			for(j=0;j<gan;j++) System.out.print(" ");
			for(j=0;j<=i;j++) System.out.print("*");
			System.out.println();
		}
		
		for(j=0;j<gan;j++) System.out.println();
		
		for(i=0; i<size; i++){
			for(j=0;j<i;j++) System.out.print(" ");
			for(j=size-i;j>0;j--) System.out.print("*");
			for(j=0;j<gan;j++) System.out.print(" ");
			for(j=size-i;j>0;j--) System.out.print("*");
			System.out.println();
		}
	}
}