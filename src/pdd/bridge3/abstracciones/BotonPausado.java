package pdd.bridge3.abstracciones;

import pdd.bridge3.interfaz.DispositivoEntretenimiento;

/*
 * Redefine la abstración
 */
public class BotonPausado extends BotonRemoto {

	public BotonPausado(DispositivoEntretenimiento disp) {
		super(disp);
	}

	@Override
	public void butonNuevePresionado() {
		System.out.println("Tv pausada!!!");
	}

}//Fin class BotonPausado
