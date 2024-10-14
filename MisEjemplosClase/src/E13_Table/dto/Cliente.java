/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package E13_Table.dto;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author DAM2Alu17
 */
public class Cliente {
    
    private String nombre , apellidos , provincia , correo;
    int edad;
    Date alta;

    public Cliente() {
    }
    
    

    public Cliente(String nombre, String apellidos, String provincia, String correo, int edad, Date alta) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.provincia = provincia;
        this.correo = correo;
        this.edad = edad;
        this.alta = alta;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Date getAlta() {
        return alta;
    }

    public void setAlta(Date alta) {
        this.alta = alta;
    }
    
    public String[] devuelveFila(){
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy,hh:mm");
        String fila[]={nombre, apellidos , String.valueOf(edad),provincia, correo,sdf.format(alta)};
        
        return fila;
        
    }
    
    public static String [] getColumnas(){
        
//        String nombre , apellidos , provincia, correo;
//        int edad;
//        Date alta;
    String columnas[]={"Nombre","Apellidos","Edad","Provincia","Correo","Alta"};
    return columnas;
    }
    
}
