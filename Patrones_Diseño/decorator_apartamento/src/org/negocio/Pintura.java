package org.negocio;

import java.math.BigDecimal;

public class Pintura extends ApartamentoDecorator{

	public Pintura(DatosInmueble datos) {
		super(datos);
	}
	
	@Override
	public String obtenerDescripcion() {
		
		return getDatos().obtenerDescripcion() + " totalmente pintada";
	}

	@Override
	public BigDecimal obtenerPrecio() {
		return getDatos().obtenerPrecio().add(new BigDecimal(1000000));
	}
}
