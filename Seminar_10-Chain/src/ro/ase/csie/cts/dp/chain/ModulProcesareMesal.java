package ro.ase.csie.cts.dp.chain;

public abstract class ModulProcesareMesal {

	ModulProcesareMesal next=null;
	
	public abstract void procesareMesaj(MesajChat mesaj);

	
	//!!!!!!!!!!!!!!!!!!!
	public void setNext(ModulProcesareMesal next) {
		this.next = next;
	}



}

