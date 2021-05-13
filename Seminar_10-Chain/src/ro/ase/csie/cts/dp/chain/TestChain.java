package ro.ase.csie.cts.dp.chain;

public class TestChain {

	public static void main(String[] args) {


	ModulProcesareMesal modulFiltru=new ModulFiltruRomana();
	ModulProcesareMesal modulPrivat=new ModulMesajePrivate();
	ModulProcesareMesal modulGrup=new ModulMesajeGrup();
	
	//legam nodurile
	modulFiltru.setNext(modulPrivat);
	modulPrivat.setNext(modulGrup);

	ModulProcesareMesal serverChat=modulFiltru;
	
	serverChat.procesareMesaj(new MesajChat("Salut!", 3, "@gigel"));
   serverChat.procesareMesaj(new MesajChat("Esti un jucator rau!", 1, "@gigel"));	
   serverChat.procesareMesaj(new MesajChat("Buna tutror!", 0, "@everyone"));
	
	}

}
