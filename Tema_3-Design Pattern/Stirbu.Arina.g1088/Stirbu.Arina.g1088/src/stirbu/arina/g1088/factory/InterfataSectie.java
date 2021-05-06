package stirbu.arina.g1088.factory;

public abstract class InterfataSectie {

	protected String nume;
	

	public void setNume(String nume) {
		this.nume = nume;
	}
	
	
	public String getNume() {
		return nume;
	}


	public abstract String programareSectie();
	public abstract void taxaProgramare();
}
