package test;

public class Bai8 {
	public static void main(String[]args) {
		double a, sum = 0, average = 0;
		for (a = 1; a <= 100; a++) {
			sum = sum + a;
			average = sum / a;
		}
		System.out.print(average);
	}
}
