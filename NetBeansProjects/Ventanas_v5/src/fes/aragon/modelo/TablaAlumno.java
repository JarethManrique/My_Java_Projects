/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fes.aragon.modelo;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Jareth Manrique
 */
public class TablaAlumno extends AbstractTableModel {

    private ArrayList<Alumno> datos = new ArrayList<>();
    private String[] columnas = {"Nombre", "Parcial 1", "Parcial 2", "Parcial 3", "Calificación"};

    @Override
    public int getRowCount() {
        return datos.size();
    }

    @Override
    public int getColumnCount() {
        return columnas.length;
    }

    @Override
    public String getColumnName(int column) {
        return columnas[column];
    }

    public ArrayList<Alumno> getDatos() {
        return datos;
    }

    public void setDatos(ArrayList<Alumno> datos) {
        this.datos = datos;
    }

    @Override
    public void fireTableDataChanged() {
        super.fireTableDataChanged(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        String dato = "";
        if (columnIndex == 0) {
            dato = datos.get(rowIndex).getNombre();
        } else if (columnIndex == 1) {
            dato = String.valueOf(datos.get(rowIndex).getParciales()[0]);
        } else if (columnIndex == 2) {
            dato = String.valueOf(datos.get(rowIndex).getParciales()[1]);
        } else if (columnIndex == 3) {
            dato = String.valueOf(datos.get(rowIndex).getParciales()[2]);
        } else if (columnIndex == 4) {
            dato = String.valueOf(datos.get(rowIndex).getCalificacion());
        }
        return dato;
    }

    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
        if (columnIndex == 0) {
            datos.get(rowIndex).setNombre((String) aValue);
        } else if (columnIndex == 1) {
            datos.get(rowIndex).getParciales()[0] = Float.parseFloat((String) aValue);
        } else if (columnIndex == 2) {
            datos.get(rowIndex).getParciales()[1] = Float.parseFloat((String) aValue);
        } else if (columnIndex == 3) {
            datos.get(rowIndex).getParciales()[2] = Float.parseFloat((String) aValue);
        } else {
            datos.get(rowIndex).setCalificacion(Float.parseFloat((String) aValue));
        }
    }

    public void calcular() {
        for (Alumno dato : datos) {
            dato.getCalificacion();
        }
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        if (columnIndex == 4) {
            return false;
        } else {
            return true;
        }
    }

}
