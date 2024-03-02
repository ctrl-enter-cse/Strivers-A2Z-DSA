package StringProblems;

import java.util.HashMap;
import java.util.Map;

public class WordPattern {
	    public static  boolean wordPattern(String pattern, String s) {
	        String words[] =s.split("\\s+");
	        //  new String[100];
	        Map<Character, String> hm = new HashMap();
	        if(words.length != pattern.length()) return false;

	        for (int i = 0; i < pattern.length(); i++) {

	            if (hm.containsKey(pattern.charAt(i))) {

	                if (!hm.get(pattern.charAt(i)).equals(words[i])) {
	                    return false;
	                }
	            } else {
	                if (hm.containsValue(words[i])) {
	                    return false;
	                }
	                hm.put(pattern.charAt(i),words[i]);
	            }
	        }
	        return true;
	    }
	    public static void main(String[] args) {
	    		
	    	
	    	String pattern = "abba", s = "dog cat cat dog";
	    	
	    	boolean flag =wordPattern(pattern,s);
	    	
	    	System.out.println(flag);
	    	
	    	pattern = "aaaa"; s = "dog cat cat dog";
	    	
	    	flag =wordPattern(pattern,s);
	    	
	    	System.out.println(flag);
	    	
		}
	}
	

