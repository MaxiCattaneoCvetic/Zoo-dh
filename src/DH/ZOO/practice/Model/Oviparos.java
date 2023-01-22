package DH.ZOO.practice.Model;

import DH.ZOO.practice.Animal;
import Interface.HabMamifero;
import Interface.HabOviparos;
import Interface.PonerHuevo;
import com.sun.security.jgss.GSSUtil;

public class Oviparos extends Animal implements PonerHuevo, HabOviparos {
    public Oviparos(String nombre, Integer edad) {
        super(nombre, edad);
    }

    @Override
    public void volar() {
        System.out.println("Estoy volando");
    }

    @Override
    public void romperCascaron() {
        System.out.println("Estoy rompiendo cascaron");
    }

    @Override
    public void poniendoHuevo() {
        System.out.println("Poniendo huevo");
    }
}
