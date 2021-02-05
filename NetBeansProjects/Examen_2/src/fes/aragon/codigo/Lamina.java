/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fes.aragon.codigo;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.io.*;

/**
 *
 * @author Jareth Manrique
 */
public class Lamina extends JPanel implements ActionListener {

    private JPanel panel = new JPanel();
    private JPanel panelD = new JPanel();
    private JPanel panelT = new JPanel();
    private JButton botG = new JButton("Guardar");
    private JButton botL = new JButton("Leer");
    private JLabel nom = new JLabel("Nombre(s):");
    private JLabel apP = new JLabel("Apellido Paterno:");
    private JLabel apM = new JLabel("Apellido Materno:");
    private JTextField cajTxNom = new JTextField(20);
    private JTextField cajTxApP = new JTextField(20);
    private JTextField cajTxApM = new JTextField(20);
    private JTextArea areaTexto = new JTextArea(10, 40);
    private JScrollPane scroll;

    public Lamina() {
        this.botG.addActionListener(this);
        this.botL.addActionListener(this);
        panel.add(nom);
        panel.add(cajTxNom);
        panel.add(apP);
        panel.add(cajTxApP);
        panel.add(apM);
        panel.add(cajTxApM);
        panelD.add(botG);
        panelD.add(botL);
        panelT.add(areaTexto);
        panel.setLayout(new GridLayout(3, 2, 20, 10));
        panelD.setLayout(new GridLayout(1, 2, 20, 20));
        panelT.setLayout(new GridLayout(1, 1, 20, 20));
        this.add(panel);
        this.add(panelD);
        this.add(panelT);
        this.scroll = new JScrollPane(this.areaTexto);
        this.add(scroll);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object origen = e.getSource();
        if (origen == this.botG) {
            FileWriter fw = null;
            try {
                File f = new File(System.getProperty("user.dir") + "/Texto");
                fw = new FileWriter(f, true);
                PrintWriter pw = new PrintWriter(fw);
                pw.print(this.cajTxNom.getText() + " ");
                pw.print(this.cajTxApP.getText() + " ");
                pw.println(this.cajTxApM.getText());
                pw.close();

            } catch (IOException ex) {
                ex.printStackTrace();
            } finally {
                try {
                    fw.close();
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            }
            this.cajTxNom.setText("");
            this.cajTxApP.setText("");
            this.cajTxApM.setText("");
            this.botG.transferFocus();
        }
        Object origenDos = e.getSource();
        if (origenDos == this.botL) {
            this.botL.transferFocus();

            File archivo = new File(System.getProperty("user.dir") + "/Texto");
            try {
                BufferedReader leer = new BufferedReader(new FileReader(archivo));
                String linea = leer.readLine();
                while (linea != null) {
                    this.areaTexto.append(linea + "\n");
                    linea = leer.readLine();
                }
            } catch (FileNotFoundException ex) {
                ex.getMessage();
            } catch (IOException ex) {
                ex.getMessage();
            }
        }
    }

}
