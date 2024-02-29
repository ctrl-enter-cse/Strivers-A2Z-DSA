package StringProblems;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class ReverseWord {

	public static String reverseWords(String s) {
		String[] words = s.split("\\s+");
		String res = "";
		for (int i = words.length - 1; i >= 0; i--) {
			res += words[i] + " ";
		}
		return res;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "the sky is blue";

		String res = reverseWords(s);

		System.out.println(res);    //blue is sky the 

		List<String> ar = Arrays.asList(s.split(" "));

		Collections.reverse(ar);

		System.out.println(ar);  //[blue, is, sky, the]

		res = ar.stream().collect(Collectors.joining(" "));

		System.out.println(res);   //blue is sky the

	}
	
//	op
//	
//	[blue, is, sky, the]
//	blue is sky the

	

}
