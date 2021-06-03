package ro.ase.cts.cise.tema3.dp.singleton;


public class ConexiuneServer{

	String ip;
	int port;
	private static ConexiuneServer conexiune = null;

	private  ConexiuneServer() {
	}
	
	private  ConexiuneServer(String ip,int port) {
		System.out.println("Apel constructor");

		this.port=port;
		this.ip=ip;
	}

	
	
	public static ConexiuneServer getConexiune() {
		if(conexiune==null) {
			conexiune=new ConexiuneServer();
			//prelare valori atribute dintr-un fisier de configurare
            conexiune.ip="127.0.0.1";
            conexiune.port=3306;
		}
		return conexiune;
	}

	
	
	
}
