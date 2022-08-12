
public class Slots extends Juego{
	
	private TipoSlots tipo;
	
	public Slots(String nombre, TipoSlots tipo) {
		super(nombre);
		this.tipo = tipo;
	}

	public TipoSlots getTipo() {
		return tipo;
	}

	public void setTipo(TipoSlots tipo) {
		this.tipo = tipo;
	}
	
	@Override
	
	public String toString() {
		
		return "Juego de Slots\n" +
		super.toString() +
		"\nTipo de Slots: " + this.tipo.name();
		
	}


}
