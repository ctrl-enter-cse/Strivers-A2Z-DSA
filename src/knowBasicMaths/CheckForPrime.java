package knowBasicMaths;

public class CheckForPrime {

	public static void main(String[] args) {
		int number=3 ;
		boolean flag= checkforprime(number);
		
		System.out.println(flag ==true ? "prime ":"non prime");
	}

	private static boolean checkforprime(int number) {

		for( int i=2; i<Math.sqrt(number);i++) {
			if(number%i==0) {
				return false;
			}
		}
		return true;
	}

}
