package ro.ase.csie.cts.dp.decorator;

public class DecoratorEsteRanit extends DecoratorErouAbstract{

	public static final int NIVEL_CRITIC=200;
	
	public DecoratorEsteRanit(SuperErou erou) {
		super(erou);
	}

	@Override
	public void alearga() {
		if(erou.getPuncteViata()< NIVEL_CRITIC) {
			System.out.println("Eroul nu mai poate alerga. Este ranit!");
		}
		else
		{
			this.erou.alearga();
		}
	}

	@Override
	public int getPuncteViata() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
	

}
