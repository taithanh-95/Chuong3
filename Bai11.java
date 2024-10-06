package test;

public class Bai11 {
	public static void main(String[]args) {
		int a=1;
		while ( a <= 1000) {
			if( a % 2 == 1) {
				System.out.println(a + " UNEVEN ");
			}
			else {
				System.out.println(a + " EVEN");
			}
			a++;
		}
	}
}
