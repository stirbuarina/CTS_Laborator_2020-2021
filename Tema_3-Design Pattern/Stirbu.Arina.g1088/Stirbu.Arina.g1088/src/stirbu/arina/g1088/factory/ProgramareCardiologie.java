package stirbu.arina.g1088.factory;

public class ProgramareCardiologie extends InterfataSectie{

	 public ProgramareCardiologie(String nume) {
		 this.setNume(nume);
		 
	}
	
	
	
	@Override
	public String programareSectie() {

    return this.getNume()+" are programare la Cardiologie!";
	}

	@Override
	public void taxaProgramare() {
System.out.println("Taxa programarii este de 50 lei!");		
	}

}
