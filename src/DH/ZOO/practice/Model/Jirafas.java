package DH.ZOO.practice.Model;

import DH.ZOO.practice.Animal;
import Interface.Amamantar;
import Interface.HabMamifero;

public class Jirafas extends Animal implements HabMamifero, Amamantar {
    public Jirafas(String nombre, Integer edad) {
        super(nombre, edad);
    }

    @Override
    public void Amamantando() {
        System.out.println("Soy el jirafa " + getNombre() + " Y estoy Amamantando" );
    }
}
