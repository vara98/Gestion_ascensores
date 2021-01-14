package Tap.Ascensores;

public class EstadoAscensorCerrarPuertas implements Estado {

	@Override
	public void moverse(Ascensor a,int piso,int pisoObjetivo) {
		System.out.println("Ascensor en piso "+ String.valueOf(piso)+" Moviendose a piso "+ String.valueOf(pisoObjetivo));
		a.setEstado(new EstadoAscensorMoviendose());
		
	}

	@Override
	public void abrirPuertas(Ascensor a, int piso) {
		System.out.println("Abriendo puertas");
		a.setEstado(new EstadoAscensorAbrirPuertas());
		
	}

	@Override
	public void cerrarPuertas(Ascensor a, int piso) {
		System.out.println("Las puertas ya están cerradas");
		
	}

	@Override
	public void pararse(Ascensor a, int piso) {
		System.out.println("Ya está el ascensor parado");
		
	}

}
