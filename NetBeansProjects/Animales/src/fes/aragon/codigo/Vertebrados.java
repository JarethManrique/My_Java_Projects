/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fes.aragon.codigo;

/**
 *
 * @author Jareth Manrique
 */
public class Vertebrados extends Animales {

    public Vertebrados() {
        super(null, null, null, null);
    }

    public Vertebrados(String nombre, String sangre, String tipo, String patas) {
        super(nombre, sangre, tipo, patas);
    }

    public String Peces() {
        Vertebrados tiburon = new Vertebrados("Tiburon", "Sangre Fria", "Vertebrado", null);
        Vertebrados caballoDeMar = new Vertebrados("Caballito de Mar", "Sangre Fría", "Vertebrado", null);
        Vertebrados pez = new Vertebrados("Pez", "Sangre Fría", "Vertebrado", null);
        return null;
    }

    public String Anfibios() {
        Vertebrados rana = new Vertebrados("Rana", "Sangre fría", "Vertebrado", null);
        Vertebrados salamandra = new Vertebrados("Salamandra", "Sangre fría", "Vertebrado", null);
        return null;
    }

    public String Reptiles() {
        Vertebrados tortuga = new Vertebrados("Tortuga", "Sangre fría", "Vertebrado", null);
        Vertebrados camaleon = new Vertebrados("Camaleon", "Sangre fría", "Vertebrado", null);
        Vertebrados serpiente = new Vertebrados("Serpiente", "Sangre fría", "Vertebrado", null);
        Vertebrados cocodrilo = new Vertebrados("Cocodrilo", "Sangre fria", "Vertebrado", null);
        return null;
    }

    public String Aves() {
        Vertebrados loro = new Vertebrados("Loro", "Sangre caliente", "Vertebrado", null);
        Vertebrados pingüino = new Vertebrados("Pingüino", "Sangre caliente", "Vertebrado", null);
        Vertebrados avestruz = new Vertebrados("Avestruz", "Sangre caliente", "Vertebrado", null);
        Vertebrados buitre = new Vertebrados("Buitre", "Sangre caliente", "Vertebrado", null);
        return null;
    }

    public String Mamiferos() {
        Vertebrados raton = new Vertebrados("Ratón", "Sangre caliente", "Vertebrado", null);
        Vertebrados canguro = new Vertebrados("Canguro", "Sangre caliente", "Vertebrado", null);
        Vertebrados murcielago = new Vertebrados("Muerciélago", "Sangre caliente", "Vertebrado", null);
        Vertebrados elefante = new Vertebrados("Elefante", "Sangre caliente", "Vertebrado", null);
        return null;
    }

    @Override
    public String toString() {
        return "Vertebrados{" + Mamiferos() + '}';
    }

}
