package knowBasicMaths;

public class ArmstrongNumbers {

	public static void main(String[] args) {
		
		int num=371;
//		int num= 123;
		
		boolean flag=checkApproch1(num);
		System.out.println(flag ==true ? "armstrong" :" not armstrong");
	}

	private static boolean checkApproch1(int num) {
		int temp =num;
		int sum=0;
		while(num>0) {
		int  rem = num % 10;
		sum+=rem*rem*rem;
			num/=10;
		}
		
		if(sum==temp) {
			return true;
		}
		return false;	
	}

}
