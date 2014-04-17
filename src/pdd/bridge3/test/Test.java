package pdd.bridge3.test;

import pdd.bridge3.abstracciones.BotonMute;
import pdd.bridge3.abstracciones.BotonPausado;
import pdd.bridge3.abstracciones.BotonRemoto;
import pdd.bridge3.implentacion.DispositivoTv;
import pdd.bridge3.interfaz.DispositivoEntretenimiento;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		BotonRemoto tv = new BotonMute(new DispositivoTv(2, 222));
		
		System.out.println("Prueba tv con mute: ");
		tv.botonCincoPresionado();
		tv.botonSeisPresionado();
		tv.butonNuevePresionado();
		
		BotonRemoto tv2 = new BotonPausado(new DispositivoTv(10, 100));
		tv2.botonCincoPresionado(); // Disminuye
		tv2.botonSeisPresionado(); // Aumenta
		tv2.botonSeisPresionado(); // Aumenta
		tv2.botonSeisPresionado(); // Aumenta
		tv2.botonSeisPresionado(); // Aumenta
		tv2.deviceFeedBack();
		
	}

}//Fin class Test
