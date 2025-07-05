package com.example.ms_inventario_bs.model.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Schema(description = "DTO que representa un proveedor de perfumes")
public class ProveedorDTO {

    @Schema(description = "ID único del proveedor", example = "2001")
    private int idProveedor;

    @Schema(description = "Nombre del proveedor", example = "Fragancias del Sur S.A.")
    private String nombre;

    @Schema(description = "Correo electrónico de contacto del proveedor", example = "contacto@fraganciasdelsur.com")
    private String email;

    @Schema(description = "Número de teléfono del proveedor", example = "+34911223344")
    private String telefono;
}
