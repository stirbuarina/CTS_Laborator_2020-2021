package stirbu.arina.g1088.decorator;
public abstract class AbstractDecorator implements InterfataReteta{

	protected Reteta reteta;
	
	public AbstractDecorator(Reteta reteta) {
		this.reteta=reteta;
	}

	@Override
	public void printeazaReteta() {
reteta.printeazaReteta();
System.out.println("Felicitari!");
}
	
	public abstract void aplicaDiscount(int procent) ;
	
}
