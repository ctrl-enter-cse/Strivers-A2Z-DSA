package StringProblems;

//Largest Odd Number in String :1903
public class LargestOddInString {
	private static boolean isEven(String res) {
		if (res.length() == 0)
			return false;
		char digit = res.charAt(res.length() - 1);

		return (digit - '0') % 2 == 0;

	}

	private static String Approch2(String num) {

		String res = num;

		while (isEven(res)) {
			res = res.substring(0, res.length() - 1);
		}
		return res;
	}

	public static String largestOddNumber(String num) {
//		char[] sr = num.toCharArray();
//		int odd = -1;
//
//		for (int i = 0; i < sr.length; i++) {
//			int digit = sr[i]- '0';
////			System.out.println(digit);
//			if (digit % 2 != 0) {
//				odd = odd > digit ? odd : digit;
//			}
//		}
		String res = num;
		int i = Integer.valueOf(res);
		while (i % 2 == 0) {
			res = res.substring(0, res.length() - 1);
			i = Integer.valueOf(res);
		}
		return res;
//				String.valueOf(odd);
	}

	public static void main(String[] args) {
		String num = "52127";
		String res = largestOddNumber(num);
//		System.out.println(res);

//		num = "4206";
		String res1 = Approch2(num);
//		System.out.println(res1);
		
		
		String res3 = largestOddNumberApproch3(num);
		System.out.println(res3);
		
		
	}

	private static String largestOddNumberApproch3(String num) {
		
		return helper(num,num.length());
	}

	private static String helper(String num, int n) {
		
		if(n<=0) return "";
		
		if( (num.charAt(n - 1)- '0') %2 == 1) {
			return num;
		}
		return helper(num.substring(0 , n-1),n-1);
	}

}
//best
//class Solution {
//    public static String helper(String num, int i) {
//       if(i<=0)
//           return "";
//       if ((num.charAt(i - 1) - '0') % 2 == 1)
//           return num;
//       return helper(num.substring(0,i-1),i-1);
//   }
//   public static String largestOddNumber(String num) {
//       return helper(num,  num.length());
//   }
//}