package Tap.Ascensores;

import java.util.ArrayList;

public class Ascensor {
	private Estado current;
	private int piso;
	private int pisoObjetivo;
	private int pisoLLamada;
	protected ArrayList<Observer> observers;
	
	
	
	
	public Ascensor(int piso) {
		this.current= new EstadoAscensorParado();
		this.piso=piso;
		//this.pisoLLamada=pisoLLamada;
		//this.pisoObjetivo=pisoObjetivo;
		this.observers = new ArrayList<Observer>();
	}
	
	public void setEstado(Estado e) {
		this.current = e;
	}
	
	public void moverse(Ascensor a, int pisoObjetivo) {
		this.current.moverse(this, piso, pisoObjetivo);
		piso=pisoObjetivo;
	}
	
	
	public void abrirPuertas(Ascensor a) {
		this.current.abrirPuertas(this, piso);
	}
	
	public void cerrarPuertas(Ascensor a) {
		this.current.cerrarPuertas(this, piso);
	}
	
	public void pararse(Ascensor a) {
		this.current.pararse(this,piso);
	}

	
	
	protected void addObserver(Observer o)
	{
		this.observers.add(o);
	}
	
	protected void removeObserver(Observer o) {
		this.observers.remove(o);
	}
	
	protected void notifyObservers() {
		for(Observer o : observers)
			o.update(this);
	}
	
	public int getPiso() {
		return piso;
	}

	public void setPiso(int piso) {
		this.piso = piso;
	}

	public int getPisoObjetivo() {
		return pisoObjetivo;
	}

	public void setPisoObjetivo(int pisoObjetivo) {
		this.pisoObjetivo = pisoObjetivo;
	}
	
	
	
	

	public int getPisoLLamada() {
		return pisoLLamada;
	}

	public void setPisoLLamada(int pisoLLamada) {
		this.pisoLLamada = pisoLLamada;
	}
	
	
	
	

	
	
	

	
	
}
