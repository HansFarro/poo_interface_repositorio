package org.hfarro.genericsClass;

public class EjemploGenericos {
    public static void main(String[] args) {
        Camion<Animal> transporteCaballos = new Camion<>(5);
        transporteCaballos.add(new Animal("Peregrino","Caballo"));
        transporteCaballos.add(new Animal("Grillo","Caballo"));
        transporteCaballos.add(new Animal("Tunquen","Caballo"));
        transporteCaballos.add(new Animal("Topocalma","Caballo"));
        transporteCaballos.add(new Animal("Longotoma","Caballo"));

        for(Animal a: transporteCaballos){
            System.out.println(a.getNombre() + " tipo: " + a.getTipo());
        }

        Camion<Maquinaria> transMaquinas = new Camion(3);
        transMaquinas.add(new Maquinaria("Bulldozer"));
        transMaquinas.add(new Maquinaria("Grua Horzilla"));
        transMaquinas.add(new Maquinaria("Perforadora"));

        for(Maquinaria m : transMaquinas){
//            Maquinaria m = (Maquinaria) o;
            System.out.println(m.getTipo());
        }

    }
}
