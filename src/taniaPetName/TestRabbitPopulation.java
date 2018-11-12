package taniaPetName;

public class TestRabbitPopulation {

	public static void main(String[] args) {
		RabbitPopulation bunny = new RabbitPopulation();
		System.out.println("Current Population: " + bunny.getPopulation());
		bunny.setPopulation(1000);
		System.out.println("Current Population: " + bunny.getPopulation());
		bunny.matingSeason();
		System.out.println("Current Population: " + bunny.getPopulation());
		bunny.huntingSeason();
		System.out.println("Current Population: " + bunny.getPopulation());
		RabbitPopulation rabbit = new RabbitPopulation(1000);
		System.out.println("Current Population: " + rabbit.getPopulation());
	}

}
