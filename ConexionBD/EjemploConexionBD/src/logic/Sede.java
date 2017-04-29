package logic;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author 
 */
@Entity
@Table(name = "sede")
public class Sede {

    @Column(name = "ciudad")
    private String ciudad;
    @Id
    @Column(name = "nit")
    private int nit;

    public Sede() {

    }

    public Sede(String ciudad, int nit) {
        this.ciudad = ciudad;
        this.nit = nit;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public int getNit() {
        return nit;
    }

    public void setNit(int nit) {
        this.nit = nit;
    }

}
