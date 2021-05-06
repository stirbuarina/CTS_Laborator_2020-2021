package stirbu.arina.g1088.prototype;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Medicamente implements Cloneable{
	
	private List<String> listaMedicamente;
	
	
	public Medicamente() {
		listaMedicamente=new ArrayList<>();
	}
	
	
	public Medicamente(List<String> lista) {
		this.listaMedicamente=lista;
	}
	
	public void incarcareDate() {
		try {
			BufferedReader reader=new BufferedReader(new FileReader("medicamentePROTOTYPE"));
            String medicament=null;
            while((medicament=reader.readLine())!=null) {
            	listaMedicamente.add(medicament);
            }
            
		}catch (FileNotFoundException e) {
        e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	
	@Override
	public String toString() {
		return "Medicamente [listaMedicamente=" + listaMedicamente + "]";
	}


	public List<String> getMedicamente(){
		return listaMedicamente;
	}

	@Override
	public Object clone() throws CloneNotSupportedException {
	
		List<String> copie=new ArrayList<String>();
		
		for(String s: this.getMedicamente()) {
			copie.add(s);
		}
		return new Medicamente(copie);
		
	}

	
	
}
