/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fes.aragon.codigo;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javafx.scene.layout.BorderPane;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

/**
 *
 * @author Jareth Manrique
 */
public class Lamina extends JPanel implements ActionListener{
    private JPanel panel = new JPanel();
    private JButton boton= new JButton("Agregar");
    private JTextField cajaTexto = new JTextField(30);
    private JTextArea areaTexto = new JTextArea(10, 20);
    private JScrollPane scroll;
    
    public Lamina(){
        this.scroll = new JScrollPane(this.areaTexto);
        this.boton.addActionListener(this);
        panel.add(boton);
        panel.add(cajaTexto);
        JPanel bordePanel = new JPanel(new BorderLayout());
        bordePanel.setBorder(new TitledBorder("Componentes Swing"));
        bordePanel.add(panel, BorderLayout.CENTER);
        this.add(bordePanel);
        this.add(scroll);
        
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        Object origen =e.getSource();
        if (origen==this.boton){
            this.areaTexto.append(this.cajaTexto.getText()+"\n");
            this.cajaTexto.setText("");
            this.boton.transferFocus();
        }
    }
    
}
