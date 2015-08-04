public class Nine {
	public static void main(String[] args) {
		System.out.println(isPalindrome(-212));

	}
    public static boolean isPalindrome(int x) {
    	if (x < 0)
    		return false;
    	int length = String.valueOf(x).length();
    	for(int i = 0; i<length/2; i++){
    	if((int)(x/Math.pow(10, length-i-1))%10 == (int)(x / Math.pow(10, i))%10){
    	}
    	else
    		return false;
    	}
    	return true;
    }
}
