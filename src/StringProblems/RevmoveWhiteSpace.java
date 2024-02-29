package StringProblems;

public class RevmoveWhiteSpace {

	public static void main(String[] args) {
		String s=" TODO Auto-generated method stub";
		
		
		String res= removeWhiteSpace(s);
				System.out.println(res);

	}

	private static String removeWhiteSpace(String s) {
	
		String res="";
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)==' '){
				res+="";
			}else{
			res+=s.charAt(i);
			}
		}
		return res;
	}

}
