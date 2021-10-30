package com.umanizales.lists_prog2.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

/**
 * Clase implementada para manejar países, departamentos y ciudades en un solo objeto
 * Ejemplo: code:169 desccription:Colombia
 * Ejemplo2: code:16917 description:Caldas
 * Ejemplo3: code:16917001 description: Manizales
 * @author Carlos Loaiza
 */

@Data
@AllArgsConstructor
public class Location {
    @NotNull
    @NotEmpty
    private String code;
    @NotNull
    @NotEmpty
    private String description;
}
