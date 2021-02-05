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
public class Invertebrados extends Animales {

    public Invertebrados(String nombre, String sangre, String tipo, String patas) {
        super(nombre, sangre, tipo, patas);
    }

    public Invertebrados() {
        super(null, null, null, null);
    }

    public String Esponjas() {
        Invertebrados esponjas = new Invertebrados("Esponga", null, "Invertebrado", "sin patas");
        return null;
    }

    public String Celentereos() {
        Invertebrados medusa = new Invertebrados("Medusa", null, "Invertebrado", "sin patas");
        Invertebrados coroles = new Invertebrados("Coroles", null, "Invertebrado", "sin patas");
        Invertebrados anemona = new Invertebrados("Anemona", null, "Invertebrado", "sin patas");
        return null;
    }

    public String Gusanos() {
        Invertebrados lombriz = new Invertebrados("Lombriz", null, "Invertebrado", "Sin patas");
        Invertebrados tenias = new Invertebrados("Tenia", null, "Invertebrado", "sin patas");
        Invertebrados lombrizIntestial = new Invertebrados("Lombriz intestinal", null, "Invertebrado", "sin patas");
        return null;
    }

    public String Equinodermos() {
        Invertebrados estrellaDeMar = new Invertebrados("Estrella de mar", null, "Invertebrado", "sin patas");
        Invertebrados erizoDeMar = new Invertebrados("Erizo de mar", null, "Invertebrado", "sin patas");
        return null;
    }

    public String Moluscos() {
        Invertebrados almeja = new Invertebrados("Almeja", null, "Invertebrado", "sin patas");
        Invertebrados caracol = new Invertebrados("Caracol", null, "Invertebrado", "sin patas");
        Invertebrados pulpo = new Invertebrados("Pulpo", null, "Invertebrado", "sin patas");
        return null;
    }

    public String Crustaceos() {
        Invertebrados cangrejo = new Invertebrados("Cangrejo", null, "Invertebrado", "con patas");
        Invertebrados percebe = new Invertebrados("Percebe", null, "Invertebrado", "con patas");
        Invertebrados langosta = new Invertebrados("Langosta", null, "Invertebrado", "con patas");
        return null;
    }

    public String Miriapodos() {
        Invertebrados cienpies = new Invertebrados("Cienpiés", null, "Invertebrado", "con patas");
        Invertebrados milpies = new Invertebrados("Milpiés", null, "Invertebrado", "con patas");
        return null;
    }

    public String Aracnidos() {
        Invertebrados escorpion = new Invertebrados("Escorpión", null, "Invertebrado", "con patas");
        Invertebrados araña = new Invertebrados("Araña", null, "invertebrado", "con patas");
        return null;
    }

    public String Insectos() {
        Invertebrados saltamontes = new Invertebrados("Saltamontes", null, "Invertebrado", "con patas");
        Invertebrados avispa = new Invertebrados("Avispa", null, "Invertebrado", "con patas");
        Invertebrados escarabajo = new Invertebrados("Escarabajo", null, "Invertebrado", "con patas");
        return null;
    }
}
