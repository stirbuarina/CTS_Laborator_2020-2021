package ro.ase.csie.cts.dp.decorator;

public class TestDecorator {
public static void main(String[] args) {
	SuperErou dragon=new Dragon("Dragonul albastru",1000);
	dragon.alearga();
	dragon.esteLovit(800);
	dragon.seVindeca(50);
	
	
	SuperErou dragon2=new Dragon("Dragonul galben",1000);
	dragon2.alearga();
	dragon2.esteLovit(100);
	dragon2.seVindeca(50);

	//aplicam decoratori pe primul dragon
//	SuperErou dragonCuArmura=new DecoratorArmura(dragon, 300);
//    dragonCuArmura.esteLovit(400);
	
	dragon=new DecoratorArmura(dragon, 300);
	dragon.esteLovit(400);
	
	dragon=new DecoratorEsteRanit(dragon);
	dragon.esteLovit(400);
    dragon.alearga();
}
}
