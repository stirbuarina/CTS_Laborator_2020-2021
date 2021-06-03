package ro.ase.cts.cise.tema3.dp.singleton;

public interface InterfataServer {

    public String getAdresaIp();
    public int getPort();
    public int getNrMaximConexiuni();

    public boolean conectare();
    public boolean deconectare();

}