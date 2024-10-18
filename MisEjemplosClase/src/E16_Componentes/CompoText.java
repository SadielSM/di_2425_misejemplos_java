/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package E16_Componentes;

import java.awt.Color;
import java.io.Serializable;
import javax.accessibility.AccessibleContext;
import javax.swing.JTextField;
import javax.swing.event.EventListenerList;
import javax.swing.plaf.ComponentUI;

/**
 *
 * @author DAM2Alu17
 */
public class CompoText extends JTextField implements Serializable{
    private Color colorFondo;
    private int numCaracteres;
    private Color colorPorDefecto;

    public CompoText() { //Primero se crea el metodo vacio para luego añadir el codigo 
        super();
        colorPorDefecto= getBackground();
        addKeyListener(new java.awt.event.KeyAdapter() { //Luego vamos , nos creamos el combo text en el entorno grafico 
    public void keyTyped(java.awt.event.KeyEvent evt) {// Vamos a las propertis del compo y inicializamos el evento keyType
        compruebaLongitud();//Luego click derecho --> Customize Code y copiamos el codigo del keyListener. Quitamos el codigo 
                            //que sobra  y ya 
    }
});
    }
    
    private void compruebaLongitud (){
        if(getText().length()>numCaracteres){
            setBackground(colorFondo);
        }else{
            setBackground(colorPorDefecto);
        }
    }

    public Color getColorFondo() {
        return colorFondo;
    }

    public void setColorFondo(Color colorFondo) {
        this.colorFondo = colorFondo;
    }

    public int getNumCaracteres() {
        return numCaracteres;
    }

    public void setNumCaracteres(int numCaracteres) {
        this.numCaracteres = numCaracteres;
    }

    public Color getColorPorDefecto() {
        return colorPorDefecto;
    }

    public void setColorPorDefecto(Color colorPorDefecto) {
        this.colorPorDefecto = colorPorDefecto;
    }

    public ComponentUI getUi() {
        return ui;
    }

    public void setUi(ComponentUI ui) {
        this.ui = ui;
    }

    public EventListenerList getListenerList() {
        return listenerList;
    }

    public void setListenerList(EventListenerList listenerList) {
        this.listenerList = listenerList;
    }

    public AccessibleContext getAccessibleContext() {
        return accessibleContext;
    }

    public void setAccessibleContext(AccessibleContext accessibleContext) {
        this.accessibleContext = accessibleContext;
    }
    
    
    
}
