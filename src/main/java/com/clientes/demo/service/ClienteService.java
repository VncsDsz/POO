package com.clientes.demo.service;

import com.clientes.demo.model.Cliente;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ClienteService {
    private List<Cliente> clientes = new ArrayList<>();
    private Long nextId = 1L;

    // listar todos
    public List<Cliente> listar() {
        return clientes;
    }

    // criar cliente
    public Cliente criar(Cliente c) {
        c.setId(nextId++);
        clientes.add(c);
        return c;
    }

    // buscar por ID
    public Cliente buscarPorId(Long id) {
        for (Cliente c : clientes) {
            if (c.getId().equals(id)) {
                return c;
            }
        }
        return null;
    }

    // remover
    public boolean remover(Long id) {
        return clientes.removeIf(c -> c.getId().equals(id));
    }

    // atualizar
    public Cliente atualizar(Long id, Cliente novo) {

        Cliente existente = buscarPorId(id);

        if (existente != null) {
            existente.setNome(novo.getNome());
            existente.setEmail(novo.getEmail());
            existente.setIdade(novo.getIdade());

            return existente;
        }

        return null;
    }
}
