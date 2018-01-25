
public class Motricidad extends Persona{

	private static final String Persona = null;

	public Motricidad(String Nombre, int Edad, boolean Genero, boolean brazos, boolean piernas) {
		super();
	}
		static boolean piernas;
		static boolean brazos;
		
	public static void main(String[] Args) {
			
			Estudiante estudiante = new Estudiante();
			estudiante.setNombre("Jose");
			estudiante.setEdad(14);
			estudiante.setGenero(true);
			estudiante.setBrazos(false);
			estudiante.setPiernas(false);
			
			Bombero bombero = new Bombero();
			bombero.setNombre("Martha");
			bombero.setEdad(32);
			bombero.setGenero(false);
			bombero.setBrazos(false);
			bombero.setPiernas(false);
			
			Disc discapacitado = new Disc();
			discapacitado.setNombre("Pepe");
			discapacitado.setEdad(28);
			discapacitado.setGenero(true);
			discapacitado.setBrazos(true);
			discapacitado.setPiernas(true);
			
		if (estudiante.getPiernas() == true) {
			System.out.println("Soy un estudiante que puede brincar");
			} else {
				System.out.println("Soy un estudiante que no puede brincar");
		}

		if (estudiante.getBrazos() == true) {
			System.out.println("Soy un estudiante que puede usar sus brazos");
			}

			else {
			System.out.print("Soy un estudiante que no puede usar sus brazos");
		}
		
		if (bombero.getPiernas() == true) {
			System.out.println("Soy un estudiante que puede brincar");
			} else {
				System.out.println("Soy un estudiante que no puede brincar");
		}

		if (bombero.getBrazos() == true) {
			System.out.println("Soy un estudiante que puede usar sus brazos");
			}

			else {
			System.out.print("Soy un estudiante que no puede usar sus brazos");
		}
		
		if (discapacitado.getPiernas() == true) {
			System.out.println("Soy un estudiante que puede brincar");
			} else {
				System.out.println("Soy un estudiante que no puede brincar");
		}

		if (discapacitado.getBrazos() == true) {
			System.out.println("Soy un estudiante que puede usar sus brazos");
			}

			else {
			System.out.print("Soy un estudiante que no puede usar sus brazos");
		}
	}
			
}

