package ro.ase.csie.cts.dp.factory;

import java.util.ArrayList;

public class TestFactory {
	public static void main(String[] args) {
//	
//	CaracterAbstract mickeyMouse=new CaractereDisnay("rosu", "Mickey Mouse");
//    CaracterAbstract spiderman=new CaracterMarvel("Spiderman", 100);
//   

		CaracterAbstract mickyMouse = FactoryCaractere.getCaracter(TipCaracter.DISNAY, "Michey Mouse");

		ArrayList<CaracterAbstract> caractere = new ArrayList<>();

	}
}
