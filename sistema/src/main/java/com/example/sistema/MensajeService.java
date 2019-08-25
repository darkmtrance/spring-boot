package com.example.sistema;

import org.springframework.stereotype.Service;

/**
 * MensajeService
 */
@Service
public class MensajeService {

    public Mensaje holaSaludar(String nombre){
        Mensaje mensaje = new Mensaje("Hola", nombre);
        return mensaje;
    }
}