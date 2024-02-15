package knowBasicMaths;

public class CheckPalindrome {

	public static void main(String[] args) {

		int num = 1221;

		boolean flag = checka(num);
		System.out.println(flag == true ? "pallindrome" : "not palindrome");
	}

	private static boolean checka(int num) {
		int temp = num;
		int reverse = 0;
		while (num > 0) {
			int rem = num % 10;
			reverse = reverse * 10 + rem;
			num /= 10;
		}
		if (temp == reverse) {
			return true;
		}
		return false;
	}

}
