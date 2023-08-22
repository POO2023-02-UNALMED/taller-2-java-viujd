package test;

public class Auto {

	String modelo;
	int precio;
	Asiento [] asientos;
	String marca;
	String motor;
	int registro;
	static int cantidadCreados;

	int cantidadAsientos() {
		        int contAsiento = 0;
		        for (Asiento asiento : asientos) {
		            if (asiento != null) {
		            	contAsiento++;
		            }
		        }
return contAsiento;
	}
	
	String verificarIntegridad() {
		if (registro==motor.registro) {
			for (int i=0; i< asientos.length; i++) {
				if (asientos[i] != null) {
					if (asientos[i].registro != registro) {
						return "Las piezas no son originales";
					}
				}
			}
			return "Auto original";
			else {
				return "Las piezas no son originales";
			}
		}
		
	}
	
	
}
