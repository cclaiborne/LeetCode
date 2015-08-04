import java.util.HashSet;

public class Three {

	public static void main(String[] args) {
		System.out.println(lengthOfLongestSubstring("a"));

	}
    public static int lengthOfLongestSubstring(String s) {
    	char[] stringToCharArray = s.toCharArray();
    	HashSet<Character> storage = new HashSet<Character>();
    	int counter = 0;
    	int largest = 0;
    	for(char c: stringToCharArray){
    		if(!storage.contains(c)){
    			storage.add(c);
    			counter++;
    			if(counter > largest)
    				largest = counter;
    		}
    		else{
    			largest = counter;
    			counter = 0;
    		}
    	}
        return largest;
    }
}
