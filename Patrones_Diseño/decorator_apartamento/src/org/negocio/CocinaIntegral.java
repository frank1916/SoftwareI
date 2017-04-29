package org.negocio;

import java.math.BigDecimal;

public class CocinaIntegral extends ApartamentoDecorator{

	public CocinaIntegral(DatosInmueble datos) {
		super(datos);
	}
	
	@Override
	public String obtenerDescripcion() {
		
		return getDatos().obtenerDescripcion() + " cocina integral";
	}

	@Override
	public BigDecimal obtenerPrecio() {
		return getDatos().obtenerPrecio().add(new BigDecimal(2000000));
	}

}
