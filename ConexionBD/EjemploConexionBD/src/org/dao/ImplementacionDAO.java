package org.dao;

import java.util.List;
import logic.Funcionario;
import logic.Persona;
import logic.Sede;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author
 */
public class ImplementacionDAO {

    private Configuration cf;
    private SessionFactory factory;
    private Session session;
    private Transaction transaction;

    public ImplementacionDAO() {
        this.cf = new Configuration();
        this.cf.configure("/logic/hibernate.xml");
    }

    /**
     * Inicio parametros de sesion.
     */
    public void iniciarSesion() {

        try {
            //crear sesion
            this.factory = cf.buildSessionFactory();

            //crear sesion objeto
            this.session = factory.openSession();

            //creando transaccion del objeteo.
            this.transaction = session.beginTransaction();
        } catch (Exception e) {
            System.err.println("1_error_conexion_bd " + e.getMessage());
        }

    }
    
    public void cerrarBD (){
        this.session.close();
    }

    /**
     * Permite almacenar los datos en la BD.
     *
     * @param o
     */
    public void guradarDatos(Object o) {
        this.session.persist(o);
    }

    /**
     * Permite actualizar la BD.
     */
    public void actualizarBD() {
        this.transaction.commit();
    }

    /**
     * Query de informacion de la clase.
     *
     * @param clase
     * @return
     */
    public List<Object> obtenerDatos(String clase) {
        List<Object> listaPersonal = null;

        try {
            listaPersonal = this.session.createQuery("FROM " + clase).list();

            switch (clase) {
                case "Funcionario":
                    verClaseFuncionario(listaPersonal);
                    break;
                case "Persona":
                    verClasePersona(listaPersonal);
                    break;
                case "Sede":
                    verClaseSede(listaPersonal);
                    break;

            }

        } catch (Exception e) {
            System.err.println("2_error " + e);
        }
        return listaPersonal;
    }

    /**
     * Ver Funcionario
     *
     * @param listFuncionario
     */
    public void verClaseFuncionario(List<Object> listFuncionario) {
        for (Object ob : listFuncionario) {
            Funcionario f = (Funcionario) ob;
            System.out.println(f.getNumeroF() + " " + f.getCargo() + " " + f.getSalario());
        }
    }

    /**
     * Ver Persona
     *
     * @param listPersona
     */
    public void verClasePersona(List<Object> listPersona) {
        for (Object ob : listPersona) {
            Persona p = (Persona) ob;
            System.out.println(p.getDocumento() + " " + p.getNombre());
        }
    }

    /**
     * Ver Sede
     *
     * @param listSede
     */
    public void verClaseSede(List<Object> listSede) {
        for (Object ob : listSede) {
            Sede s = (Sede) ob;
            System.out.println(s.getNit() + " " + s.getCiudad());
        }
    }

}
