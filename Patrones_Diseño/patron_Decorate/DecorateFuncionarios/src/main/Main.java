package main;

import empresa.Administrador;
import empresa.Comisiones;
import empresa.DatosFuncionario;
import empresa.DescuentosBasicos;
import empresa.Funcionario;
import empresa.FuncionarioDecorator;
import empresa.Operador;
import empresa.Vendedor;

/**
 *
 * @author 
 */
public class Main {
    
    public static void main(String[] args) {
        DatosFuncionario admministrador = new Administrador();
        System.err.println("Administrador");
        System.out.println(admministrador.obtenerFunciones()+ " Salario" +" $" +admministrador.obtenerSalario());
        
        admministrador = new Administrador();
        admministrador = new Comisiones(admministrador);
        System.out.println(admministrador.obtenerFunciones()+ " Salario" +" $" +admministrador.obtenerSalario());
        admministrador = new DescuentosBasicos(admministrador);
        System.out.println(admministrador.obtenerFunciones()+ " Salario" +" $" +admministrador.obtenerSalario());
        System.out.println("-------------------------------------");
        
        DatosFuncionario vendedor = new Vendedor();
        System.err.println("Vendedor");
        System.out.println(vendedor.obtenerFunciones()+ " Salario" +" $" +vendedor.obtenerSalario());
        
        vendedor = new Vendedor();
        vendedor = new Comisiones(vendedor);
        System.out.println(vendedor.obtenerFunciones()+ " Salario" +" $" + vendedor.obtenerSalario());
        vendedor = new DescuentosBasicos(vendedor);
        System.out.println(vendedor.obtenerFunciones()+ " Salario" +" $" + vendedor.obtenerSalario());
        System.out.println("-------------------------------------");
        
        DatosFuncionario operador = new Operador();
        System.err.println("Operador");
        System.out.println(operador.obtenerFunciones()+ " Salario" +" $" +operador.obtenerSalario());
        
        operador = new Operador();
        operador = new Comisiones(operador);
        System.out.println(operador.obtenerFunciones() + " " +  operador.obtenerSalario());
        operador = new DescuentosBasicos(operador);
        System.out.println(operador.obtenerFunciones()+ " Salario" +" $" +operador.obtenerSalario());
        System.out.println("-------------------------------------");
        
    }
    
}
