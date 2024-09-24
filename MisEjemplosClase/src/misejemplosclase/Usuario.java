package misejemplosclase;

import java.util.logging.Logger;

public class Usuario {

    String nombre, apellidos;
    int edad,Anyos;

    public Usuario() {
    }

    Usuario(String andrea, String varo) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    @Override
    public String toString() {
        return "Usuario{" + "nombre=" + nombre + ", apellidos=" + apellidos + '}';
    }
    
    public void setEdad (int edad) {
        if (edad<18) {
            this.edad = 0;
        }else{
            edad = edad;
        }
    }//del setEdad

    public Usuario(int edad) {
        this.edad = edad;
    }

    public void setAnyos(int Anyos) {
        this.Anyos = Anyos;
    }
    
    
    
      public void intervaloEdad () {
          Usuario nuevo;
          
        }

}
