/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo.Repositorio;

import com.example.demo.Interface.ClientInterface;
import com.example.demo.Modelo.Client;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author astu3
 */
@Repository
public class ClientRepositorio {
    @Autowired
    private ClientInterface clientICrudnterface;
    
    public List<Client> getAll(){
        return (List<Client>) clientICrudnterface.findAll();
    }
    
    public Optional<Client> getClient(int id){
    return clientICrudnterface.findById(id);
       }
    
    public Client save(Client client){
    return clientICrudnterface.save(client);
    }
}
