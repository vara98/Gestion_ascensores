package Tap.Ascensores;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Edificio edificio= new Edificio();
		Ascensor a1 = new Ascensor(3);
		edificio.addproducto(a1);
		Ascensor a2 = new Ascensor(5);
		edificio.addproducto(a2);
		Ascensor a3 = new Ascensor(2);
		edificio.addproducto(a3);
		a1.addObserver(new PisosLed());
		a1.notifyObservers();
		edificio.llamarAscensor(a1, 2);
		a1.notifyObservers();
		edificio.viajar(a1,5);
		a1.notifyObservers();

		
		
		
		
	}

}
