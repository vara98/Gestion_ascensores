package Tap.Ascensores;

public class EstadoAscensorMoviendose implements Estado{

	
	
	@Override
	public void moverse(Ascensor a, int piso, int pisoObjetivo) {
		System.out.println("Ya está el ascensor en movimiento");
		
	}

	@Override
	public void abrirPuertas(Ascensor a, int piso) {
		System.out.println("No se pueden abrir las puertas ya que el ascensor se encuentra en movimiento");
	}

	@Override
	public void cerrarPuertas(Ascensor a, int piso) {
		System.out.println("Las puertas ya están cerradas");
		
	}

	@Override
	public void pararse(Ascensor a, int piso) {
		System.out.println("El ascensor se ha detenido");
		a.setEstado(new EstadoAscensorParado());
		
	}

}
