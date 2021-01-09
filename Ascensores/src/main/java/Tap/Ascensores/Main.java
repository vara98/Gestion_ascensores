package Tap.Ascensores;
import Tap.Displays.PisosComb;
import Tap.Displays.PisosNumero;
import Tap.Displays.PisosLed;

public class Main {

	public static void main(String[] args) {
		
		for (int i = 0; i <= 6; i++) {
			Piso data = new DataPiso(i);
			data.addObserver(new PisosNumero());
			data.notifyObservers();
		}
		
		for (int i = 0; i <= 6; i++) {
			Piso data = new DataPiso(i);
			data.addObserver(new PisosLed());
			data.notifyObservers();
		}
		
		for (int i = 0; i <= 6; i++) {
			Piso data = new DataPiso(i);
			data.addObserver(new PisosComb());
			data.notifyObservers();
		}
		
	}

}
