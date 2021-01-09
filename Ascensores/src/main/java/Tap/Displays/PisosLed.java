package Tap.Displays;

import Tap.Ascensores.Piso;

public class PisosLed implements Observer {
	
	private int piso;

	public int getPiso() {
		return piso;
	}

	public void setPiso(int piso) {
		this.piso = piso;
	}
	
	public void display() {
		if (this.piso == 0) {
			System.out.println("*------");
		}
		else if (this.piso == 1) {
			System.out.println("-*-----");
		}
		else if (this.piso == 2) {
			System.out.println("--*----");
		}
		else if (this.piso == 3) {
			System.out.println("---*---");
		}
		else if (this.piso == 4) {
			System.out.println("----*--");
		}
		else if (this.piso == 5) {
			System.out.println("-----*-");
		}
		else if (this.piso == 6) {
			System.out.println("------*");
		}
		else {
			
		}
	}

	@Override
	public void update(Piso data) {
		
		this.piso = data.getPiso();
		this.display();
		
	}
}