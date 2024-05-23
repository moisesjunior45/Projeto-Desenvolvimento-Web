package com.example.BoraDe0.services;

import com.example.BoraDe0.models.ClienteModel;
import com.example.BoraDe0.repositories.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;

    public ClienteModel cadastrar(ClienteModel cliente) {
        // Sem codificação de senha
        return clienteRepository.save(cliente);
    }

    public ClienteModel findByEmail(String email) {
        return clienteRepository.findByEmail(email);
    }

    public boolean verificarSenha(ClienteModel cliente, String senha) {
        // Comparação simples de senha (sem segurança)
        return cliente.getSenha().equals(senha);
    }
}
