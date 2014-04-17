package pdd.bridge3.implentacion;

import pdd.bridge3.interfaz.DispositivoEntretenimiento;

/*
 * Está es mi implementación.
 */
public class DispositivoTv extends DispositivoEntretenimiento {

	public DispositivoTv(int newEstadoDispositivo, int newConfiMax) {
		
		super.estadoDispositivo = newEstadoDispositivo;
		super.configuracionMax = newConfiMax;
		
	}
	
	@Override
	public void botonCincoPresionado() {
		
		super.estadoDispositivo--;
		
		System.out.println("Canal abajo");
		
		
		
	}

	@Override
	public void botonSeisPresionado() {
		
		super.estadoDispositivo++;
		
		System.out.println("Canal arriba");
		

	}

}//Fin class DispositivoTv
