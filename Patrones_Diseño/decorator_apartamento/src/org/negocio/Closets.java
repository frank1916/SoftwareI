package org.negocio;

import java.math.BigDecimal;

public class Closets extends ApartamentoDecorator{

	public Closets(DatosInmueble datos) {
		super(datos);
	}
	
	@Override
	public String obtenerDescripcion() {
		
		return getDatos().obtenerDescripcion() + " 3 closets en madera...";
	}

	@Override
	public BigDecimal obtenerPrecio() {
		return getDatos().obtenerPrecio().add(new BigDecimal(3000000));
	}

}
