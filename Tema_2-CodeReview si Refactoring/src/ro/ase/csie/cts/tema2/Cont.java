package ro.ase.csie.cts.tema2;

import ro.ase.csie.cts.tema2.exceptii.ExceptieValoareImprumutInvalid;
import ro.ase.csie.cts.tema2.servicii.InterfataValidare;
import ro.ase.csie.cts.tema2.test.TestCont;

public class Cont {
	private double valoareImprumut;
	private double rata;
	private int zileActiv;
	private TipCont tipCont;
	InterfataValidare serviciuValidare = null;

	public Cont(InterfataValidare validare, double valoareImprumut, double rata, int zileActiv, TipCont tipCont)
			throws ExceptieValoareImprumutInvalid {
		this.setValidareImprumut(validare);
		serviciuValidare.validareValoareImprumut(valoareImprumut);
		this.valoareImprumut = valoareImprumut;
		this.rata = rata;
		this.zileActiv = zileActiv;
		this.tipCont = tipCont;
	}

	public int getZileActiv() {
		return zileActiv;
	}

	public void setZileActiv(int zileActiv) {
		this.zileActiv = zileActiv;
	}

	public TipCont getTipCont() {
		return tipCont;
	}

	public void setTipCont(TipCont tipCont) {
		this.tipCont = tipCont;
	}

	public void setValidareImprumut(InterfataValidare validare) {
		if (validare == null) {
			throw new NullPointerException();
		}

		this.serviciuValidare = validare;
	}

	public double getValoareImprumut() {
		return valoareImprumut;
	}

	public void setValoareImprumut(double valoare) throws ExceptieValoareImprumutInvalid {
		serviciuValidare.validareValoareImprumut(valoareImprumut);
		valoareImprumut = valoare;

	}

	public double getRata() {
		return this.rata;
	}

	public double getRataLunara() {
		return valoareImprumut / rata;
	}

	@Override
	public String toString() {
		return "Cont [valoareImprumut=" + valoareImprumut + ", rata=" + rata + ", zileActiv=" + zileActiv + ", tipCont="
				+ tipCont + "]";
	}



}