package ro.ase.csie.cts.dp.factory;

public class FactoryCaractere {
 
	public static CaracterAbstract getCaracter(TipCaracter tip, String nume) {
		CaracterAbstract caracter=null;
		
		switch(tip){
			case DISNAY:
				caracter=new CaractereDisnay("alb", nume);
                break;
			case MARVEL:
				caracter=new CaracterMarvel(nume, 50);
                break;
            default:
            	throw new UnsupportedOperationException();
		}
		return caracter;
	}
}
