package ro.ase.csie.cts.g1088.seminar3.faza1;

public class Produs {
	 public static final int VECHIME_CLIENT_MAXIMA=10;
		//valorile implicite in java sunt de tip double
	 public static final float DISCOUNT_CLIENT_MAXIM=0.15f;
     
	 
	public float getPretFinal(TipProdus tipProdus, float pretInitial, int vechimeClientInAni)
	  {
	    float  pretFinal = 0;
	    float discountFidelitate = (vechimeClientInAni > VECHIME_CLIENT_MAXIMA) ? DISCOUNT_CLIENT_MAXIM : (float)vechimeClientInAni/100; 
	    if (tipProdus ==TipProdus.NOU)
	    {
	      pretFinal = pretInitial;
	    }
	    else if (tipProdus == TipProdus.DISCOUNT)
	    {
	      pretFinal = (pretInitial - (0.1f * pretInitial)) - discountFidelitate * (pretInitial - (0.1f * pretInitial));
	    }
	    else if (tipProdus == TipProdus.STOC_LIMITAT)
	    {
	      pretFinal = (pretInitial - (0.25f * pretInitial)) - discountFidelitate * (pretInitial - (0.25f * pretInitial));
	    }
	    else if (tipProdus == TipProdus.VECHI)
	    {
	      pretFinal = (pretInitial - (0.35f * pretInitial)) - discountFidelitate * (pretInitial - (0.35f * pretInitial));
	    }
	    return pretFinal;
	  }
}