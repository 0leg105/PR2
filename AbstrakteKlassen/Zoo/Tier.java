package Zoo;

public abstract class Tier {

	private String name;
	private int alter;
	
	public Tier(String name, int alter) {
		this.alter = alter;
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
	public int getAlter() {
		return this.alter;
	}
	
	public abstract String speak();
}
