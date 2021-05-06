package ro.ase.csie.cts.dp.strategy;

public class Jucator {

	int totalOreJucate;
	String nume;
	int clasaJucator;
	
	InterfataStrategieMarketing strategieMrk=null;
	

	public Jucator(int totalOreJucate, String nume, int clasaJucator) {
		super();
		this.totalOreJucate = totalOreJucate;
		this.nume = nume;
		this.clasaJucator = clasaJucator;
	}
	public int getTotalOreJucate() {
		return totalOreJucate;
	}
	public String getNume() {
		return nume;
	}
	public int getClasaJucator() {
		return clasaJucator;
	}
	
	
	public void setStrategieMrk(InterfataStrategieMarketing strategieMrk) {
		this.strategieMrk = strategieMrk;
	}

	
	
public void acordaPuncteBonus() {
    if(this.strategieMrk!=null) {
    	this.strategieMrk.aplicaStrategieBonus(this);
    }
    else
    {
    	throw new UnsupportedOperationException();
    }
}







	
}
