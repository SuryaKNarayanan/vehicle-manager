public class Vehicle{
	
	public static void main(String[] args) {
		PetrolEngine pE = new PetrolEngine();
		pE.start();
		
		DieselEngine dE = new DieselEngine();
		dE.start();
		
	}
}