import java.util.Scanner;

public class BaseballRunner {
	
	public static void main(String[] args){
		double atBats, hits, doubles, triples, homeRuns, runs, walks;
		String name;
		Scanner input = new Scanner(System.in);
		
		System.out.println("What's the Batter's name?");
		name = input.nextLine();
		System.out.println("How many At Bats?");
		atBats = input.nextDouble();
		System.out.println("How many Hits?");
		hits = input.nextDouble();
		System.out.println("How many Doubles?");
		doubles = input.nextDouble();
		System.out.println("How many Triples?");
		triples = input.nextDouble();
		System.out.println("How many Home Runs?");
		homeRuns = input.nextDouble();
		System.out.println("How many Runs?");
		runs = input.nextDouble();
		System.out.println("How many Walks?");
		walks = input.nextDouble();
		
		Player p = new Player(atBats, hits, doubles, triples, homeRuns, runs, walks, name);
		System.out.println(p);
		
	}
}
