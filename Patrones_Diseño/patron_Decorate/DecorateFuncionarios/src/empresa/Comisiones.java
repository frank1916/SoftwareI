package empresa;

import java.math.BigDecimal;

/**
 *
 * @author 
 */
public class Comisiones extends FuncionarioDecorator{

    public Comisiones(DatosFuncionario df) {
        super(df);
    }
    

    @Override
    public String obtenerFunciones() {
     return  getDatos().obtenerFunciones() + " mas Actividades extra";
    }

    @Override
    public BigDecimal obtenerSalario() {
       return getDatos().obtenerSalario().add(new BigDecimal(150000));
    }


}
