package knowBasicMaths;

public class GCDHCF {

	public static void main(String[] args) {
		int n1 = 9;
		int n2 = 12;

		checkHCF(n1, n2);

		approch2(n1, n2);

		approch3(n1, n2);
	}

	// Euclidean Algo that is gcd(a,b) *a>b*--> gcd(a-b,b) one of them is zero then
	// other is gcf
	// TC ---> o(logfiv(Min(a,b)))
	private static void approch3(int n1, int n2) {

		while (n1 > 0 && n2 > 0) {
			if (n1 > n2)
				n1 = n1 % n2;
			else
				n2 = n2 % n1;
		}
		if (n1 == 0)
			System.out.println(n2);
		else
			System.out.println(n1);

	}

	// run from 9 to 1 will take less but we measure for the worst case senario
	private static void approch2(int n1, int n2) {

		for (int i = Math.min(n1, n2); i > 1; i--) {
			if (n1 % i == 0 && n2 % i == 0) {
				System.out.println(i);
				break;
			}
		}

	}

	// from 1 to 9 time complecity O(min(n1,n2))
	private static void checkHCF(int n1, int n2) {
		int hcf = 0;
		for (int i = 1; i < Math.min(n2, n1); i++) {
			if (n1 % i == 0 && n2 % i == 0) {
				if (i > hcf)
					hcf = i;
			}
		}
		System.out.println(hcf);
	}

}
