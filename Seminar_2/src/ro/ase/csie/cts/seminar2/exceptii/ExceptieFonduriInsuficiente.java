package ro.ase.csie.cts.seminar2.exceptii;

public class ExceptieFonduriInsuficiente extends Exception{
	
    public ExceptieFonduriInsuficiente(String mesaj) {
    //super apeleaza constructorul din clasa de baza
	super(mesaj);
	}
 
    public ExceptieFonduriInsuficiente() {
    	
    }
    

}
