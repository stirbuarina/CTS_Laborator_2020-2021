package ro.ase.csie.cts.dp.flyweight;

import java.util.List; 
import java.util.ArrayList; 

public class FlyWeightModel3D implements InterfataFlyweightModel3D{

	public String numeModel;
	List<Integer> puncteModel=new ArrayList<>();
	
	@Override
	public void afisareEcran(DateEcran date) {
System.out.println(String.format("Adisare %s la coordonatele %d, %d, %d cu %s ", numeModel,date.x,date.y,date.z,date.textura));		
	}
	
	public FlyWeightModel3D(String numeModel) {
	super();
	this.numeModel=numeModel;
}

}
