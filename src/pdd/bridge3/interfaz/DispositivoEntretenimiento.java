package pdd.bridge3.interfaz;

/*
 * Está es mi interfaz
 */
public abstract class DispositivoEntretenimiento {

	protected int estadoDispositivo;
	protected int configuracionMax;
	protected int nivelVolumen = 0;
	
	public abstract void botonCincoPresionado();
	public abstract void botonSeisPresionado();
	
	public void deviceFeedBack() {
		
		if(estadoDispositivo > configuracionMax ||
				estadoDispositivo < 0) {
			
			estadoDispositivo = 0;
			
		}
		
		System.out.println("On: " + estadoDispositivo);
		
	}//Fin deviceFeedBack
	
	public void botonSietePresionado() {
		
		nivelVolumen++;
		System.out.println("Volumen en: " + nivelVolumen);
		
	}
	
	public void botonOchoPresionado() {
		
		nivelVolumen--;
		System.out.println("Volumen en: " + nivelVolumen);
		
	}
	
}//Fin abstract class
