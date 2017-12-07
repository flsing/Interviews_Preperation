import java.util.LinkedList;
import java.util.Queue;

public class FourWayStop {

	static Queue<Integer> top = new LinkedList<Integer>();
	static Queue<Integer> right = new LinkedList<Integer>();
	static Queue<Integer> bottom = new LinkedList<Integer>();
	static Queue<Integer> left = new LinkedList<Integer>();
	static Queue<Integer> allQueues = new LinkedList<Integer>();
	
	public static void add(int carId, int roadId){

		if(roadId == 0){
			top.add(carId);	

		}else if(roadId == 1){
			right.add(carId);
		}else if(roadId == 2){
			bottom.add(carId);
		}else{
			left.add(carId);
		}
	}
	
	public static int remove(){
		int carId = -1;
		Queue<Integer> queue = new LinkedList<Integer>();
		if(!allQueues.isEmpty()){
			carId = (allQueues.remove());
			
		}
		return carId;
	}
	
	
	public static void main(String[] args) {
		add(1,1);
		add(2,1);
		add(3,1);
		add(4,0);
		add(0,2);
		System.out.println(remove());
		System.out.println(remove());

	}

}
