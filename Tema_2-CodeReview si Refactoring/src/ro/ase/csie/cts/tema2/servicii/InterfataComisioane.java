package ro.ase.csie.cts.tema2.servicii;

import ro.ase.csie.cts.tema2.Cont;

public interface InterfataComisioane {
	public static final double COMISION_AGENT_BANCAR = 0.125;

	public double calculeazaComisionBanca(Cont cont);

	public double calculeazaComisionBancaTotal();

}
