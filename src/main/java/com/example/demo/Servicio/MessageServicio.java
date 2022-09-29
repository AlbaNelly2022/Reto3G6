/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo.Servicio;

import com.example.demo.Modelo.Message;
import com.example.demo.Repositorio.MessageRepositorio;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author astu3
 */
@Service
public class MessageServicio {

    @Autowired
    private MessageRepositorio messageRepository;

    public List<Message> getAll() {
        return (List<Message>) messageRepository.getAll();
    }

    public Optional<Message> getMessage(int IdMessage) {
        return messageRepository.getMessage(IdMessage);
    }

    public Message save(Message message) {
        if (message.getIdMessage() == null) {
            return messageRepository.save(message);
        } else {

            Optional<Message> M = messageRepository.getMessage(message.getIdMessage());
            if (M.isEmpty()) {
                return messageRepository.save(message);
            } else {
                return message;
            }
        }

    }
}
