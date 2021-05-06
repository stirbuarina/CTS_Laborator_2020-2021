package stirbu.arina.g1088.decorator;

public class RetetaDecorator extends AbstractDecorator{

	public RetetaDecorator(Reteta reteta) {
		super(reteta);
	}

	@Override
	public void aplicaDiscount(int procent) {

		super.reteta.setCostReteta(super.reteta.getCostReteta()*(100-procent)/100);
	}
	
	
}
