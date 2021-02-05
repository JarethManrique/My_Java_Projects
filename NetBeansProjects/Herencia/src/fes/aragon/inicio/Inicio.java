package fes.aragon.inicio;

import fes.aragon.codigo.Elipse;
import fes.aragon.codigo.Empleado;
import fes.aragon.codigo.JefeDeArea;
import fes.aragon.codigo.Rectangulo;

public class Inicio {
    public static void main(String[] args) {
        Elipse elp = new Elipse(3, 2);
        Rectangulo rec = new Rectangulo(4, 4);
        Empleado emp = new Empleado("Pepe", 5000);
        JefeDeArea jef = new JefeDeArea("Ricardo", 5000);
        
        System.out.println(elp.area());
        System.out.println(rec.area());
        System.out.println(elp.getX());
        System.out.println(emp.incrementoSueldo());
        System.out.println(jef.incrementoSueldo());
    }
}
