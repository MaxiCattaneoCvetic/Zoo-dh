package DH.ZOO.practice.Model;

import DH.ZOO.practice.Animal;
import Interface.Amamantar;
import Interface.HabMamifero;

public class Elefantes extends Animal implements HabMamifero, Amamantar {


    public Elefantes(String nombre, Integer edad) {
        super(nombre, edad);
    }

    @Override
    public void Amamantando() {
        System.out.println("Soy el elefante " + getNombre() + " Y estoy Amamantando" );

    }
}
