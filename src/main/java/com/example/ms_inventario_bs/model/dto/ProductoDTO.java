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
@Schema(description = "DTO que representa un producto dentro del sistema de inventario de perfumes")
public class ProductoDTO {

    @Schema(description = "ID único del producto", example = "1001")
    private Long idProducto;

    @Schema(description = "Nombre del perfume", example = "Aroma Elegante")
    private String nombre;

    @Schema(description = "Descripción del perfume", example = "Fragancia floral con toques de vainilla y almizcle")
    private String descripcion;

    @Schema(description = "Precio del perfume en USD", example = "75.50")
    private Float precio;

    @Schema(description = "Cantidad disponible en inventario", example = "50")
    private int stock;

    @Schema(description = "ID del proveedor asociado", example = "2001")
    private Integer proveedorId;

    @Schema(description = "Información completa del proveedor")
    private ProveedorDTO proveedor;
}
