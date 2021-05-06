package stirbu.arina.g1088.factory;

public class SectieFactory {

	public static InterfataSectie creareProgramare(TipSectiiCabinet tipProgramare,String nume) {
		
		
		InterfataSectie programare=null;
		
		switch(tipProgramare) {
		case CARDIOLOGIE:
			programare=new ProgramareCardiologie(nume);
			break;
		case CHIRURGIE:
			programare=new ProgramareChirurgie(nume);
			break;
		case DERMATOLOGIE:
			programare=new ProgramareDermatologie(nume);
			break;
		case PEDIATRIE:
			programare=new ProgramarePediatrie(nume);
			break;
		default:
			throw new UnsupportedOperationException();
			
		}
		return programare;
	}
}
