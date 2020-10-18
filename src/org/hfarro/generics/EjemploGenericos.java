package org.hfarro.generics;

import org.hfarro.poointerfaces.modelo.Cliente;
import org.hfarro.poointerfaces.modelo.ClientePremium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EjemploGenericos {
    public static void main(String[] args) {
        List<Cliente> clientes = new ArrayList<>();
        clientes.add(new Cliente("Hans","Farro"));

        Cliente andres = clientes.get(0);

        Cliente[] clientesArreglo ={new Cliente("Luci","Martinez"),new Cliente("Andres","Guzman")};
        Integer[] enteros ={1,2,3};

        List<Cliente> clientes2 = fromArraytoList(clientesArreglo);
        List<Integer> enterosLista = fromArraytoList(enteros);

        clientes2.forEach(System.out::println);
        enterosLista.forEach(System.out::println);

        List<String> nombres = fromArraytoList(new String[]{"Hans","Pepe","Juan","Luci","Jhon"},enteros);
        nombres.forEach(System.out::println);

        List<ClientePremium> clientePremiumList = fromArraytoList(new ClientePremium[]{new ClientePremium("Paco","Fernandez")});
        imprimirClientes(clientes);
        imprimirClientes(clientePremiumList);

        System.out.println("Maximo de 1, 9 y 4 es  "+ maximo(1,9,4));
        System.out.println("Maximo de zanahoria, arandanos , manzana es :"+maximo("zanahoria","arandanos","manzana"));
    }

    public static <T> List<T> fromArraytoList (T[] c){
        return Arrays.asList(c);
    }

    public static <T extends Number> List<T> fromArraytoList (T[] c){
        return Arrays.asList(c);
    }

    public static <T extends Cliente & Comparable <T>> List<T> fromArraytoList (T[] c){
        return Arrays.asList(c);
    }

    public static void imprimirClientes(List<? extends Cliente> clientes){
        clientes.forEach(System.out::println);
    }

    public static <T, G> List<T> fromArraytoList (T[] c,G[] x){
        for(G elemento: x){
            System.out.println(elemento);
        }
        return Arrays.asList(c);
    }

    public static <T extends Comparable<T>> T maximo(T a,T b ,T c){
        T max = a;
        if(b.compareTo(max) > 0){
            max = b;
        }
        if(c.compareTo(max) > 0){
            max = c;
        }
        return max;
    }
}
