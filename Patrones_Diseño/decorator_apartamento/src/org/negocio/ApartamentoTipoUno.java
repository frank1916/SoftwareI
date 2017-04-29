package org.negocio;

import java.math.BigDecimal;

public class ApartamentoTipoUno extends Apartamento{
	
	public String obtenerDescripcion() {
		return "Apartamento de 80 mts cuadrados, dos baños, tres habitaciones";
	}
	
	public BigDecimal obtenerPrecio() {
		return new BigDecimal(80000000);
	}
}

