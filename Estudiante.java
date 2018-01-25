
public class Estudiante extends	 Persona {

	private boolean brazos;
	private boolean piernas;

	public Estudiante() {
		
	}
	
	public boolean setBrazos(){
		return brazos;
	}
	
	public void getBrazos(boolean brazos){
		this.brazos=brazos;
	}
	
	public boolean setPiernas(){
		return piernas;
	}
	
	public void getPiernas(boolean piernas){
		this.piernas=piernas;
	}


//	public void Mostrar() {
//		if (piernas == true) {
//			System.out.println("Soy un estudiante que puede brincar");
//		} else {
//			System.out.println("Soy un estudiante que no puede brincar");
//		}
//
//		if (brazos == true) {
//			System.out.println("Soy un estudiante que puede usar sus brazos");
//		}
//
//		else {
//			System.out.print("Soy un estudiante que no puede usar sus brazos");
//		}
//	}

}
