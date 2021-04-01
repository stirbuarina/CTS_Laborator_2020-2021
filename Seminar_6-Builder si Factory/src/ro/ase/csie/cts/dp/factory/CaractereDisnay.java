package ro.ase.csie.cts.dp.factory;

public class CaractereDisnay extends CaracterAbstract{
	String culoare;
    boolean okPentruCopiiMici=true;
    
	@Override
	public void alearga() {
		System.out.println("Alearga....");
	}

	@Override
	public void sare() {
		System.out.println("Sare.....");
		
	}

	public CaractereDisnay(String culoare,String nume) {
		this.nume=nume;
		this.culoare = culoare;
	}
	
	

}
