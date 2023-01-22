package DH.ZOO.practice.Model;

import DH.ZOO.practice.Animal;
import Interface.Amamantar;
import Interface.HabMamifero;

public class Caninos extends Animal implements HabMamifero, Amamantar {

    public Caninos(String nombre, Integer edad) {
        super(nombre, edad);
    }

    @Override
    public void Amamantando() {

        System.out.println("Soy el canino " + getNombre() + " Y estoy Amamantando" );

    }
}
