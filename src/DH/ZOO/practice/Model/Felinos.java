package DH.ZOO.practice.Model;

import DH.ZOO.practice.Animal;
import Interface.Amamantar;
import Interface.HabMamifero;

public class Felinos extends Animal implements HabMamifero, Amamantar {
    public Felinos(String nombre, Integer edad) {
        super(nombre, edad);
    }

    @Override
    public void Amamantando() {
        System.out.println("Soy el Felino " + getNombre() + " Y estoy Amamantando" );
    }
}
