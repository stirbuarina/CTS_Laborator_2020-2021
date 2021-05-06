package stirbu.arina.g1088.singleton;

public class Clinica {

	private String numeClinica;
	private float capital;
	private int numarAngajati;
	
	
	private static Clinica clinica=null;
	
	private Clinica() {
		
	}
	
	private Clinica(String numeClinica,float capital,int numarAngajati) {
		this.capital=capital;
		this.numeClinica=numeClinica;
		this.numarAngajati=numarAngajati;
	}
	
	
	
	public String getNumeClinica() {
		return numeClinica;
	}

	public void setNumeClinica(String numeClinica) {
		this.numeClinica = numeClinica;
	}

	public float getCapital() {
		return capital;
	}

	public void setCapital(float capital) {
		this.capital = capital;
	}

	public int getNumarAngajati() {
		return numarAngajati;
	}

	public void setNumarAngajati(int numarAngajati) {
		this.numarAngajati = numarAngajati;
	}



	public static void setClinica(Clinica clinica) {
		Clinica.clinica = clinica;
	}

	public static Clinica getClinica(String nume,float capital,int numarAngajati)
	{
     if(clinica==null) {
    	 clinica=new Clinica(nume, capital, numarAngajati);
        
     }
     return clinica;
	}
}
