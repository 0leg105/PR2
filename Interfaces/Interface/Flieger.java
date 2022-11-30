package Interface;

public interface Flieger {
	
	int defaultWert = 12; //Final  
	
	public default boolean wertÄndern() { //default Methode
		return true;
	}
	public void starten();
	public void landen();
	public void fliegen();

}
