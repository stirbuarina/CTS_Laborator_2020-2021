package ro.ase.csie.cts.tema2.servicii;

import ro.ase.csie.cts.tema2.exceptii.ExceptieValoareImprumutInvalid;

public interface InterfataValidare {
	public void validareValoareImprumut(double valoareImprumut) throws ExceptieValoareImprumutInvalid;
}
