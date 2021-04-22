package ro.ase.csie.cts.dp.flyweight;
import java.util.HashMap;
import java.util.Map;
public class Model3DFactory {
   public static Map<String,InterfataFlyweightModel3D> modele=
		   new HashMap<>();

  //se executa o singura data blocul static
   static {
	   modele.put(TipModel3D.CLADIRE.toString(),new FlyWeightModel3D("Cladire"));
       modele.put(TipModel3D.SOLDAT.toString(), new FlyWeightModel3D("Soldat"));

   }
   
   
   public static InterfataFlyweightModel3D getModel(TipModel3D tip) {
	   return modele.get(tip.toString());
   }
}
