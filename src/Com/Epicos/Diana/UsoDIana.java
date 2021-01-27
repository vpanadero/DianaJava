package Com.Epicos.Diana;


import java.util.ArrayList;
import javax.swing.JOptionPane;

public class UsoDIana{
	
	public static void main(String[] args) {
		
		
		String J1 = "", J2="", J3="", J4="";
						
		int Njuga=Integer.parseInt(JOptionPane.showInputDialog("Introduce el número de jugadores"));
				
		while (Njuga>=5) {
								
			int Opcion=Integer.parseInt(JOptionPane.showInputDialog("ERROR Introduce un número del 1 al 4 "));
			
			if (Opcion<=4);
			
			Njuga=Opcion;
			
		}
		
			switch (Njuga){
		
		case 1:
			J1=JOptionPane.showInputDialog("Introduce Nombre Jugador 1");
			
			break;
							
		case 2:
			J1=JOptionPane.showInputDialog("Introduce Nombre Jugador 1");
			J2=JOptionPane.showInputDialog("Introduce Nombre Jugador 2");
			
			break;
			
		case 3:
			J1=JOptionPane.showInputDialog("Introduce Nombre Jugador 1");
			J2=JOptionPane.showInputDialog("Introduce Nombre Jugador 2");
			J3=JOptionPane.showInputDialog("Introduce Nombre Jugador 3");
			
			break;
			
		case 4:
			J1=JOptionPane.showInputDialog("Introduce Nombre Jugador 1");
			J2=JOptionPane.showInputDialog("Introduce Nombre Jugador 2");
			J3=JOptionPane.showInputDialog("Introduce Nombre Jugador 3");
			J4=JOptionPane.showInputDialog("Introduce Nombre Jugador 4");
		
			break;
			
		}
			
		System.out.println("Los jugadores han sido registrados, que comience la partida");
		
		int id1=Integer.parseInt("Nombre"), id2=Integer.parseInt(J2);
			
		int [] [] matrix=new int [7] [5];
		
		matrix [0] [0]=id1; matrix [0] [1]=J1; matrix [0] [2]=J2; matrix [0] [3]=J3; matrix [0] [4]=J4;
		
		matrix [1] [0]="20 Doble"; matrix [1] [1]=J1; matrix [1] [2]=J2; matrix [1] [3]=J3; matrix [1] [4]=J4;
		
	}

}





