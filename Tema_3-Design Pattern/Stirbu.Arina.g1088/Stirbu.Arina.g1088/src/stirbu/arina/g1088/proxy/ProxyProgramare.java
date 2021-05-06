package stirbu.arina.g1088.proxy;

public class ProxyProgramare implements IProgramareConsult {

	private ProgramareMedic programare;
	
	 public ProxyProgramare(ProgramareMedic programare) {
      
		this.programare=programare;
	}

	@Override
	public void primaConsulatieGratuita() {

		if(programare.getNumarDeProgramariExistente()==1) {
			programare.primaConsulatieGratuita();
		}
		else {
			System.out.println("Cotrolul nu este gratuit! Trebuie sa achitati taxa!");
		}
	}
	
	
	
	

}
