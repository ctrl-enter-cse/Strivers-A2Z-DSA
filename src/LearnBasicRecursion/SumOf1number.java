package LearnBasicRecursion;

public class SumOf1number {

	static int count=0;
	static int sum1=0;
	
	static int print(int n) {

		if (n == 0) {
			return 0;
		}
		return n + print(n - 1);
	}

	public static void main(String[] args) {

		int n = 5;
//		1+2+3+4+5
		
		int number=12345;
		
		int  digit =(int) Math.floor(Math.log10(number)+1);
		System.out.println(digit);
		

		int sum = print(n);

		System.out.println(sum);

		sum = Approch2(n);
		System.out.println(sum);

	}

// from 0 to n
	private static int Approch2(int n) {
		
		if(count==n+1) return sum1;
		sum1 = sum1+count++;

		return Approch2(n);
	}

}
