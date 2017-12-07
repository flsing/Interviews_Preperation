import java.util.Iterator;

public class RunLengthEncoding implements Iterator<Integer>{

	private int[] encodedNumbers;
	
	public RunLengthEncoding(int[] encodedNumbers){
		this.encodedNumbers = encodedNumbers;
		
	}

	
	@Override
	public Integer next() {
		if(hasNext()){
			return 1;
		}
		
		
			
		return -1;
	}
	
	@Override
	public boolean hasNext() {
		if(encodedNumbers.length == 0)		
			return false;
		return true;
	}


	
	public static void main(String[] args) {
		RunLengthEncoding x;
		x = new RunLengthEncoding({1,3,5,2});
		x.next();
		x.next();
		x.hashNext();
	
		
	}

	

}
