package ro.ase.csie.cts.seminar2.modele;

public abstract class ContBancar extends Cont {
	protected double balanta;
	protected String iban;

	@Override
	public double getBalanta() {
		return this.balanta;
	}

	public ContBancar(double balanta, String iban) {
		this.balanta = balanta;
		this.iban = iban;
	}
	
	

}
