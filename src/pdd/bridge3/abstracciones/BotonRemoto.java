package pdd.bridge3.abstracciones;

import pdd.bridge3.interfaz.DispositivoEntretenimiento;

/*
 * Representa las diferentes maneras de trabajar
 * 	con cada dispositivo.
 */
public abstract class BotonRemoto {
	
	private DispositivoEntretenimiento dispositivoEn;
	
	public BotonRemoto(DispositivoEntretenimiento disp) {
		dispositivoEn = disp;
	}
	
	public void botonSeisPresionado() {
		dispositivoEn.botonSeisPresionado();
	}
	
	public void botonCincoPresionado() {
		dispositivoEn.botonCincoPresionado();
	}
	
	public void deviceFeedBack() {
		dispositivoEn.deviceFeedBack();
	}
	
	public abstract void butonNuevePresionado();
	
}//Fin class BotonRemoto
