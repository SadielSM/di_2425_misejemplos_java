/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package E15_Eventos;

/**
 *
 * @author DAM2Alu17
 */
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.*;



import javax.swing.*;
import javax.swing.border.Border;


public class EjemploRegisterKeyboard extends JFrame implements ActionListener {
  protected JButton botones[] = new JButton[9];
  
  public EjemploRegisterKeyboard() {
    super( "Tutorial de Java, Swing" );
    Container pane = getContentPane();
    pane.setLayout( new GridLayout( 3,3 ) );
    
    Border borde = BorderFactory.createLineBorder( Color.black );
    KeyStroke arriba = KeyStroke.getKeyStroke( KeyEvent.VK_UP,0 );
    KeyStroke abajo = KeyStroke.getKeyStroke( KeyEvent.VK_DOWN,0 );
    KeyStroke izqda = KeyStroke.getKeyStroke( KeyEvent.VK_LEFT,0 );
    KeyStroke drcha = KeyStroke.getKeyStroke( KeyEvent.VK_RIGHT,0 );
    
    JRootPane rootPane = getRootPane();
    rootPane.registerKeyboardAction( this,"arriba",arriba,
      JComponent.WHEN_ANCESTOR_OF_FOCUSED_COMPONENT );
    rootPane.registerKeyboardAction( this,"abajo",abajo,
      JComponent.WHEN_ANCESTOR_OF_FOCUSED_COMPONENT );
    rootPane.registerKeyboardAction( this,"drcha",drcha,
      JComponent.WHEN_ANCESTOR_OF_FOCUSED_COMPONENT );
    rootPane.registerKeyboardAction( this,"izqda",izqda,
      JComponent.WHEN_ANCESTOR_OF_FOCUSED_COMPONENT );
    
    for( int i=0; i < 9; i++ ) {
      JButton boton;
      boton = new JButton();
      boton.setBorder( borde );
      boton.setName( new Integer(i).toString() );
      pane.add( boton );
      
      botones[i] = boton;
    }
    setSize( 200,200 );
  }
    
  public void actionPerformed( ActionEvent evt ) {
    Component foco = getFocusOwner();
    String nombre = foco.getName();
    int indice = Integer.parseInt( nombre );
    botones[indice].setText( "" );
    String accion = evt.getActionCommand();
    
    if( accion.equals( "arriba" ) ) {
      indice = (indice < 3) ? indice + 6 : indice - 3;
    } else if( accion.equals( "abajo" ) ) {
      indice = (indice > 5) ? indice - 6 : indice + 3;
    } else if( accion.equals( "izqda" ) ) {
      indice = (indice == 0) ? indice = 8 : indice - 1;
    } else { // asume drcha
      indice = (indice == 8) ? indice = 0 : indice + 1;
    }
    
    botones[indice].setText( "X" );
    botones[indice].requestFocus();
  }
 
  static public void main( String argv[] ) {
    new EjemploRegisterKeyboard().show();
  }
}

