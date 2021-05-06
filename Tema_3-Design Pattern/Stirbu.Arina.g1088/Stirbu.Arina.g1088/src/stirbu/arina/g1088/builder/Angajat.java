package stirbu.arina.g1088.builder;

public class Angajat {

	private String nume;
	private int varsta;
	private double salariu;
    private String adresa;
    private boolean areVechime;
    private boolean areStudiiSuperioare;
    
	private TipMedic tipSectie;
    private	TipAngajat tipAngajat;
	
    private InterfataMarireSalariu marireSalariu;
    
	private Angajat() {
		
	}

	
	
	public Angajat(String nume, int varsta,double salariu, String adresa, boolean areVechime, boolean areStudiiSuperioare,
			TipMedic tipSectie, TipAngajat tipAngajat) {
		super();
		this.nume = nume;
		this.varsta = varsta;
		
		this.salariu=salariu;
		this.adresa = adresa;
		this.areVechime = areVechime;
		this.areStudiiSuperioare = areStudiiSuperioare;
		this.tipSectie = tipSectie;
		this.tipAngajat = tipAngajat;
	}



	public static class AngajatBuilder{
		
		private Angajat angajat;
	   
		public AngajatBuilder(String nume,TipAngajat tip,double salariu) {
			angajat=new Angajat();
			angajat.nume=nume;
			angajat.tipAngajat=tip;
           angajat.salariu=salariu;
		}
		
		
		public AngajatBuilder areVechime() {
			this.angajat.areVechime=true;
			return this;
		}
		
		public AngajatBuilder areStudiiSuperioare() {
			this.angajat.areStudiiSuperioare=true;
			return this;
		
		}
		
		public AngajatBuilder setVarsta(int varsta) {
			this.angajat.varsta=varsta;
			return this;
		}
		
		public AngajatBuilder setAdresa(String adresa) {
			this.angajat.adresa=adresa;
			return this;
		}
		
		
		public AngajatBuilder setTipMedic(TipMedic tip) {
			this.angajat.tipSectie=tip;
			return this;
		}
		
		
		public AngajatBuilder setTipAngajat(TipAngajat tip) {
			this.angajat.tipAngajat=tip;
			return this;
		}
		
		
		
		public AngajatBuilder setMajorareSalariu(InterfataMarireSalariu salariuMarit) {
		this.angajat.marireSalariu=salariuMarit;
		return this;
	}
		
		public Angajat build() {
			return angajat;
		}
		
		
	}



	@Override
	public String toString() {
		return "Angajat [nume=" + nume + ", varsta=" + varsta + ", salariu=" + salariu + ", adresa=" + adresa
				+ ", areVechime=" + areVechime + ", areStudiiSuperioare=" + areStudiiSuperioare + ", tipSectie="
				+ tipSectie + ", tipAngajat=" + tipAngajat + ", marireSalariu=" + marireSalariu + "]";
	}
	
	
	
	
	
}
