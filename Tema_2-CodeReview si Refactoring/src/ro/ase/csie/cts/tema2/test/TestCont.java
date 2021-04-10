package ro.ase.csie.cts.tema2.test;

import java.util.ArrayList;
import java.util.List;

import ro.ase.csie.cts.tema2.ComisionBanca;
import ro.ase.csie.cts.tema2.Cont;
import ro.ase.csie.cts.tema2.TipCont;
import ro.ase.csie.cts.tema2.exceptii.ExceptieValoareImprumutInvalid;
import ro.ase.csie.cts.tema2.servicii.ServiciuValidari;

public class TestCont {
	public static void main(String[] args) {
		try {
			ArrayList<Cont> conturi = new ArrayList<>();
			Cont cont = new Cont(new ServiciuValidari(), 100, 20, 900, TipCont.PREMIUM);
			Cont cont2 = new Cont(new ServiciuValidari(), 200, 10, 2500, TipCont.SUPER_PREMIUM);
			System.out.println(cont.toString());
			conturi.add(cont);
			conturi.add(cont2);
			ComisionBanca banca = new ComisionBanca(conturi);
			System.out.println(banca.calculeazaComisionBancaTotal());
			System.out.println(banca.calculeazaComisionBanca(cont));
		} catch (ExceptieValoareImprumutInvalid e) {
			e.printStackTrace();
		}

	}

}
