package com.clientes.demo.controller;

import com.clientes.demo.model.Cliente;
import com.clientes.demo.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/clientes")
public class ClienteController {
    @Autowired
    private ClienteService service;

    // GET -> listar todos
    @GetMapping
    public List<Cliente> listar() {
        return service.listar();
    }

    // POST -> criar cliente
    @PostMapping
    public ResponseEntity<Cliente> criar(@RequestBody Cliente cliente) {

        Cliente novoCliente = service.criar(cliente);

        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(novoCliente);
    }

    // DELETE -> remover cliente
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> remover(@PathVariable Long id) {

        boolean removido = service.remover(id);

        if (removido) {
            return ResponseEntity.noContent().build();
        }

        return ResponseEntity.notFound().build();
    }

    // PUT -> atualizar cliente
    @PutMapping("/{id}")
    public ResponseEntity<Cliente> atualizar(
            @PathVariable Long id,
            @RequestBody Cliente cliente) {

        Cliente atualizado = service.atualizar(id, cliente);

        if (atualizado != null) {
            return ResponseEntity.ok(atualizado);
        }

        return ResponseEntity.notFound().build();
    }

}
