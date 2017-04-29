package org.main;

import org.negocio.ApartamentoTipoDos;
import org.negocio.ApartamentoTipoUno;
import org.negocio.Closets;
import org.negocio.CocinaIntegral;
import org.negocio.DatosInmueble;
import org.negocio.Pintura;

public class ClasePrincipal {

	public static void main(String[] args) {
		DatosInmueble apartamentoTipoUno = new ApartamentoTipoUno();
		System.out.println(apartamentoTipoUno.obtenerDescripcion() + " "+ apartamentoTipoUno.obtenerPrecio());
		
		apartamentoTipoUno = new ApartamentoTipoUno();
		apartamentoTipoUno = new CocinaIntegral(apartamentoTipoUno);		
		System.out.println(apartamentoTipoUno.obtenerDescripcion() + " "+ apartamentoTipoUno.obtenerPrecio());
		
		DatosInmueble apartamentoTipoDos = new ApartamentoTipoDos();
		System.out.println(apartamentoTipoDos.obtenerDescripcion() + " "+ apartamentoTipoDos.obtenerPrecio());
		
		apartamentoTipoDos = new ApartamentoTipoDos();
		apartamentoTipoDos = new CocinaIntegral(apartamentoTipoDos);
		apartamentoTipoDos = new Pintura(apartamentoTipoDos);
		apartamentoTipoDos = new Closets(apartamentoTipoDos);
		System.out.println(apartamentoTipoDos.obtenerDescripcion() + " "+ apartamentoTipoDos.obtenerPrecio());
	}

}
