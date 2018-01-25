
public class Persona {

	private String Nombre;
	private int Edad;
	private boolean Genero;
	private boolean brazos = true;
	private boolean piernas = true;

	public String getNombre() {
		return this.Nombre;
	}

	public void setNombre(String Nombre) {
		this.Nombre = Nombre;
	}

	public int getEdad() {
		return this.Edad;
	}

	public void setEdad(int Edad) {
		this.Edad = Edad;
	}

	public boolean getGenero() {
		return this.Genero;
	}

	public void setGenero(boolean Genero) {
		this.Genero = Genero;
	}

	public boolean getPiernas() {
		return this.piernas;
	}

	public void setPiernas(boolean piernas) {
		this.piernas = piernas;
	}

	public boolean getBrazos() {
		return this.brazos;
	}

	public void setBrazos(boolean brazos) {
		this.brazos = brazos;
	}
	
}



