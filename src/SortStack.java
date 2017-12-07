import java.util.Random;
import java.util.Stack;

public class SortStack {

	public static Stack<Integer> sortStack(Stack<Integer> input){
		Stack<Integer> sortedStack = new Stack<Integer>();
		int temp;
		
		try{
			while(!input.isEmpty()){
				temp = input.pop();

				while(!sortedStack.isEmpty() && temp > sortedStack.peek()){
					input.push(sortedStack.pop());
				}
				sortedStack.push(temp);	
			}
			
		}catch(NullPointerException e){
			System.out.println("null pointer");
		}
		return sortedStack;
	}
	
	
	
	public static void main(String[] args) {
		Random rand = new Random();
		Stack<Integer> stack = new Stack<Integer>();
		while(stack.size() < 5){
			stack.push((int) rand.nextInt(40)+1);
		}
		System.out.println(sortStack(null));
		System.out.println(sortStack(stack));

	}

}
