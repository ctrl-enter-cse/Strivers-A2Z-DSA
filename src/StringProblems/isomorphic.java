package StringProblems;

import java.util.HashMap;
import java.util.Map;

public class isomorphic {
	public static boolean isIsomorphic(String s, String t) {
		Map<Character, Character> hm = new HashMap();
		if (s.length() != t.length())
			return false;
		for (int i = 0; i < s.length(); i++) {
			if (hm.containsKey(s.charAt(i))) {

				if (!hm.get(s.charAt(i)).equals(t.charAt(i))) {
					return false;
				}

			} else {
				if (hm.containsValue(t.charAt(i))) {
					return false;
				}
				hm.put(s.charAt(i), t.charAt(i));
			}
		}
		return true;
	}

	public static boolean isIsomorphic1(String s, String t) {
		int map1[] = new int[200];
		int map2[] = new int[200];

		if (s.length() != t.length())
			return false;

		for (int i = 0; i < s.length(); i++) {
			if (map1[s.charAt(i)] != map2[t.charAt(i)])
				return false;

			map1[s.charAt(i)] = i + 1;
			map2[t.charAt(i)] = i + 1;
		}
		return true;
	}

	public static void main(String[] args) {

		String s = "egg", t = "add";
		String s1 = "foo", t1 = "bar";

		boolean flag = isIsomorphic(s, t);

		System.out.println(flag);
		
		flag = isIsomorphic(s1, t1);

		System.out.println(flag);

		boolean flag1 = isIsomorphic1(s, t);

		System.out.println(flag1);

		flag1 = isIsomorphic1(s1, t1);

		System.out.println(flag1);
	}

}
