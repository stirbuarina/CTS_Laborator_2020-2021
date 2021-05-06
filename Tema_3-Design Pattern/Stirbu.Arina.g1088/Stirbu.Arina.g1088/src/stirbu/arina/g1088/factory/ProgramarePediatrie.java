package stirbu.arina.g1088.factory;

public class ProgramarePediatrie extends InterfataSectie {

	 public ProgramarePediatrie(String nume) {
this.setNume(nume);
	 }
	
	
	@Override
	public String programareSectie() {
  return this.getNume()+" are programare la Pediatrie!";
	}

	@Override
	public void taxaProgramare() {
System.out.println("Programarea este gratuita!");		
	}
}
