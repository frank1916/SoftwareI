package empresa;

import java.math.BigDecimal;

/**
 *
 * @author ffg
 */
public class DescuentosBasicos extends FuncionarioDecorator {

    public DescuentosBasicos(DatosFuncionario df) {
        super(df);
    }

    @Override
    public String obtenerFunciones() {
        return "Descuentos por salud";
    }

    @Override
    public BigDecimal obtenerSalario() {
        return getDatos().obtenerSalario().subtract(new BigDecimal(120000));
    }
}
