/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo.Repositorio;

import com.example.demo.Interface.MessageInterface;
import com.example.demo.Modelo.Message;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author astu3
 */
@Repository
public class MessageRepositorio {
    @Autowired 
    private MessageInterface messageCrudRepository;
    
    public List<Message> getAll(){
    return (List<Message>) messageCrudRepository.findAll();
    }
    
    public Optional<Message> getMessage(int idMessage){
    return messageCrudRepository.findById(idMessage);
    }

public Message save(Message message){
return messageCrudRepository.save(message);
}
}
