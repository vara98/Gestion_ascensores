package Tap.Ascensores;

public class EstadoAscensorAbrirPuertas implements Estado {

	@Override
	public void moverse(Ascensor a, int piso, int pisoObjetivo) {
		System.out.println("Error, puertas abiertas");
		
	}

	@Override
	public void abrirPuertas(Ascensor a, int piso) {
		System.out.println("Las puertas ya están abiertas");
		
	}

	@Override
	public void cerrarPuertas(Ascensor a, int piso) {
		System.out.println("Cerrando puertas");
		a.setEstado(new EstadoAscensorCerrarPuertas());
		
	}

	@Override
	public void pararse(Ascensor a, int piso) {
		System.out.println("El ascensor ya está quieto");
		// TODO Auto-generated method stub
		
	}

}
