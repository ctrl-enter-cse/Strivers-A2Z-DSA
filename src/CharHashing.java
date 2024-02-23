import java.util.HashMap;
import java.util.Map;

public class CharHashing {

	public static void main(String[] args) {

		String str="absabcef";
		
		int hash[]  = new int [26];
		
		for(int i=0;i<str.length();i++) {
//			System.out.println(str.charAt(i));
			hash[str.charAt(i)-'a']++;
		}
		
		System.out.println(hash['b'-'a']);
		
		Map<Character,Integer> ch= new HashMap<>();		
		for(int i=0;i<str.length();i++) {
			
		if(!ch.containsKey(str.charAt(i))){
			ch.put(str.charAt(i),1);
		}
		ch.put(str.charAt(i),ch.get(str.charAt(i))+1);	
		}
		System.out.println("--------------------------------------");
		System.out.println('a'+" "+ch.get('a'));
		System.out.println("--------------------------------------");
		System.out.println('s'+" "+ch.get('s'));
		System.out.println("--------------------------------------");
		
		for(char c: ch.keySet()) {
			System.out.println(c+" "+ch.get(c));
		}
	} 

}
