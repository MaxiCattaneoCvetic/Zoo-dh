package DH.ZOO.practice.Model;

import DH.ZOO.practice.Animal;
import Interface.Amamantar;
import Interface.HabMamifero;

public class Hipopotamos extends Animal implements HabMamifero, Amamantar {
    public Hipopotamos(String nombre, Integer edad) {
        super(nombre, edad);
    }

    @Override
    public void Amamantando() {
        System.out.println("Soy el hipopotamo " + getNombre() + " Y estoy Amamantando" );
    }
}
