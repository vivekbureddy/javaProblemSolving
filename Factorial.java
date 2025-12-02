package easylevelproblemsolving;

public class Factorial {
	public void factorial(int num) {
		long fact=1l;
		for(int i=1;i<=num;i++) {
			fact=fact*i;
		}
		System.out.println(fact);
	}

	public static void main(String[] args) {
		new Factorial().factorial(20);

	}

}
