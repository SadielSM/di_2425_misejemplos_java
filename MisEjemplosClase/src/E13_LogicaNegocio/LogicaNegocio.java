/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package E13_LogicaNegocio;

import E13_Table.dto.Cliente;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author DAM2Alu17
 */
public class LogicaNegocio {
    
    static List<Cliente> listaClientes = new ArrayList();

    public static void addCliente(Cliente cliente){
        listaClientes.add(cliente);
    }
    
    public static void cargarDatos(){
        //Cliente cliente =
        for(int i=0;i<10;i++){
            Cliente cliente = new Cliente("Nombre"+i,"Apellido"+i,"Huesca","Correo"+i,30,new Date());
               addCliente(cliente); // añadida
        }
    }
    
    public static List<Cliente> getClientes(){
        return listaClientes;
    }
    
    
}


