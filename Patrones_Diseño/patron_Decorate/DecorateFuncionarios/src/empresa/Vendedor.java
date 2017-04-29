package empresa;

import java.math.BigDecimal;

/**
 *
 * @author 
 */
public class Vendedor extends Funcionario {

    @Override
    public String obtenerFunciones() {
       return "Vender Productos Clientes";
    }

    @Override
    public BigDecimal obtenerSalario() {
        return new BigDecimal(1500000);
    }


    
}
