package stirbu.arina.g1088.factory;

public class ProgramareChirurgie extends InterfataSectie{

	 public ProgramareChirurgie(String nume) {
this.setNume(nume);
	 }
	
	
	@Override
	public String programareSectie() {
   return this.getNume()+" are programare la Chirurgie!";
	}

	@Override
	public void taxaProgramare() {
System.out.println("Taxa programarii este de 100 lei");		
	}

}
