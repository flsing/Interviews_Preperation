import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Random;
import java.util.Set;

public class BattleShip {

	
	private static int[][] Board = 		 {{ 0, 0, 3, 3, 3 },
										  { 0, 0, 4, 4, 0 },
										  { 0, 0, 0, 0, 0 },
										  {  1, 1, 1, 2, 2 }
    									 };

	

	public static String shoot(int x, int y){
		int pos = Board[x][y];
		if(pos > 0) {
			Board[x][y] = pos * -1;
			if(isSunk(x,y)) return "sunken ship";
			return "hit";
		}
		return "miss";
	}
	
	
	public static boolean isSunk(int x, int y) {
		int pos = Board[x][y];
		final Map<Integer, Integer> map = new HashMap<Integer, Integer>(Board.length);
		for (int[] mapping : Board)
		{
		    map.put(mapping[0], mapping[1]);
		}
//		HashMap<Integer, String> hm = new HashMap<Integer, String>();
//		for(int x2 = 0; x2 < Board.length; x2 ++){
//			for(int y2 = 0; y2 < Board.length; y2 ++){
//				int position = Board[x2][y2];
//				hm.put(position, Integer.toString(x2) + Integer.toString(y2));
//			}
//		}
//		if(hm.containsKey(pos * -1)) return false;
		
		for(int i = 0; i<Board.length; i++){
			for(int j = 0; j <Board.length; j++){
				if (Board[i][j] == pos * -1){
					return false;
				}
			}
		}
		
		return true;
	}


	public static void main(String[] args) {
		Random rand = new Random();
		for(int i = 0; i< 10; i++){
			System.out.println(shoot((int)rand.nextInt(3)+1, (int)rand.nextInt(4)+1));
		}
	}

}
