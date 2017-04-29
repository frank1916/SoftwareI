package org.negocio;

public abstract class ApartamentoDecorator implements DatosInmueble{

	private DatosInmueble datos;
	
	public ApartamentoDecorator(DatosInmueble datos) {
		setDatos(datos);
	}
	
	/**
	 * @return the datos
	 */
	public DatosInmueble getDatos() {
		return datos;
	}

	/**
	 * @param datos the datos to set
	 */
	public void setDatos(DatosInmueble datos) {
		this.datos = datos;
	}
}
