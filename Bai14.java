package test;

public class Bai14 {
	public static void main(String[] args) {
		int s = 1;
		for(int h=0; h<4; h++) {
			for(int c=0; c<6-2*h; c++) {
				System.out.print(" ");
			}
			for(int c=0; c<s+h*2; c++) {
				System.out.print(" *");
			}
			System.out.println();
		}
	}
}
