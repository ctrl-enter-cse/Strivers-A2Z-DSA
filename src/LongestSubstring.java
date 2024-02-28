import java.util.HashSet;
import java.util.Set;

public class LongestSubstring {

	public static void main(String[] args) {
		String s = "abcdefabacabcde";

		int i = checkA1(s);
		System.out.println("Max LENGth OF  SUBstring :" + i);

	}

	private static int checkA1(String s) {
		int l = 1;
		int r = 1;
		int len = 0;
		Set<Character> st = new HashSet();
		while (r != s.length()) {

			if (st.contains(s.charAt(r)) == false) {
				st.add(s.charAt(r));
				int newlen = r - l + 1;
				len = Math.max(len, newlen);
//				(newlen > len)? newlen : len;  
				r++;
			} else {
				st.remove(s.charAt(l));
				l++;
			}
		}
//		System.out.println(st);
		return len;
	}

}
