package ro.ase.csie.cts.tema2.servicii;

import ro.ase.csie.cts.tema2.exceptii.ExceptieValoareImprumutInvalid;

public class ServiciuValidari implements InterfataValidare {

	@Override
	public void validareValoareImprumut(double valoareImprumut) throws ExceptieValoareImprumutInvalid {
		if (valoareImprumut <= 0) {
			throw new ExceptieValoareImprumutInvalid();
		}
	}

}
