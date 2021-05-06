package stirbu.arina.g1088;
import java.util.List;
import stirbu.arina.g1088.builder.Angajat;
import stirbu.arina.g1088.builder.MajorareSalariu;
import stirbu.arina.g1088.builder.TipAngajat;
import stirbu.arina.g1088.builder.TipMedic;
import stirbu.arina.g1088.decorator.AbstractDecorator;
import stirbu.arina.g1088.decorator.Reteta;
import stirbu.arina.g1088.decorator.RetetaDecorator;
import stirbu.arina.g1088.factory.InterfataSectie;
import stirbu.arina.g1088.factory.SectieFactory;
import stirbu.arina.g1088.factory.TipSectiiCabinet;
import stirbu.arina.g1088.prototype.Medicamente;
import stirbu.arina.g1088.proxy.ProgramareMedic;
import stirbu.arina.g1088.proxy.ProxyProgramare;
import stirbu.arina.g1088.singleton.Clinica;

public class TestAssingment {
	

	public static void main(String[] args) throws CloneNotSupportedException {
		
		
		//SINGLETON
		System.out.println("SINGLETON:");
        Clinica primaClinica=Clinica.getClinica("MediCare", 1000, 20);
        Clinica aDouaClinica=Clinica.getClinica("MediCare2", 2000, 50);
        
        if(primaClinica==aDouaClinica) {
        	System.out.println("cele 2 referinte sunt identice");
        }
        else
        {
        	System.out.println("Cele 2 referinte sunt diferite");
        }
        
        
        
        //SIMPLE FACTORY
        System.out.println();
        System.out.println("SIMPLE FACTORY:");
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
        
        
        
        //BUILDER
        System.out.println();
        System.out.println("BUILDER:");
    	Angajat a1=new Angajat.AngajatBuilder("Arina", TipAngajat.MEDIC, 5000)
				.areVechime()
				.areStudiiSuperioare()
				.setAdresa("Bucuresti")
				.setTipMedic(TipMedic.CHIRURGIE)
				.setMajorareSalariu(new MajorareSalariu(0.8))
				.build();
		
		Angajat a2=new Angajat.AngajatBuilder("Mihai", TipAngajat.ASISTENT, 2000)
				.setVarsta(20)
				.areStudiiSuperioare()
				.build();
        
	    
	    
        
        //decorator
		System.out.println();
		System.out.println("DECORATOR");
       Reteta reteta=new Reteta(1,1000);
       reteta.printeazaReteta();
       AbstractDecorator retetaDecorata=new RetetaDecorator(reteta);
       retetaDecorata.aplicaDiscount(50);
       retetaDecorata.printeazaReteta();
	
		
		
		
//      //proxy
       System.out.println();
       System.out.println("PROXY:");
     ProgramareMedic programareMedic=new ProgramareMedic(3534, 3);
     programareMedic.primaConsulatieGratuita();
     
     ProxyProgramare proxy=new ProxyProgramare(programareMedic);
     proxy.primaConsulatieGratuita();
     
     
     
     //PROTOTYPE
		System.out.println();
		System.out.println("PROTOTYPE");
		
	 	Medicamente medicamenteClinica=new Medicamente();
		medicamenteClinica.incarcareDate();
	    
		Medicamente medicamenteDistribuite=(Medicamente)medicamenteClinica.clone();

	   List<String> lista=medicamenteDistribuite.getMedicamente();
	   for(int i=0;i<5;i++) {
		   lista.remove(0);
	   }
	   System.out.println("Medicamente clinica:"+medicamenteClinica.getMedicamente());
	   System.out.println("Medicamente de distribuit:"+medicamenteDistribuite.getMedicamente());
	   
     
     
    
	}
}
