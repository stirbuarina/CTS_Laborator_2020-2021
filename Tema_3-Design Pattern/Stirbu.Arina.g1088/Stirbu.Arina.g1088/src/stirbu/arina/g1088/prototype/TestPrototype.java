package stirbu.arina.g1088.prototype;

import java.util.List;

public class TestPrototype {

	public static void main(String[] args) throws CloneNotSupportedException {
		
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
