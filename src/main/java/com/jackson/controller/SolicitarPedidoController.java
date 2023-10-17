package com.jackson.controller;

import com.jackson.modelo.Pedido;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.persistence.EntityManager;

@RestController
public class SolicitarPedidoController {

    private EntityManager entityManager;

    @GetMapping
    public Pedido buscarPedido() {
        Pedido pedido = entityManager.find(Pedido.class, 1);

        return pedido;
    }

    @GetMapping("/criar")
    public Pedido criarTodosPedidos() {
        Pedido pedido = new Pedido();

        pedido.setPedido("papel");
        pedido.setDescricao("cliente 1");

        return pedido;
    }
}
