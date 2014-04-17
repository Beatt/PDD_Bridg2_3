package pdd.bridge3.abstracciones;

import pdd.bridge3.interfaz.DispositivoEntretenimiento;

/*
 * Redefine la abstración
 */
public class BotonMute extends BotonRemoto {

	public BotonMute(DispositivoEntretenimiento disp) {
		super(disp);
	}

	@Override
	public void butonNuevePresionado() {
		System.out.println("La tv fue muteada!!!");
	}
	
}//Fin class BotoMute
