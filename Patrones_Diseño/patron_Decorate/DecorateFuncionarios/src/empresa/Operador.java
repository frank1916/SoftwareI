package empresa;

import java.math.BigDecimal;

/**
 *
 * @author RA304
 */
public class Operador extends Funcionario{

    @Override
    public String obtenerFunciones() {
      return "Producir Productos";
    }

    @Override
    public BigDecimal obtenerSalario() {
     return new BigDecimal(850000);
    }
    

    
    
}
