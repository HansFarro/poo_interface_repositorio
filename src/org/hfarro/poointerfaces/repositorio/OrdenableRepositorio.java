package org.hfarro.poointerfaces.repositorio;

import org.hfarro.poointerfaces.modelo.Cliente;

import java.util.List;

public interface OrdenableRepositorio {
    List<Cliente> listar(String campo, Direccion dir);
}
