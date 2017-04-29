package navegador;

import java.net.URI;
import java.net.URISyntaxException;

/**
 *
 * @author 
 */
public class FacadeConexion {
    
    private Conexion conexion;
    private URI direccion;

    public FacadeConexion(String direccionWeb) {
        this.conexion= new Conexion(443,direccionWeb, true);
        try {
         this.direccion = new URI(conexion.getDireccion());   
        } catch (Exception e) {
        }
        
    }

    public URI getDireccion() {
        return direccion;
    }
    
    
    
    
    
}
