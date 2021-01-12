package Tap.Ascensores;

public interface Estado {
	
	void moverse(Ascensor a, int piso, int pisoObjetivo);
	void abrirPuertas(Ascensor a,int piso );
	void cerrarPuertas(Ascensor a,int piso );
	void pararse(Ascensor a, int piso );
	
	
}
