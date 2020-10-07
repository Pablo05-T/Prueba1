
package prueba1;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
/**
 *
 * @author Pablo
 */
public class MiVentana extends JFrame {

    public MiVentana() {
        super("Mi Otra Ventana");
        setSize(500, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container cp = getContentPane();
        cp.setLayout(new FlowLayout());
        JLabel etiqueta = new JLabel("Nombre: ");
        JTextField texto = new JTextField(20);
        JButton boton = new JButton("Aceptar");
        cp.add(etiqueta);
        cp.add(texto);
        cp.add(boton);
    }
}
