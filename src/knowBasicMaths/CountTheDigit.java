package knowBasicMaths;

public class CountTheDigit {

	public static void main(String[] args) {

		int i = 123, count = 0;

		count = approch1(i);

		System.out.println(count);
		
		count = approch2(i);
		
		System.err.println(count);
	}

	private static int approch2(int i) {
		int k=(int) Math.log10(i) + 1;
		return k;
	}

	private static int approch1(int i) {
		int k = 0;
		while (i > 0) {
			k++;
			i /= 10;
		}
		return k;
	}

}
