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
@Table(name ="funcionario")
public class Funcionario {
    
    @Id
    @Column(name="numeroF")
    private String numeroF;
    
    @Column(name="cargo")
    private String cargo;
    
    @Column(name="salario")
    private double salario;

    public Funcionario(String n,String cargo, double salario) {
        this.numeroF = n;
        this.cargo = cargo;
        this.salario = salario;
    }
    
    public Funcionario(){
        
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getNumeroF() {
        return numeroF;
    }

    public void setNumeroF(String numeroF) {
        this.numeroF = numeroF;
    }
    
    
}
