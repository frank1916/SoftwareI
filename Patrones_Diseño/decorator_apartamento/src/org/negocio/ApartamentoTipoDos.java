package org.negocio;

import java.math.BigDecimal;

public class ApartamentoTipoDos extends Apartamento{
	
	public String obtenerDescripcion() {
		return "Apartamento de 60 mts cuadrados, dos baños, dos habitaciones";
	}
	
	public BigDecimal obtenerPrecio() {
		return new BigDecimal(60000000);
	}
}

