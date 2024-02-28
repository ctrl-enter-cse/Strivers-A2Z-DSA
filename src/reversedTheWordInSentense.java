
public class reversedTheWordInSentense {

	public static void main(String[] args) {

		String s = "This  is the prasanna Acharaya";

		String s1 = checkApproch1(s);
		System.out.println(s1);

	}

	private static String checkApproch1(String s) {

		String[] words = s.split("\\s+");

		String result = "";
//		for(int i=;i<=words.length;i++) {
		for (String word : words) {
			String re =" ";
			re = reverse(word);
			result += re + " ";
		}
		return result;
	}

	private static String reverse(String s1) {
		String res = "";
		for (int i =s1.length()-1; i >=0; i--) {
			res += s1.charAt(i);
		}
		return res; 
	}

}
