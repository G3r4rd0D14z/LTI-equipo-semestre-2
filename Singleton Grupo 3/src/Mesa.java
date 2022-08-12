public class Mesa extends Juego{

	private int metrosCuadrados;
	private int minimoJugadores;
	private int maximoJugadores;
	
	public Mesa(String nombre, int metrosCuadrados, int minimoJugadores, int maximoJugadores) {		
		super(nombre);
		this.metrosCuadrados = metrosCuadrados;
		if(minimoJugadores > 1) {
			this.minimoJugadores = minimoJugadores;			
		}else {
			System.out.println("Valor minimo incorrecto. Se ingresa valor por defecto");
			this.minimoJugadores = 2;
		}
		if(maximoJugadores > this.minimoJugadores) {
			this.maximoJugadores = maximoJugadores;
		}
		else{
			this.maximoJugadores = this.minimoJugadores + 2;
		}
	}

	public int getMetrosCuadrados() {
		return metrosCuadrados;
	}

	public void setMetrosCuadrados(int metrosCuadrados) {
		this.metrosCuadrados = metrosCuadrados;
	}

	public int getMaximoJugadores() {
		return maximoJugadores;
	}

	public void setMaximoJugadores(int maximoJugadores) {
		this.maximoJugadores = maximoJugadores;
	}

	public int getMinimoJugadores() {
		return minimoJugadores;
	}

	public void setMinimoJugadores(int minimoJugadores) {
		this.minimoJugadores = minimoJugadores;
	}

	@Override
	
	public String toString() {
		
		return "Juego de Mesa\n" +
		super.toString() +
		"\nMetros cuadrados: " + this.metrosCuadrados +
		"\nMinimo de jugadores: " + this.minimoJugadores +
		"\nMaximo de jugadores: " + this.maximoJugadores;
		
	}

}