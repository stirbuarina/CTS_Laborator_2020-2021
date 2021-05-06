package ro.ase.csie.cts.dp.strategy;

public class TestStrategy {

	public static void main(String[] args) {

		Jucator jucator=new Jucator(150, "Mihai", 7);
		jucator.setStrategieMrk(new StrategieJucatorNou());
		
		jucator.acordaPuncteBonus();
		
		jucator.setStrategieMrk(new StrategieZiuaCopilului());
		jucator.acordaPuncteBonus();
		
		
	}

}
