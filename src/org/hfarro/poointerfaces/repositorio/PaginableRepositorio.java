package org.hfarro.poointerfaces.repositorio;

import org.hfarro.poointerfaces.modelo.Cliente;

import java.util.List;

public interface PaginableRepositorio {
    List<Cliente> listar(int desde, int hasta);
}
