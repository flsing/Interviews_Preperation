
public class Reverse {

	// reverse string, if period, it still has to appear at the end
	public static String reverse(String orig){
		
		boolean containsPeriod = false; 
		
		if(orig.length() == 0) return "";
		if(orig.length() == 1) return orig;
		
		String[] words = orig.split(" ");

		String newString = "";
		for(int i = words.length -1; i>= 0; i--){
			if(words[i].contains(".")){
				containsPeriod = true;
				words[i] = words[i].replace('.', ' ').trim();
			}
			newString +=  " " +words[i];
			
		}
		if(containsPeriod == true){
			newString = newString + ".";
		}
		return newString;
	}
	
	public static StringBuilder reverse2(String orig){
		
//		if(orig.length() == 0) return "";
//		if(orig.length() == 1) return orig;
		
		String[] words = orig.split(" ");
		//String newString="";
		StringBuilder newSentence = new StringBuilder();
		for(String w: words){
			//newString +=
			newSentence.append(w);
			newSentence.reverse();
		}
		return newSentence;
		
		
	}
	
	public static void main(String[] args) {
		System.out.println(reverse("Hello I am Felix."));
		System.out.println(reverse("welcome to my world"));
		//System.out.println(reverse2("welcome to my world"));
	}

}
