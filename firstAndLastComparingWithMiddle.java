package easylevelproblemsolving;
import java.util.*;

public class firstAndLastComparingWithMiddle {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("enter any three or four digit number:");
		int num =sc.nextInt();
		int temp=num;
		int last=temp%10;
		int[] mid=new int[10];
		temp/=10;
		int count=0;
		while(temp>=10) {
			mid[count++]=temp%10;
			temp/=10;
		}
		int first=temp;		
		boolean result=true;
		for(int i=0;i<count;i++) {
			if(mid[i]>=first||mid[i]>=last)
				result=false;
			break;
		}
		System.out.println(result);
		}

}
