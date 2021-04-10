package ro.ase.csie.cts.tema2;


import java.util.ArrayList;
import java.util.List;

import ro.ase.csie.cts.tema2.servicii.InterfataComisioane;

public class ComisionBanca implements InterfataComisioane {
	private ArrayList<Cont> conturi = new ArrayList<>();

	public ComisionBanca(ArrayList<Cont> conturi) {
		this.conturi = conturi;
	}

	public List<Cont> getConturi() {
		return conturi;
	}

	public void setConturi(ArrayList<Cont> conturi) {
		this.conturi = conturi;
	}

	@Override
	public double calculeazaComisionBanca(Cont cont) {
		return cont.getValoareImprumut() * Math.pow(cont.getRata(), (cont.getZileActiv() / 365))
				- cont.getValoareImprumut();
	}

	@Override
	public double calculeazaComisionBancaTotal() {
		double comisionTotal = 0.0;
		for (int i = 0; i < this.conturi.size(); i++) {
			if (this.conturi.get(i).getTipCont() == TipCont.PREMIUM
					|| this.conturi.get(i).getTipCont() == TipCont.SUPER_PREMIUM) {
				comisionTotal += InterfataComisioane.COMISION_AGENT_BANCAR
						* calculeazaComisionBanca(this.conturi.get(i));
			}
		}
		return comisionTotal;
	}

}
