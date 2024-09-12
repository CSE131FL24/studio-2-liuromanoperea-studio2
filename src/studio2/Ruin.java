package studio2;

public class Ruin {

	public static void main(String[] args) {
		int startAmount = 2, winLimit = 10, totalSimulation = 1, simulationDay;
		double winChance = 0.7;
	for	(simulationDay = 1; simulationDay <= 200; simulationDay ++) {
		while (startAmount < winLimit && startAmount > 0) {
			if (Math.random() < winChance) {
				startAmount += 1;
				totalSimulation += 1;
			}
			else {
				startAmount -=1;
				totalSimulation += 1;
			}
		}
		if (startAmount == winLimit ) {
			System.out.println("Successful Day!");
			System.out.println("Total simulation: " + totalSimulation);
			System.out.println("Simulation day " + simulationDay);
		}
		else {
			System.out.println("Ruin Day :(");
			System.out.println("Total simulations: " + totalSimulation);
			System.out.println("Simulation day " + simulationDay);
		
		}
		startAmount = 2;
		totalSimulation = 1;
	}

}
}