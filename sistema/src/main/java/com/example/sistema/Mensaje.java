package com.example.sistema;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * Mensaje
 */
@Getter
@Setter
@EqualsAndHashCode
@AllArgsConstructor
@ToString
public class Mensaje {
    private String frase;
    private String name;
    
}