package com.example.sistema;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * MensajeController
 */
@Controller
public class MensajeController {

    @Autowired
    private MensajeService mensajeService;

    @GetMapping("/hola")
    @ResponseBody
    public Mensaje hola(@RequestParam String nombre){
        return mensajeService.holaSaludar(nombre);
    }
}