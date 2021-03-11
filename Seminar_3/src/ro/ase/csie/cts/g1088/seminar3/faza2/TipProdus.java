package ro.ase.csie.cts.g1088.seminar3.faza2;

public enum TipProdus {
	//sunt obiecte in java, nu numere ca in C++
  NOU(0),DISCOUNT(0.1f),STOC_LIMITAT(0.25f),VECHI(0.35f);
  
   private final float discount;
  
   private TipProdus(float discount) {
	   this.discount=discount;
   }
   
   public float getDiscount() {
	   return this.discount;
   }
  
}
