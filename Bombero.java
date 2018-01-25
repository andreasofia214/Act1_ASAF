
public class Bombero extends Persona{
	
	private boolean brazos;
	private boolean piernas;

	public Bombero() {
		
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
}
