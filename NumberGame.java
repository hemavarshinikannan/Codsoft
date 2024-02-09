package task;
import java.util.*;

public class NumberGame {
	static HashMap<Integer,Integer> m = new HashMap<>();
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("This is a number game \nYou have to guess the number \nEach palyer has 8 chances");
		System.out.println("Enter no of players : ");
		int n = sc.nextInt();
		for(int i=1;i<=n;i++)
			m.put(i, 0);
		int i=0;
		Random rand = new Random();
		int r = rand.nextInt(100)+1;
		while(i!=n+1) {
			i++;
			boolean won = play(r,i);
			if(won) {
				i=n+1;
				break;
			}
			if(i==n) {
				i=0;
			}
		}
	}

	private static boolean play(int r, int i) {
		System.out.println("Turn for player : "+i);
		int y = m.get(i);
		if(y==8) {
			System.out.println("Game Over!!");
			return true;
		}
		System.out.println("Player "+i+" has "+(8-y)+" chances");
		System.out.println("Enter your choice : ");
		int z = sc.nextInt();
		m.compute(i, (key,value)->value+1);
		if(z==r) {
			System.out.println("Player "+i+" won the game \nCongratulations!! \nBetter luck next time for other players!!");
			System.out.println("The number is : "+r);
			return true;
		}
		else if(z<r) {
			System.out.println("Too Low");
			return false;
		}
		else if(z>r) {
			System.out.println("Too High");
			return false;
		}
		return false;
		 
	}
}
