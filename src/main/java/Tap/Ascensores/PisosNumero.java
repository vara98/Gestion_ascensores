package Tap.Ascensores;

public class PisosNumero implements Observer {
	
	private int piso;

	public int getPiso() {
		return piso;
	}

	public void setPiso(int piso) {
		this.piso = piso;
	}
	
	public void display() {
		if (this.piso == 1) {
			System.out.println("1");
		}
		else if (this.piso == 2) {
			System.out.println("2");
		}
		else if (this.piso == 3) {
			System.out.println("3");
		}
		else if (this.piso == 4) {
			System.out.println("4");
		}
		else if (this.piso == 5) {
			System.out.println("5");
		}
		else if (this.piso == 6) {
			System.out.println("6");
		}
		else if (this.piso == 7) {
			System.out.println("7");
		}
		else {
			
		}
	}

	@Override
	public void update(Ascensor data) {
		this.piso = data.getPiso();
		this.display();
		
	}
}
