package stirbu.arina.g1088.factory;

public class ProgramareDermatologie extends InterfataSectie{

	
	
	 public ProgramareDermatologie(String nume) {
      this.setNume(nume);
	 }
	
	
	@Override
	public String programareSectie() {
  return this.getNume()+" are programare la Dermatologie!";
	}

	@Override
	public void taxaProgramare() {
System.out.println("Taxa programarii este de 80 lei");		
	}
}
