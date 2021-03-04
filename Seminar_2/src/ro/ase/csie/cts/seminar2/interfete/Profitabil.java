package ro.ase.csie.cts.seminar2.interfete;

public interface Profitabil {
	//interfata=clasa abstracata care contine doar metode abstracte
	//atribute statice, constante
	//clasele final nu mai poate fi derivata

   public static final int MAX_PROCENT_DOBANDA=5;
	public abstract void adaugaDobanda(double procentDobanda);
   
}
