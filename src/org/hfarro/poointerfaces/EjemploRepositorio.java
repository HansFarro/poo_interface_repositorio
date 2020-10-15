package org.hfarro.poointerfaces;

import org.hfarro.poointerfaces.modelo.Cliente;
import org.hfarro.poointerfaces.repositorio.*;
import static org.hfarro.poointerfaces.repositorio.Direccion.*;

import java.util.List;

public class EjemploRepositorio {
    public static void main(String[] args) {
        CrudRepositorio repo = new ClienteListRepositorio();
        repo.crear(new Cliente("Jano","Perez"));
        repo.crear(new Cliente("Bea","Gonzales"));
        repo.crear(new Cliente("Luci","Martinez"));

        List<Cliente> clientes = repo.listar();
        clientes.forEach(System.out::println);
        System.out.println("========= paginable ==========");
        List<Cliente> paginable = ((PaginableRepositorio)repo).listar(2,3);
        paginable.forEach(System.out::println);

        System.out.println("========= ordenar ============");
        List<Cliente> clientesOrdenAsc = ((OrdenableRepositorio)repo).listar("apellido",DESC);
        for (Cliente c:clientesOrdenAsc) {
            System.out.println(c);
        }

        System.out.println("========= editar =============");
        Cliente beaActualizar = new Cliente("Bea","Mena");
        beaActualizar.setId(2);
        repo.editar(beaActualizar);
        Cliente bea = repo.porid(2);
        System.out.println(bea);
    }
}
