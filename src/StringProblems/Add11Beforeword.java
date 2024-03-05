package StringProblems;

public class Add11Beforeword {

	public static void main(String[] args) {
		String s=" TODO Auto-generated method stub";
		
		String res=add(s);
		System.out.println(res);
	}

	private static String add(String s) {
		String res="";
		for(int i=0;i<s.length();i++) {
					
			if(s.charAt(i)==' '&& s.charAt(i+1)!=' ') {
				res+= s.charAt(i)+"11";
			}else
			{
				res+=s.charAt(i);
			}
			
		}
		
		return res;
	}

}
