package empresa;

/**
 *
 * @author 
 */
public abstract class FuncionarioDecorator implements DatosFuncionario{
    
    private DatosFuncionario datosFuncionario;
    
    public FuncionarioDecorator(DatosFuncionario df){
        setDatos(df);
    }
    
    public DatosFuncionario getDatos(){
        return datosFuncionario;
    }
    
    public void setDatos (DatosFuncionario df){
        this.datosFuncionario = df;
    }
    
}
