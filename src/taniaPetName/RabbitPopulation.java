package taniaPetName;

public class RabbitPopulation {
	private long population;
	public RabbitPopulation() {
		population = 9999;
	}
	public RabbitPopulation(long newPop) {
		population = newPop;
	}
	public long getPopulation() {
		return population;
	}
	public void setPopulation(long newPopulation) {
		population = newPopulation;
	}
	public void matingSeason() {
		population = population * 3;
	}
	public void huntingSeason() {
		double decrease = population * 0.43;
		population -= decrease;
	}
}
