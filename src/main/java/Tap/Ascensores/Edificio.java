package Tap.Ascensores;

import java.util.ArrayList;





public class Edificio {
	
	private ArrayList<Ascensor> ascensor;
	
	public Edificio(){
	
	 ascensor= new ArrayList<Ascensor>();
}
	public void addproducto(Ascensor u) {
		ascensor.add(u);
	}
	
	
	public void llamarAscensor(Ascensor u, int pisoLLamada) {
		u.setPisoLLamada(pisoLLamada);
		u.moverse(u,u.getPisoLLamada());
		u.pararse(u);
		u.setPiso(u.getPisoLLamada());
		u.abrirPuertas(u);
		u.cerrarPuertas(u);
	}
	
	
	
	public void viajar(Ascensor u, int pisoObjetivo) {
		u.setPisoObjetivo(pisoObjetivo);
		u.moverse(u, u.getPisoObjetivo());
		u.setPiso(u.getPisoObjetivo());
		u.pararse(u);
		u.abrirPuertas(u);
		u.cerrarPuertas(u);
	}
	
	
	
	
}