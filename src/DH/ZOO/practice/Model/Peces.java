package DH.ZOO.practice.Model;

import DH.ZOO.practice.Animal;
import Interface.HabOviparos;
import Interface.PonerHuevo;

public class Peces extends Animal implements PonerHuevo {
    public Peces(String nombre, Integer edad) {
        super(nombre, edad);
    }


    @Override
    public void poniendoHuevo() {

    }
}
