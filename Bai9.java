package test;

public class Bai9 {
	public static void main(String[] args) {
		int i = 100;
		while (i>=1) {
			if (i%7==0) {
				break;
			}
			i--;
		}
		System.out.print(i);
	}
}
