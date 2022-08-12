
public class Principal {

	public static void main(String[] args) {
		
		Casino casino = Casino.createCasino();
		
		casino.setEncargado(new Persona("31234567","Fructuosa Mora",Status.ACTIVO));		
		casino.setNombre("Las Garzas");
		
		System.out.println(casino.toString());
		
		System.out.println("Hola mundo :)");
		
		Mesa mesa = new Mesa("Nombre", 23,0,0);
		
		System.out.println(mesa.toString());

	}

}
