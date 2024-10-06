package test;

public class Bai13 {
	public static void main(String[]args) {
		int s=10;
		for(int h=0; h<4; h++) {
			for( int c=0; c<h; c++) {
				System.out.print(" ");
			}
			for(int c=0;c<s-h*2;c++) {
				System.out.print("*");
			}
			System.out.println();
		}
		s = 6;
		for(int h=0; h<3; h++) {
			for(int c=0; c<2-h; c++) {
				System.out.print(" ");
				}
			for(int c=0; c<s+h*2; c++)	{
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
}
