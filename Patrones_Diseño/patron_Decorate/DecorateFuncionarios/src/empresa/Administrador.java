package empresa;

import java.math.BigDecimal;

/**
 *
 * @author 
 */
public class Administrador extends Funcionario{

    @Override
    public String obtenerFunciones() {
       return "Administrar_empledos";
    }

    @Override
    public BigDecimal obtenerSalario() {
      return new BigDecimal(2000000);
    }


    
}
