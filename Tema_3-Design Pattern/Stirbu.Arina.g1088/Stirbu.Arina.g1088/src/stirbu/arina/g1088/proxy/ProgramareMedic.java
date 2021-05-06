package stirbu.arina.g1088.proxy;

public class ProgramareMedic implements IProgramareConsult{
private int codProgramare;
private int numarDeProgramariExistente;



public int getNumarDeProgramariExistente() {
	return numarDeProgramariExistente;
}
public void setNumarDeProgramariExistente(int numarDeProgramariExistente) {
	this.numarDeProgramariExistente = numarDeProgramariExistente;
}
public int getCodProgramare() {
	return codProgramare;
}
public void setCodProgramare(int codProgramare) {
	this.codProgramare = codProgramare;
}


public ProgramareMedic(int codProgramare,int nrProgramari) {
	super();
	this.codProgramare = codProgramare;
	this.numarDeProgramariExistente=nrProgramari;

}
@Override
public void primaConsulatieGratuita() {
System.out.println("Consultul cu codul "+codProgramare+" este gratuita!");
	
}



	
}
