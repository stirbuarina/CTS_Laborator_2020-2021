package ro.ase.csie.cts.seminar2.modele;

import ro.ase.csie.cts.seminar2.exceptii.ExceptieFonduriInsuficiente;
import ro.ase.csie.cts.seminar2.exceptii.ExceptieTransferIlegal;

public abstract class Cont {
	public abstract double getBalanta();
	//Object valoare=valoare generica
	public abstract void alimenteaza(Double valoare);
	public abstract void extrage(Double valoare) throws ExceptieFonduriInsuficiente;
	public abstract void transfer(Cont destinatie,Double valoare) throws ExceptieTransferIlegal,ExceptieFonduriInsuficiente;

}
