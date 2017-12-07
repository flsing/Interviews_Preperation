import java.awt.List;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Properties;
import java.util.Random;

public class Atm {
	
	static int[][] values = {{1000,10},
						{20, 500},
						{2, 1000}
					  };
	

	private static int min, max;
	private static int[] valueType, valueAmount;
	private static HashMap<Integer, Integer> moneyMap = new HashMap<Integer, Integer>(values.length);
	
	public Atm(Properties properties) throws IOException
	{
		max = Integer.parseInt( properties.getProperty("max","9000"));
		min = Integer.parseInt(properties.getProperty("min","100"));
		for (int[] mapping : values)
		{
		    moneyMap.put(mapping[0], mapping[1]);
		}
	}
	
	
	public static boolean withdraw(int amount){
		if(amount >= min && amount <= max){
			while(amount > 0){
				for(int i = 0; i <= 2; i++){
					int bills = values[i][0];
					int numberOfBills = values[i][1];
					
					while(numberOfBills > 0 && bills <= amount){
						amount -= values[i][0];
						numberOfBills --;
						values[i][1]--;
					}
				}if(amount > 0) return false;
			}
		}
		
		return true;
	}
	
	public static boolean withdrawHash(int amount){
		if(amount >= min && amount <= max){
			while(amount > 0){
				for(int i = 0; i <= 2; i++){
					int bills = values[i][0];
					int numberOfBills = values[i][1];
					
					while(numberOfBills > 0 && bills <= amount){
						amount -= values[i][0];
						numberOfBills --;
						values[i][1]--;
					}
				}if(amount > 0) return false;
			}
		}
		
		return true;
	}
	
	public static void main(String[] args) throws IOException {
		Properties properties = System.getProperties();
		Atm atm = new Atm(properties);
		Random rand = new Random();
		for(int i = 0; i< 10; i++){
			System.out.println(withdraw((int)rand.nextInt(Atm.max)+1));
		}
	}

}
