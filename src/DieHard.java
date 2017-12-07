import java.util.Random;

public class DieHard {
	
	
	private static int Gcd(int num1, int num2){
		while(num1 != num2){
			if(num1 > num2)
				num1 -= num2;
			else
				num2 -= num1;
		}
		return num1;
	}
	
	public static String waterJugs(int jugA, int jugB, int goal){
		if(goal <= Math.max(jugA, jugB) && goal % Gcd(jugA, jugB) == 0){
			return "YES";
		}
		return "NO";
	}

	public static void main(String[] args) {
		System.out.println(waterJugs(3,6,4));
		System.out.println(waterJugs(3,5,4));
		System.out.println(waterJugs(3,5,5));
		System.out.println(waterJugs(6,9,3));
		Random rand = new Random();
		for(int i = 0; i < 10; i++){
			System.out.println(waterJugs((int)rand.nextInt(10)+1, (int)rand.nextInt(10)+1, (int)rand.nextInt(10)+1 ));
		}

	}

}
