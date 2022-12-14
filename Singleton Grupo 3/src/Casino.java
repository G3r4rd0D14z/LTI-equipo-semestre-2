
public class Casino {

	private String nombre = "Maroñas";
	private Persona responsable;
	private static Casino casino = new Casino();
	private Mesa[] mesas = new Mesa[2];
	private Slots[] slots = new Slots[8];
	
	private Casino() {}
	
	public static Casino createCasino() {
		
		return casino;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Persona getEncargado() {
		return responsable;
	}

	public void setEncargado(Persona encargado) {
		this.responsable = encargado;
	}	
	
	public String toString() {
		
		return "Este casino se llama " + nombre + " y su encargado es " + responsable + ".";
	}
}
