
public class Persona {
	
	private String cedula;
	private String nombre;
	private Status estado;
	
	public Persona (String cedula, String nombre, Status estado) {		
		this.cedula = cedula;
		this.nombre = nombre;
		this.estado = estado;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getCedula() {
		return cedula;
	}
	public void setCedula(String cedula) {
		this.cedula = cedula;
	}
	
	public Status getEstado() {
		return estado;
	}
	public void setEstado(Status estado) {
		this.estado = estado;
	}
	
	@Override

	public String toString() {
		return "Nombre: " + this.nombre + "\n Cedula: "+ this.cedula + "\n Estado: " + this.estado;
	}

}
