package StringProblems;

//Integer.valueOf(c);
//String.valueOf(5);
public class CommonPrefix {

	public static void main(String[] args) {
		String[] s = { "dog", "racecar", "car" };
		String[] s2 = { "flower", "flow", "flight" };
		char c='1';

//	List <String> list = Arrays.asList(s);
//		
//		Collections.sort(list);
//		System.out.println(list);
//		
//		String small= Collections.min(list,(s1,s2)->Integer.compare(s1.length(),s2.length()));
//		int smal=Integer.valueOf(small);

//		for(int i=0;i<smal;i++) {
//			
//		}
//		 looping from every  my idea was check all element till the smallest of the string length or else it will throw error indexoutofbound

		String res = checkprefix(s);
		System.out.println(res);
		
		res = checkprefix(s2);
		System.out.println(res);
		

	}

	private static String checkprefix(String[] s) {
		if (s.length == 0)
			return "";
		String prefix = s[0]; // flower
		for (int i = 1; i < s.length; i++) { // looping from {"flow","flight"};
			while (s[i].indexOf(prefix) != 0) {
				prefix = prefix.substring(0, prefix.length() - 1);
			}
		}

		return prefix.length() > 0 ? prefix : "none";
	}

}
