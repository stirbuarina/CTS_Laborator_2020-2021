package ro.ase.csie.cts.dp.state;

public class SuperErou {

	public static final int PUNCTE_NIVEL_CRITIC=50;
	public static final int PUNCTE_NIVEL_NORMAL=500;
	int puncteViata;
	String efectMagic;
	String nume;
	
	InterfataModDeplasare stareDeplasares;
	
	

	public SuperErou( String nume) {
		super();
		this.puncteViata = PUNCTE_NIVEL_NORMAL;
		this.nume = nume;
		this.stareDeplasares=new StareDeplasareNormala();
	}
	
	public void esteAtacat(int puncteLovitura) {
		System.out.println(this.nume+" este lovit cu "+puncteLovitura);
	   this.puncteViata-=puncteLovitura;
	   if(this.puncteViata<PUNCTE_NIVEL_CRITIC) {
		   this.stareDeplasares=new StareDeplasareRanitCritic();
	   }
	   else
	       if(this.puncteViata<PUNCTE_NIVEL_NORMAL) {
	    	   this.stareDeplasares=new StareDeplasareRanit();
	       }
		
	   
	}
	
	
	public void seVindeca(int puncte) {
		System.out.println("Eroul se vindeca");
		this.puncteViata+=puncte;
		if(this.puncteViata>PUNCTE_NIVEL_NORMAL) {
			this.stareDeplasares=new StareDeplasareNormala();
		}
		else
			if(this.puncteViata>PUNCTE_NIVEL_CRITIC) {
				this.stareDeplasares=new StareDeplasareRanit();
			}
	}
	
	public void seDeplaseaza() {
		
		this.stareDeplasares.seMisca(this);
		
	}
	
	
	
	
	
}
