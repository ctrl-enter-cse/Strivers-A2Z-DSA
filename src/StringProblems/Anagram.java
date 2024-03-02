package StringProblems;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {

		String Str1 = "INTEGER";
//	    String Str2 = "TEGERNI";
		String Str2 = "EEGINRT";
		System.out.println(checkAnagrams(Str1, Str2));

		System.out.println(checkAnagrams1(Str1, Str2));
	}

	private static boolean checkAnagrams1(String str1, String str2) {

		str1 = str1.toLowerCase();
		str2 = str2.toLowerCase();
		str1 ="nl";
		str2 ="cx";
		int[] m1 = new int[26];

		for (int i = 0; i < str1.length(); i++) {

			m1[str1.charAt(i) - 'a']++;
			m1[str2.charAt(i) - 'a']--;
		}

		for (int i = 0; i < m1.length; i++) {
			if (m1[i] != 0) {
				return false;
			}
		}
		return true;
	}

	private static boolean checkAnagrams(String str1, String str2) {

		if (str1.length() != str2.length())
			return false;

		str1 = sortString(str1);
		str2 = sortString(str2);

		for (int i = 0; i < str1.length(); i++) {

			if (str1.charAt(i) != str2.charAt(i)) {
				return false;
			}
		}
		return true;
	}

	public static String sortString(String s) {

		char[] c = s.toCharArray();
		Arrays.sort(c);
		return new String(c);
	}
}
