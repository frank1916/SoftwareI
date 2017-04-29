package navegador;

/**
 *
 * @author ffg
 */
public class Conexion {
    
    private int puertoConexion;
    private String Direccion;
    private boolean estadoConexion;

    public Conexion(int puertoConexion, String Direccion, boolean estadoConexion) {
        this.puertoConexion = puertoConexion;
        this.Direccion = Direccion;
        this.estadoConexion = estadoConexion;
    }

    public int getPuertoConexion() {
        return puertoConexion;
    }

    public void setPuertoConexion(int puertoConexion) {
        this.puertoConexion = puertoConexion;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public boolean isEstadoConexion() {
        return estadoConexion;
    }

    public void setEstadoConexion(boolean estadoConexion) {
        this.estadoConexion = estadoConexion;
    }
    
    
    
    
}
