public class HW7_2{
	public static void main(String args[]){
		setCoord(6,3);
		setCoord(3,6,2);
	}
	
	public static void setCoord(double d1, double d2){
		System.out.printf("x, y coordinates: (%.2f, %.2f)\n", d1, d2);
	}
	public static void setCoord(double d1, double d2, double d3){
		System.out.printf("x, y coordinates: (%.2f, %.2f, %.2f)\n", d1, d2, d3);
	}
}