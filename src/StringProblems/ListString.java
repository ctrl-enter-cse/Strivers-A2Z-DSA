package StringProblems;

public class ListString {
  public static void main(String[] args) {

	  String s= "this is prasanna this ";
	  
	  String res="";
	  System.out.println(s);
//	 res = ;
	 System.out.println(remove1(s));
	  
}

private static String remove1(String s) {
	String res="";
	String[] words = s.split("\\s+");
	
	for(int i=0;i<words.length;i++) {
		
		if(!words[i].equals("this")) {
			res+=words[i]+ " ";
		}
	}
//	for(String s1:words) {
//		System.out.print(res+" ");
//	}
	
	return res;
}
}
