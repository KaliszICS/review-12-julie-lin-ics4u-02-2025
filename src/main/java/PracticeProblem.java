public class PracticeProblem {

	public static void main(String args[]) {

	}
	public static boolean isPalindrome(String word){
		word = word.toLowerCase();
		int left = 0;
		int right = word.length() - 1;
		while (left < right){
			while (left < right && word.charAt(left) == ' '){
				left++; 
			}
			while (left < right && word.charAt(right) == ' '){
				right--; 
			}
			if (word.charAt(left) != word.charAt(right)){
				return false;
			}
			left++;
			right--;
		}
		return true; 
	}
	public static int getAge(String[] names, int[]ages, String Name){
		for (int i = 0; i < names.length; i++){
			if (names[i].equals(Name)){
				return ages[i];
			}
		}
		return -1;
	}
	public static int countWords (String sentence, char letter){
		String[] words = sentence.split(" ");
		int count = 0;
		for (int i = 0; i < words.length; i++) {
			if (words[i].indexOf(letter) != -1) {
				count++;
			}
		} 
		return count; 
	}
}
