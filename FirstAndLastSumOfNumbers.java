package easylevelproblemsolving;

public class FirstAndLastSumOfNumbers {
	public static void main(String[] args) {

		int num=7171,count=0,sum1=0,sum2=0;
		int temp=num;
		while(temp!=0) {
			count++;
			temp/=10;
		}
		for(int i=1;i<=count;i++) {
			int n=num%10;
			if(i==1 || i==count)
				sum1=sum1+n;
			else
				sum2=sum2+n;
			num/=10;
		}
		System.out.println((sum1==sum2)?"Equal":"Not Equal");

	}


}


