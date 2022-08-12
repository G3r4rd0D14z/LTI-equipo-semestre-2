public class Principal {

	public static void main(String[] args) {
		
		Casino casino = Casino.createCasino();
		
		casino.setEncargado(new Persona("31234567","Fructuosa Mora",Status.ACTIVO));		
		casino.setNombre("Las Garzas");
		
		System.out.println(casino.toString());
		

		System.out.println("Hola mundo");

		
		
		Mesa mesa_1 = new Mesa("Poker", 23,0,0);
		Mesa mesa_2 = new Mesa("Texas Hold'em", 20, 2, 8);
		
		Slots slot_1 = new Slots ("Mega Fortune", TipoSlots.PALANCA);
		Slots slot_2 = new Slots ("The One Armed Bandit", TipoSlots.BOTONES);
		Slots slot_3 = new Slots ("Book Of Ra", TipoSlots.PALANCA);
		
		
		System.out.println(mesa_1.toString());
		System.out.println(mesa_2.toString());
		
		System.out.println(slot_1.toString());
		System.out.println(slot_2.toString());
		System.out.println(slot_3.toString());


	}

}
