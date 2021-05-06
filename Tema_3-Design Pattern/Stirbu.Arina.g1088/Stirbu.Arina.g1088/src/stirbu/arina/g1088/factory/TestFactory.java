package stirbu.arina.g1088.factory;

public class TestFactory {
public static void main(String[] args) {
	
	SectieFactory factory=new SectieFactory();
	
	//creare programare pe chirurgie
	InterfataSectie programare1=SectieFactory.creareProgramare(TipSectiiCabinet.CHIRURGIE, "Poescu Ion");

   //creare programare pe cardiologie
	InterfataSectie programare2=SectieFactory.creareProgramare(TipSectiiCabinet.CARDIOLOGIE, "Dragomir Andrei");
	InterfataSectie programare3=SectieFactory.creareProgramare(TipSectiiCabinet.DERMATOLOGIE, "Cosma Ruxandra");
	InterfataSectie programare4=SectieFactory.creareProgramare(TipSectiiCabinet.PEDIATRIE, " Stirbu Arina");

	System.out.println(programare1.programareSectie());
    programare1.taxaProgramare();
	System.out.println(programare2.programareSectie());
    programare2.taxaProgramare();
    
    System.out.println(programare3.programareSectie());
    programare3.taxaProgramare();
	System.out.println(programare4.programareSectie());
    programare4.taxaProgramare();
    
    
}
}
