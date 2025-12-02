package easylevelproblemsolving;

public class ReverseOfNum {
	public void reverse(int num) {
		int rev=0;
		while(num!=0) {
			rev=rev*10+num%10;
			num/=10;
		}
		System.out.println(rev);
		
	}

	public static void main(String[] args) {
		new ReverseOfNum().reverse(765);

	}

}
