package easylevelproblemsolving;

public class MiddleChar {
	public String Middle(String str) {
		 int length = str.length();
	        int middle = length / 2;

	        if (length % 2 == 0) {
	            return str.substring(middle - 1, middle + 1);
	        }
	        else {
	            return String.valueOf(str.charAt(middle));
	        }
	}
public static void main(String[] args) {
        String res=new MiddleChar().Middle("today");
        System.out.println(res);
    }
}

