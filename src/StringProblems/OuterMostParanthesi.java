package StringProblems;

public class OuterMostParanthesi {

	public static String removeOuterParentheses(String s) {
		int count = 0;
		String res = "";

//		for (int i = 1; i < s.length(); i++) {
//
//			if (s.charAt(i) == '(') {
//				count++;
//				if (count >0) {
//					continue;
//				} else {
//					res += s.charAt(i);
//				}
//			} else 
////				(s.charAt(i) == ')') 
//				{
//				count--;
//				if (count >1) {
//					continue;
//				} else {
//					res += s.charAt(i);
//				}
//			}
//		}
		for (char c : s.toCharArray()) {
			if ((c == '(' && count++ > 0) || (c == ')' && count-- > 1)) {
				res += c;
			}
		}
		return res;
	}

	public static void main(String[] args) {

		String s = "(()())(())";

		String r = removeOuterParentheses(s);
		System.out.println(r);
	}

}
