package main;

import logic.Funcionario;
import logic.Persona;
import logic.Sede;
import org.dao.ImplementacionDAO;

/**
 *
 * @author 
 */
public class Main {
    
    //CREAR BASE DE DATOS en mysql llamada test

    public static void main(String[] args) {

        ImplementacionDAO imp = new ImplementacionDAO();
        imp.iniciarSesion();

        //Funconarios
        Funcionario f = new Funcionario("N100", "Administrador", 2000000);
        Funcionario f2 = new Funcionario("N500", "Vendedor", 120000);
        Funcionario f3 = new Funcionario("N1000", "Proveedor", 850000);

        //Personas
        Persona p = new Persona("Juan", "40033");
        Persona p2 = new Persona("Pedro", "50065");
        Persona p3 = new Persona("Marco", "713039");

        //sedes.
        Sede s = new Sede("Tunja", 10);
        Sede s2 = new Sede("Pereira", 50);
        Sede s3 = new Sede("Manizales", 80);

        //insert Funcionarios
        imp.guradarDatos(f);
        imp.guradarDatos(f2);
        imp.guradarDatos(f3);

        //insert Personas
        imp.guradarDatos(p);
        imp.guradarDatos(p2);
        imp.guradarDatos(p3);

//        insert Sedes
        imp.guradarDatos(s);
        imp.guradarDatos(s2);
        imp.guradarDatos(s3);

        //Actualizar tabla datos.
        imp.actualizarBD();

        //Consulta de datos
        System.out.println("-----FUNCIONARIOS------");
        imp.obtenerDatos("Funcionario");
        System.out.println("-------PERSONAS--------");
        imp.obtenerDatos("Persona");
        System.out.println("--------SEDES-----------");
        imp.obtenerDatos("Sede");
        
        //Cerrar Base de datos
        imp.cerrarBD();
        
    }

}
