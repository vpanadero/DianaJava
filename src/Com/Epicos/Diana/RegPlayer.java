package Com.Epicos.Diana;

public class RegPlayer {
	
	String Nombres;
	
	int Jugada;
	
	public void RegJugada(String Nombres, int Jugada) {
		
		this.Nombres=Nombres;
		
		this.Jugada=Jugada;
		
		
	}

	public String GetJugada() {
	
	return ("La tirada del Jugador ha sido " + " ");
	}
}