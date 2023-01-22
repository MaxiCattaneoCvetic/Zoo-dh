package DH.ZOO.practice.Model;

import DH.ZOO.practice.Animal;
import Interface.Amamantar;
import Interface.PonerHuevo;

public class OtorrinoHembra extends Animal implements PonerHuevo, Amamantar {

    public OtorrinoHembra(String nombre, Integer edad) {
        super(nombre, edad);
    }

    @Override
    public void Amamantando() {
        System.out.println("Soy el OtorrinoHembra " + getNombre() + " Y estoy Amamantando" );
    }

    @Override
    public void poniendoHuevo() {

    }
}
