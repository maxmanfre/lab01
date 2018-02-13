
public class Player {
	
	private String name;
	
	private double atBats;
	private double hits;
	private double doubles;
	private double triples;
	private double homeRuns;
	private double runs;
	private double walks;
	
	public Player(double atBats, double hits, double doubles, double triples, double homeRuns, double runs, double walks, String name){
		this.atBats = atBats;
		this.hits = hits;
		this.doubles = doubles;
		this.triples = triples;
		this.homeRuns = homeRuns;
		this.runs = runs;
		this.walks = walks;
		this.name = name;
	}
	public double battingAverage(){
		return hits / atBats; 
	}
	public double onBasePercentage(){
		return (walks + hits) / (atBats + walks);
	}
	public double sluggingPercentage(){
		return totalBases() / atBats;
	}
	public double totalBases(){
		return ((2 * doubles + 3 * triples + 4 * homeRuns) + (hits - (doubles + triples + homeRuns)));
	}
	public double onBaseSlugging(){
		return onBasePercentage() + sluggingPercentage();
	}
	public String getName(){
		return name;
	}
	public String toString(){
		return name + " has a Batting Average of " + battingAverage() + ".\n"
		+ "and an On Base Percentage of " + onBasePercentage() + ".\n"
		+ "and a Slugging Percentage of " + sluggingPercentage() + ".\n"
		+ "and an On Base and Slugging Percentage of " + onBaseSlugging() + ".\n"
		+ "and " + totalBases() + " total bases. Along with " + runs + " RBIs.";
	}
}