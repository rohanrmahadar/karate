
public class Fibonacci {

	public static void main(String[] args) {

		int num, a = 0, b = 0, c = 1;

		System.out.println("Enter the number of times");
		num = 10;
		System.out.println("Fibonacci Series of the number is:");
		for (int i = 0; i < num; i++) {
			a = b;
			b = c;
			c = a + b;
			System.out.print(a + " "); // if you want to print on the same line, use print()
		}
	}
}
