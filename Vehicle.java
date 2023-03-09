public class Vehicle{
	
	int tyres;
	
	public static void main(String[] args) {
		PetrolEngine pE = new PetrolEngine();
		pE.start();
		pE.stop();
		
		DieselEngine dE = new DieselEngine();
		dE.start();
		dE.stop();
		
		ElectricEngine eE = new ElectricEngine();
		
		HydrogenEngine hE = new HydrogenEngine();
		hE.start();
		hE.stop();
		
		this.tyres = 4;
	}
}