package LearnBasicRecursion;

public class PrintNnumber {
	static int count = 0;
	static void print() {
		
		if (count == 5) {
			return;
		}
		System.out.println(count++);
		print();
	}

	public static void main(String[] args) {

		int n = 5;
		int i = RecApproch(n);
		System.out.println(i);
		print();
//		print(5,count);
		
	}

	private static int RecApproch(int n) {

		if (n == 0) {
			return 1;
		}

		return n * RecApproch(n - 1);
	}

}
