package stirbu.arina.g1088.decorator;

public class Reteta implements InterfataReteta{

	private int codReteta;
	private double costReteta;
	
	
	
	public Reteta(int codReteta, double costReteta) {
		super();
		this.codReteta = codReteta;
		this.costReteta = costReteta;
	}

	@Override
	public void printeazaReteta() {
System.out.println("Reteta cu codul "+codReteta+" costa "+costReteta+" lei");	

	}

	public int getCodReteta() {
		return codReteta;
	}

	public void setCodReteta(int codReteta) {
		this.codReteta = codReteta;
	}

	public double getCostReteta() {
		return costReteta;
	}

	public void setCostReteta(double costReteta) {
		this.costReteta = costReteta;
	}

	
	
}
